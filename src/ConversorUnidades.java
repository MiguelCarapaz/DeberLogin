import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConversorUnidades extends JFrame {
    private JList<String> unitList;
    private JTextField inputField, outputField;
    private JButton convertButton;
    private String[] units = { "De Metros a Pies","Pulgadas a Pies" };


    public ConversorUnidades() {
        setLayout(new FlowLayout());
        unitList = new JList<>(units);
        unitList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(unitList);
        inputField = new JTextField(10);
        add(inputField);
        convertButton = new JButton("Convertir");
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index = unitList.getSelectedIndex();
                double inputValue = Double.parseDouble(inputField.getText());
                double result = 0.0;
                switch (index) {
                    case 0:
                        result = inputValue * 3.28084;
                        break;
                    case 1:
                        result = inputValue / 12.0;
                        break;
                }
                outputField.setText(String.format("%.2f", result));
            }
        });
        add(convertButton);
        outputField = new JTextField(10);
        outputField.setEditable(false);
        add(outputField);
        setTitle("Convertidor de unidades");
        //MODIFICADO
        //setSize(400, 100);
        setBounds(0,0,550,550);
        setLocationRelativeTo(null);
        //MODIFICADO
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /*
    public static void main(String[] args) {
        new ConversorUnidades();
    }
    */
}