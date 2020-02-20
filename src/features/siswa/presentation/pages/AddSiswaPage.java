package features.siswa.presentation.pages;

import cores.entities.Kelas;
import cores.entities.Siswa;
import cores.entities.Spp;
import cores.styles.Colors;
import cores.styles.Constants;
import cores.styles.Fonts;
import cores.styles.Strings;
import cores.utils.ImageProcessor;
import cores.widgets.RoundedBorder;
import cores.widgets.RoundedButton;
import cores.widgets.a_TextField;
import features.siswa.data.repositories.SiswaRepository;
import javax.swing.ImageIcon;

/**
 *
 * @author rizal
 */
public class AddSiswaPage extends javax.swing.JPanel {
    private static final long serialVersionUID = 1L;

    private final SiswaRepository repository;

    public Siswa siswa;

    public AddSiswaPage(SiswaRepository repository, Siswa siswa) {
        this.repository = repository;
        this.siswa = siswa;
        initComponents();
        init();
    }

    private void init() {
        repository.initDropdownKelas(this);
        repository.initDropdownSpp(this);
        if (siswa != null) {
            final var roundedImage = ImageProcessor.roundImage(ImageProcessor
                    .byteArrayToBufferedImage(siswa.getFoto()),
                    Constants.BORDER_RADIUS);
            b_addImage.setIcon(new ImageIcon(roundedImage));
            b_addImage.setText(null);
            b_addImage.setBorder(null);
            et_namaSiswa.setText(siswa.getNama());
            et_nisn.setText(siswa.getNisn());
            et_nis.setText(siswa.getNis());
            et_noTelepon.setText(siswa.getNoTelepon());
            et_alamat.setText(siswa.getAlamat());
            cb_kelas.setSelectedItem(siswa.getIdKelas());
            cb_spp.setSelectedItem(siswa.getIdSpp());
            cb_jenisKelamin.setSelectedItem(siswa.getJenisKelamin());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_addImage = new javax.swing.JButton();
        cb_kelas = new javax.swing.JComboBox<>();
        cb_spp = new javax.swing.JComboBox<>();
        b_clear = new RoundedButton(Constants.BORDER_RADIUS);
        b_save = new RoundedButton(Constants.BORDER_RADIUS);
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        et_nisn = new a_TextField("NISN");
        et_nis = new a_TextField("NIS");
        et_namaSiswa = new a_TextField("Nama Siswa");
        et_noTelepon = new a_TextField("No. Telepon");
        et_alamat = new a_TextField("Alamat");
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb_jenisKelamin = new javax.swing.JComboBox<>();

        setBackground(Colors.BACKGROUND_COLOR);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        b_addImage.setBackground(Colors.BACKGROUND_COLOR);
        b_addImage.setFont(Fonts.ROBOTO_MEDIUM.deriveFont(14f)
        );
        b_addImage.setForeground(Colors.GREY_TEXT_COLOR);
        b_addImage.setText("Tambah Foto");
        b_addImage.setBorder(new cores.widgets.RoundedBorder());
        b_addImage.setContentAreaFilled(false);
        b_addImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_addImage.setFocusPainted(false);
        b_addImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_addImageActionPerformed(evt);
            }
        });

        cb_kelas.setBackground(Colors.BACKGROUND_COLOR);
        cb_kelas.setFont(Fonts.ROBOTO_MEDIUM.deriveFont(14f)
        );
        cb_kelas.setForeground(Colors.TEXT_COLOR);
        cb_kelas.setBorder(null);

        cb_spp.setBackground(Colors.BACKGROUND_COLOR);
        cb_spp.setFont(Fonts.ROBOTO_MEDIUM.deriveFont(14f)
        );
        cb_spp.setForeground(Colors.TEXT_COLOR);
        cb_spp.setBorder(null);

        b_clear.setBackground(Colors.BACKGROUND_COLOR);
        b_clear.setFont(Fonts.PRODUCT_SANS_MEDIUM.deriveFont(14f)
        );
        b_clear.setForeground(Colors.TEXT_COLOR);
        b_clear.setText("Bersihkan");
        b_clear.setBorder(new RoundedBorder());
        b_clear.setContentAreaFilled(false);
        b_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_clear.setFocusPainted(false);
        b_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_clearActionPerformed(evt);
            }
        });

        b_save.setBackground(Colors.PRIMARY_COLOR);
        b_save.setFont(Fonts.PRODUCT_SANS_MEDIUM.deriveFont(14f)
        );
        b_save.setForeground(Colors.WHITE_TEXT_COLOR);
        b_save.setText("Simpan");
        b_save.setBorder(null);
        b_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_save.setFocusPainted(false);
        b_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_saveActionPerformed(evt);
            }
        });

        jLabel2.setFont(Fonts.ROBOTO_MEDIUM.deriveFont(14f)
        );
        jLabel2.setForeground(Colors.GREY_TEXT_COLOR);
        jLabel2.setText("Tipe SPP");

        jPanel1.setBackground(Colors.BACKGROUND_COLOR);
        jPanel1.setLayout(new java.awt.GridLayout(0, 2, 8, 4));

        et_nisn.setBackground(Colors.BACKGROUND_COLOR);
        et_nisn.setFont(Fonts.ROBOTO_REGULAR.deriveFont(16f)
        );
        et_nisn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                et_nisnKeyTyped(evt);
            }
        });
        jPanel1.add(et_nisn);

        et_nis.setBackground(Colors.BACKGROUND_COLOR);
        et_nis.setFont(Fonts.ROBOTO_REGULAR.deriveFont(16f)
        );
        et_nis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                et_nisKeyTyped(evt);
            }
        });
        jPanel1.add(et_nis);

        et_namaSiswa.setBackground(Colors.BACKGROUND_COLOR);
        et_namaSiswa.setFont(Fonts.ROBOTO_REGULAR.deriveFont(16f)
        );
        et_namaSiswa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                et_namaSiswaKeyTyped(evt);
            }
        });
        jPanel1.add(et_namaSiswa);

        et_noTelepon.setBackground(Colors.BACKGROUND_COLOR);
        et_noTelepon.setFont(Fonts.ROBOTO_REGULAR.deriveFont(16f)
        );
        et_noTelepon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                et_noTeleponKeyTyped(evt);
            }
        });
        jPanel1.add(et_noTelepon);

        et_alamat.setBackground(Colors.BACKGROUND_COLOR);
        et_alamat.setFont(Fonts.ROBOTO_REGULAR.deriveFont(16f)
        );

        jLabel3.setFont(Fonts.ROBOTO_MEDIUM.deriveFont(14f)
        );
        jLabel3.setForeground(Colors.GREY_TEXT_COLOR);
        jLabel3.setText("Kelas");

        jLabel4.setFont(Fonts.ROBOTO_MEDIUM.deriveFont(14f)
        );
        jLabel4.setForeground(Colors.GREY_TEXT_COLOR);
        jLabel4.setText("Jenis Kelamin");

        cb_jenisKelamin.setBackground(Colors.BACKGROUND_COLOR);
        cb_jenisKelamin.setFont(Fonts.ROBOTO_MEDIUM.deriveFont(14f)
        );
        cb_jenisKelamin.setForeground(Colors.TEXT_COLOR);
        cb_jenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { Strings.LAKI_LAKI, Strings.PEREMPUAN }));
        cb_jenisKelamin.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b_save, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(b_addImage, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(et_alamat)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_jenisKelamin, 0, 95, Short.MAX_VALUE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_kelas, 0, 95, Short.MAX_VALUE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_spp, 0, 95, Short.MAX_VALUE)
                                    .addComponent(jLabel2))))))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_addImage, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(et_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_spp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_jenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_save, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_clearActionPerformed
        repository.clear(this);
    }//GEN-LAST:event_b_clearActionPerformed

    private void b_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_saveActionPerformed
        repository.insertSiswa(this);
    }//GEN-LAST:event_b_saveActionPerformed

    private void b_addImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_addImageActionPerformed
        repository.getImageFromDisk(this, 144, 192);
    }//GEN-LAST:event_b_addImageActionPerformed

    private void et_namaSiswaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_et_namaSiswaKeyTyped
        final var nama = et_namaSiswa.getText();
        if (nama.length() >= 36) {
            evt.consume();
        }
    }//GEN-LAST:event_et_namaSiswaKeyTyped

    private void et_nisnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_et_nisnKeyTyped
        final var nisn = et_nisn.getText();
        if (nisn.length() >= 10) {
            evt.consume();
        }
        char newChar = evt.getKeyChar();
        if (!(Character.isDigit(newChar))) {
            evt.consume();
        }
    }//GEN-LAST:event_et_nisnKeyTyped

    private void et_nisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_et_nisKeyTyped
        final var nis = et_nis.getText();
        if (nis.length() >= 8) {
            evt.consume();
        }
        char newChar = evt.getKeyChar();
        if (!(Character.isDigit(newChar))) {
            evt.consume();
        }
    }//GEN-LAST:event_et_nisKeyTyped

    private void et_noTeleponKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_et_noTeleponKeyTyped
        final var noTelepon = et_noTelepon.getText();
        if (noTelepon.length() >= 13) {
            evt.consume();
        }
        char newChar = evt.getKeyChar();
        if (!(Character.isDigit(newChar))) {
            evt.consume();
        }
    }//GEN-LAST:event_et_noTeleponKeyTyped

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        et_nisn.requestFocus();
    }//GEN-LAST:event_formComponentResized

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton b_addImage;
    private javax.swing.JButton b_clear;
    private javax.swing.JButton b_save;
    public javax.swing.JComboBox<String> cb_jenisKelamin;
    public javax.swing.JComboBox<Kelas> cb_kelas;
    public javax.swing.JComboBox<Spp> cb_spp;
    public javax.swing.JTextField et_alamat;
    public javax.swing.JTextField et_namaSiswa;
    public javax.swing.JTextField et_nis;
    public javax.swing.JTextField et_nisn;
    public javax.swing.JTextField et_noTelepon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
