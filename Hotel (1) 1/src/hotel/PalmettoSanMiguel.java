
package hotel;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author PC GAMER
 */
public class PalmettoSanMiguel extends javax.swing.JFrame {
    private String sucursal;
    private String habitacion;
    private String huesped;
    private Date entradaDate;
    private Date salidaDate;


    public PalmettoSanMiguel() {
        initComponents();
    }
    public PalmettoSanMiguel(String sucursal, String habitacion, String huesped, Date entradaDate, Date salidaDate) {
        initComponents();
        this.sucursal = sucursal;
        this.habitacion = habitacion;
        this.huesped = huesped;
        this.entradaDate = entradaDate;
        this.salidaDate = salidaDate;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        seleccion = new javax.swing.JLabel();
        Ofrece = new javax.swing.JLabel();
        Incluye = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        AvPerla = new javax.swing.JLabel();
        HotelPerla = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        imagenPerla = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        capacidad2 = new javax.swing.JLabel();
        Descripcion1Cuarto3 = new javax.swing.JLabel();
        Descripcion3Cuarto3 = new javax.swing.JLabel();
        Descripcion2Cuarto3 = new javax.swing.JLabel();
        Descripcion4Cuarto3 = new javax.swing.JLabel();
        tamaño3 = new javax.swing.JLabel();
        aireAcondicional3 = new javax.swing.JLabel();
        costo1 = new javax.swing.JLabel();
        btnReserva3 = new javax.swing.JButton();
        imagenCuarto3 = new javax.swing.JLabel();
        DatosCuarto3 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        AvMiguel = new javax.swing.JLabel();
        hotelMiguel = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        imagenMiguel = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        imagenBorja = new javax.swing.JLabel();
        AvBorja = new javax.swing.JLabel();
        hotelBorja = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        capacidad4 = new javax.swing.JLabel();
        Descripcion1Cuarto5 = new javax.swing.JLabel();
        Descripcion3Cuarto5 = new javax.swing.JLabel();
        Descripcion2Cuarto5 = new javax.swing.JLabel();
        Descripcion4Cuarto5 = new javax.swing.JLabel();
        tamaño5 = new javax.swing.JLabel();
        aireAcondicional7 = new javax.swing.JLabel();
        costo3 = new javax.swing.JLabel();
        btnReserva4 = new javax.swing.JButton();
        imagenCuarto4 = new javax.swing.JLabel();
        DatosCuarto5 = new javax.swing.JLabel();
        aireAcondicional8 = new javax.swing.JLabel();
        Descripcion4Cuarto6 = new javax.swing.JLabel();
        Descripcion2Cuarto4 = new javax.swing.JLabel();
        Descripcion4Cuarto4 = new javax.swing.JLabel();
        tamaño4 = new javax.swing.JLabel();
        aireAcondicional4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnReserva2 = new javax.swing.JButton();
        imagenCuarto5 = new javax.swing.JLabel();
        DatosCuarto6 = new javax.swing.JLabel();
        secadora4 = new javax.swing.JLabel();
        capacidad5 = new javax.swing.JLabel();
        Descripcion1Cuarto4 = new javax.swing.JLabel();
        Descripcion3Cuarto4 = new javax.swing.JLabel();
        Descripcion2Cuarto19 = new javax.swing.JLabel();
        caja = new javax.swing.JLabel();
        secadora = new javax.swing.JLabel();
        capacidad3 = new javax.swing.JLabel();
        Descripcion1Cuarto6 = new javax.swing.JLabel();
        Descripcion2Cuarto7 = new javax.swing.JLabel();
        Descripcion2Cuarto8 = new javax.swing.JLabel();
        Descripcion2Cuarto9 = new javax.swing.JLabel();
        tamaño6 = new javax.swing.JLabel();
        aireAcondicional5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnReserva1 = new javax.swing.JButton();
        imagenCuarto6 = new javax.swing.JLabel();
        DatosCuarto4 = new javax.swing.JLabel();
        secadora5 = new javax.swing.JLabel();
        Descripcion2Cuarto20 = new javax.swing.JLabel();
        secadora6 = new javax.swing.JLabel();
        secadora7 = new javax.swing.JLabel();
        secadora8 = new javax.swing.JLabel();
        secadora9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 242, 235));

        seleccion.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        seleccion.setForeground(new java.awt.Color(134, 179, 0));
        seleccion.setText("Seleccione una habitación ");

        Ofrece.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        Ofrece.setForeground(new java.awt.Color(134, 179, 0));
        Ofrece.setText("✓ Wi-Fi gratis ✓ Habitaciones para no fumadores ✓ Restaurante en el lugar ✓ Piscina al aire libre ✓ Gimnasio ✓ Centro de negocios");

        Incluye.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        Incluye.setForeground(new java.awt.Color(134, 179, 0));
        Incluye.setText("Su estadía con Hotel Palmetto incluye");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator7.setForeground(new java.awt.Color(204, 204, 204));

        AvPerla.setBackground(new java.awt.Color(0, 0, 0));
        AvPerla.setForeground(new java.awt.Color(102, 102, 102));
        AvPerla.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AvPerla.setText(" AV. LA MARINA 1090, LIMA 15087 PERÚ");

        HotelPerla.setBackground(new java.awt.Color(0, 0, 0));
        HotelPerla.setForeground(new java.awt.Color(102, 102, 102));
        HotelPerla.setText("PALMETTO LA PERLA ");

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));

        imagenPerla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Hotel palmeto la Perla.jpg"))); // NOI18N

        jSeparator10.setBackground(new java.awt.Color(134, 179, 0));
        jSeparator10.setForeground(new java.awt.Color(134, 179, 0));
        jSeparator10.setPreferredSize(new java.awt.Dimension(0, 5));

        capacidad2.setForeground(new java.awt.Color(102, 102, 102));
        capacidad2.setText("2 adultos");

        Descripcion1Cuarto3.setText("Nuestras habitaciones doble twin, se encuentran ubicadas en todos");

        Descripcion3Cuarto3.setText("cuentan con dos individuales, escritorio de trabajo, aire");

        Descripcion2Cuarto3.setText("los pisos del hotel y cuentan con vistas internas. Estas habitaciones");

        Descripcion4Cuarto3.setText("acondicionado y calefacción, TV cable, closet y baño privado.");

        tamaño3.setText("Tamaño de la habitación: 18 m² aproximadamente");

        aireAcondicional3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aire Acondicional.png"))); // NOI18N

        costo1.setBackground(new java.awt.Color(164, 236, 164));
        costo1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        costo1.setForeground(new java.awt.Color(97, 165, 97));
        costo1.setText("PEN 212");

        btnReserva3.setBackground(new java.awt.Color(134, 179, 0));
        btnReserva3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnReserva3.setForeground(new java.awt.Color(255, 255, 255));
        btnReserva3.setText("Reservar");
        btnReserva3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserva3ActionPerformed(evt);
            }
        });

        imagenCuarto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cuarto6.jpg"))); // NOI18N

        DatosCuarto3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DatosCuarto3.setText("Doble Twin");

        jSeparator11.setBackground(new java.awt.Color(134, 179, 0));
        jSeparator11.setForeground(new java.awt.Color(134, 179, 0));
        jSeparator11.setPreferredSize(new java.awt.Dimension(0, 5));

        AvMiguel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AvMiguel.setText("AV. LA MARINA 3691, LIMA 15087 PERÚ.");

        hotelMiguel.setText("PALMETTO SAN MIGUEL");

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        imagenMiguel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hotel san MIguel.jpg"))); // NOI18N

        jSeparator12.setBackground(new java.awt.Color(134, 179, 0));
        jSeparator12.setForeground(new java.awt.Color(134, 179, 0));
        jSeparator12.setPreferredSize(new java.awt.Dimension(0, 5));

        imagenBorja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Hotel San borja.jpg"))); // NOI18N

        AvBorja.setForeground(new java.awt.Color(102, 102, 102));
        AvBorja.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AvBorja.setText("AV. SAN BORJA SUR 415 SAN BORJA LIMA 15036 PE");

        hotelBorja.setForeground(new java.awt.Color(102, 102, 102));
        hotelBorja.setText("PALMETTO SAN BORJA");

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));

        capacidad4.setForeground(new java.awt.Color(102, 102, 102));
        capacidad4.setText("2 adultos");

        Descripcion1Cuarto5.setText("Nuestras habitaciones suite con bañera hidromasaje, se encuentran");

        Descripcion3Cuarto5.setText("hacia la ciudad. Estas habitaciones cuentan con una cama de");

        Descripcion2Cuarto5.setText("ubicadas en todos los pisos del hotel y cuentan con vistas exteriores");

        Descripcion4Cuarto5.setText("tamaño King, escritorio de trabajo, aire acondicionado y calefacción,");

        tamaño5.setText("Tamaño de la habitación: 25 m² aproximadamente");

        aireAcondicional7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aire Acondicional.png"))); // NOI18N

        costo3.setBackground(new java.awt.Color(164, 236, 164));
        costo3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        costo3.setForeground(new java.awt.Color(97, 165, 97));
        costo3.setText("PEN 222");

        btnReserva4.setBackground(new java.awt.Color(134, 179, 0));
        btnReserva4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnReserva4.setForeground(new java.awt.Color(255, 255, 255));
        btnReserva4.setText("Reservar");
        btnReserva4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserva4ActionPerformed(evt);
            }
        });

        imagenCuarto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuarto10.jpg"))); // NOI18N

        DatosCuarto5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DatosCuarto5.setText("Suite con bañera");

        aireAcondicional8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bañera.png"))); // NOI18N

        Descripcion4Cuarto6.setText("TV cable, jacuzzi, closet y baño privado.");

        Descripcion2Cuarto4.setText("todos los pisos del hotel y cuentan con vistas exteriores hacia la");

        Descripcion4Cuarto4.setText("Queen, escritorio de trabajo, aire acondicionado y calefacción, TV");

        tamaño4.setText("Tamaño de la habitación: 18 m² aproximadamente");

        aireAcondicional4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aire Acondicional.png"))); // NOI18N

        jLabel14.setBackground(new java.awt.Color(164, 236, 164));
        jLabel14.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(97, 165, 97));
        jLabel14.setText("PEN 190");

        btnReserva2.setBackground(new java.awt.Color(134, 179, 0));
        btnReserva2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnReserva2.setForeground(new java.awt.Color(255, 255, 255));
        btnReserva2.setText("Reservar");
        btnReserva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserva2ActionPerformed(evt);
            }
        });

        imagenCuarto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuarto9.jpg"))); // NOI18N

        DatosCuarto6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DatosCuarto6.setText("Doble Superior");

        secadora4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/secadora.png"))); // NOI18N

        capacidad5.setForeground(new java.awt.Color(102, 102, 102));
        capacidad5.setText("2 adultos");

        Descripcion1Cuarto4.setText("Nuestras habitaciones doble superior, se encuentran ubicadas en");

        Descripcion3Cuarto4.setText("ciudad. Estas habitaciones cuentan con una cama de tamaño");

        Descripcion2Cuarto19.setText("cable, closet y baño privado.");

        caja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caja.png"))); // NOI18N

        secadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/secadora.png"))); // NOI18N

        capacidad3.setForeground(new java.awt.Color(102, 102, 102));
        capacidad3.setText("2 adultos");

        Descripcion1Cuarto6.setText("Nuestras habitaciones doble superior, se encuentran ubicadas en");

        Descripcion2Cuarto7.setText("ciudad. Estas habitaciones cuentan con una cama de tamaño");

        Descripcion2Cuarto8.setText("todos los pisos del hotel y cuentan con vistas exteriores hacia la");

        Descripcion2Cuarto9.setText("Queen, escritorio de trabajo, aire acondicionado y calefacción, TV");

        tamaño6.setText("Tamaño de la habitación: 20 m² aproximadamente");

        aireAcondicional5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aire Acondicional.png"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(164, 236, 164));
        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(97, 165, 97));
        jLabel8.setText("PEN 175 ");

        btnReserva1.setBackground(new java.awt.Color(134, 179, 0));
        btnReserva1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnReserva1.setForeground(new java.awt.Color(255, 255, 255));
        btnReserva1.setText("Reservar");
        btnReserva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserva1ActionPerformed(evt);
            }
        });

        imagenCuarto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cuarto5.jpg"))); // NOI18N

        DatosCuarto4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DatosCuarto4.setText("Doble Estandar");

        secadora5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escritorio.png"))); // NOI18N

        Descripcion2Cuarto20.setText("cable, closet y baño privado.");

        secadora6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escritorio.png"))); // NOI18N

        secadora7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/secadora.png"))); // NOI18N

        secadora8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escritorio.png"))); // NOI18N

        secadora9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/secadora.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(seleccion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Incluye)
                                    .addComponent(Ofrece))
                                .addGap(320, 320, 320))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnReserva4)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                            .addComponent(imagenCuarto3)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(DatosCuarto3)
                                                                        .addComponent(capacidad2))
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(aireAcondicional3)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(secadora5)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(secadora7)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(btnReserva3))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Descripcion1Cuarto3)
                                                                        .addComponent(Descripcion4Cuarto3)
                                                                        .addComponent(Descripcion3Cuarto3)
                                                                        .addComponent(Descripcion2Cuarto3)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                            .addComponent(tamaño3)
                                                                            .addGap(18, 18, 18)
                                                                            .addComponent(costo1)))
                                                                    .addGap(0, 0, Short.MAX_VALUE))))
                                                        .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(0, 0, Short.MAX_VALUE))
                                                .addComponent(jSeparator12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(140, 140, 140))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(imagenCuarto6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(tamaño6)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel8))
                                                .addComponent(Descripcion2Cuarto9)
                                                .addComponent(Descripcion2Cuarto7)
                                                .addComponent(Descripcion2Cuarto8)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(DatosCuarto4)
                                                        .addComponent(capacidad3))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(aireAcondicional5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(caja)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(secadora)
                                                    .addGap(36, 36, 36)
                                                    .addComponent(btnReserva1))
                                                .addComponent(Descripcion1Cuarto6)
                                                .addComponent(Descripcion2Cuarto19)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(imagenCuarto4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(DatosCuarto5)
                                                        .addComponent(capacidad4))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(aireAcondicional7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(aireAcondicional8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(secadora8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(secadora9))
                                                .addComponent(Descripcion4Cuarto5)
                                                .addComponent(Descripcion3Cuarto5)
                                                .addComponent(Descripcion2Cuarto5)
                                                .addComponent(Descripcion1Cuarto5)
                                                .addComponent(Descripcion4Cuarto6)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(tamaño5)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(costo3))))
                                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(imagenCuarto5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Descripcion4Cuarto4)
                                                    .addComponent(Descripcion3Cuarto4)
                                                    .addComponent(Descripcion2Cuarto4)
                                                    .addComponent(Descripcion1Cuarto4)
                                                    .addComponent(Descripcion2Cuarto20)
                                                    .addComponent(tamaño4))
                                                .addGap(109, 109, 109))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(DatosCuarto6)
                                                    .addComponent(capacidad5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(aireAcondicional4)
                                                .addGap(18, 18, 18)
                                                .addComponent(secadora4)
                                                .addGap(18, 18, 18)
                                                .addComponent(secadora6)
                                                .addGap(26, 26, 26)
                                                .addComponent(btnReserva2)
                                                .addGap(83, 83, 83)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(2, 2, 2)
                                                    .addComponent(HotelPerla)
                                                    .addGap(184, 184, 184))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(AvPerla)
                                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(imagenPerla, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(hotelMiguel)
                                                .addComponent(imagenMiguel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(AvMiguel)
                                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(hotelBorja)
                                                .addComponent(AvBorja)
                                                .addComponent(imagenBorja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(140, 140, 140))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imagenPerla, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HotelPerla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AvPerla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagenMiguel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hotelMiguel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AvMiguel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagenBorja, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hotelBorja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AvBorja)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Incluye, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ofrece)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenCuarto6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DatosCuarto4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(capacidad3))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnReserva1)
                                            .addGap(5, 5, 5))
                                        .addComponent(aireAcondicional5)
                                        .addComponent(secadora)
                                        .addComponent(caja)))
                                .addGap(10, 10, 10)
                                .addComponent(Descripcion1Cuarto6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion2Cuarto8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion2Cuarto7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion2Cuarto9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion2Cuarto19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tamaño6)
                                    .addComponent(jLabel8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DatosCuarto6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(capacidad5))
                                    .addComponent(aireAcondicional4)
                                    .addComponent(secadora4)
                                    .addComponent(btnReserva2)
                                    .addComponent(secadora6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion1Cuarto4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion2Cuarto4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion3Cuarto4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion4Cuarto4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion2Cuarto20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tamaño4)
                                    .addComponent(jLabel14)))
                            .addComponent(imagenCuarto5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(imagenCuarto3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(aireAcondicional3)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(DatosCuarto3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(capacidad2))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnReserva3)
                                            .addComponent(secadora5)
                                            .addComponent(secadora7))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion1Cuarto3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion2Cuarto3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion3Cuarto3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion4Cuarto3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tamaño3)
                                    .addComponent(costo1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenCuarto4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DatosCuarto5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(capacidad4))
                                    .addComponent(aireAcondicional7)
                                    .addComponent(aireAcondicional8)
                                    .addComponent(secadora8)
                                    .addComponent(secadora9)
                                    .addComponent(btnReserva4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion1Cuarto5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion2Cuarto5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion3Cuarto5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion4Cuarto5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Descripcion4Cuarto6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tamaño5)
                                    .addComponent(costo3))))
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReserva3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserva3ActionPerformed
        conexion con = new conexion();
    
        String sucursal = this.sucursal;
        String habitacion = this.habitacion;
        String huesped = this.huesped;
        Date entrada = this.entradaDate;
        Date salida = this.salidaDate;
    
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String entradaStr = dateFormat.format(entrada);
        String salidaStr = dateFormat.format(salida);
    
        int resultado = con.conexionHotel(sucursal, huesped, habitacion, entradaStr, salidaStr);
    
        if (resultado > 0) {
            JOptionPane.showMessageDialog(this, "La reserva fue registrada correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "Hubo un error en el registro.");
        }
    }//GEN-LAST:event_btnReserva3ActionPerformed

    private void btnReserva4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserva4ActionPerformed
        conexion con = new conexion();
    
        String sucursal = this.sucursal;
        String habitacion = this.habitacion;
        String huesped = this.huesped;
        Date entrada = this.entradaDate;
        Date salida = this.salidaDate;
    
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String entradaStr = dateFormat.format(entrada);
        String salidaStr = dateFormat.format(salida);
    
        int resultado = con.conexionHotel(sucursal, huesped, habitacion, entradaStr, salidaStr);
    
        if (resultado > 0) {
            JOptionPane.showMessageDialog(this, "La reserva fue registrada correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "Hubo un error en el registro.");
        }
    }//GEN-LAST:event_btnReserva4ActionPerformed

    private void btnReserva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserva2ActionPerformed
        conexion con = new conexion();
    
        String sucursal = this.sucursal;
        String habitacion = this.habitacion;
        String huesped = this.huesped;
        Date entrada = this.entradaDate;
        Date salida = this.salidaDate;
    
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String entradaStr = dateFormat.format(entrada);
        String salidaStr = dateFormat.format(salida);
    
        int resultado = con.conexionHotel(sucursal, huesped, habitacion, entradaStr, salidaStr);
    
        if (resultado > 0) {
            JOptionPane.showMessageDialog(this, "La reserva fue registrada correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "Hubo un error en el registro.");
        }      
    }//GEN-LAST:event_btnReserva2ActionPerformed

    private void btnReserva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserva1ActionPerformed
        conexion con = new conexion();
    
        String sucursal = this.sucursal;
        String habitacion = this.habitacion;
        String huesped = this.huesped;
        Date entrada = this.entradaDate;
        Date salida = this.salidaDate;
    
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String entradaStr = dateFormat.format(entrada);
        String salidaStr = dateFormat.format(salida);
    
        int resultado = con.conexionHotel(sucursal, huesped, habitacion, entradaStr, salidaStr);
    
        if (resultado > 0) {
            JOptionPane.showMessageDialog(this, "La reserva fue registrada correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "Hubo un error en el registro.");
        }
    }//GEN-LAST:event_btnReserva1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PalmettoSanMiguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PalmettoSanMiguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PalmettoSanMiguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PalmettoSanMiguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PalmettoSanMiguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvBorja;
    private javax.swing.JLabel AvMiguel;
    private javax.swing.JLabel AvPerla;
    private javax.swing.JLabel DatosCuarto3;
    private javax.swing.JLabel DatosCuarto4;
    private javax.swing.JLabel DatosCuarto5;
    private javax.swing.JLabel DatosCuarto6;
    private javax.swing.JLabel Descripcion1Cuarto3;
    private javax.swing.JLabel Descripcion1Cuarto4;
    private javax.swing.JLabel Descripcion1Cuarto5;
    private javax.swing.JLabel Descripcion1Cuarto6;
    private javax.swing.JLabel Descripcion2Cuarto19;
    private javax.swing.JLabel Descripcion2Cuarto20;
    private javax.swing.JLabel Descripcion2Cuarto3;
    private javax.swing.JLabel Descripcion2Cuarto4;
    private javax.swing.JLabel Descripcion2Cuarto5;
    private javax.swing.JLabel Descripcion2Cuarto7;
    private javax.swing.JLabel Descripcion2Cuarto8;
    private javax.swing.JLabel Descripcion2Cuarto9;
    private javax.swing.JLabel Descripcion3Cuarto3;
    private javax.swing.JLabel Descripcion3Cuarto4;
    private javax.swing.JLabel Descripcion3Cuarto5;
    private javax.swing.JLabel Descripcion4Cuarto3;
    private javax.swing.JLabel Descripcion4Cuarto4;
    private javax.swing.JLabel Descripcion4Cuarto5;
    private javax.swing.JLabel Descripcion4Cuarto6;
    private javax.swing.JLabel HotelPerla;
    private javax.swing.JLabel Incluye;
    private javax.swing.JLabel Ofrece;
    private javax.swing.JLabel aireAcondicional3;
    private javax.swing.JLabel aireAcondicional4;
    private javax.swing.JLabel aireAcondicional5;
    private javax.swing.JLabel aireAcondicional7;
    private javax.swing.JLabel aireAcondicional8;
    private javax.swing.JButton btnReserva1;
    private javax.swing.JButton btnReserva2;
    private javax.swing.JButton btnReserva3;
    private javax.swing.JButton btnReserva4;
    private javax.swing.JLabel caja;
    private javax.swing.JLabel capacidad2;
    private javax.swing.JLabel capacidad3;
    private javax.swing.JLabel capacidad4;
    private javax.swing.JLabel capacidad5;
    private javax.swing.JLabel costo1;
    private javax.swing.JLabel costo3;
    private javax.swing.JLabel hotelBorja;
    private javax.swing.JLabel hotelMiguel;
    private javax.swing.JLabel imagenBorja;
    private javax.swing.JLabel imagenCuarto3;
    private javax.swing.JLabel imagenCuarto4;
    private javax.swing.JLabel imagenCuarto5;
    private javax.swing.JLabel imagenCuarto6;
    private javax.swing.JLabel imagenMiguel;
    private javax.swing.JLabel imagenPerla;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel secadora;
    private javax.swing.JLabel secadora4;
    private javax.swing.JLabel secadora5;
    private javax.swing.JLabel secadora6;
    private javax.swing.JLabel secadora7;
    private javax.swing.JLabel secadora8;
    private javax.swing.JLabel secadora9;
    private javax.swing.JLabel seleccion;
    private javax.swing.JLabel tamaño3;
    private javax.swing.JLabel tamaño4;
    private javax.swing.JLabel tamaño5;
    private javax.swing.JLabel tamaño6;
    // End of variables declaration//GEN-END:variables
}
