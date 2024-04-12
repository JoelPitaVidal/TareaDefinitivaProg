import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private Float operando1;
    private Float operando2;
    private Float resultado;
    private double operacion;
    public Calculadora() {
        TextArea pantalla = new TextArea();
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new GridLayout(4,4));

        //Botones
        JButton boton1 = new JButton("1");
        JButton boton2 = new JButton("2");
        JButton boton3 = new JButton("3");
        JButton boton4 = new JButton("4");
        JButton boton5 = new JButton("5");
        JButton boton6 = new JButton("6");
        JButton boton7 = new JButton("7");
        JButton boton8 = new JButton("8");
        JButton boton9 = new JButton("9");
        JButton boton0 = new JButton("0");

        JButton botonAdd = new JButton("+");
        JButton botonSub = new JButton("-");
        JButton botonMul = new JButton("*");
        JButton botonDiv = new JButton("/");

        JButton botonEqual = new JButton("=");
        JButton botonC = new JButton("C");


        setTitle("Calculadora");
        setSize(new Dimension(300,300));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());
        //Area Norte
        add(pantalla, BorderLayout.NORTH);

        //Area Centro
        add(panelCentral, BorderLayout.CENTER);
        panelCentral.add(boton1);
        panelCentral.add(boton2);
        panelCentral.add(boton3);
        panelCentral.add(boton4);
        panelCentral.add(boton5);
        panelCentral.add(boton6);
        panelCentral.add(boton7);
        panelCentral.add(boton8);
        panelCentral.add(boton9);
        panelCentral.add(boton0);
        panelCentral.add(botonAdd);
        panelCentral.add(botonSub);
        panelCentral.add(botonMul);
        panelCentral.add(botonDiv);
        panelCentral.add(botonEqual);
        panelCentral.add(botonC);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("1");
            }
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("2");
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("3");
            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("4");
            }
        });
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("5");
            }
        });
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("6");
            }
        });
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("7");
            }
        });
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("8");
            }
        });
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("9");
            }
        });
        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("0");
            }
        });

        botonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operando1 = Float.parseFloat(pantalla.getText());
                pantalla.setText("");
                resultado = operando1+operando2;;
            }
        });
        botonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operando1 = Float.parseFloat(pantalla.getText());
                pantalla.setText("");
                operacion = operando1-operando2;;
            }
        });
        botonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operando1 = Float.parseFloat(pantalla.getText());
                pantalla.setText("");
                operacion = operando1*operando2;;;
            }
        });
        botonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operando1 = Float.parseFloat(pantalla.getText());
                pantalla.setText("");
                operacion =  operando1/operando2;;;
            }
        });

        botonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operando1 = 0f;
                operando2 = 0f;
                resultado = 0f;
                pantalla.setText("");
            }
        });


        botonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operando2 = Float.parseFloat(pantalla.getText());
                pantalla.setText(resultado.toString());
            }
        });



        setVisible(true);

    }
}