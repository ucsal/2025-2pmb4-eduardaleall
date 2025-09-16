package br.com.mariojp.figureeditor;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {}

            JFrame frame = new JFrame("Figure Editor — Clique para inserir figuras");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            DrawingPanel panel = new DrawingPanel(new CircleFactory());
            JMenuBar menuBar = new JMenuBar();
            JMenu menu = new JMenu("Formas");

            JMenuItem circleItem = new JMenuItem("Círculo");
            circleItem.addActionListener(e -> panel.setShapeFactory(new CircleFactory())); // >>> ALTERAÇÃO

            JMenuItem rectItem = new JMenuItem("Retângulo");
            rectItem.addActionListener(e -> panel.setShapeFactory(new RectangleFactory())); // >>> ALTERAÇÃO

            JMenuItem clearItem = new JMenuItem("Limpar Tela");
            clearItem.addActionListener(e -> panel.clear());

            menu.add(circleItem);
            menu.add(rectItem);
            menu.addSeparator();
            menu.add(clearItem);
            menuBar.add(menu);
            frame.setJMenuBar(menuBar);

            frame.setLayout(new BorderLayout());
            frame.add(panel, BorderLayout.CENTER);

            frame.setSize(900, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
