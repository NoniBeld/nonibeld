package cuadroDeDialogo;

import javax.swing.*;
import java.awt.*;

public class ChessBoard {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChessBoard::createGUI);
    }

    private static void createGUI() {
        JFrame frame = new JFrame("Chess Board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);

        JPanel mainPanel = new JPanel(new BorderLayout());

        // Panel de jugadores
        JLabel player1 = new JLabel("Jugador 1", SwingConstants.CENTER);
        JLabel player2 = new JLabel("Jugador 2", SwingConstants.CENTER);
        mainPanel.add(player1, BorderLayout.NORTH);
        mainPanel.add(player2, BorderLayout.SOUTH);

        // Panel del tablero
        JPanel boardPanel = new JPanel(new GridLayout(8, 8));
        boardPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        Color[] colors = {Color.CYAN, Color.GRAY};
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JPanel square = new JPanel();
                square.setBackground(colors[(row + col) % 2]);
                boardPanel.add(square);
            }
        }
        mainPanel.add(boardPanel, BorderLayout.CENTER);

        // Paneles laterales para las piezas
        JPanel leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(100, 800));
        leftPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        leftPanel.setBackground(Color.WHITE);

        JPanel rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(100, 800));
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        rightPanel.setBackground(Color.WHITE);
        
        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(rightPanel, BorderLayout.EAST);
        
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
