
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarah
 */
public class RedigeraFormelltInlagg extends javax.swing.JFrame {

    private String epost;
    
    /**
     * Creates new form RedigeraFormelltInlägg
     */
    public RedigeraFormelltInlagg(String e) {
        epost = e;
        initComponents();
        this.setLocationRelativeTo(null);
        fyllCbRubriker();
        txaRedigeraText.setLineWrap(true);
        txaRedigeraText.setWrapStyleWord(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbRedigeraKategori = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnLaddaUppNyFil = new javax.swing.JButton();
        btnUppdateraFormelltInlagg = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaRedigeraText = new javax.swing.JTextArea();
        txaRedigeraRubrik = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbVisaRubriker = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtSkapaNyKategori = new javax.swing.JTextField();
        btnSkapaNyKategori = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblInlaggsID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("  Redigera formellt blogginlägg");
        jLabel1.setOpaque(true);

        jLabel2.setText("Välj ny kategori:");

        jLabel3.setText("Ladda upp ny fil:");

        btnLaddaUppNyFil.setText("Välj");

        btnUppdateraFormelltInlagg.setText("Redigera blogginlägg");
        btnUppdateraFormelltInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraFormelltInlaggActionPerformed(evt);
            }
        });

        btnAvbryt.setText("Avbryt");
        btnAvbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvbrytActionPerformed(evt);
            }
        });

        txaRedigeraText.setColumns(20);
        txaRedigeraText.setRows(5);
        jScrollPane1.setViewportView(txaRedigeraText);

        jLabel4.setText("Redigera rubrik:");

        jLabel5.setText("Redigera text:");

        cbVisaRubriker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVisaRubrikerActionPerformed(evt);
            }
        });

        jLabel6.setText("Välj inlägg att redigera:");

        btnSkapaNyKategori.setText("Skapa ny kategori");
        btnSkapaNyKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkapaNyKategoriActionPerformed(evt);
            }
        });

        jLabel7.setText("InläggsID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btnUppdateraFormelltInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(btnAvbryt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbRedigeraKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLaddaUppNyFil, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbVisaRubriker, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInlaggsID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtSkapaNyKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txaRedigeraRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSkapaNyKategori)))))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbVisaRubriker, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInlaggsID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txaRedigeraRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRedigeraKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtSkapaNyKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSkapaNyKategori))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnLaddaUppNyFil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUppdateraFormelltInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAvbryt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Lägger till RUBRIKER den inloggade användaren skapat från FORMELL_BLOGG i combo box.
    private void fyllCbRubriker() {
        String fraga = "SELECT RUBRIK from FORMELL_BLOGG where ANVANDARID = "
                + "(select ANVANDARID from ANVANDARE where EPOST = '" + epost + "')";

        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        String rubrik = null;
        try {
            String query = fraga;
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                rubrik = rs.getString(1);
                cbVisaRubriker.addItem(rubrik);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //Lägger till kategorier från KATEGORI_FORMELL i combo box.
    private void fyllCbKategorier() {
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
                cbRedigeraKategori.addItem(kategori);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        this.dispose();
        new MinaInlagg(epost).setVisible(true);
    }//GEN-LAST:event_btnAvbrytActionPerformed

    //Lägger till ny kategori i databas KATEGORI_FORMELL
    private void btnSkapaNyKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkapaNyKategoriActionPerformed
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;

        String fraga = ("select KATEGORIID from KATEGORI_FORMELL");
        if (Validering.textFaltHarVarde(txtSkapaNyKategori)) {

            String kategoriNamn = txtSkapaNyKategori.getText();
            int id = GetAutoId(fraga);

            try {
                String query = "insert into KATEGORI_FORMELL (KATEGORINAMN, KATEGORIID) values (?, ?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, kategoriNamn);
                ps.setInt(2, id);
                ps.execute();

                cbRedigeraKategori.removeAllItems();
                fyllCbKategorier();
                cbRedigeraKategori.setSelectedItem(kategoriNamn);
                txtSkapaNyKategori.setText("");

                JOptionPane.showMessageDialog(null, "Kategori tillagd!");

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_btnSkapaNyKategoriActionPerformed

    //Redigerar inlägg i FORMELL_BLOGG utifrån ID.
    //FILHANTERING FUNGERAR EJ!!!!!!!!!!!!!!!!
    private void btnUppdateraFormelltInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraFormelltInlaggActionPerformed
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;

        if (Validering.textFaltHarVarde(txaRedigeraRubrik) && Validering.textAreaHarVarde(txaRedigeraText)) {

            String rubrik = txaRedigeraRubrik.getText();
            String kategoriNamn = cbRedigeraKategori.getSelectedItem().toString();
            int kategoriID = GetKategoriID(kategoriNamn);
            //String fil = !!!!!!!!!!!!!!!!!!!!!
            String text = txaRedigeraText.getText();
            String inlaggsID = lblInlaggsID.getText();
            try {
                String query = "update FORMELL_BLOGG set RUBRIK = '" + rubrik + "', TEXT = '" + text + "', "
                        + "KATEGORI = " + kategoriID + " where INLAGGSID = " + inlaggsID; //FIL SKA LÄGGAS TILL!!!!!!!!!!!!!!1

                ps = connection.prepareStatement(query);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Inlägg uppdaterat!");
                cbVisaRubriker.removeAllItems();
                fyllCbRubriker();

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_btnUppdateraFormelltInlaggActionPerformed

    //Visar det inlägg vars rubrik står i combo boxen (cbVisaRubriker). 
    //FILHANTERINGEN BEHÖVER FIXAS!!!!!!!!!!!!!!!!!!!!111
    private void cbVisaRubrikerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVisaRubrikerActionPerformed
        fyllCbKategorier();
        String rubrik = cbVisaRubriker.getSelectedItem().toString();
        String fraga = "select * from FORMELL_BLOGG where RUBRIK = '" + rubrik + "'";

        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        String rubrik2 = null;
        int kategori = 0;
        //String fil = null; !!!!!!!!!!!!!!!!!!!!!!!!!!!
        String text = null;
        String inlaggsID = null;
        try {
            String query = fraga;
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                rubrik2 = rs.getString(1);
                kategori = rs.getInt(5);
                //fil = rs.getString(7); !!!!!!!!!!!!!!!!!!!!!1
                text = rs.getString(2);
                inlaggsID = rs.getString(3);

                String kategoriNamn = GetKategoriNamn(kategori);

                txaRedigeraRubrik.setText(rubrik2);
                cbRedigeraKategori.setSelectedItem(kategoriNamn);
                txaRedigeraText.setText(text);
                lblInlaggsID.setText(inlaggsID);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cbVisaRubrikerActionPerformed

    //Returnerar ID för den kategori vars namn skickas in som parameter.
    public int GetKategoriID(String kategori) {
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        int kategoriID = 0;
        try {
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

    //Returnerar namnet för den kategori vars ID skickas in som parameter. 
    public String GetKategoriNamn(int kategoriID) {
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        String kategoriNamn = null;
        try {
            String query = "select * from KATEGORI_FORMELL where KATEGORIID = " + kategoriID;
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                kategoriNamn = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return kategoriNamn;
    }

    //Tar emot en SQL-fråga som parameter för att sedan returnera nästa lediga ID för den tabell som är specificerad i SQL-frågan.
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
                idNy = idNy + 1;
            }
        } catch (Exception ex) {
            System.out.println("Internt felmeddelande: " + ex);
        }
        return idNy;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnLaddaUppNyFil;
    private javax.swing.JButton btnSkapaNyKategori;
    private javax.swing.JButton btnUppdateraFormelltInlagg;
    private javax.swing.JComboBox<String> cbRedigeraKategori;
    private javax.swing.JComboBox<String> cbVisaRubriker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInlaggsID;
    private javax.swing.JTextField txaRedigeraRubrik;
    private javax.swing.JTextArea txaRedigeraText;
    private javax.swing.JTextField txtSkapaNyKategori;
    // End of variables declaration//GEN-END:variables
}
