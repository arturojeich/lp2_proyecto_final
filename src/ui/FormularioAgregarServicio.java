package ui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Manuel René Pauls Toews
 */
public final class FormularioAgregarServicio extends JPanel {
    private final JButton agregarBtn;
    private final JTextField cuentaText, montoText, descripcionText, nombreText, iconoText;
    private final JLabel cuentaLabel, montoLabel, titulo, descripcionLabel, nombreLabel, iconoLabel;
    private final JPanel[] lineas = new JPanel[9];
    private App app;
    public FormularioAgregarServicio(App app) {
        this.app = app;
        //crear elementos
        agregarBtn = new JButton("Agregar");
        cuentaLabel = new JLabel("Nro. Cuenta: ");
        cuentaLabel.setPreferredSize(new Dimension(100, 20));
        montoLabel = new JLabel("Monto: ");
        montoLabel.setPreferredSize(new Dimension(100, 20));
        nombreLabel = new JLabel("Nombre: ");
        nombreLabel.setPreferredSize(new Dimension(100, 20));
        descripcionLabel = new JLabel("Descripción: ");
        descripcionLabel.setPreferredSize(new Dimension(100, 20));
        iconoLabel = new JLabel("Icono: ");
        iconoLabel.setPreferredSize(new Dimension(100, 20));
        cuentaText = new JTextField(20);
        cuentaText.setPreferredSize(new Dimension(150, 20));
        montoText = new JTextField(20);
        montoText.setPreferredSize(new Dimension(150, 20));
        nombreText = new JTextField(20);
        nombreText.setPreferredSize(new Dimension(150, 20));
        descripcionText = new JTextField(20);
        descripcionText.setPreferredSize(new Dimension(150, 20));
        iconoText = new JTextField(20);
        iconoText.setPreferredSize(new Dimension(150, 20));
        titulo = new JLabel("Agregar Servicio");
        titulo.setFont(new Font(titulo.getName(), Font.PLAIN, 20));
        
        //preparar lineas
        for(int i = 0; i < lineas.length; i++) {
            lineas[i] = new JPanel();
            lineas[i].setBackground(Color.decode("#f8f8ff"));
        }
        for(int i = 1; i < lineas.length-1; i++) 
            lineas[i].setMaximumSize(new Dimension(Integer.MAX_VALUE, 80));
        
        //a cada linea agregar elementos necesarios
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        lineas[1].add(titulo);
        lineas[2].add(cuentaLabel);
        lineas[2].add(cuentaText);
        lineas[3].add(montoLabel);
        lineas[3].add(montoText);
        lineas[4].add(nombreLabel);
        lineas[4].add(nombreText);
        lineas[5].add(descripcionLabel);
        lineas[5].add(descripcionText);
        lineas[6].add(iconoLabel);
        lineas[6].add(iconoText);
        lineas[7].add(agregarBtn);
        
        //agregar lineas a ventana
        for(int i = 0; i < lineas.length; i++) 
            this.add(lineas[i]);
    }
}
