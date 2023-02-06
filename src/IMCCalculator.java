import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class IMCCalculator extends JFrame implements ActionListener {

    private JLabel pesoLabel;
    private JLabel alturaLabel;
    private JSpinner pesoSpinner;
    private JSpinner alturaSpinner;
    private JButton calcularBtn;
    private JLabel resultadoLabel;

    public IMCCalculator() {
        setLayout(new FlowLayout());
        pesoLabel = new JLabel("Peso (kg):");
        add(pesoLabel);
        pesoSpinner = new JSpinner(new SpinnerNumberModel(0.0, 0.0, 999.0, 1.0));
        add(pesoSpinner);
        alturaLabel = new JLabel("Altura (m):");
        add(alturaLabel);
        alturaSpinner = new JSpinner(new SpinnerNumberModel(0.0, 0.0, 999.0, 0.1));
        add(alturaSpinner);
        calcularBtn = new JButton("Calcular");
        add(calcularBtn);
        calcularBtn.addActionListener(this);
        resultadoLabel = new JLabel("");
        add(resultadoLabel);
        setTitle("Calculadora de IMC");

        //MODIFICADO
        //setSize(400, 300);
        setBounds(0,0,550,550);
        setLocationRelativeTo(null);
        //MODIFICADO
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double peso = (double) pesoSpinner.getValue();
        double altura = (double) alturaSpinner.getValue();
        double imc = peso / (altura * altura);
        resultadoLabel.setText("IMC: " + imc);
    }
    /*
    public static void main(String[] args) {
        new IMCCalculator();
    }
     */

    public static class ConversorUnidades extends JFrame {
        private JList<String> unitList;
        private JTextField inputField, outputField;
        private JButton convertButton;
        private String[] units = { "Metros", "Pies", "Pulgadas" };


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
                            result = inputValue;
                            break;
                        case 2:
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
            setSize(400, 100);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }

        public static void main(String[] args) {
            new ConversorUnidades();
        }
    }
}
