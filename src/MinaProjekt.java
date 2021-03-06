
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class MinaProjekt extends javax.swing.JFrame {

    private boolean uProjekt;
    private String epost;
    private String id;
    /**
     * Creates new form MinaProjekt
     */
    public MinaProjekt(String e, String i,boolean u) {
        initComponents();
        uProjekt = u;
        epost = e;
        id = i;
        fyllcbxUtbildning();
        fyllcbxForskning();
    }
    
    private void fyllcbxUtbildning() {
        cbxUtbildning.removeAllItems();
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        String inlagg = null;
        cbxUtbildning.addItem("");

        try {
            String fraga = "SELECT TITEL FROM UTBILDNINGSPROJEKT WHERE ANVANDARID="+id;
            ps = connection.prepareStatement(fraga);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                inlagg = rs.getString(1);
                cbxUtbildning.addItem(inlagg);
            }
        } catch (Exception e) {
            System.out.println("Felmeddelande! " + e);
        }
    }
    
    private void fyllcbxForskning() {
       cbxForskning.removeAllItems();
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        String inlagg = null;
        cbxForskning.addItem("");

        try {
            String fraga = "SELECT TITEL FROM FORSKNINGSPROJEKT WHERE ANVANDARID="+id;
            ps = connection.prepareStatement(fraga);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                inlagg = rs.getString(1);
                cbxForskning.addItem(inlagg);
            }
        } catch (Exception e) {
            System.out.println("Felmeddelande! " + e);
        }
        
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
        lblUtbildning = new javax.swing.JLabel();
        lblForskning = new javax.swing.JLabel();
        cbxUtbildning = new javax.swing.JComboBox<>();
        cbxForskning = new javax.swing.JComboBox<>();
        btnTillbaka = new javax.swing.JButton();
        btnRadera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrik.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblRubrik.setText("Mina Projekt");

        lblUtbildning.setText("Mina utbildningsprojekt:");

        lblForskning.setText("Mina forskningsprojekt:");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnRadera.setText("Radera projekt");
        btnRadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaderaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUtbildning)
                                    .addComponent(cbxUtbildning, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxForskning, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblForskning)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(lblRubrik))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(btnRadera, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(lblUtbildning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxUtbildning, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblForskning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxForskning, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnRadera, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        this.dispose();
        if (uProjekt){
        new UtbildningsProjekt(epost).setVisible(true);
        }
        else {
        new ForskningsProjekt(epost).setVisible(true);
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnRaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaderaActionPerformed
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;


            String utbildningsTitel = cbxUtbildning.getSelectedItem().toString();
            String forskningsTitel = cbxForskning.getSelectedItem().toString();
            if (utbildningsTitel.equals("") && forskningsTitel.equals("")){
                JOptionPane.showMessageDialog(null, "Välj ett projekt!");
            }
            else if (utbildningsTitel != null && forskningsTitel.equals("")) {
                String uPid = getUFpid("SELECT UPID FROM UTBILDNINGSPROJEKT WHERE TITEL = '"+utbildningsTitel+"'");
                String sql1 = "DELETE FROM UTBILDNINGSPROJEKT WHERE UPID ="+uPid;
                String sql2 = "DELETE FROM UTBILDNINGSINLAGG WHERE UPID ="+uPid;
                String sql3 = "DELETE FROM ANVANDARE_UTBILDNINGSPROJEKT WHERE UPID ="+uPid;
                updateSql(sql3);
                updateSql(sql2);
                updateSql(sql1);

                JOptionPane.showMessageDialog(null, "Projektet har raderats!");
                
                fyllcbxUtbildning();
            } else if (forskningsTitel != null && utbildningsTitel.equals("")) {
                String fPid = getUFpid("SELECT FPID FROM FORSKNINGSPROJEKT WHERE TITEL = '"+forskningsTitel+"'");
                String sql1 = "DELETE FROM FORSKNINGSPROJEKT WHERE FPID ="+fPid;
                String sql2 = "DELETE FROM FORSKNINGSINLAGG WHERE FPID ="+fPid;
                String sql3 = "DELETE FROM ANVANDARE_FORSKNINGSPROJEKT WHERE FPID ="+fPid;
                updateSql(sql3);
                updateSql(sql2);
                updateSql(sql1);

                JOptionPane.showMessageDialog(null, "Projektet har raderats!");
                
                fyllcbxForskning();
            } else if (utbildningsTitel != null && forskningsTitel != null) {
                JOptionPane.showMessageDialog(null, "Välj endast ett projekt!");
            }


    }//GEN-LAST:event_btnRaderaActionPerformed

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
    
    private String getUFpid(String q){
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        String svar = null;
        try {
            PreparedStatement ps = connection.prepareStatement(q);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
             svar = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return svar;
    }

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRadera;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbxForskning;
    private javax.swing.JComboBox<String> cbxUtbildning;
    private javax.swing.JLabel lblForskning;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblUtbildning;
    // End of variables declaration//GEN-END:variables
}
