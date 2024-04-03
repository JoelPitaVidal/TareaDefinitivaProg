package calculadoramain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraCodigo extends JFrame{
    
    private JTextField operando1;
    private JTextField operando2;
    private JButton operacionSuma;
    private JButton operacionResta;
    private JTextArea resultados;
    
    
    
    public CalculadoraCodigo(){
        super("Calculadora Básica");
        setLayout(new FlowLayout());
        
        operando1= new JTextField(10);
        add(operando1);
        operando2= new JTextField(10);
        add(operando2);
        
        operacionSuma = new JButton("Realizar operación de suma");
        operacionSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
            // Obtener los valores de los campos de texto como números enteros
            int num1 = Integer.parseInt(operando1.getText());
            int num2 = Integer.parseInt(operando2.getText());
            
            // Realizar la operación de suma
            int resultado = num1 + num2;
            
            // Mostrar el resultado en el área de texto
            resultados.append("Suma: " + resultado + "\n");
                } catch (NumberFormatException ex) {
            // Manejar la excepción si se introducen caracteres no numéricos
            JOptionPane.showMessageDialog(null, "Por favor, introduce solo números en los operandos.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                 }
            });
        add(operacionSuma);
        
        operacionResta = new JButton("Realizar operación de resta");
        operacionResta.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
        try {
            // Obtener los valores de los campos de texto como números enteros
            int num1 = Integer.parseInt(operando1.getText());
            int num2 = Integer.parseInt(operando2.getText());
            
            // Realizar la operación de resta
            int resultado = num1 - num2;
            
            // Mostrar el resultado en el área de texto
            resultados.append("Resta: " + resultado + "\n");
                    } catch (NumberFormatException ex) {
            // Manejar la excepción si se introducen caracteres no numéricos
            JOptionPane.showMessageDialog(null, "Por favor, introduce solo números en los operandos.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
        add(operacionResta);
        
        
        resultados = new JTextArea(5, 20);
            resultados.setEditable(false);
        add(new JScrollPane(resultados));
        
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new CalculadoraCodigo();
    }
}