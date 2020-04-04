package mypack;



import com.jtattoo.plaf.texture.TextureLookAndFeel;
import java.util.Properties;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static void main(String args[])throws Exception
    {
        
       try {
            // select Look and Feel
           Properties props = new Properties();
  props.put("logoString", "");
  
            TextureLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
           
            
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
        
        
        
        Splash s=new Splash();
        s.setVisible(true);
        Thread t=Thread.currentThread();
        t.sleep(10000);
        s.dispose();
        SwingUtilities.invokeLater(new Runnable(){
            public void run()
            {
                new Login().setVisible(true);
            }
        });
        
        
    }

}
