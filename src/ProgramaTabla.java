import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramaTabla extends JFrame implements ActionListener {
    private JTextField nombreTextField, apellidoTextField;
    private JComboBox<String> cursoComboBox;
    private JButton agregarButton;
    private DefaultTableModel tablaModelo;

    public ProgramaTabla() {
        setTitle("Programa de Tabla");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Crear paneles
        JPanel panelDatos = new JPanel(new GridLayout(3, 2));
        JPanel panelBoton = new JPanel(new FlowLayout());

        // Componentes de entrada
        nombreTextField = new JTextField();
        apellidoTextField = new JTextField();
        String[] cursos = {"DAM1", "DAM2", "ASIR1"};
        cursoComboBox = new JComboBox<>(cursos);

        // Botón de agregar
        agregarButton = new JButton("Agregar Tabla");
        agregarButton.addActionListener(this);

        // Añadir componentes al panel de datos
        panelDatos.add(new JLabel("Nombre:"));
        panelDatos.add(nombreTextField);
        panelDatos.add(new JLabel("Apellido:"));
        panelDatos.add(apellidoTextField);
        panelDatos.add(new JLabel("Curso:"));
        panelDatos.add(cursoComboBox);

        // Crear tabla
        tablaModelo = new DefaultTableModel();
        JTable tabla = new JTable(tablaModelo);
        tablaModelo.addColumn("Nombre");
        tablaModelo.addColumn("Apellido");
        tablaModelo.addColumn("Curso");

        // Agregar paneles y tabla al frame
        add(panelDatos, BorderLayout.NORTH);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
        add(panelBoton, BorderLayout.SOUTH);
        panelBoton.add(agregarButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == agregarButton) {
            String nombre = nombreTextField.getText();
            String apellido = apellidoTextField.getText();
            String curso = (String) cursoComboBox.getSelectedItem();
            tablaModelo.addRow(new Object[]{nombre, apellido, curso});

            // Limpiar campos después de agregar a la tabla
            nombreTextField.setText("");
            apellidoTextField.setText("");
        }
    }
}