import javax.swing.*;

public class Movimiento {
    private JPanel Panel;
    private JLabel Imagen2;
    private JLabel Imagen3;
    private JLabel Imagen4;
    private JLabel Imagen1;

    public Movimiento(){
        /*
        JDesktopPane dp = new JDesktopPane();
        JFrame v = new JFrame("Prueba JInternalFrame");
        v.getContentPane().add(dp);
        JInternalFrame internal = new JInternalFrame("Un Internal Frame");
        Imagen.setIcon( new ImageIcon("img/toyota.png"));
        internal.add(Imagen);
        internal.pack();
        dp.add(internal);
        ventana.setBounds(0,0,550,550);
        ventana.setLocationRelativeTo(null);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        internal.setVisible(true);
        */

    }

    public void a(){
        JFrame ventana = new JFrame("JUEGO-MOVIMIENTO");
        JDesktopPane dp = new JDesktopPane();
        ventana.getContentPane().add(dp);

        // Se construye el panel que ira dentro del JInternalFrame
        // Se construye el JInternalFrame
        JInternalFrame internal1 = new JInternalFrame("Avion 1");
        Imagen1.setIcon( new ImageIcon("img/avion1.png"));
        internal1.add(Imagen1);

        JInternalFrame internal2 = new JInternalFrame("Avion 2");
        Imagen2.setIcon( new ImageIcon("img/avion2.png"));
        internal2.add(Imagen2);

        JInternalFrame internal3 = new JInternalFrame("Avion 3");
        Imagen3.setIcon( new ImageIcon("img/avion3.png"));
        internal3.add(Imagen3);

        JInternalFrame internal4 = new JInternalFrame("Avion 4");
        Imagen4.setIcon( new ImageIcon("img/avion4.png"));
        internal4.add(Imagen4);
        // Es importante darle tamaño -pack()- al JInternalFrame,
        // porque si no, tendrá tamaño 0,0 y no lo veremos.
        internal1.pack();
        internal1.setBounds(0,0,100,100);
        internal2.pack();
        internal2.setBounds(20,20,100,100);
        internal3.pack();
        internal3.setBounds(40,40,100,100);
        internal4.pack();
        internal4.setBounds(60,60,100,100);

        // Por defecto el JInternalFrame no es redimensionable ni
        // tiene el botón de cerrar, así que se lo ponemos.

        // Se mete el internal en el JDesktopPane
        dp.add(internal1);
        dp.add(internal2);
        dp.add(internal3);
        dp.add(internal4);

        // Se visualiza todo.
        ventana.setBounds(0,0,550,550);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Se visualiza el JInternalFrame
        internal1.setVisible(true);
        internal2.setVisible(true);
        internal3.setVisible(true);
        internal4.setVisible(true);
        ventana.setVisible(true);
    }
}