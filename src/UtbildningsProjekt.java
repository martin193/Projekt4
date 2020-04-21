
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenni
 */
public class UtbildningsProjekt extends javax.swing.JFrame {

    private String epost;
    private String id;
    /**
     * Creates new form UtbildningsProjekt
     */
    public UtbildningsProjekt(String e) {
        initComponents();
        epost = e;
        id = getId();
        fillBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        btnSkapaProjekt = new javax.swing.JButton();
        cbxProjekt = new javax.swing.JComboBox<>();
        lblProjekt = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        btnMinaProjekt = new javax.swing.JButton();
        btnVisaProjekt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaVisaProjekt = new javax.swing.JTextArea();
        jPanelBakgrund = new javax.swing.JPanel();
        lblSkrivInlagg = new javax.swing.JLabel();
        lblSkrivRubrik = new javax.swing.JLabel();
        lblSkrivText = new javax.swing.JLabel();
        txfRubrik = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaText = new javax.swing.JTextArea();
        lblSkrivFil = new javax.swing.JLabel();
        btnPosta = new javax.swing.JButton();
        txfFil = new javax.swing.JTextField();
        btnValjFil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrik.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblRubrik.setText("Utbildningsprojekt");

        btnSkapaProjekt.setText("Skapa nytt projekt");
        btnSkapaProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkapaProjektActionPerformed(evt);
            }
        });

        cbxProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProjektActionPerformed(evt);
            }
        });

        lblProjekt.setText("Projekt jag har åtkomst till:");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnMinaProjekt.setText("Mina projekt");
        btnMinaProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinaProjektActionPerformed(evt);
            }
        });

        btnVisaProjekt.setText("Visa");
        btnVisaProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaProjektActionPerformed(evt);
            }
        });

        txaVisaProjekt.setColumns(20);
        txaVisaProjekt.setRows(5);
        jScrollPane2.setViewportView(txaVisaProjekt);

        jPanelBakgrund.setBackground(new java.awt.Color(204, 204, 255));

        lblSkrivInlagg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSkrivInlagg.setText("Skriv ett inlägg i projektet!");

        lblSkrivRubrik.setText("Rubrik:");

        lblSkrivText.setText("Text:");

        txfRubrik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfRubrikActionPerformed(evt);
            }
        });

        txaText.setColumns(20);
        txaText.setRows(5);
        jScrollPane1.setViewportView(txaText);

        lblSkrivFil.setText("Ladda upp fil:");

        btnPosta.setText("Posta");
        btnPosta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostaActionPerformed(evt);
            }
        });

        btnValjFil.setText("Välj");

        javax.swing.GroupLayout jPanelBakgrundLayout = new javax.swing.GroupLayout(jPanelBakgrund);
        jPanelBakgrund.setLayout(jPanelBakgrundLayout);
        jPanelBakgrundLayout.setHorizontalGroup(
            jPanelBakgrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBakgrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBakgrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBakgrundLayout.createSequentialGroup()
                        .addComponent(lblSkrivFil, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfFil, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnValjFil))
                    .addGroup(jPanelBakgrundLayout.createSequentialGroup()
                        .addGroup(jPanelBakgrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblSkrivRubrik, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(lblSkrivText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelBakgrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBakgrundLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 30, Short.MAX_VALUE))
                            .addGroup(jPanelBakgrundLayout.createSequentialGroup()
                                .addGroup(jPanelBakgrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelBakgrundLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(lblSkrivInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelBakgrundLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txfRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanelBakgrundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnPosta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBakgrundLayout.setVerticalGroup(
            jPanelBakgrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBakgrundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblSkrivInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBakgrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSkrivRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBakgrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSkrivText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBakgrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSkrivFil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfFil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValjFil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnPosta)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelBakgrund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 47, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblProjekt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(btnVisaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(btnMinaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(btnSkapaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVisaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelBakgrund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSkapaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMinaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(btnTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinaProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinaProjektActionPerformed
        this.dispose();
        new MinaProjekt(epost,id,true).setVisible(true);
    }//GEN-LAST:event_btnMinaProjektActionPerformed

    private void btnSkapaProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkapaProjektActionPerformed
        this.dispose();
        new SkapaNyttUtbildningsProjekt(epost).setVisible(true);
    }//GEN-LAST:event_btnSkapaProjektActionPerformed

    private void cbxProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProjektActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProjektActionPerformed

    private void btnVisaProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaProjektActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisaProjektActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        this.dispose();
        new AnvStartsida(epost).setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnPostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostaActionPerformed
        if (Validering.textFaltHarVarde(txfRubrik) && Validering.textAreaHarVarde(txaText)){
            String rubrik = txfRubrik.getText();
            String text = txaText.getText();
            String uiid = GetAutoId("SELECT MAX(UIID) FROM UTBILDNINGSINLAGG");
            String tidpunkt = hemtaTidpunkt();
            String personId = getId();
            String upid = getUpid();
            String query = "INSERT INTO UTBILDNINGSINLAGG VALUES ("+uiid+",'"+rubrik+"','"+text+"',null,'"+tidpunkt+"',"+personId+","+upid+")";
            updateSql(query);
            JOptionPane.showMessageDialog(null, "Inlägget har publicerats!");
            txfRubrik.setText(null);
            txaText.setText(null);
        }
        else {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i rubrik och textfält!");
        }
    }//GEN-LAST:event_btnPostaActionPerformed

    private void txfRubrikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfRubrikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfRubrikActionPerformed

    private String getId(){
        String id1 = null;
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        try {
            String query = "SELECT ANVANDARID FROM ANVANDARE WHERE EPOST='"+epost+"'";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id1 = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return id1;
    }
    
    private void fillBox(){
        cbxProjekt.removeAllItems();
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        try {
            String query = "SELECT TITEL FROM ANVANDARE_UTBILDNINGSPROJEKT JOIN UTBILDNINGSPROJEKT ON ANVANDARE_UTBILDNINGSPROJEKT.UPID=UTBILDNINGSPROJEKT.UPID WHERE ANVANDARE_UTBILDNINGSPROJEKT.ANVANDARID="+id;
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cbxProjekt.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public String GetAutoId(String o) {
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        int idNy = 1;
        try {
            String query = o;
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idNy = rs.getInt(1);
            }

        } catch (Exception ex) {
            System.out.println("Internt felmeddelande: " + ex);
        }

        idNy = idNy + 1;

        return Integer.toString(idNy);

    }
    
    public String hemtaTidpunkt() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        return dtf.format(now);

    }
    
    public String getUpid(){
        int uPid = 0;
        String titel = cbxProjekt.getSelectedItem().toString();
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT UPID FROM UTBILDNINGSPROJEKT WHERE TITEL ='"+titel+"'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                uPid = rs.getInt(1);

            }

        } catch (Exception ex) {
            System.out.println("Internt felmeddelande: " + ex);
        }
        
        return Integer.toString(uPid);
        
    }
    
        private void updateSql(String statement)
    {
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        try{
       PreparedStatement ps = connection.prepareStatement(statement);
       ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMinaProjekt;
    private javax.swing.JButton btnPosta;
    private javax.swing.JButton btnSkapaProjekt;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnValjFil;
    private javax.swing.JButton btnVisaProjekt;
    private javax.swing.JComboBox<String> cbxProjekt;
    private javax.swing.JPanel jPanelBakgrund;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblProjekt;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblSkrivFil;
    private javax.swing.JLabel lblSkrivInlagg;
    private javax.swing.JLabel lblSkrivRubrik;
    private javax.swing.JLabel lblSkrivText;
    private javax.swing.JTextArea txaText;
    private javax.swing.JTextArea txaVisaProjekt;
    private javax.swing.JTextField txfFil;
    private javax.swing.JTextField txfRubrik;
    // End of variables declaration//GEN-END:variables
}
