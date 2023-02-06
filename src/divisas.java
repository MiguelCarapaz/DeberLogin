import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class divisas extends JFrame {
    private JTextField divisa;
    private JTextField divisafinal;
    private JComboBox combo2;
    private JComboBox combo1;
    private JButton convertir;
    private JPanel mainPanel;
    private JButton limpiar;

    public divisas() {
        setTitle("CONVERSOR");
        //MODIFICADO
        //setSize(500, 300);
        setBounds(0,0,550,550);
        setLocationRelativeTo(null);
        //MODIFICADO
        setContentPane(mainPanel);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        
        convertir.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                double moneda = Double.parseDouble(divisa.getText());
                int div = combo1.getSelectedIndex();
                int div1 = combo2.getSelectedIndex();
                     convertir conexion = new convertir();

                conexion.setMoneda(moneda);

                conexion.setDiv(div);
                conexion.setDiv1(div1);
                conexion.conversor();

                divisafinal.setText(String.valueOf(conexion.getResultado()));
            }
        });

        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                divisa.setText("");
                divisafinal.setText("");
            }
        });

    }
    /*
    public static void main(String[] args) {
        divisas divisa1 = new divisas();

    }
     */
}
