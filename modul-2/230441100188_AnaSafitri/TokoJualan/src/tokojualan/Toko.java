package tokojualan;
import javax.swing.JOptionPane;
import javax.swing.JTextField; 
import javax.swing.ButtonGroup;

public class Toko extends javax.swing.JFrame {
    private javax.swing.JTextField hargaRamenTextField;
    private javax.swing.JTextField hargaTopingTextField;
    private javax.swing.JTextField dibayarTextField;
    private javax.swing.JTextField kembalianTextField;
    private JTextField jumlahTextField = new JTextField();
    private ButtonGroup hargaRamen;
    private ButtonGroup hargaToping;
    private javax.swing.JTextField totalTextField;
    private int jumlah;

    public Toko() {
        initComponents();
        dibayarTextField = new javax.swing.JTextField();
        kembalianTextField = new javax.swing.JTextField();
        totalTextField = new javax.swing.JTextField();
        hargaRamenTextField = HargaRamen;
        hargaTopingTextField = HargaToping;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ShoyuRamen = new javax.swing.JRadioButton();
        ShioRamen = new javax.swing.JRadioButton();
        MisoRamen = new javax.swing.JRadioButton();
        TankotsuRamen = new javax.swing.JRadioButton();
        BeefRamen = new javax.swing.JRadioButton();
        CurryRamen = new javax.swing.JRadioButton();
        HotRamen = new javax.swing.JRadioButton();
        KarangeRamen = new javax.swing.JRadioButton();
        SaltedEggRamen = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Toping1 = new javax.swing.JRadioButton();
        Toping3 = new javax.swing.JRadioButton();
        Toping2 = new javax.swing.JRadioButton();
        Toping4 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        HargaRamen = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        HargaToping = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        Jumlah = new javax.swing.JTextField();
        Tambah = new javax.swing.JButton();
        Kurang = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        Total = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        Kembalian = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        DiBayar = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Riset = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        Hitung = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        jLabel21.setText("jLabel21");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel3.setBackground(new java.awt.Color(102, 0, 51));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("=======================================================================================");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("======================================================================================");

        jLabel12.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Variasi Ramen");

        buttonGroup1.add(ShoyuRamen);
        ShoyuRamen.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        ShoyuRamen.setForeground(new java.awt.Color(255, 255, 255));
        ShoyuRamen.setText("Shoyu Ramen");
        ShoyuRamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShoyuRamenMouseClicked(evt);
            }
        });
        ShoyuRamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShoyuRamenActionPerformed(evt);
            }
        });

        buttonGroup1.add(ShioRamen);
        ShioRamen.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        ShioRamen.setForeground(new java.awt.Color(255, 255, 255));
        ShioRamen.setText("Shio Ramen");
        ShioRamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShioRamenMouseClicked(evt);
            }
        });
        ShioRamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShioRamenActionPerformed(evt);
            }
        });

        buttonGroup1.add(MisoRamen);
        MisoRamen.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        MisoRamen.setForeground(new java.awt.Color(255, 255, 255));
        MisoRamen.setText("Miso RAmen");
        MisoRamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MisoRamenMouseClicked(evt);
            }
        });
        MisoRamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MisoRamenActionPerformed(evt);
            }
        });

        buttonGroup1.add(TankotsuRamen);
        TankotsuRamen.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        TankotsuRamen.setForeground(new java.awt.Color(255, 255, 255));
        TankotsuRamen.setText("Tankotsu Ramen");
        TankotsuRamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TankotsuRamenMouseClicked(evt);
            }
        });
        TankotsuRamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TankotsuRamenActionPerformed(evt);
            }
        });

        buttonGroup1.add(BeefRamen);
        BeefRamen.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        BeefRamen.setForeground(new java.awt.Color(255, 255, 255));
        BeefRamen.setText("Beef Dry Ramen");
        BeefRamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BeefRamenMouseClicked(evt);
            }
        });
        BeefRamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeefRamenActionPerformed(evt);
            }
        });

        buttonGroup1.add(CurryRamen);
        CurryRamen.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        CurryRamen.setForeground(new java.awt.Color(255, 255, 255));
        CurryRamen.setText("Curry Ramen");
        CurryRamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CurryRamenMouseClicked(evt);
            }
        });
        CurryRamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurryRamenActionPerformed(evt);
            }
        });

        buttonGroup1.add(HotRamen);
        HotRamen.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        HotRamen.setForeground(new java.awt.Color(255, 255, 255));
        HotRamen.setText("Hot Ramen");
        HotRamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HotRamenMouseClicked(evt);
            }
        });
        HotRamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HotRamenActionPerformed(evt);
            }
        });

        buttonGroup1.add(KarangeRamen);
        KarangeRamen.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        KarangeRamen.setForeground(new java.awt.Color(255, 255, 255));
        KarangeRamen.setText("Karaage Ramen");
        KarangeRamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KarangeRamenMouseClicked(evt);
            }
        });
        KarangeRamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KarangeRamenActionPerformed(evt);
            }
        });

        buttonGroup1.add(SaltedEggRamen);
        SaltedEggRamen.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        SaltedEggRamen.setForeground(new java.awt.Color(255, 255, 255));
        SaltedEggRamen.setText("Salted Egg Ramen");
        SaltedEggRamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaltedEggRamenMouseClicked(evt);
            }
        });
        SaltedEggRamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaltedEggRamenActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("=======================================================================================");

        jLabel14.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Toping Tambahan");

        buttonGroup2.add(Toping1);
        Toping1.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        Toping1.setForeground(new java.awt.Color(255, 255, 255));
        Toping1.setText("Ni Tamago");
        Toping1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Toping1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(Toping3);
        Toping3.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        Toping3.setForeground(new java.awt.Color(255, 255, 255));
        Toping3.setText("Gohan");
        Toping3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Toping3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(Toping2);
        Toping2.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        Toping2.setForeground(new java.awt.Color(255, 255, 255));
        Toping2.setText("Beef Yakiniku");
        Toping2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Toping2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(Toping4);
        Toping4.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        Toping4.setForeground(new java.awt.Color(255, 255, 255));
        Toping4.setText("Nori");
        Toping4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Toping4ActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokojualan/ramen pink.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("=======================================================================================");

        jLabel17.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText(">>");

        jLabel18.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText(">>");

        jLabel19.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(">>");

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));

        HargaRamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HargaRamenMouseClicked(evt);
            }
        });
        HargaRamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaRamenActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));

        jLabel20.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setText("HARGA  RAMEN:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addContainerGap())
        );

        HargaToping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaTopingActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));

        jLabel23.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setText("HARGA  TOPING:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 204, 204));

        jLabel25.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setText("JUMLAH :");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addContainerGap())
        );

        Jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahActionPerformed(evt);
            }
        });

        Tambah.setForeground(new java.awt.Color(102, 0, 0));
        Tambah.setText("+");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });

        Kurang.setForeground(new java.awt.Color(102, 0, 0));
        Kurang.setText("-");
        Kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KurangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(HargaRamen, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(HargaToping, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Tambah)
                        .addGap(19, 19, 19)
                        .addComponent(Kurang)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HargaRamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HargaToping, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tambah)
                    .addComponent(Kurang))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 153, 153));

        Total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TotalMouseClicked(evt);
            }
        });
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(255, 204, 204));

        jLabel26.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setText("TOTAL :");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(255, 204, 204));

        jLabel27.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 0, 0));
        jLabel27.setText("KEMBALIAN");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(37, 37, 37))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 204, 204));

        jLabel31.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 0, 0));
        jLabel31.setText("DI BAYAR :");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addContainerGap())
        );

        DiBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiBayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DiBayar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kembalian, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DiBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokojualan/ramen 3.jpeg"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("=========================================================================================");

        jLabel30.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Terima Kasih!");

        Riset.setBackground(new java.awt.Color(255, 204, 204));
        Riset.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        Riset.setForeground(new java.awt.Color(102, 0, 0));
        Riset.setText("Riset");
        Riset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RisetActionPerformed(evt);
            }
        });

        Keluar.setBackground(new java.awt.Color(255, 204, 204));
        Keluar.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        Keluar.setForeground(new java.awt.Color(102, 0, 0));
        Keluar.setText("Keluar");
        Keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KeluarMouseClicked(evt);
            }
        });
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Rp 45.000");

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Rp 55.000");

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Rp 55.000");

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Rp 40.000");

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Rp 45.000");

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Rp 40.000");

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Rp 45.000");

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Rp 55.000");

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Rp 50.000");

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Rp 10.000");

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Rp 20.000");

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Rp 15.000");

        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Rp 8.000");

        Hitung.setBackground(new java.awt.Color(255, 204, 204));
        Hitung.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        Hitung.setForeground(new java.awt.Color(102, 0, 0));
        Hitung.setText("Hitung");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(80, 80, 80))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel12)
                                .addGap(36, 36, 36)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ShoyuRamen)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(MisoRamen)
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ShioRamen)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(TankotsuRamen)
                                        .addGap(18, 18, 18)
                                        .addComponent(HotRamen))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(BeefRamen)
                                                        .addComponent(CurryRamen))
                                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SaltedEggRamen)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(KarangeRamen)
                                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(77, 77, 77)
                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel18)))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(Toping1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(Toping2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(58, 58, 58)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Toping3)
                                            .addComponent(Toping4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Keluar, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Riset, javax.swing.GroupLayout.Alignment.TRAILING))
                                                    .addComponent(Hitung, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel29))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel30)
                                                .addGap(16, 16, 16)))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ShoyuRamen)
                            .addComponent(TankotsuRamen)
                            .addComponent(HotRamen))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel12))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addGap(4, 4, 4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel37)
                                            .addComponent(jLabel38))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ShioRamen)
                                    .addComponent(BeefRamen)
                                    .addComponent(KarangeRamen))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel34))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(MisoRamen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(SaltedEggRamen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(CurryRamen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32))))
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Toping1)
                            .addComponent(Toping3)
                            .addComponent(jLabel17)
                            .addComponent(jLabel39)
                            .addComponent(jLabel41))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Toping2)
                            .addComponent(jLabel19)
                            .addComponent(Toping4)
                            .addComponent(jLabel40)
                            .addComponent(jLabel42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel18))
                        .addGap(27, 27, 27)))
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(Hitung)
                                .addGap(40, 40, 40)
                                .addComponent(Riset)
                                .addGap(38, 38, 38)
                                .addComponent(Keluar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel29)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(40, 40, 40))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel1.setText("M");

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel2.setText("E");

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel3.setText("N");

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel4.setText("U");

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel5.setText("~");

        jLabel6.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        jLabel6.setText(".");

        jLabel7.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel7.setText("Ramen");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokojualan/ramen anime.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MisoRamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MisoRamenActionPerformed
        hargaRamenTextField.setText("Rp 45.000");
    }//GEN-LAST:event_MisoRamenActionPerformed

    private void BeefRamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeefRamenActionPerformed
       hargaRamenTextField.setText("Rp 55.000");
    }//GEN-LAST:event_BeefRamenActionPerformed

    private void CurryRamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurryRamenActionPerformed
        hargaRamenTextField.setText("Rp 55.000");
    }//GEN-LAST:event_CurryRamenActionPerformed

    private void KarangeRamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KarangeRamenActionPerformed
        hargaRamenTextField.setText("Rp 45.000");
    }//GEN-LAST:event_KarangeRamenActionPerformed

    private void SaltedEggRamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaltedEggRamenActionPerformed
        hargaRamenTextField.setText("Rp 40.000");
    }//GEN-LAST:event_SaltedEggRamenActionPerformed

    private void Toping1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Toping1ActionPerformed
        hargaTopingTextField.setText("Rp 10.000");
    }//GEN-LAST:event_Toping1ActionPerformed

    private void Toping3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Toping3ActionPerformed
        hargaTopingTextField.setText("Rp 15.000");
    }//GEN-LAST:event_Toping3ActionPerformed

    private void Toping2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Toping2ActionPerformed
        hargaTopingTextField.setText("Rp 20.000");
    }//GEN-LAST:event_Toping2ActionPerformed

    private void Toping4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Toping4ActionPerformed
        hargaTopingTextField.setText("Rp 8.000");
    }//GEN-LAST:event_Toping4ActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        Total.setEditable(false);
    }//GEN-LAST:event_TotalActionPerformed

    private void DiBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiBayarActionPerformed
        
    }//GEN-LAST:event_DiBayarActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
          dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    private void KeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KeluarMouseClicked
      
    }//GEN-LAST:event_KeluarMouseClicked

    private void ShoyuRamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShoyuRamenMouseClicked
        
    }//GEN-LAST:event_ShoyuRamenMouseClicked

    private void ShioRamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShioRamenMouseClicked
        
    }//GEN-LAST:event_ShioRamenMouseClicked

    private void BeefRamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BeefRamenMouseClicked
        
    }//GEN-LAST:event_BeefRamenMouseClicked

    private void MisoRamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MisoRamenMouseClicked
        
    }//GEN-LAST:event_MisoRamenMouseClicked

    private void TankotsuRamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TankotsuRamenMouseClicked
        
    }//GEN-LAST:event_TankotsuRamenMouseClicked

    private void CurryRamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CurryRamenMouseClicked
        
    }//GEN-LAST:event_CurryRamenMouseClicked

    private void HotRamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HotRamenMouseClicked
        
    }//GEN-LAST:event_HotRamenMouseClicked

    private void KarangeRamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KarangeRamenMouseClicked
        
    }//GEN-LAST:event_KarangeRamenMouseClicked

    private void SaltedEggRamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaltedEggRamenMouseClicked
        
    }//GEN-LAST:event_SaltedEggRamenMouseClicked

    private void TotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TotalMouseClicked
        Total.setEditable(false);
    }//GEN-LAST:event_TotalMouseClicked

    private void HargaRamenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HargaRamenMouseClicked
        
    }//GEN-LAST:event_HargaRamenMouseClicked

    private void ShoyuRamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShoyuRamenActionPerformed
        hargaRamenTextField.setText("Rp 45.000");
    }//GEN-LAST:event_ShoyuRamenActionPerformed

    private void ShioRamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShioRamenActionPerformed
        hargaRamenTextField.setText("Rp 40.000");
    }//GEN-LAST:event_ShioRamenActionPerformed

    private void TankotsuRamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TankotsuRamenActionPerformed
       hargaRamenTextField.setText("Rp 50.000");
    }//GEN-LAST:event_TankotsuRamenActionPerformed

    private void HotRamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HotRamenActionPerformed
        hargaRamenTextField.setText("Rp 55.000");
    }//GEN-LAST:event_HotRamenActionPerformed

    private void HargaRamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaRamenActionPerformed
       
    }//GEN-LAST:event_HargaRamenActionPerformed

    private void HargaTopingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaTopingActionPerformed
        
    }//GEN-LAST:event_HargaTopingActionPerformed

    private void JumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahActionPerformed

    }//GEN-LAST:event_JumlahActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        jumlah++;
        Jumlah.setText(String.valueOf(jumlah));
    }//GEN-LAST:event_TambahActionPerformed

    private void KurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KurangActionPerformed
        if (jumlah > 0) {
        jumlah--;
        Jumlah.setText(String.valueOf(jumlah));
        }
    }//GEN-LAST:event_KurangActionPerformed

    private void RisetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RisetActionPerformed
        hargaRamenTextField.setText(""); 
        hargaTopingTextField.setText(""); 

        jumlahTextField.setText(""); 
        Jumlah.setText("0"); 

        Total.setText("Rp 0"); 
        DiBayar.setText(null); 
        Kembalian.setText("Rp 0"); 

        jumlah = 0;
    }//GEN-LAST:event_RisetActionPerformed
int totalAmount = 0; 
    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
       Hitung.addActionListener(e -> {

    if (buttonGroup1.getSelection() == null || buttonGroup2.getSelection() == null) {
        JOptionPane.showMessageDialog(null, "Pilih Menu Terlebih Dahulu.");
        return;
    }

    if (ShoyuRamen.isSelected()) {
        totalAmount = 45000;
    } else if (ShoyuRamen.isSelected()) {
        totalAmount = 40000;
    } else if (ShioRamen.isSelected()) {
        totalAmount = 40000;
    } else if (MisoRamen.isSelected()) {
        totalAmount = 45000;
    } else if (TankotsuRamen.isSelected()) {
        totalAmount = 50000;
    } else if (BeefRamen.isSelected()) {
        totalAmount = 55000;
    } else if (CurryRamen.isSelected()) {
        totalAmount = 55000;
    } else if (HotRamen.isSelected()) {
        totalAmount = 55000;
    } else if (KarangeRamen.isSelected()){
        totalAmount = 45000;
    } else if (SaltedEggRamen.isSelected()){
        totalAmount = 40000;
    }

    if (Toping1.isSelected()) {
        totalAmount += 0;
    } else if (Toping2.isSelected()) {
        totalAmount += 5000;
    } else if (Toping3.isSelected()) {
        totalAmount += 4000;
    } else if (Toping4.isSelected()) {
        totalAmount += 3000;
    }

    totalAmount *= jumlah;

    if (totalAmount > 100000) {
        totalAmount *= 0.95; 
    }

    Total.setText (String.valueOf(totalAmount));
      });
    }//GEN-LAST:event_HitungActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    DiBayar.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            hitungKembalian();
        }
    });
    }                                   
        
        private void hitungKembalian() {
    try {

        int total = Integer.parseInt(Total.getText());
        int cash = Integer.parseInt(DiBayar.getText());

  
        if (cash >= total) {
            int kembalian = cash - total;
            Kembalian.setText(String.valueOf(kembalian));  
        } else {
            Kembalian.setText("Uang Anda Kurang");
        }
    } catch (NumberFormatException e) {
        
        Kembalian.setText("");
    }
    }//GEN-LAST:event_formComponentShown

 
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
            java.util.logging.Logger.getLogger(Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Toko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Toko().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BeefRamen;
    private javax.swing.JRadioButton CurryRamen;
    private javax.swing.JTextField DiBayar;
    private javax.swing.JTextField HargaRamen;
    private javax.swing.JTextField HargaToping;
    private javax.swing.JButton Hitung;
    private javax.swing.JRadioButton HotRamen;
    private javax.swing.JTextField Jumlah;
    private javax.swing.JRadioButton KarangeRamen;
    private javax.swing.JButton Keluar;
    private javax.swing.JTextField Kembalian;
    private javax.swing.JButton Kurang;
    private javax.swing.JRadioButton MisoRamen;
    private javax.swing.JButton Riset;
    private javax.swing.JRadioButton SaltedEggRamen;
    private javax.swing.JRadioButton ShioRamen;
    private javax.swing.JRadioButton ShoyuRamen;
    private javax.swing.JButton Tambah;
    private javax.swing.JRadioButton TankotsuRamen;
    private javax.swing.JRadioButton Toping1;
    private javax.swing.JRadioButton Toping2;
    private javax.swing.JRadioButton Toping3;
    private javax.swing.JRadioButton Toping4;
    private javax.swing.JTextField Total;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
