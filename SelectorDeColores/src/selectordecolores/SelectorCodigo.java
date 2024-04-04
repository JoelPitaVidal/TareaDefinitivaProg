package selectordecolores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectorCodigo extends JFrame {
    private JComboBox<String> colorComboBox;
    private JPanel colorPanel;

    private String[] colors = {"Rojo", "Verde", "Azul"};
    private Color[] colorValues = {Color.RED, Color.GREEN, Color.BLUE};

    public SelectorCodigo() {
        setTitle("Selector de Colores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new BorderLayout());

        colorComboBox = new JComboBox<>(colors);
        colorComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = colorComboBox.getSelectedIndex();
                if (selectedIndex >= 0 && selectedIndex < colorValues.length) {
                    colorPanel.setBackground(colorValues[selectedIndex]);
                }
            }
        });

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);
        colorPanel.setPreferredSize(new Dimension(200, 100));

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Selecciona un color: "));
        topPanel.add(colorComboBox);

        add(topPanel, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);
        }
    }


