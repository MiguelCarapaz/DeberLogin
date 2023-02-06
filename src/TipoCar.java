import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TipoCar {
    private JPanel Panel;
    private JRadioButton boton_chev;
    private JRadioButton boton_maz;
    private JLabel Imagen;
    private JRadioButton boton_kia;
    private JRadioButton boton_toy;
    private JRadioButton boton_hyun;
    private JLabel Modelo;

    public TipoCar(){
        boton_chev.addActionListener(new ActionListener() {
            //

            @Override
            public void actionPerformed(ActionEvent e) {
                Modelo.setText("Groove");
                Imagen.setIcon( new ImageIcon("img/chevrolet.png"));
                Imagen.setSize(500,500);
                boton_maz.setSelected(false);
                boton_kia.setSelected(false);
                boton_toy.setSelected(false);
                boton_hyun.setSelected(false);
            }
        });
        boton_maz.addActionListener(new ActionListener() {
            //Dog
            @Override
            public void actionPerformed(ActionEvent e) {
                Modelo.setText("KMO Milano");
                Imagen.setIcon( new ImageIcon("img/mazda.png"));
                boton_chev.setSelected(false);
                boton_kia.setSelected(false);
                boton_toy.setSelected(false);
                boton_hyun.setSelected(false);
            }
        });
        boton_kia.addActionListener(new ActionListener() {
            //Dog
            @Override
            public void actionPerformed(ActionEvent e) {
                Modelo.setText("KIA Picanto");
                Imagen.setIcon( new ImageIcon("img/kia.png"));
                boton_maz.setSelected(false);
                boton_chev.setSelected(false);
                boton_toy.setSelected(false);
                boton_hyun.setSelected(false);
            }
        });
        boton_toy.addActionListener(new ActionListener() {
            //Dog
            @Override
            public void actionPerformed(ActionEvent e) {
                Modelo.setText("Veloz Cross");
                Imagen.setIcon( new ImageIcon("img/toyota.png"));
                boton_maz.setSelected(false);
                boton_kia.setSelected(false);
                boton_chev.setSelected(false);
                boton_hyun.setSelected(false);
            }
        });
        boton_hyun.addActionListener(new ActionListener() {
            //Dog
            @Override
            public void actionPerformed(ActionEvent e) {
                Modelo.setText("Sinaloa");
                Imagen.setIcon( new ImageIcon("img/hyundai.png"));
                boton_maz.setSelected(false);
                boton_kia.setSelected(false);
                boton_toy.setSelected(false);
                boton_chev.setSelected(false);
            }
        });
    }
    public void a(){
        JFrame ventana = new JFrame("TIPO CARRO");
        ventana.setBounds(0,0,550,550);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(Panel);
        /*aplicacion.setSize(0,0,500,500);*/
        ventana.setVisible(true);
    }
}
