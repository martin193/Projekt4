
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

    private String epost;

    /**
     * Creates new form SkrivaFormelltInlägg
     */
    public SkrivaFormelltInlagg(String e) {
        initComponents();
        this.setLocationRelativeTo(null);
        epost = e;
        txaNyttInlägg.setLineWrap(true);
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
        btnLaggUppFil = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaNyttInlägg = new javax.swing.JTextArea();
        txtNyRubrik = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtKategori = new javax.swing.JTextField();
        btnLaggTillNyKategori = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPubliceraFormelltInlagg.setBackground(new java.awt.Color(255, 255, 255));
        btnPubliceraFormelltInlagg.setText("Publicera");
        btnPubliceraFormelltInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPubliceraFormelltInlaggActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("Skriv ett nytt formellt blogginlägg!");

        jLabel2.setText("Välj kategori");

        jLabel3.setText("Ange ny kategori här!");

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel4.setText("Hittade du ingen som passar?");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnLaggUppFil.setText("Välj");

        jLabel5.setText("Ladda upp fil:");

        txaNyttInlägg.setColumns(20);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(227, 227, 227))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(btnPubliceraFormelltInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNyRubrik)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLaggUppFil)
                                    .addComponent(txtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLaggTillNyKategori)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNyRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
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
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLaggUppFil)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPubliceraFormelltInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    //Lägger till nytt blogginlägg i databas FORMELL_BLOGG
    //INLÄGGSID, TIDPUNKT och FIL EJ KLART!!!!!!   
    private void btnPubliceraFormelltInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPubliceraFormelltInlaggActionPerformed
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        if (Validering.textFaltHarVarde(txtNyRubrik) && Validering.textAreaHarVarde(txaNyttInlägg)) {

            String rubrik = txtNyRubrik.getText();
            int kategoriID = GetKategoriID();
            String text = txaNyttInlägg.getText();
            int forfattareID = GetForfattare();
            int inlaggsID = 5; //String inlaggsID = idb.getAutoIncrement("ALIEN", "ALIEN_ID"); 
            String tidpunkt = "2020-04-15"; //String tidpunkt = automatiskt datum
            String fil = null; //String fil = ????
            try {
                String query = "insert into FORMELL_BLOGG (RUBRIK, TEXT, INLAGGSID, ANVANDARID, FIL, TIDPUNKT, KATEGORI) values"
                        + " (?, ?, ?, ?, ?, ?, ?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, rubrik);
                ps.setString(2, text);
                ps.setInt(3, inlaggsID);
                ps.setInt(4, forfattareID);
                ps.setString(5, fil);
                ps.setString(6, tidpunkt);
                ps.setInt(7, kategoriID);
                ps.execute();
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_btnPubliceraFormelltInlaggActionPerformed

//Lägger till ny kategori i databas KATEGORI_FORMELL
//AUTO INCREMENT FUNGERAR EJ FÖR ID!!!
    private void btnLaggTillNyKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillNyKategoriActionPerformed
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        String kategoriNamn = txtKategori.getText();
        String id = "5"; //ändra denna till auto increment!
        try {
            String query = "insert into KATEGORI_FORMELL (KATEGORINAMN, KATEGORIID) values (?, ?)";
            ps = connection.prepareStatement(query);
            ps.setString(1, kategoriNamn);
            ps.setString(2, id);
            ps.execute();

            fyllCbKategori();

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnLaggTillNyKategoriActionPerformed

        public int GetKategoriID()
    {
	DB_connection.DB_Connection obj_DB_Connection= new DB_connection.DB_Connection();
	Connection connection=obj_DB_Connection.get_connection();
	PreparedStatement ps=null;
        int kategoriID = 0;
	try {
            String kategori = cbKategori.getSelectedItem().toString();
	    String query= "select * from KATEGORI_FORMELL where KATEGORINAMN = '" + kategori + "'";
	    ps=connection.prepareStatement(query);
	    ResultSet rs=ps.executeQuery();
	    while(rs.next()){
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTillNyKategori;
    private javax.swing.JButton btnLaggUppFil;
    private javax.swing.JButton btnPubliceraFormelltInlagg;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbKategori;
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
    // End of variables declaration//GEN-END:variables
}
