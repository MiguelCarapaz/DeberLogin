import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tablas extends JFrame {
    private JTable table1;
    private JPanel tabla;
    private JButton agreagrButton;
    private JButton eliminarButton;


    DefaultTableModel model = new DefaultTableModel();

    public tablas() {

        setTitle("STOCK TIENDA");
        setSize(500, 300);
        setContentPane(tabla);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        String[] titulo = new String[]{"ID", "PRODUCTO", "DESCRIPCION", "CANTIDAD"};
        model.setColumnIdentifiers(titulo);
        table1.setModel(model);


        agreagrButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregar();
            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminar();
            }
        });
    }
    public void agregar(){
        model.addRow(new Object[]{1,"paracetamol","hoasjjjd","precio"});
    }

    public void eliminar() {
        int fila = table1.getSelectedRow();

            model.removeRow(fila);

    }
    public static void main(String[] args) {


        tablas t1 = new tablas();
    }
}