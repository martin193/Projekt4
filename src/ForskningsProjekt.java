
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
public class ForskningsProjekt extends javax.swing.JFrame {
    
    private String epost;
    private String id; 
    String filepath;
    private byte[] filebytes;

    /**
     * Creates new sform ForskningsProjekt
     */
    public ForskningsProjekt(String e) {
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

        lblForskningsProjekt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaVisaProjekt = new javax.swing.JTextArea();
        lblProjektAtkomst = new javax.swing.JLabel();
        cbxProjekt = new javax.swing.JComboBox<>();
        btnVisaProjekt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblSkrivInlagg = new javax.swing.JLabel();
        lblRubrik = new javax.swing.JLabel();
        txfRubrik = new javax.swing.JTextField();
        lblText = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaText = new javax.swing.JTextArea();
        lblFil = new javax.swing.JLabel();
        txfLaddaUppFil = new javax.swing.JTextField();
        btnValjFil = new javax.swing.JButton();
        btnPosta = new javax.swing.JButton();
        test = new java.awt.Button();
        btnMinaProjekt = new javax.swing.JButton();
        btnSkapaNyttProjekt = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblForskningsProjekt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblForskningsProjekt.setText("Forskningsprojekt");

        txaVisaProjekt.setColumns(20);
        txaVisaProjekt.setRows(5);
        jScrollPane1.setViewportView(txaVisaProjekt);

        lblProjektAtkomst.setText("Projekt jag har åtkomst till:");

        btnVisaProjekt.setText("Visa");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lblSkrivInlagg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSkrivInlagg.setText("Skriv ett inlägg i projektet!");

        lblRubrik.setText("Rubrik:");

        lblText.setText("Text:");

        txaText.setColumns(20);
        txaText.setRows(5);
        jScrollPane2.setViewportView(txaText);

        lblFil.setText("Ladda upp fil:");

        btnValjFil.setText("Välj");
        btnValjFil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValjFilActionPerformed(evt);
            }
        });

        btnPosta.setText("Posta");
        btnPosta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostaActionPerformed(evt);
            }
        });

        test.setActionCommand("test");
        test.setLabel("button1");
        test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(lblSkrivInlagg))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblFil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfLaddaUppFil, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnValjFil))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPosta)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRubrik)
                                    .addComponent(lblText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSkrivInlagg)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRubrik))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblText)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFil)
                    .addComponent(txfLaddaUppFil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValjFil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnPosta)
                .addGap(23, 23, 23))
        );

        btnMinaProjekt.setText("Mina projekt");
        btnMinaProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinaProjektActionPerformed(evt);
            }
        });

        btnSkapaNyttProjekt.setText("Skapa nytt projekt");
        btnSkapaNyttProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkapaNyttProjektActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(lblProjektAtkomst)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVisaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnMinaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(btnSkapaNyttProjekt))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(lblForskningsProjekt)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblForskningsProjekt)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProjektAtkomst)
                            .addComponent(cbxProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVisaProjekt))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSkapaNyttProjekt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMinaProjekt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinaProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinaProjektActionPerformed
        this.dispose();
        new MinaProjekt(epost,id,false).setVisible(true);
    }//GEN-LAST:event_btnMinaProjektActionPerformed

    private void btnSkapaNyttProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkapaNyttProjektActionPerformed
        this.dispose();
        new SkapaNyttForskningsProjekt(epost).setVisible(true);
        
    }//GEN-LAST:event_btnSkapaNyttProjektActionPerformed

    private void btnPostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostaActionPerformed
        if (Validering.textFaltHarVarde(txfRubrik) && Validering.textAreaHarVarde(txaText))
            try
            {
            String sokväg = txfLaddaUppFil.getText();
            Path path = Paths.get(sokväg);
                  byte[] fileBytes = Files.readAllBytes(path);{
            String rubrik = txfRubrik.getText();
            String text = txaText.getText();
            String fiid = GetAutoId("SELECT MAX(FIID) FROM FORSKNINGSINLAGG");
            String tidpunkt = hemtaTidpunkt();
            String personId = getId();
            String fpid = getFpid();
            
            sokväg = path.getFileName().toString();
            
            String query = "INSERT INTO FORSKNINGSINLAGG VALUES ("+fiid+",'"+rubrik+"','"+text+"',fileBytes,'"+tidpunkt+"',"+personId+","+fpid+")";
            updateSql(query);
            JOptionPane.showMessageDialog(null, "Inlägget har publicerats!");
            txfRubrik.setText(null);
            txaText.setText(null);
            
        }
            }
       catch (Exception e) {
                System.out.println(e);
            }
    }//GEN-LAST:event_btnPostaActionPerformed

    private void btnValjFilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValjFilActionPerformed
        // TODO add your handling code here:
              JFileChooser jfc = new JFileChooser();
      jfc.showOpenDialog(this);
      
      try {
                  File f = jfc.getSelectedFile();
                  filepath = f.getAbsolutePath();
                  filepath = filepath.replace('\\', '/');
                  txfLaddaUppFil.setText(filepath);
//                  Path path = Paths.get(filepath);
//                  byte[] fileBytes = Files.readAllBytes(path);
      }
      catch (Exception e)
      {
          JOptionPane.showMessageDialog(rootPane, e);
      }
      
    }//GEN-LAST:event_btnValjFilActionPerformed

    private void testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testActionPerformed
        // TODO add your handling code here:
                        filepath = txfLaddaUppFil.getText();
        try {
            
           String basepath = System.getProperty("user.dir");
           String newfilepath = basepath + "\\src\\UploadedFiles\\" + filepath; 
           Path path = Paths.get(newfilepath);
           if (Files.exists(path))
                   {
                       Files.delete(path);
                   }
           File file = new File(newfilepath);
           FileOutputStream os = new FileOutputStream(file); 
           
           os.write(filebytes);
           os.close();
            
            File pdfFile = new File(newfilepath);
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
        catch ( HeadlessException | IOException e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_testActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        this.dispose();
        new AnvStartsida(epost).setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

        private String getId(){
        String id = null;
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        PreparedStatement ps = null;
        try {
            String query = "SELECT ANVANDARID FROM ANVANDARE WHERE EPOST='"+epost+"'";
            ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return id;
    }
        
     private void fillBox(){
        cbxProjekt.removeAllItems();
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        try {
            String query = "SELECT TITEL FROM ANVANDARE_FORSKNINGSPROJEKT JOIN FORSKNINGSPROJEKT ON ANVANDARE_FORSKNINGSPROJEKT.FPID=FORSKNINGSPROJEKT.FPID WHERE ANVANDARE_FORSKNINGSPROJEKT.ANVANDARID="+id;
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
    
    public String getFpid(){
        int uPid = 0;
        String titel = cbxProjekt.getSelectedItem().toString();
        DB_connection.DB_Connection obj_DB_Connection = new DB_connection.DB_Connection();
        Connection connection = obj_DB_Connection.get_connection();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT FPID FROM FORSKNINGSPROJEKT WHERE TITEL ='"+titel+"'");
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
    private javax.swing.JButton btnSkapaNyttProjekt;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnValjFil;
    private javax.swing.JButton btnVisaProjekt;
    private javax.swing.JComboBox<String> cbxProjekt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFil;
    private javax.swing.JLabel lblForskningsProjekt;
    private javax.swing.JLabel lblProjektAtkomst;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblSkrivInlagg;
    private javax.swing.JLabel lblText;
    private java.awt.Button test;
    private javax.swing.JTextArea txaText;
    private javax.swing.JTextArea txaVisaProjekt;
    private javax.swing.JTextField txfLaddaUppFil;
    private javax.swing.JTextField txfRubrik;
    // End of variables declaration//GEN-END:variables
}
