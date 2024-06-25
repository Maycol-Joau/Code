
package hotel;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class PalmettoLaPerla extends javax.swing.JFrame {

    private String sucursal;
    private String habitacion;
    private String huesped;
    private Date entradaDate;
    private Date salidaDate;

    public PalmettoLaPerla() {
        initComponents();
        setResizable(true);

    }
    public PalmettoLaPerla(String sucursal, String habitacion, String huesped, Date entradaDate, Date salidaDate) {
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
        AvPerla = new javax.swing.JLabel();
        HotelPerla = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        imagenPerla = new javax.swing.JLabel();
        imagenCuarto1 = new javax.swing.JLabel();
        DatosCuarto1 = new javax.swing.JLabel();
        capacidad = new javax.swing.JLabel();
        Descripcion1Cuarto1 = new javax.swing.JLabel();
        Descripcion3Cuarto1 = new javax.swing.JLabel();
        Descripcion2Cuarto1 = new javax.swing.JLabel();
        Descripcion4Cuarto1 = new javax.swing.JLabel();
        Tamaño = new javax.swing.JLabel();
        aireAcondicional = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReserva1 = new javax.swing.JButton();
        capacidad1 = new javax.swing.JLabel();
        Descripcion1Cuarto2 = new javax.swing.JLabel();
        Descripcion3Cuarto2 = new javax.swing.JLabel();
        Descripcion2Cuarto2 = new javax.swing.JLabel();
        Descripcion4Cuarto2 = new javax.swing.JLabel();
        tamaño2 = new javax.swing.JLabel();
        aireAcondicional2 = new javax.swing.JLabel();
        costo = new javax.swing.JLabel();
        btnReserva2 = new javax.swing.JButton();
        imagenCuarto2 = new javax.swing.JLabel();
        DatosCuarto2 = new javax.swing.JLabel();
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
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();

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

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        AvPerla.setBackground(new java.awt.Color(0, 0, 0));
        AvPerla.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AvPerla.setText(" AV. LA MARINA 1090, LIMA 15087 PERÚ");

        HotelPerla.setBackground(new java.awt.Color(0, 0, 0));
        HotelPerla.setText("PALMETTO LA PERLA ");

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        imagenPerla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Hotel palmeto la Perla.jpg"))); // NOI18N

        imagenCuarto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cuarto1.jpg"))); // NOI18N

        DatosCuarto1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DatosCuarto1.setText("Doble estándar");

        capacidad.setForeground(new java.awt.Color(102, 102, 102));
        capacidad.setText("2 adultos");

        Descripcion1Cuarto1.setText("Nuestras habitaciones doble standard o ejecutivas, se encuentran");

        Descripcion3Cuarto1.setText("Estas habitaciones cuentan con una cama doble, escritorio de");

        Descripcion2Cuarto1.setText("ubicadas en todos los pisos del hotel y cuentan con vistas internas.");

        Descripcion4Cuarto1.setText("trabajo, TV cable, closet y baño privado.");

        Tamaño.setText("Tamaño de la habitación: 24 m² aproximadamente");

        aireAcondicional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aire Acondicional.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(164, 236, 164));
        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(97, 165, 97));
        jLabel3.setText("PEN 132");

        btnReserva1.setBackground(new java.awt.Color(134, 179, 0));
        btnReserva1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnReserva1.setForeground(new java.awt.Color(255, 255, 255));
        btnReserva1.setText("Reservar");
        btnReserva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserva1ActionPerformed(evt);
            }
        });

        capacidad1.setForeground(new java.awt.Color(102, 102, 102));
        capacidad1.setText("2 adultos");

        Descripcion1Cuarto2.setText("Nuestras habitaciones doble superior, se encuentran ubicadas en");

        Descripcion3Cuarto2.setText("habitaciones cuentan con una cama de tamaño Queen, escritorio de");

        Descripcion2Cuarto2.setText("todos los pisos del hotel y cuentan con vistas internas. Estas");

        Descripcion4Cuarto2.setText("trabajo, TV cable, closet, aire acondicionado y baño privado.");

        tamaño2.setText("Tamaño de la habitación: 34 m² aproximadamente");

        aireAcondicional2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aire Acondicional.png"))); // NOI18N

        costo.setBackground(new java.awt.Color(164, 236, 164));
        costo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        costo.setForeground(new java.awt.Color(97, 165, 97));
        costo.setText("PEN 168");

        btnReserva2.setBackground(new java.awt.Color(134, 179, 0));
        btnReserva2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnReserva2.setForeground(new java.awt.Color(255, 255, 255));
        btnReserva2.setText("Reservar");
        btnReserva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserva2ActionPerformed(evt);
            }
        });

        imagenCuarto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cuarto2.jpg"))); // NOI18N

        DatosCuarto2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DatosCuarto2.setText("Doble Superior");

        jSeparator10.setBackground(new java.awt.Color(134, 179, 0));
        jSeparator10.setForeground(new java.awt.Color(134, 179, 0));
        jSeparator10.setPreferredSize(new java.awt.Dimension(0, 5));

        capacidad2.setForeground(new java.awt.Color(102, 102, 102));
        capacidad2.setText("2 adultos");

        Descripcion1Cuarto3.setText("Nuestras habitaciones doble twin, se encuentran ubicadas en todos");

        Descripcion3Cuarto3.setText("cuentan con dos camas individuales, escritorio de trabajo, TV cable,");

        Descripcion2Cuarto3.setText("los pisos del hotel y cuentan con vistas internas. Estas habitaciones");

        Descripcion4Cuarto3.setText("closet y baño privado.");

        tamaño3.setText("Tamaño de la habitación: 31 m² aproximadamente");

        aireAcondicional3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aire Acondicional.png"))); // NOI18N

        costo1.setBackground(new java.awt.Color(164, 236, 164));
        costo1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        costo1.setForeground(new java.awt.Color(97, 165, 97));
        costo1.setText("PEN 178");

        btnReserva3.setBackground(new java.awt.Color(134, 179, 0));
        btnReserva3.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnReserva3.setForeground(new java.awt.Color(255, 255, 255));
        btnReserva3.setText("Reservar");
        btnReserva3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserva3ActionPerformed(evt);
            }
        });

        imagenCuarto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuarto7.jpg"))); // NOI18N

        DatosCuarto3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DatosCuarto3.setText("Doble Twin");

        jSeparator11.setBackground(new java.awt.Color(134, 179, 0));
        jSeparator11.setForeground(new java.awt.Color(134, 179, 0));
        jSeparator11.setPreferredSize(new java.awt.Dimension(0, 5));

        AvMiguel.setForeground(new java.awt.Color(102, 102, 102));
        AvMiguel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AvMiguel.setText("AV. LA MARINA 3691, LIMA 15087 PERÚ.");

        hotelMiguel.setForeground(new java.awt.Color(102, 102, 102));
        hotelMiguel.setText("PALMETTO SAN MIGUEL");

        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));

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

        Descripcion1Cuarto5.setText("La habitación suite con bañera hidromasaje, se encuentran ubicadas");

        Descripcion3Cuarto5.setText("ciudad. Estas habitaciones cuentan con una cama de tamaño King,");

        Descripcion2Cuarto5.setText("en todos los pisos del hotel y cuentan con vistas exteriores hacia la");

        Descripcion4Cuarto5.setText("escritorio de trabajo, TV cable, closet, aire acondicionado, tina");

        tamaño5.setText("Tamaño de la habitación: 32 m² aproximadamente");

        aireAcondicional7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aire Acondicional.png"))); // NOI18N

        costo3.setBackground(new java.awt.Color(164, 236, 164));
        costo3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        costo3.setForeground(new java.awt.Color(97, 165, 97));
        costo3.setText("PEN 188");

        btnReserva4.setBackground(new java.awt.Color(134, 179, 0));
        btnReserva4.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        btnReserva4.setForeground(new java.awt.Color(255, 255, 255));
        btnReserva4.setText("Reservar");
        btnReserva4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserva4ActionPerformed(evt);
            }
        });

        imagenCuarto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuarto8.jpg"))); // NOI18N

        DatosCuarto5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DatosCuarto5.setText("Suite con bañera");

        aireAcondicional8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bañera.png"))); // NOI18N

        Descripcion4Cuarto6.setText("hidromasaje y baño privado.");

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(seleccion)
                        .addGap(766, 766, 766))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(imagenCuarto4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Descripcion4Cuarto5)
                                            .addComponent(Descripcion3Cuarto5)
                                            .addComponent(Descripcion2Cuarto5)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(DatosCuarto5)
                                                    .addComponent(capacidad4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(aireAcondicional7)
                                                .addGap(18, 18, 18)
                                                .addComponent(aireAcondicional8)
                                                .addGap(29, 29, 29)
                                                .addComponent(btnReserva4))
                                            .addComponent(Descripcion1Cuarto5)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tamaño5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(costo3))
                                            .addComponent(Descripcion4Cuarto6)))
                                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(imagenCuarto2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tamaño2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(costo))
                                            .addComponent(Descripcion4Cuarto2)
                                            .addComponent(Descripcion3Cuarto2)
                                            .addComponent(Descripcion2Cuarto2)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(DatosCuarto2)
                                                        .addComponent(capacidad1))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(aireAcondicional2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnReserva2))
                                                .addComponent(Descripcion1Cuarto2, javax.swing.GroupLayout.Alignment.LEADING))))
                                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(imagenCuarto3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Descripcion4Cuarto3)
                                            .addComponent(Descripcion3Cuarto3)
                                            .addComponent(Descripcion2Cuarto3)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(DatosCuarto3)
                                                    .addComponent(capacidad2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(aireAcondicional3)
                                                .addGap(118, 118, 118)
                                                .addComponent(btnReserva3))
                                            .addComponent(Descripcion1Cuarto3)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tamaño3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(costo1))))
                                    .addComponent(Incluye)
                                    .addComponent(Ofrece)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(imagenCuarto1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Tamaño)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3))
                                            .addComponent(Descripcion4Cuarto1)
                                            .addComponent(Descripcion3Cuarto1)
                                            .addComponent(Descripcion2Cuarto1)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(DatosCuarto1)
                                                        .addComponent(capacidad))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(aireAcondicional)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnReserva1))
                                                .addComponent(Descripcion1Cuarto1, javax.swing.GroupLayout.Alignment.LEADING)))))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(HotelPerla)
                                            .addGap(111, 111, 111))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AvPerla)
                                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(hotelMiguel)
                                        .addComponent(imagenMiguel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AvMiguel)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(hotelBorja)
                                        .addComponent(AvBorja)
                                        .addComponent(imagenBorja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(imagenPerla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(194, 194, 194)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(DatosCuarto3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(capacidad2))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(btnReserva3))
                                            .addComponent(aireAcondicional3))
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
                                            .addComponent(costo1)))
                                    .addComponent(imagenCuarto3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(DatosCuarto5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(capacidad4))
                                            .addComponent(aireAcondicional7)
                                            .addComponent(aireAcondicional8)
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
                                        .addComponent(Descripcion4Cuarto6))
                                    .addComponent(imagenCuarto4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(162, 162, 162)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tamaño5)
                                            .addComponent(costo3)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Incluye, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ofrece)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(imagenCuarto1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(DatosCuarto1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(capacidad))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(btnReserva1))
                                            .addComponent(aireAcondicional))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Descripcion1Cuarto1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Descripcion2Cuarto1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Descripcion3Cuarto1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Descripcion4Cuarto1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Tamaño)
                                            .addComponent(jLabel3))))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(DatosCuarto2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(capacidad1))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(btnReserva2))
                                            .addComponent(aireAcondicional2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Descripcion1Cuarto2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Descripcion2Cuarto2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Descripcion3Cuarto2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Descripcion4Cuarto2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tamaño2)
                                            .addComponent(costo)))
                                    .addComponent(imagenCuarto2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagenPerla, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HotelPerla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AvPerla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagenMiguel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(0, 32, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PalmettoLaPerla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PalmettoLaPerla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PalmettoLaPerla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PalmettoLaPerla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PalmettoLaPerla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvBorja;
    private javax.swing.JLabel AvMiguel;
    private javax.swing.JLabel AvPerla;
    private javax.swing.JLabel DatosCuarto1;
    private javax.swing.JLabel DatosCuarto2;
    private javax.swing.JLabel DatosCuarto3;
    private javax.swing.JLabel DatosCuarto5;
    private javax.swing.JLabel Descripcion1Cuarto1;
    private javax.swing.JLabel Descripcion1Cuarto2;
    private javax.swing.JLabel Descripcion1Cuarto3;
    private javax.swing.JLabel Descripcion1Cuarto5;
    private javax.swing.JLabel Descripcion2Cuarto1;
    private javax.swing.JLabel Descripcion2Cuarto2;
    private javax.swing.JLabel Descripcion2Cuarto3;
    private javax.swing.JLabel Descripcion2Cuarto5;
    private javax.swing.JLabel Descripcion3Cuarto1;
    private javax.swing.JLabel Descripcion3Cuarto2;
    private javax.swing.JLabel Descripcion3Cuarto3;
    private javax.swing.JLabel Descripcion3Cuarto5;
    private javax.swing.JLabel Descripcion4Cuarto1;
    private javax.swing.JLabel Descripcion4Cuarto2;
    private javax.swing.JLabel Descripcion4Cuarto3;
    private javax.swing.JLabel Descripcion4Cuarto5;
    private javax.swing.JLabel Descripcion4Cuarto6;
    private javax.swing.JLabel HotelPerla;
    private javax.swing.JLabel Incluye;
    private javax.swing.JLabel Ofrece;
    private javax.swing.JLabel Tamaño;
    private javax.swing.JLabel aireAcondicional;
    private javax.swing.JLabel aireAcondicional2;
    private javax.swing.JLabel aireAcondicional3;
    private javax.swing.JLabel aireAcondicional7;
    private javax.swing.JLabel aireAcondicional8;
    private javax.swing.JButton btnReserva1;
    private javax.swing.JButton btnReserva2;
    private javax.swing.JButton btnReserva3;
    private javax.swing.JButton btnReserva4;
    private javax.swing.JLabel capacidad;
    private javax.swing.JLabel capacidad1;
    private javax.swing.JLabel capacidad2;
    private javax.swing.JLabel capacidad4;
    private javax.swing.JLabel costo;
    private javax.swing.JLabel costo1;
    private javax.swing.JLabel costo3;
    private javax.swing.JLabel hotelBorja;
    private javax.swing.JLabel hotelMiguel;
    private javax.swing.JLabel imagenBorja;
    private javax.swing.JLabel imagenCuarto1;
    private javax.swing.JLabel imagenCuarto2;
    private javax.swing.JLabel imagenCuarto3;
    private javax.swing.JLabel imagenCuarto4;
    private javax.swing.JLabel imagenMiguel;
    private javax.swing.JLabel imagenPerla;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel seleccion;
    private javax.swing.JLabel tamaño2;
    private javax.swing.JLabel tamaño3;
    private javax.swing.JLabel tamaño5;
    // End of variables declaration//GEN-END:variables
}
