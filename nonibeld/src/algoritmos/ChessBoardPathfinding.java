package algoritmos;

import javax.swing.*;  // API de Java Swing para la interfaz gráfica
import java.awt.*;  // API de AWT para la gestión de la interfaz
import java.awt.event.*;  // API de eventos para manejar interacciones del usuario
import java.util.*;  // API de Java para estructuras de datos como ArrayList y PriorityQueue

// Clase principal que extiende JFrame para crear la ventana del programa
public class ChessBoardPathfinding extends JFrame {
    private static final int SIZE = 8;  // Tamaño del tablero de ajedrez (8x8)
    private JButton[][] board;  // Matriz de botones que representan el tablero
    private boolean[][] blocked;  // Matriz para marcar las casillas bloqueadas por torres
    private ArrayList<Point> path;  // Lista de puntos que forman el camino encontrado
    private int towersPlaced = 0;  // Contador de torres colocadas

    // Constructor de la clase
    public ChessBoardPathfinding() {
        setTitle("Pathfinding with Towers");  // Título de la ventana
        setLayout(new GridLayout(SIZE, SIZE));  // Diseño de cuadrícula para el tablero
        board = new JButton[SIZE][SIZE];  // Inicializa la matriz de botones
        blocked = new boolean[SIZE][SIZE];  // Inicializa la matriz de casillas bloqueadas
        path = new ArrayList<>();  // Inicializa la lista del cam ino

        // Bucle para crear y añadir botones al tablero
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = new JButton("");  // Crea un botón vacío
                board[i][j].setPreferredSize(new Dimension(60, 60));  // Tamaño del botón
                board[i][j].setBackground(Color.WHITE);  // Fondo blanco por defecto
                board[i][j].addActionListener(new ButtonClickListener(i, j));  // Asigna evento
                add(board[i][j]);  // Agrega el botón al tablero
            }
        }

        setSize(600, 600);  // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Cierra la aplicación al salir
        setVisible(true);  // Hace visible la ventana
    }

    // Clase interna para manejar los clics en los botones del tablero
    private class ButtonClickListener implements ActionListener {
        private final int row, col;  // Coordenadas del botón clickeado

        public ButtonClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (towersPlaced < 32 && !blocked[row][col]) {
                blocked[row][col] = true;  // Bloquea la casilla con una torre
                
                // Verifica si el camino sigue siendo válido
                if (findPath()) {
                    board[row][col].setBackground(Color.BLACK);  // Muestra la torre
                    towersPlaced++;
                    if (towersPlaced == 32) {
                        highlightPath();  // Resalta el camino cuando se colocan todas las torres
                    }
                } else {
                    blocked[row][col] = false;  // Deshace la colocación si bloquea el camino
                    JOptionPane.showMessageDialog(ChessBoardPathfinding.this, "No puedes bloquear el camino!");
                }
            }
        }
    }

    // Algoritmo A* para encontrar el camino más corto
    private boolean findPath() {
        path.clear();  // Limpia el camino anterior
        boolean[][] visited = new boolean[SIZE][SIZE];  // Matriz de nodos visitados
        PriorityQueue<Node> openList = new PriorityQueue<>(Comparator.comparingInt(Node::getF));

        Node start = new Node(0, 0, 0, calculateHeuristic(0, 0), null);  // Nodo inicial (a1)
        Node goal = new Node(SIZE - 1, SIZE - 1, 0, 0, null);  // Nodo objetivo (h8)
        openList.add(start);

        while (!openList.isEmpty()) {
            Node current = openList.poll();  // Obtiene el nodo con menor costo f
            int x = current.x;
            int y = current.y;

            if (x == goal.x && y == goal.y) {
                while (current != null) {  // Reconstruye el camino encontrado
                    path.add(new Point(current.x, current.y));
                    current = current.parent;
                }
                Collections.reverse(path);  // Invierte la lista para obtener el camino correcto
                return true;
            }

            visited[x][y] = true;

            // Explora los vecinos (arriba, abajo, izquierda, derecha)
            for (int[] dir : new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}}) {
                int nx = x + dir[0];
                int ny = y + dir[1];

                if (isValidMove(nx, ny) && !visited[nx][ny] && !blocked[nx][ny]) {
                    int gCost = current.g + 1;
                    int hCost = calculateHeuristic(nx, ny);
                    Node neighbor = new Node(nx, ny, gCost, hCost, current);
                    openList.add(neighbor);
                }
            }
        }
        return false;  // No se encontró un camino
    }

    // Calcula la heurística con la distancia Manhattan
    private int calculateHeuristic(int x, int y) {
        return Math.abs(x - (SIZE - 1)) + Math.abs(y - (SIZE - 1));
    }

    // Verifica si la casilla está dentro del tablero
    private boolean isValidMove(int x, int y) {
        return x >= 0 && y >= 0 && x < SIZE && y < SIZE;
    }

    // Método para resaltar el camino encontrado en rojo
    private void highlightPath() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (blocked[i][j]) {
                    board[i][j].setBackground(Color.BLACK);  // Mantiene las torres en negro
                } else {
                    board[i][j].setBackground(Color.WHITE);  // Restaura las casillas
                }
            }
        }
        for (Point p : path) {
            board[p.x][p.y].setBackground(Color.RED);  // Pinta el camino en rojo
        }
    }

    // Clase para los nodos del algoritmo A*
    private static class Node {
        int x, y, g, h;
        Node parent;

        public Node(int x, int y, int g, int h, Node parent) {
            this.x = x;
            this.y = y;
            this.g = g;
            this.h = h;
            this.parent = parent;
        }

        public int getF() {
            return g + h;  // Retorna el costo total (f = g + h)
        }
    }

    // Método principal que inicia la aplicación
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChessBoardPathfinding::new);  // Asegura que la GUI se ejecute en el hilo de eventos de Swing
    }
}
