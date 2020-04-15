
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
public class InformellBlogg extends javax.swing.JFrame {

    /**
     * Creates new form InformellBlogg
     */
    public InformellBlogg() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        fyllBloggRuta();
        fyllCbKategorier();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
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
        bloggRuta = new java.awt.TextArea();
        btnNyttInlagg = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        btnFiltreraKategori = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrik.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblRubrik.setText("Informella bloggen");

        btnNyttInlagg.setText("Skriv ett nytt blogginlägg!");
        btnNyttInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyttInlaggActionPerformed(evt);
            }
        });

        jButton2.setText("Visa mina inlägg");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnFiltreraKategori.setText("Filtrera på kategori");
        btnFiltreraKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltreraKategoriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bloggRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNyttInlagg, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTillbaka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(31, 31, 31))))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFiltreraKategori)
                        .addGap(42, 42, 42)
                        .addComponent(cbxKategorier, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxKategorier, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bloggRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFiltreraKategori)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(btnNyttInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        this.dispose();
        new AnvStartsida().setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnFiltreraKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltreraKategoriActionPerformed

        String kategori = cbxKategorier.getSelectedItem().toString();
        
        bloggRuta.setText("");
        
        try
        {
            
            String fraga= "SELECT * FROM INFORMELL_BLOGG JOIN KATEGORI_INFORMELL ON KATEGORIID = KATEGORI WHERE KATEGORINAMN = '" + kategori + "'";
                
                
            String rubrik = GetQuery(fraga);
                
                
        }
        catch (Exception bla)
        {
             JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
         
    }//GEN-LAST:event_btnFiltreraKategoriActionPerformed

    private void btnNyttInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyttInlaggActionPerformed
        this.dispose();
        new SkrivaInformelltInlagg().setVisible(true);
    }//GEN-LAST:event_btnNyttInlaggActionPerformed

    private void fyllBloggRuta() {                                             
           
        
        bloggRuta.setText("");
        
            try
            {
            
                String fraga= "SELECT * FROM INFORMELL_BLOGG JOIN KATEGORI_INFORMELL ON KATEGORIID = KATEGORI JOIN ANVANDARE ON ANVANDARE.ANVANDARID = INFORMELL_BLOGG.ANVANDARID";
                
                
                String rubrik = GetQuery(fraga);
                
                
            }
            catch (Exception bla)
            {
                JOptionPane.showMessageDialog(null, "Något gick fel!");
            }
        
    }      
    
    public String GetQuery(String s)
    {
	DB_connection.DB_Connection obj_DB_Connection= new DB_connection.DB_Connection();
	Connection connection=obj_DB_Connection.get_connection();
	PreparedStatement ps=null;
        String rubrik = null;
        String text = null;
        String kategori = null;
        String fornamn = null;
        String efternamn = null;
	try {
	    String query= s;
	    ps=connection.prepareStatement(query);
	    ResultSet rs=ps.executeQuery();
	    while(rs.next()){
                rubrik = rs.getString(1);
                text = rs.getString(2);
                kategori = rs.getString(8);
                fornamn = rs.getString(11);
                efternamn = rs.getString(12);
                
                
                String resultat = "";                      
                
                resultat+=rubrik + "\n" + "Författare: " + fornamn + ' ' + efternamn + "\n" + "Kategori: " + kategori + "\n" + text +  "\n" + "\n";
                
                bloggRuta.append(resultat);
                
	    }
	} catch (Exception e) {
	    System.out.println(e);
	} 
        return rubrik;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextArea bloggRuta;
    private javax.swing.JButton btnFiltreraKategori;
    private javax.swing.JButton btnNyttInlagg;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbxKategorier;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblRubrik;
    // End of variables declaration//GEN-END:variables
}
