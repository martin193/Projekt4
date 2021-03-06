
import java.awt.Desktop;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sarah
 */
public class SkrivaFormelltInlagg extends javax.swing.JFrame {
    String filepath;
    private String epost;

    /**
     * Creates new form SkrivaFormelltInlägg
     */
    public SkrivaFormelltInlagg(String e) {
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

        btnPubliceraFormelltInlagg = new javax.swing.JButton();
        cbKategori = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        btnValjFil = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaNyttInlägg = new javax.swing.JTextArea();
        txtNyRubrik = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtKategori = new javax.swing.JTextField();
        btnLaggTillNyKategori = new javax.swing.JButton();
        txtValjFil = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPubliceraFormelltInlagg.setText("Publicera inlägg");
        btnPubliceraFormelltInlagg.setOpaque(false);
        btnPubliceraFormelltInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPubliceraFormelltInlaggActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("Skriv ett nytt formellt blogginlägg!");

        jLabel2.setText("Välj kategori:");

        jLabel3.setText("Skapa en ny kategori här!");

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel4.setText("Hittade du ingen passande kategori?");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnValjFil.setText("Välj");
        btnValjFil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValjFilActionPerformed(evt);
            }
        });

        jLabel5.setText("Ladda upp fil:");

        txaNyttInlägg.setColumns(20);
        txaNyttInlägg.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txaNyttInlägg.setRows(5);
        jScrollPane1.setViewportView(txaNyttInlägg);

        txtNyRubrik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setText("Rubrik:");

        jLabel7.setText("Huvudtext:");

        btnLaggTillNyKategori.setText("Lägg till");
        btnLaggTillNyKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillNyKategoriActionPerformed(evt);
            }
        });

        jButton1.setText("Open");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(txtNyRubrik)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(btnPubliceraFormelltInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(2, 2, 2)
                                                        .addComponent(jLabel5)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtKategori, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                    .addComponent(txtValjFil)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnLaggTillNyKategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnValjFil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 20, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jButton1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNyRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(txtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnLaggTillNyKategori))
                                        .addGap(52, 52, 52))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtValjFil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnValjFil)))
                                .addGap(49, 49, 49)
                                .addComponent(jButton1)
                                .addGap(98, 98, 98))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(436, 436, 436)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPubliceraFormelltInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
                        this.dispose();
        new NyaFormellaSidan(epost).setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    //Lägger till nytt blogginlägg i databas FORMELL_BLOGG

    private void btnPubliceraFormelltInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPubliceraFormelltInlaggActionPerformed
       
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        if (Validering.textFaltHarVarde(txtNyRubrik) && Validering.textAreaHarVarde(txaNyttInlägg)) {
                try {
                    String sokväg = null;
                    byte[] fileBytes = null;
                    
                    if (txtValjFil.getText().isEmpty()) 
                    {
                        //String sokväg = null;
                    }
                    else
                    {
                        sokväg = txtValjFil.getText();
                        Path path = Paths.get(sokväg);
                        fileBytes = Files.readAllBytes(path);
                        sokväg = path.getFileName().toString();
                    }
                
                  
                    String fraga = ("select INLAGGSID from FORMELL_BLOGG order by INLAGGSID ASC");

                    String rubrik = txtNyRubrik.getText();
                    int kategoriID = GetKategoriID();
                    String text = txaNyttInlägg.getText();
                    int forfattareID = GetForfattare();
                    int inlaggsID = GetAutoId(fraga);
                    String tidpunkt = hemtaTidpunkt();

                    //sokväg = path.getFileName().toString();

                    //System.out.println("byte: " + fileBytes);
                    //System.out.println("sokväg: " + sokväg);
            

                String query = "insert into FORMELL_BLOGG (RUBRIK, TEXT, INLAGGSID, ANVANDARID, KATEGORI, TIDPUNKT, FIL, NYFIL) values"
                        + " (?, ?, ?, ?, ?, ?, ?, ?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, rubrik);
                ps.setString(2, text);
                ps.setInt(3, inlaggsID);
                ps.setInt(4, forfattareID);                                
                ps.setInt(5, kategoriID);
                ps.setString(6, tidpunkt);
                ps.setString(7, sokväg);
                ps.setBytes(8, fileBytes);
                ps.execute();

                JOptionPane.showMessageDialog(null, "Inlägg publicerat!");
                } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_btnPubliceraFormelltInlaggActionPerformed

//Lägger till ny kategori i databas KATEGORI_FORMELL
    private void btnLaggTillNyKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillNyKategoriActionPerformed
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;

        if (Validering.textFaltHarVarde(txtKategori)) {
            String fraga = ("select KATEGORIID from KATEGORI_FORMELL order by KATEGORIID ASC");

            String kategoriNamn = txtKategori.getText();
            int id = GetAutoId(fraga);
            try {
                String query = "insert into KATEGORI_FORMELL (KATEGORINAMN, KATEGORIID) values (?, ?)";
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

    private void btnValjFilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValjFilActionPerformed
        
        // TODO add your handling code here:
      JFileChooser jfc = new JFileChooser();
      jfc.showOpenDialog(this);
      
      try {
                  File f = jfc.getSelectedFile();
                  filepath = f.getAbsolutePath();
                  filepath = filepath.replace('\\', '/');
                                    
                  txtValjFil.setText(filepath);
//                  Path path = Paths.get(filepath);
//                  byte[] fileBytes = Files.readAllBytes(path);
      }
      catch (Exception e)
      {
          JOptionPane.showMessageDialog(rootPane, e);
      }
        
                   
    }//GEN-LAST:event_btnValjFilActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:{                                         
        // TODO add your handling code here:
        filepath = txtValjFil.getText();
        try {
            File pdfFile = new File(filepath);
            if (pdfFile.exists())
            {
                if (Desktop.isDesktopSupported())
                {
                    Desktop.getDesktop().open(pdfFile);
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "desktop is not supported");
                }
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "File doesnt exist");
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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

        //System.out.print(idNy);
        return idNy;

    }

    public int GetKategoriID() {
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        int kategoriID = 0;
        try {
            String kategori = cbKategori.getSelectedItem().toString();
            String query = "select * from KATEGORI_FORMELL where KATEGORINAMN = '" + kategori + "'";
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

    //Lägger till kategorier från KATEGORI_FORMELL  i combo box.
    private void fyllCbKategori() {
        String fraga = "SELECT KATEGORINAMN from KATEGORI_FORMELL";

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
    public String hemtaTidpunkt() {

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaNyttInlägg;
    private javax.swing.JTextField txtKategori;
    private javax.swing.JTextField txtNyRubrik;
    private javax.swing.JTextField txtValjFil;
    // End of variables declaration//GEN-END:variables
}
