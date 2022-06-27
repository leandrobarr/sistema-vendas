
package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Utilidades {
    public static boolean isNumeric(String Numero) {
        try {
            Integer.parseInt(Numero);
            return true;
        } catch(NumberFormatException nfe) {
            return false;
        }
    }
    
    public static Date StringtoDate(String Data) {
        SimpleDateFormat formatotexto = new SimpleDateFormat("YYYY/MM/dd");
        Date x = null;
        try {
            x = formatotexto.parse(Data);
            
        }catch (ParseException ex) {
            
        }
        return  x;
    }
}


