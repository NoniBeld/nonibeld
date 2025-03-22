package cuadroDeDialogo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FibonacciGrid {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(FibonacciGrid::createGUI);
    }

    private static void createGUI() {
        // Crear la ventana
        JFrame frame = new JFrame("Fibonacci Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Obtener tamaño de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;

        // Crear el panel principal con GridBagLayout
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Generar la secuencia de Fibonacci y agregar cuadros
        List<Integer> fibSequence = generateFibonacci(width / 2, height / 2);
        int x = width / 40, y = height / 40;
        int direction = 0;
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.CYAN};

        for (int i = 0; i < fibSequence.size(); i++) {
            int size = fibSequence.get(i);
            JPanel panel = new JPanel();
            panel.setBackground(colors[i % colors.length]);
            gbc.gridx = x;
            gbc.gridy = y;
            gbc.gridwidth = Math.max(1, size / 20);
            gbc.gridheight = Math.max(1, size / 20);
            mainPanel.add(panel, gbc);

            // Movimiento en espiral
            switch (direction % 4) {
                case 0 -> x += size;  // Derecha
                case 1 -> y += size;  // Abajo
                case 2 -> x -= size;  // Izquierda
                case 3 -> y -= size;  // Arriba
            }
            direction++;
        }
        
        // Cuadro más grande con CardLayout
        JPanel cardPanel = new JPanel(new CardLayout());
        String[] cardColors = {"#FFFFFF", "#FF0000", "#0000FF", "#00FF00", "#000000"};
        for (String color : cardColors) {
            JPanel colorPanel = new JPanel();
            colorPanel.setBackground(Color.decode(color));
            cardPanel.add(colorPanel, color);
        }
        
        // Botón para cambiar colores en el CardLayout
        JButton changeColorButton = new JButton("Cambiar Color");
        changeColorButton.addActionListener(new ActionListener() {
            private int index = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (cardPanel.getLayout());
                index = (index + 1) % cardColors.length;
                cl.show(cardPanel, cardColors[index]);
            }
        });
        
        JPanel cardContainer = new JPanel(new BorderLayout());
        cardContainer.add(cardPanel, BorderLayout.CENTER);
        cardContainer.add(changeColorButton, BorderLayout.SOUTH);
        
        mainPanel.add(cardContainer);

        // Cuadro central con BorderLayout
        JPanel centralPanel = new JPanel(new BorderLayout());
        centralPanel.add(new JLabel("N", SwingConstants.CENTER), BorderLayout.NORTH);
        centralPanel.add(new JLabel("S", SwingConstants.CENTER), BorderLayout.SOUTH);
        centralPanel.add(new JLabel("E", SwingConstants.CENTER), BorderLayout.EAST);
        centralPanel.add(new JLabel("O", SwingConstants.CENTER), BorderLayout.WEST);

        // GridLayout 2x2 para botones
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2));
        for (int i = 1; i <= 4; i++) {
            buttonPanel.add(new JButton("Botón " + i));
        }
        centralPanel.add(buttonPanel, BorderLayout.CENTER);

        mainPanel.add(centralPanel);

        frame.add(mainPanel);
        frame.setSize(width, height);
        frame.setVisible(true);
    }

    private static List<Integer> generateFibonacci(int maxWidth, int maxHeight) {
        List<Integer> sequence = new ArrayList<>();
        int a = 20, b = 20;
        while (a < maxWidth && a < maxHeight) {
            sequence.add(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
        return sequence;
    }
}
