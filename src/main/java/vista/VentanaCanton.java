/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.CantonControl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class VentanaCanton extends JFrame implements ActionListener{
    
    private CantonControl actorControl;
    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;

    public void iniciarPaneles() {

        this.actorControl = new CantonControl();

        this.jPanelList = new ArrayList<>();
        this.jLabelList = new ArrayList<>();
        this.jTextFieldList = new ArrayList<>();
        this.jButtonList = new ArrayList<>();
        this.jComboBoxList = new ArrayList<>();
        this.jRadioButtonList = new ArrayList<>();
        this.jCheckBoxList = new ArrayList<>();

        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jButtonList.add(new JButton("Guadar"));
        this.jButtonList.add(new JButton("Listar"));

        this.jTextFieldList.add(new JTextField("", 20));
        this.jTextFieldList.add(new JTextField("", 20));
        this.jTextFieldList.add(new JTextField("", 20));
        this.jTextFieldList.add(new JTextField("", 5));

        this.jLabelList.add(new JLabel("Ingrese el nombre del canton: "));
        this.jLabelList.add(new JLabel("Ingrese la expaccion Territorial: "));
        this.jLabelList.add(new JLabel("Ingrese el numeros de habitantes "));

        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(0).add(this.jTextFieldList.get(0));

        this.jPanelList.get(0).add(this.jLabelList.get(1));
        this.jPanelList.get(0).add(this.jTextFieldList.get(1));

        this.jPanelList.get(0).add(this.jLabelList.get(2));
        this.jPanelList.get(0).add(this.jTextFieldList.get(2));

        var ButtonGroup = new ButtonGroup();
        this.jRadioButtonList.add(new JRadioButton("Maculino"));
        this.jRadioButtonList.add(new JRadioButton("Femenino"));

        ButtonGroup.add(this.jRadioButtonList.get(0));
        ButtonGroup.add(this.jRadioButtonList.get(1));

        this.jPanelList.get(0).add(this.jLabelList.get(3));
        this.jPanelList.get(0).add(this.jRadioButtonList.get(0));
        this.jPanelList.get(0).add(this.jRadioButtonList.get(1));

        var listaPaises = new String[4];
        listaPaises[0] = "ACCION";
        listaPaises[1] = "COMEDIO";
        listaPaises[2] = "TERROR";
        listaPaises[3] = "ROMANTICA";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaPaises)));

        this.jPanelList.get(0).add(this.jLabelList.get(4));
        this.jPanelList.get(0).add(this.jComboBoxList.get(0));

        this.jPanelList.get(0).add(this.jLabelList.get(5));
        this.jPanelList.get(0).add(this.jTextFieldList.get(3));

        this.jPanelList.get(0).add(this.jButtonList.get(0));
        this.jPanelList.get(0).add(this.jButtonList.get(1));

        this.jButtonList.get(0).addActionListener((ActionListener) this);
        this.jButtonList.get(1).addActionListener((ActionListener) this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.jButtonList.get(0))) {
            var datos = new String[6];

            datos[0] = this.jTextFieldList.get(0).getText();
            datos[1] = this.jTextFieldList.get(1).getText();
            datos[2] = this.jTextFieldList.get(2).getText();

            if (this.jRadioButtonList.get(0).isSelected()) {
                datos[3] = "Masculino";

            } else {
                if (this.jRadioButtonList.get(1).isSelected()) {
                    datos[3] = "Femenino";
                } else {

                }
            }
            datos[4] = this.jComboBoxList.get(0).getSelectedItem().toString();
            datos[5] = this.jTextFieldList.get(3).getText();

            this.actorControl.crear(datos);

        }

        if (e.getSource().equals(this.jButtonList.get(1))) {
            System.out.println("--------------------------------");

            for (var canton : actorControl.listar()) {
                System.out.println("Canton=" + canton.toString());

            }
        }
    }
    
}
