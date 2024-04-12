import javax.swing.*;
import java.awt.*;

public class MediaControlPanel extends JFrame {

    public MediaControlPanel() {
        // Configurar la ventana principal
        setTitle("Panel de Control de Medios");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Crear paneles
        JPanel controlPanel = createControlPanel();
        JPanel numericPanel = createNumericPanel();
        JProgressBar progressBar = new JProgressBar();

        // Configurar BorderLayout para la ventana principal
        setLayout(new BorderLayout());

        // Añadir paneles a la ventana principal
        add(progressBar, BorderLayout.NORTH);
        add(controlPanel, BorderLayout.SOUTH);
        add(numericPanel, BorderLayout.CENTER);
    }

    private JPanel createControlPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        JButton playButton = new JButton("Play");
        JButton pauseButton = new JButton("Pause");
        JButton stopButton = new JButton("Stop");

        panel.add(playButton);
        panel.add(pauseButton);
        panel.add(stopButton);

        return panel;
    }

    private JPanel createNumericPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 3));

        for (int i = 1; i <= 9; i++) {
            panel.add(new JButton(String.valueOf(i)));
        }
        panel.add(new JButton("*"));
        panel.add(new JButton("0"));
        panel.add(new JButton("#"));

        return panel;

    }
}
