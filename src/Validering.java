
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author afcfa
 */
public class Validering {
    public static boolean korrektDatum(JTextField kollaRuta)
    {
        String datum = "\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])*"; 
        if (kollaRuta.getText().matches(datum)) 
        {
            return true;
            //kollar ifall angivet värde är i korrekt datumformat, returnerar isåfall true
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Ange ett korrekt formulerat datum, åååå-mm-dd!");
            return false;
            //annars returneras false
        }

    }
    
    public static boolean korrektEmail(String kollaRuta)
    {
        String mail = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if (kollaRuta.matches(mail))
        {
            return true;
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Ange en korrekt mailadress");
            return false;
        }    
    }
    
    public static boolean textFaltHarVarde(JTextField kollaRuta)
    { 
        boolean resultat = true;
        if(kollaRuta.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i fält!");
            resultat=false;
            kollaRuta.requestFocus();
        }
           
        return resultat;
        
        //kollar om angivet värde är ifyllt eller tomt och returnerar true eller false
        
        //requestFocus gör att rutan där det felaktiva värdet har angetts kommer markeras åt användaren
    }
    
        public static boolean textAreaHarVarde(JTextArea kollaRuta)
    { 
        boolean resultat = true;
        if(kollaRuta.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i fält!");
            resultat=false;
            kollaRuta.requestFocus();
        }
           
        return resultat;
        
        //kollar om angivet värde är ifyllt eller tomt och returnerar true eller false
        
        //requestFocus gör att rutan där det felaktiva värdet har angetts kommer markeras åt användaren
    }
    
    public static boolean baraBokstaver(JTextField kollaRuta)
    {
          
        if (kollaRuta.getText().matches("^[\\p{L} .'-]+$"))         
        {
            return true;
            //såhär kollar man ifall inmatat värde endast innehåller bokstäver, då returneras true
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Vänligen ange endast bokstäver!");
            kollaRuta.requestFocus();
            return false;
            //annars returneras false
        }
    }
    public static boolean korrektTelnr(JTextField kollaRuta)
    {
        int nummer = (kollaRuta.getText().length());
                
         
        if (nummer != 10) 
        {
            JOptionPane.showMessageDialog(null, "Telefonnumret är i fel format");
            kollaRuta.requestFocus();
            return false;
        } 
        else {
            return true;
        } 
        
    }
    public static boolean korrektLosenord(JTextField kollaRuta)
    {
          
        if (kollaRuta.getText().length()>4)         
        {
            return true;
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Lösenordet är för kort");
            kollaRuta.requestFocus();
            return false;
        }
    }
    
}
