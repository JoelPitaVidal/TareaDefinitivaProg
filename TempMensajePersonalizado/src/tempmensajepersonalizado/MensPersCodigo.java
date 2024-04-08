package tempmensajepersonalizado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class MensPersCodigo {
    JButton boton;
    int count = 0;

    public MensPersCodigo() {
        boton = new JButton("Haz clic");

        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar mensaje predeterminado usando JOptionPane
                JOptionPane.showMessageDialog(null, "Mensaje predeterminado");

                // Incrementar el contador
                count++;

                // Si el contador alcanza cierto número, cambiar el mensaje y reiniciar el contador
                if (count == 5) {
                    JOptionPane.showMessageDialog(null, "Mensaje modificado");
                    count = 0; // Reiniciar el contador
                }
            }
        });

        // Iniciar el temporizador
        timer.start();
        
        // Agregar acción al botón
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "¡Botón presionado!");
            }
        });
    }
}