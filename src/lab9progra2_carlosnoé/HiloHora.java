package lab9progra2_carlosnoé;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class HiloHora implements Runnable {
    private JLabel hora;
    public HiloHora(JLabel hora) {
        this.hora = hora;
    }        

    @Override
    public void run() {
        while(true){
            Date h=new Date();
            DateFormat f=new SimpleDateFormat("hh:mm:ss");
            hora.setText( f.format(h) );
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                
            }
        }        
    }
    
}
