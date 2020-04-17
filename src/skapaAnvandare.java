
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class skapaAnvandare extends javax.swing.JFrame {
    
    String epost;

    /**
     * Creates new form skapaAnvandare
     */
    public skapaAnvandare() {
        initComponents();
    }
    
    public skapaAnvandare(String e) {
        initComponents();
        epost = e;   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txfFornamn = new javax.swing.JTextField();
        txfEfternamn = new javax.swing.JTextField();
        txfMail = new javax.swing.JTextField();
        txfTelnr = new javax.swing.JTextField();
        txfLosenord = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLaggTill = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        cboxAdministrator = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Förnamn");

        jLabel2.setText("Efternamn");

        jLabel3.setText("Mailadress");

        jLabel4.setText("Telefonnummer");

        jLabel5.setText("Lösenord");

        jLabel6.setText("Skapa ny användare");

        btnLaggTill.setText("Lägg till");
        btnLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        cboxAdministrator.setText("Administratör");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnLaggTill)
                        .addGap(30, 30, 30)
                        .addComponent(btnTillbaka)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboxAdministrator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfLosenord, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(txfTelnr)
                    .addComponent(txfMail)
                    .addComponent(txfEfternamn)
                    .addComponent(txfFornamn))
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txfFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txfEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(txfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(txfTelnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboxAdministrator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaggTill)
                    .addComponent(btnTillbaka))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillActionPerformed
        String fornamn = txfFornamn.getText();
        String efternamn = txfEfternamn.getText();
        String mail = txfMail.getText();
        String telnr = txfTelnr.getText();
        String losenord = txfLosenord.getText();
        boolean adminstatus = cboxAdministrator.isSelected(); 
        
        String admin = "F";
        
        if(adminstatus){
            admin = "T";
        }
        
        
        if (Validering.baraBokstaver(txfFornamn) && Validering.textFaltHarVarde(txfFornamn)){
            if (Validering.baraBokstaver(txfEfternamn) && Validering.textFaltHarVarde(txfEfternamn)){
                if (Validering.korrektEmail(mail)){
                    if (Validering.korrektTelnr(txfTelnr)){
                        if (Validering.korrektLosenord(txfLosenord)){
                            String id = "3";
                            String fraga = "INSERT into ANVANDARE values ('" + id + "', '" + fornamn + "', '" + efternamn +
                                    "', '" + mail + "', '" + telnr + "', '" + losenord + "', '" + admin + "','-','T')";
                            
                            skapaAnvandare(fraga);
                            
                            JOptionPane.showMessageDialog(null, "Användare tillagd");
                            
                            emptyBoxes();
                        }
                    }
                    
                }
                
            }
            
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnLaggTillActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        this.dispose();
        new AnvStartsida(epost).setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed
    
    private void skapaAnvandare(String Q){
        	DB_connection.DB_Connection obj_DB_Connection= new DB_connection.DB_Connection();
	Connection connection=obj_DB_Connection.get_connection();
	PreparedStatement ps=null;
	try {
	    String query= Q;
	    ps=connection.prepareStatement(query);
	    ps.executeUpdate();
	} catch (SQLException e) {
	    System.out.println(e);
	}
    }
    
    private void emptyBoxes(){
        txfFornamn.setText(null);
        txfEfternamn.setText(null);
        txfMail.setText(null);
        txfTelnr.setText(null);
        txfLosenord.setText(null);
        cboxAdministrator.setSelected(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaggTill;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JCheckBox cboxAdministrator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txfEfternamn;
    private javax.swing.JTextField txfFornamn;
    private javax.swing.JTextField txfLosenord;
    private javax.swing.JTextField txfMail;
    private javax.swing.JTextField txfTelnr;
    // End of variables declaration//GEN-END:variables
}
