import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pelicula{

    public Pelicula(){
    }

    public void a() {
        JLabel Accion1 = new JLabel();
        Accion1.setIcon(new ImageIcon("img/Accion1.png"));
        Accion1.setOpaque(true);
        Accion1.setBounds(40,300,100,100);

        JLabel Accion2 = new JLabel();
        Accion2.setIcon(new ImageIcon("img/Accion2.png"));
        Accion2.setOpaque(true);
        Accion2.setBounds(190,300,100,100);


        JLabel Accion3 = new JLabel();
        Accion3.setIcon(new ImageIcon("img/Accion3.png"));
        Accion3.setOpaque(true);
        Accion3.setBounds(340,300,100,100);

        JLabel CF1 = new JLabel();
        CF1.setIcon(new ImageIcon("img/CienciaFiccion1.png"));
        CF1.setOpaque(true);
        CF1.setBounds(25,250,100,100);

        JLabel CF2 = new JLabel();
        CF2.setIcon(new ImageIcon("img/CienciaFiccion2.png"));
        CF2.setOpaque(true);
        CF2.setBounds(175,250,100,100);

        JLabel CF3 = new JLabel();
        CF3.setIcon(new ImageIcon("img/CienciaFiccion3.png"));
        CF3.setOpaque(true);
        CF3.setBounds(325,250,100,100);

        JLabel Terror1 = new JLabel();
        Terror1.setIcon(new ImageIcon("img/Terror1.png"));
        Terror1.setOpaque(true);
        Terror1.setBounds(10,200,100,100);

        JLabel Terror2 = new JLabel();
        Terror2.setIcon(new ImageIcon("img/Terror2.png"));
        Terror2.setOpaque(true);
        Terror2.setBounds(160,200,100,100);

        JLabel Terror3 = new JLabel();
        Terror3.setIcon(new ImageIcon("img/Terror3.png"));
        Terror3.setOpaque(true);
        Terror3.setBounds(310,200,100,100);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setSize(550,550);
        layeredPane.setVisible(true);

        JFrame frame = new JFrame("PELICULAS");
        frame.setBounds(0,0,550,550);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(layeredPane);
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);

        JButton A = new JButton("ACCION");
        A.setBounds(10,10,100,50);
        layeredPane.add(A);

        A.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layeredPane.add(Accion1);
                layeredPane.add(Accion2);
                layeredPane.add(Accion3);

                /*
                layeredPane.add(Accion1, JLayeredPane.DRAG_LAYER);
                layeredPane.add(CF2, JLayeredPane.PALETTE_LAYER;
                layeredPane.add(Terror3, JLayeredPane.DEFAULT_LAYER);
                 */

            }
        });

        JButton C = new JButton("CIENCIA FICCION");
        C.setBounds(160,10,100,50);
        layeredPane.add(C);

        C.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                A.setEnabled(false);
                layeredPane.add(CF1);
                layeredPane.add(CF2);
                layeredPane.add(CF3);
            }
        });

        JButton T = new JButton("TERROR");
        T.setBounds(310,10,100,50);
        layeredPane.add(T);

        T.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                C.setEnabled(false);
                layeredPane.add(Terror1);
                layeredPane.add(Terror2);
                layeredPane.add(Terror3);
                T.setEnabled(false);
            }
        });

    }
}
