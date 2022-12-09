/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ProvinciaControl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class VentanaProvincia extends JFrame {
    
    private ProvinciaControl provinciaControl;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JTextField> jTextFieldList;
    private List<JLabel> jLabelList;

    public VentanaProvincia() {
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        this.provinciaControl = new ProvinciaControl();
        this.jPanelList = new ArrayList<>();
        this.jTextFieldList = new ArrayList<>();
        this.jButtonList = new ArrayList<>();
    }
    
}
