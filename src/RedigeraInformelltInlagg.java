
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jenni
 */
public class RedigeraInformelltInlagg extends javax.swing.JFrame {

    private String epost;
    
    /**
     * Creates new form RedigeraInformelltInlagg
     */
    public RedigeraInformelltInlagg(String e) {
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

        lblRubrik = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbVisaRubriker = new javax.swing.JComboBox<>();
        btnUppdateraInformelltInlagg = new javax.swing.JButton();
        btnLaddaUppNyFil = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbRedigeraKategori = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txaRedigeraRubrik = new javax.swing.JTextField();
        lblInlaggsID = new javax.swing.JLabel();
        btnSkapaNyKategori = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaRedigeraText = new javax.swing.JTextArea();
        txtSkapaNyKategori = new javax.swing.JTextField();
        btnAvbryt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrik.setBackground(new java.awt.Color(255, 255, 255));
        lblRubrik.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblRubrik.setText("  Redigera informellt blogginlägg");
        lblRubrik.setOpaque(true);

        jLabel6.setText("Välj inlägg att redigera:");

        cbVisaRubriker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVisaRubrikerActionPerformed(evt);
            }
        });

        btnUppdateraInformelltInlagg.setText("Redigera blogginlägg");
        btnUppdateraInformelltInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraInformelltInlaggActionPerformed(evt);
            }
        });

        btnLaddaUppNyFil.setText("Välj");

        jLabel3.setText("Ladda upp ny fil:");

        jLabel5.setText("Redigera text:");

        jLabel4.setText("Redigera rubrik:");

        jLabel2.setText("Välj ny kategori:");

        btnSkapaNyKategori.setText("Skapa ny kategori");
        btnSkapaNyKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkapaNyKategoriActionPerformed(evt);
            }
        });

        jLabel7.setText("InläggsID:");

        txaRedigeraText.setColumns(20);
        txaRedigeraText.setRows(5);
        jScrollPane1.setViewportView(txaRedigeraText);

        btnAvbryt.setText("Avbryt");
        btnAvbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvbrytActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnUppdateraInformelltInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(btnAvbryt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(47, 47, 47))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addGap(48, 48, 48)))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbRedigeraKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSkapaNyKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSkapaNyKategori))
                            .addComponent(btnLaddaUppNyFil, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txaRedigeraRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblInlaggsID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbVisaRubriker, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(cbVisaRubriker, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblInlaggsID, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txaRedigeraRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRedigeraKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtSkapaNyKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSkapaNyKategori))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnLaddaUppNyFil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUppdateraInformelltInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAvbryt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Lägger till RUBRIKER den inloggade användaren skapat från FORMELL_BLOGG i combo box.
    private void fyllCbRubriker() {
        String fraga = "SELECT RUBRIK from INFORMELL_BLOGG where ANVANDARID = "
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

    //Lägger till kategorier från KATEGORI_INFORMELL i combo box.
    private void fyllCbKategorier() {
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
                cbRedigeraKategori.addItem(kategori);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //Redigerar inlägg i INFORMELL_BLOGG utifrån ID.
    //FILHANTERING FUNGERAR EJ!!!!!!!!!!!!!!!!
    private void btnUppdateraInformelltInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraInformelltInlaggActionPerformed
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
                String query = "update INFORMELL_BLOGG set RUBRIK = '" + rubrik + "', TEXT = '" + text + "', "
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
    }//GEN-LAST:event_btnUppdateraInformelltInlaggActionPerformed

    //Lägger till ny kategori i databas KATEGORI_INFORMELL
    private void btnSkapaNyKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkapaNyKategoriActionPerformed
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;

        String fraga = ("select KATEGORIID from KATEGORI_INFORMELL");
        if (Validering.textFaltHarVarde(txtSkapaNyKategori)) {

            String kategoriNamn = txtSkapaNyKategori.getText();
            int id = GetAutoId(fraga);
            try {
                String query = "insert into KATEGORI_INFORMELL (KATEGORINAMN, KATEGORIID) values (?, ?)";
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

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        this.dispose();
        new MinaInlagg(epost).setVisible(true);
    }//GEN-LAST:event_btnAvbrytActionPerformed

    //Visar det inlägg vars rubrik står i combo boxen (cbVisaRubriker). 
    //FILHANTERINGEN BEHÖVER FIXAS!!!!!!!!!!!!!!!!!!!!111
    private void cbVisaRubrikerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVisaRubrikerActionPerformed
        fyllCbKategorier();
        String rubrik = cbVisaRubriker.getSelectedItem().toString();
        String fraga = "select * from INFORMELL_BLOGG where RUBRIK = '" + rubrik + "'";

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
                kategori = rs.getInt(6);
                //fil = rs.getString(7); !!!!!!!!!!!!!!!!!!!!!
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

    //Returnerar ID för den kategori vars namn skickas in som parameter.
    public int GetKategoriID(String kategori) {
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        int kategoriID = 0;
        try {
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

    //Returnerar namnet för den kategori vars ID skickas in som parameter. 
    public String GetKategoriNamn(int kategoriID) {
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        String kategoriNamn = null;
        try {
            String query = "select * from KATEGORI_INFORMELL where KATEGORIID = " + kategoriID;
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnLaddaUppNyFil;
    private javax.swing.JButton btnSkapaNyKategori;
    private javax.swing.JButton btnUppdateraInformelltInlagg;
    private javax.swing.JComboBox<String> cbRedigeraKategori;
    private javax.swing.JComboBox<String> cbVisaRubriker;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInlaggsID;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JTextField txaRedigeraRubrik;
    private javax.swing.JTextArea txaRedigeraText;
    private javax.swing.JTextField txtSkapaNyKategori;
    // End of variables declaration//GEN-END:variables
}
