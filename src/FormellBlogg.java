
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarah
 */
public class FormellBlogg extends javax.swing.JFrame {

    private String epost;
    /**
     * Creates new form FormellBlogg
     */
    public FormellBlogg(String e) {
        initComponents();
        this.setLocationRelativeTo(null);
        fyllCbKategorier();
        fyllBloggRuta();
        txtFormell.setLineWrap(true);
        txtFormell.setEditable(false);
        epost = e;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxFormellKategori = new javax.swing.JComboBox<>();
        btNyFormell = new javax.swing.JButton();
        btVisaMinaFormella = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        btnFiltreraKategori = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFormell = new javax.swing.JTextArea();
        btnVisaAllaFormella = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbxFormellKategori.setToolTipText("");

        btNyFormell.setText("Skriv nytt blogginlägg");
        btNyFormell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNyFormellActionPerformed(evt);
            }
        });

        btVisaMinaFormella.setText("Visa mina inlägg");
        btVisaMinaFormella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisaMinaFormellaActionPerformed(evt);
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

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("   Formell Blogg");
        jLabel1.setOpaque(true);

        txtFormell.setColumns(20);
        txtFormell.setRows(5);
        jScrollPane1.setViewportView(txtFormell);

        btnVisaAllaFormella.setText("Visa alla inlägg");
        btnVisaAllaFormella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaAllaFormellaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btNyFormell)
                                    .addComponent(btVisaMinaFormella, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnVisaAllaFormella, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxFormellKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFiltreraKategori))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btNyFormell, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btVisaMinaFormella, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnVisaAllaFormella, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxFormellKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFiltreraKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                cbxFormellKategori.addItem(kategori);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void btNyFormellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNyFormellActionPerformed
        this.dispose();
        new SkrivaFormelltInlagg(epost).setVisible(true);
    }//GEN-LAST:event_btNyFormellActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        this.dispose();
        new AnvStartsida().setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    //Fyller BloggRuta med inlägg från FORMELL_BLOGG
    private void fyllBloggRuta() {
        txtFormell.setText("");

        try {
            String fraga = "SELECT * FROM FORMELL_BLOGG JOIN KATEGORI_FORMELL ON KATEGORIID = KATEGORI";
            String text = GetQuery(fraga);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.print("Internt felmeddelande: " + ex);
        }
    }

    //Databaskoppling för att fylla BloggRuta.
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
                txtFormell.append(resultat);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return rubrik;
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

    //Filtrerar formella blogginlägg utifrån den kategori som valts i combo boxen.
    private void btnFiltreraKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltreraKategoriActionPerformed
        txtFormell.setText("");       
        String kategori = cbxFormellKategori.getSelectedItem().toString();
        String fraga = "SELECT * FROM FORMELL_BLOGG JOIN KATEGORI_FORMELL ON KATEGORIID = KATEGORI WHERE KATEGORINAMN = '" + kategori + "'";

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
                txtFormell.append(resultat);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnFiltreraKategoriActionPerformed

    private void btnVisaAllaFormellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaAllaFormellaActionPerformed
        fyllBloggRuta();
    }//GEN-LAST:event_btnVisaAllaFormellaActionPerformed

    //Visar formella blogginlägg den inloggade användaren skrivit.
    private void btVisaMinaFormellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisaMinaFormellaActionPerformed
        txtFormell.setText("");

        try {         
            String fraga = "select * from FORMELL_BLOGG JOIN KATEGORI_FORMELL ON KATEGORIID = "
                  + "KATEGORI where ANVANDARID = (select ANVANDARID from ANVANDARE where EPOST = '" + epost + "')";           
            String text = GetQuery(fraga);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.print("Internt felmeddelande: " + ex);
        }
    }//GEN-LAST:event_btVisaMinaFormellaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNyFormell;
    private javax.swing.JButton btVisaMinaFormella;
    private javax.swing.JButton btnFiltreraKategori;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnVisaAllaFormella;
    private javax.swing.JComboBox<String> cbxFormellKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtFormell;
    // End of variables declaration//GEN-END:variables
}
