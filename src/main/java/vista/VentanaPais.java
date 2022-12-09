/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.PaisControl;
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
public class VentanaPais extends JFrame{
    
    private PaisControl paisControl;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JTextField> jTextFieldList;
    private List<JLabel> jLabelList;

    public VentanaPais() {
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        this.paisControl = new PaisControl();
        this.jPanelList = new ArrayList<>();
        this.jTextFieldList = new ArrayList<>();
        this.jButtonList = new ArrayList<>();
        }
    
}
