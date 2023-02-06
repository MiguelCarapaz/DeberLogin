import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Login extends Menu{
    private JLabel usuario;
    private JTextField escribirUsuario;
    private JPanel panel1;
    private JButton entrarButton;
    private JPasswordField escribirContra;

    public Login() {
        entrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean ingreso = false;
                String user = "miguel";
                String contrasenia ="miguel";
                String pass = new String(escribirContra.getPassword());
                if(escribirUsuario.getText().equals(user) && pass.equals(contrasenia)){
                        ingreso = true;
                }
                else {
                    JOptionPane.showMessageDialog(null,
                            "El usuario o contraseña son incorrectos");

                }

                if (!ingreso) {
                    JOptionPane.showMessageDialog(null,
                            "Intente de nuevo");
                }
                else {
                    Menu menu = new Menu();
                    menu.a();
                    /*
                    JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
                    JFrame frame = new JFrame("PAGINA PRINCIPAL");
                    frame.setContentPane(new Menu().getJMenuBar());
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setSize(700, 700);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                     */
                }
            }
        });
    }


    public static void main (String[] args){
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}