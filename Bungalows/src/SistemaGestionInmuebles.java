import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SistemaGestionInmuebles extends JFrame {
    private ArrayList<Inmueble> inmuebles;
    private Map<Integer, Recibo> recibos;

    public SistemaGestionInmuebles() {
        super("Gestión de Bungalows e Inmuebles");
        inmuebles = new ArrayList<>();
        recibos = new HashMap<>();

        // Crear la interfaz de usuario
        JPanel panel = new JPanel(new GridLayout(4, 2));
        JLabel lblDireccion = new JLabel("Dirección:");
        JTextField txtDireccion = new JTextField();
        JLabel lblNumero = new JLabel("Número:");
        JTextField txtNumero = new JTextField();
        JButton btnAgregarInmueble = new JButton("Agregar Inmueble");
        JButton btnMostrarInmuebles = new JButton("Mostrar Inmuebles");
        JButton btnGenerarRecibos = new JButton("Generar Recibos");
        JButton btnMostrarRecibos = new JButton("Mostrar Recibos");
        panel.add(lblDireccion);
        panel.add(txtDireccion);
        panel.add(lblNumero);
        panel.add(txtNumero);
        panel.add(btnAgregarInmueble);
        panel.add(btnMostrarInmuebles);
        panel.add(btnGenerarRecibos);
        panel.add(btnMostrarRecibos);
        add(panel);

        // Acción del botón para agregar un inmueble
        btnAgregarInmueble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String direccion = txtDireccion.getText();
                int numero = Integer.parseInt(txtNumero.getText());
                Inmueble nuevoInmueble = new Inmueble(direccion, numero);
                inmuebles.add(nuevoInmueble);
                JOptionPane.showMessageDialog(null, "Inmueble agregado correctamente");
            }
        });

        // Acción del botón para mostrar los inmuebles
        btnMostrarInmuebles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for (Inmueble inmueble : inmuebles) {
                    sb.append("Dirección: ").append(inmueble.getDireccion()).append(", Número: ").append(inmueble.getNumero()).append("\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString());
            }
        });

        // Acción del botón para generar recibos
        btnGenerarRecibos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarRecibos();
                JOptionPane.showMessageDialog(null, "Recibos generados correctamente");
            }
        });

        // Acción del botón para mostrar los recibos
        btnMostrarRecibos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for (Recibo recibo : recibos.values()) {
                    sb.append(recibo.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString());
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Clase Inmueble
    class Inmueble {
        private String direccion;
        private int numero;

        public Inmueble(String direccion, int numero) {
            this.direccion = direccion;
            this.numero = numero;
        }

        public String getDireccion() {
            return direccion;
        }

        public int getNumero() {
            return numero;
        }
    }

    // Clase Recibo
    class Recibo {
        private int numeroRecibo;
        private String detalle;

        public Recibo(int numeroRecibo, String detalle) {
            this.numeroRecibo = numeroRecibo;
            this.detalle = detalle;
        }

        @Override
        public String toString() {
            return "Recibo #" + numeroRecibo + ": " + detalle;
        }
    }

    // Método para generar recibos (simulado)
    private void generarRecibos() {
        // Lógica para generar los recibos (simulado)
        for (Inmueble inmueble : inmuebles) {
            int numeroRecibo = inmueble.getNumero(); // Simulación de número de recibo único por inmueble
            String detalle = "Detalle del recibo para el inmueble en " + inmueble.getDireccion();
            Recibo recibo = new Recibo(numeroRecibo, detalle);
            recibos.put(numeroRecibo, recibo);
        }
    }

    // Otros módulos y clases del sistema (pisos, alquileres, movimientos bancarios, informes, etc.)

    public static void main(String[] args) {
        new SistemaGestionInmuebles();
    }
}
