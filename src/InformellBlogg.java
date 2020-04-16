
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jenni
 */
public class InformellBlogg extends javax.swing.JFrame {

    private String epost;

    /**
     * Creates new form InformellBlogg
     */
    public InformellBlogg(String e) {
        initComponents();
        this.setLocationRelativeTo(null);
        fyllBloggRuta();
        fyllCbKategorier();
        txtInformell.setLineWrap(true);
        txtInformell.setEditable(false);
        epost = e;
    }

    @SuppressWarnings("unchecked")

    //Lägger till kategorier från KATEGORI_INFORMELL i combo box.
    private void fyllCbKategorier() {
        String fraga = "SELECT KATEGORINAMN FROM KATEGORI_INFORMELL";

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
                cbxKategorier.addItem(kategori);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        cbxKategorier = new javax.swing.JComboBox<>();
        btnNyttInlagg = new javax.swing.JButton();
        btnVisaMinaInlagg = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        btnFiltreraKategori = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInformell = new javax.swing.JTextArea();
        btnVisaAllaInformella = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrik.setBackground(new java.awt.Color(255, 255, 255));
        lblRubrik.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblRubrik.setText("   Informell blogg");
        lblRubrik.setOpaque(true);

        btnNyttInlagg.setText("Skriv nytt blogginlägg");
        btnNyttInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyttInlaggActionPerformed(evt);
            }
        });

        btnVisaMinaInlagg.setText("Visa mina inlägg");
        btnVisaMinaInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaMinaInlaggActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnFiltreraKategori.setText("Filtrera kategori");
        btnFiltreraKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltreraKategoriActionPerformed(evt);
            }
        });

        txtInformell.setColumns(20);
        txtInformell.setRows(5);
        jScrollPane1.setViewportView(txtInformell);

        btnVisaAllaInformella.setText("Visa alla inlägg");
        btnVisaAllaInformella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaAllaInformellaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxKategorier, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFiltreraKategori))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNyttInlagg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVisaAllaInformella, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVisaMinaInlagg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(47, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxKategorier, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltreraKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnNyttInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnVisaMinaInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnVisaAllaInformella, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        this.dispose();
        new AnvStartsida().setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    //Filtrerar informella blogginlägg utifrån den kategori som valts i combo boxen.
    private void btnFiltreraKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltreraKategoriActionPerformed
        txtInformell.setText("");
        String kategori = cbxKategorier.getSelectedItem().toString();
        String fraga = "SELECT * FROM INFORMELL_BLOGG JOIN KATEGORI_INFORMELL ON KATEGORIID = KATEGORI WHERE KATEGORINAMN = '" + kategori + "'";

        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();

        PreparedStatement ps = null;
        String rubrik = null;
        String text = null;
        String kategori2 = null;
        String anvandarID = null;

        try {
            String query = fraga;
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                rubrik = rs.getString(1);
                text = rs.getString(2);
                kategori2 = rs.getString(8);
                anvandarID = rs.getString(4);

                String anvandare = GetForfattare(anvandarID);

                String resultat = "";
                resultat += "Rubrik: " + rubrik + "\nFörfattare: " + anvandare + "\nKategori: " + kategori2 + "\n" + text + "\n" + "\n";
                txtInformell.append(resultat);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnFiltreraKategoriActionPerformed

    private void btnNyttInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyttInlaggActionPerformed
        this.dispose();
        new SkrivaInformelltInlagg(epost).setVisible(true);
    }//GEN-LAST:event_btnNyttInlaggActionPerformed

    private void btnVisaAllaInformellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaAllaInformellaActionPerformed
        fyllBloggRuta();
    }//GEN-LAST:event_btnVisaAllaInformellaActionPerformed

    //Visar formella blogginlägg den inloggade användaren skrivit.
    private void btnVisaMinaInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaMinaInlaggActionPerformed
        txtInformell.setText("");

        try {
            String fraga = "select * from INFORMELL_BLOGG JOIN KATEGORI_INFORMELL ON KATEGORIID = "
                    + "KATEGORI where ANVANDARID = (select ANVANDARID from ANVANDARE where EPOST = '" + epost + "')";
            String text = GetQuery(fraga);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.print("Internt felmeddelande: " + ex);
        }
    }//GEN-LAST:event_btnVisaMinaInlaggActionPerformed

    private void fyllBloggRuta() {

        txtInformell.setText("");

        try {

            String fraga = "SELECT * FROM INFORMELL_BLOGG JOIN KATEGORI_INFORMELL ON KATEGORIID = KATEGORI JOIN ANVANDARE ON ANVANDARE.ANVANDARID = INFORMELL_BLOGG.ANVANDARID";

            String rubrik = GetQuery(fraga);

        } catch (Exception bla) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }

    }

    public String GetQuery(String s) {
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;

        String rubrik = null;
        String text = null;
        String kategori = null;
        String anvandarID = null;
        byte[] photo = null;

        try {
            String query = s;
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                rubrik = rs.getString(1);
                text = rs.getString(2);
                kategori = rs.getString(8);
                anvandarID = rs.getString(4);
                photo = rs.getBytes(5);

                String anvandare = GetForfattare(anvandarID);
                String resultat = "";
                resultat += "Rubrik: " + rubrik + "\nFörfattare: " + anvandare + "\nKategori: " + kategori + "\n" + text + "\n" + "\n";
                txtInformell.append(resultat);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return rubrik;
    }

    public void skrivBloggPost() {
        //det här var ett test men gick inge bra

        JPanel contactlist = new JPanel();
        getContentPane().add(contactlist);

        //test = new JLabel(); 
        //test.setText("waa");
        JLabel test;
        test = new JLabel("waaa");

        contactlist.add(test);

    }

    //Returnerar förnamn och efternamn för den användare vars ANVANDARID skickats in i parametern.
    public String GetForfattare(String anvandarID) {
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        String fornamn = null;
        String efternamn = null;
        try {
            String query = "select * from ANVANDARE where ANVANDARID = " + anvandarID;
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                fornamn = rs.getString(2);
                efternamn = rs.getString(3);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        String namn = fornamn + " " + efternamn;
        return namn;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltreraKategori;
    private javax.swing.JButton btnNyttInlagg;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnVisaAllaInformella;
    private javax.swing.JButton btnVisaMinaInlagg;
    private javax.swing.JComboBox<String> cbxKategorier;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JTextArea txtInformell;
    // End of variables declaration//GEN-END:variables
String rubrik = null;

}
