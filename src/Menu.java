import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener{

    private JMenuBar barra;
    private JMenu menu1;
    private JMenuItem menu_CalDIV, menu_IMC, menu_Cal,menu_Unidades;
    private JMenuItem menu_Tienda, menu_TipoCar, menu_perfil, menu_imagen, menu_movimiento;
    public Menu(){
        barra = new JMenuBar();
        setJMenuBar (barra); //
        menu1= new JMenu("MENU OPCIONES");
        barra.add(menu1);

        menu_CalDIV = new JMenuItem("CALCULADORA DE DIVISAS");
        menu1.add(menu_CalDIV); // Tamaño de la ventana se añade al menú
        menu_CalDIV.addActionListener(this);

        menu_IMC = new JMenuItem("IMC");
        menu1.add(menu_IMC);
        menu_IMC.addActionListener(this);

        menu_Cal = new JMenuItem("CALCULADORA");
        menu1.add(menu_Cal);
        menu_Cal.addActionListener(this);

        menu_Unidades = new JMenuItem("CONVERSOR DE UNIDADES");
        menu1.add(menu_Unidades);
        menu_Unidades.addActionListener(this);

        menu_Tienda = new JMenuItem("STOCK TIENDA");
        menu1.add(menu_Tienda);
        menu_Tienda.addActionListener(this);

        menu_TipoCar = new JMenuItem("TIPO CARRO");
        menu1.add(menu_TipoCar);
        menu_TipoCar.addActionListener(this);

        menu_perfil = new JMenuItem("PERFIL");
        menu1.add(menu_perfil);
        menu_perfil.addActionListener(this);

        menu_imagen = new JMenuItem("PELICULAS");
        menu1.add(menu_imagen);
        menu_imagen.addActionListener(this);

        menu_movimiento = new JMenuItem("MOVIMIENTO");
        menu1.add(menu_movimiento);
        menu_movimiento.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==menu_TipoCar){
            TipoCar ap = new TipoCar();
            ap.a();
        }
        if(e.getSource()==menu_perfil){
            Perfil p = new Perfil();
            p.a();
        }
        if(e.getSource()==menu_imagen){
            Pelicula peli = new Pelicula();
            peli.a();
        }
        if(e.getSource()==menu_movimiento){
            Movimiento mv = new Movimiento();
            mv.a();
        }

        if(e.getSource()==menu_CalDIV){
            divisas dv = new divisas();
        }
        if(e.getSource()==menu_IMC){
            new IMCCalculator();
        }
        if(e.getSource()==menu_Cal){
            calcu cl = new calcu();
            cl.a();
        }
        if(e.getSource()==menu_Unidades){
            new ConversorUnidades();
        }
        if(e.getSource()==menu_Tienda){
            tablas t1 = new tablas();
        }
    }

    public static void main(String[] args) {
        Menu m1 = new Menu();
        m1.setBounds(0,0,550,550);
        m1.setLocationRelativeTo(null);
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m1.setVisible(true);


        JLabel label = new JLabel();
        m1.add(label);
        label.setIcon(new ImageIcon("img/Perfil.png"));
        label.setBounds(500,0,50,50);
    }
}