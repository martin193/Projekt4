
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author jenni
 */
public class SkrivaInformelltInlagg extends javax.swing.JFrame {

    private String epost;

    /**
     * Creates new form SkrivaInformelltInlagg
     */
    public SkrivaInformelltInlagg(String e) {
        initComponents();
        this.setLocationRelativeTo(null);
        epost = e;
        txaNyttInlägg.setLineWrap(true);
        txaNyttInlägg.setWrapStyleWord(true);
        fyllCbKategori();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaNyttInlägg = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnValjFil = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtValjFil = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnLaggTillNyKategori = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtKategori = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbKategori = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnPubliceraFormelltInlagg = new javax.swing.JButton();
        txtNyRubrik = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(790, 692));
        setResizable(false);

        lblRubrik.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblRubrik.setText("Skriv ett nytt informellt blogginlägg!");

        txaNyttInlägg.setColumns(20);
        txaNyttInlägg.setRows(5);
        jScrollPane1.setViewportView(txaNyttInlägg);

        jLabel5.setText("Ladda upp fil:");

        btnValjFil.setText("Välj");
        btnValjFil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValjFilActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        jLabel10.setText("Bild/fil");

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel4.setText("Hittade du ingen passande kategori?");

        jLabel3.setText("Skapa en ny kategori här!");

        btnLaggTillNyKategori.setText("Lägg till");
        btnLaggTillNyKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillNyKategoriActionPerformed(evt);
            }
        });

        jLabel2.setText("Välj kategori");

        jLabel7.setText("Huvudtext:");

        jLabel6.setText("Rubrik:");

        btnPubliceraFormelltInlagg.setText("Publicera inlägg");
        btnPubliceraFormelltInlagg.setOpaque(false);
        btnPubliceraFormelltInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPubliceraFormelltInlaggActionPerformed(evt);
            }
        });

        txtNyRubrik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(lblRubrik)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(btnPubliceraFormelltInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addComponent(txtNyRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(10, 10, 10)))
                                                .addComponent(btnLaggTillNyKategori))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtValjFil, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnValjFil))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNyRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLaggTillNyKategori))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtValjFil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnValjFil))
                                .addGap(13, 13, 13)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPubliceraFormelltInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    //Lägger till ny kategori i databas KATEGORI_INFORMELL
    private void btnLaggTillNyKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillNyKategoriActionPerformed
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;

        if (Validering.textFaltHarVarde(txtKategori)) {
            String fraga = ("select KATEGORIID from KATEGORI_INFORMELL order by KATEGORIID ASC");

            String kategoriNamn = txtKategori.getText();
            int id = GetAutoId(fraga);
            try {
                String query = "insert into KATEGORI_INFORMELL (KATEGORINAMN, KATEGORIID) values (?, ?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, kategoriNamn);
                ps.setInt(2, id);
                ps.execute();

                cbKategori.removeAllItems();
                fyllCbKategori();
                cbKategori.setSelectedItem(kategoriNamn);
                txtKategori.setText("");

                JOptionPane.showMessageDialog(null, "Kategori tillagd!");

            } catch (SQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null, "Kategorin finns redan i listan");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_btnLaggTillNyKategoriActionPerformed

    //Lägger till nytt blogginlägg i databas FORMELL_BLOGG
    //INLÄGGSID, TIDPUNKT och FIL EJ KLART!!!!!!   
    private void btnPubliceraFormelltInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPubliceraFormelltInlaggActionPerformed
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        if (Validering.textFaltHarVarde(txtNyRubrik) && Validering.textAreaHarVarde(txaNyttInlägg)) {

            String fraga = ("select INLAGGSID from INFORMELL_BLOGG order by INLAGGSID ASC");

            String rubrik = txtNyRubrik.getText();
            int kategoriID = GetKategoriID();
            String text = txaNyttInlägg.getText();
            int forfattareID = GetForfattare();
            int inlaggsID = GetAutoId(fraga);
            String tidpunkt = "2020-04-15"; //String tidpunkt = automatiskt datum
            try {
                String query = "insert into INFORMELL_BLOGG (RUBRIK, TEXT, INLAGGSID, ANVANDARID, TIDPUNKT, KATEGORI) values"
                        + " (?, ?, ?, ?, ?, ?, ?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, rubrik);
                ps.setString(2, text);
                ps.setInt(3, inlaggsID);
                ps.setInt(4, forfattareID);
                //ps.setBytes(5, photo); //FINNS ET SOM TABELL I DATABAS
                ps.setString(6, tidpunkt);
                ps.setInt(7, kategoriID);
                ps.execute();

                JOptionPane.showMessageDialog(null, "Inlägg publicerat!");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }//GEN-LAST:event_btnPubliceraFormelltInlaggActionPerformed


    private void btnValjFilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValjFilActionPerformed
        {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            String filename = f.getAbsolutePath();
            txtValjFil.setText(filename);
            jLabel10.setIcon(new ImageIcon(f.toString()));
            try {
                File image = new File(filename);
                FileInputStream fis = new FileInputStream(image);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                for (int readNum; (readNum = fis.read(buf)) != -1;) {
                    bos.write(buf, 0, readNum);
                }
                photo = bos.toByteArray();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnValjFilActionPerformed

//Tar emot en SQL-fråga som parameter för att sedan returnera nästa lediga ID för den tabell som r specificerad i SQL-frågan.
    public int GetAutoId(String o) {
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        int idNy = 1;
        try {
            String query = o;
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idNy = rs.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println("Internt felmeddelande: " + ex);
        }
        idNy = idNy + 1;
        JOptionPane.showMessageDialog(null, " nästa id: " + idNy);

        return idNy;
    }

    //Lägger till kategorier från KATEGORI_FORMELL  i combo box.
    private void fyllCbKategori() {
        String fraga = "SELECT KATEGORINAMN from KATEGORI_INFORMELL";

        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        String kategori = null;
        try {
            String query = fraga;
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                kategori = rs.getString(1);
                cbKategori.addItem(kategori);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int GetKategoriID() {
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        int kategoriID = 0;
        try {
            String kategori = cbKategori.getSelectedItem().toString();
            String query = "select * from KATEGORI_INFORMELL where KATEGORINAMN = '" + kategori + "'";
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                kategoriID = rs.getInt(2);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return kategoriID;
    }

    // Returnerar ID för den användare som är inloggad.  
    public int GetForfattare() {
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        int anvandarID = 0;
        try {
            String query = "select * from ANVANDARE where EPOST = '" + epost + "'";
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                anvandarID = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return anvandarID;
    }

    public String hemtaDatum() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        return dtf.format(now);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTillNyKategori;
    private javax.swing.JButton btnPubliceraFormelltInlagg;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnValjFil;
    private javax.swing.JComboBox<String> cbKategori;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JTextArea txaNyttInlägg;
    private javax.swing.JTextField txtKategori;
    private javax.swing.JTextField txtNyRubrik;
    private javax.swing.JTextField txtValjFil;
    // End of variables declaration//GEN-END:variables
String filename = null;
    byte[] photo = null;
}
