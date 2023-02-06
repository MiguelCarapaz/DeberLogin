import javax.swing.*;

public class Perfil {
    private JLabel Imagen;
    private JScrollPane Tamano;
    private JPanel Contenedor;
    private JPanel Panel;

    public Perfil(){
        Imagen.setIcon( new ImageIcon("img/PerfilGrande.png"));
        Tamano.setVisible(true);
        Contenedor.setVisible(true);
    }

    public void a(){
        JFrame ventana = new JFrame("PERFIL");
        ventana.setBounds(0,0,550,550);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(Panel);
        /*aplicacion.setSize(0,0,500,500);*/
        ventana.setVisible(true);
    }
    /*
    private JLabel Imagen;
    private JCheckBox JScrollPaneCheckBox;

    Imagen.setBounds(0,0,100,100);
    Imagen.setIcon(new ImageIcon("img/Prfil.png"));
    JScrollPaneCheckBox.setBounds(0,0,100,100);
    JScrollPaneCheckBox.setSelected(true);

     */
}
