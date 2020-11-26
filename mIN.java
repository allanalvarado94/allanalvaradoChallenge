import java.awt.*;
import java.awt.event.*;
import java.math.MathContext;
import javax.management.StringValueExp;
import javax.swing.*;


public class mIN extends JFrame implements
 ActionListener
{
String tm="";
String txt="";
        float c,b;
                  double cn;
                            int op;
                                     JMenuBar cnt;
                                      JMenu see,edition,help;
                                       JRadioButtonMenuItem radians, Centimeters;
                                        JMenuItem standard, scientific,Programmer,Copy,paste,history,see_help_about_calculator;
                             
                           JButton b1= new JButton("gsm");     
                            JButton b2= new JButton("exp"); 
                             JButton b3= new JButton("In");
                              JButton b4= new JButton("SIN"); 
                               JButton b5= new JButton("X^Y"); 
                                JButton b6= new JButton("Log"); 
                                  JButton b7= new JButton("COS"); 
                                    JButton b8= new JButton("X^3"); 
                                      JButton b9= new JButton("N!"); 
                                        JButton b10= new JButton("TAN"); 
                                          JButton b11= new JButton("X^2"); 
                                            JButton b12= new JButton("1/X"); 
                                           JButton b13= new JButton("7"); 
                                          JButton b14= new JButton("8"); 
                                         JButton b15= new JButton("9"); 
                                        JButton b16= new JButton("/"); 
                                        JButton b17= new JButton("4"); 
                                       JButton b18= new JButton("5"); 
                                      JButton b19= new JButton("6"); 
                                     JButton b20= new JButton("*"); 
                                    JButton b21= new JButton("1"); 
                                   JButton b22= new JButton("2");
                                  JButton b23= new JButton("3");
                                 JButton b24= new JButton("-"); 
                                   JButton b25= new JButton("0");
                                     JButton b26= new JButton("+/-"); 
                                       JButton b27= new JButton(","); 
                                         JButton b28= new JButton("+"); 
                                           JButton b29= new JButton("=");
                                             JButton b30= new JButton("Back"); 
                                               JButton b31= new JButton("CE"); 
                                                 JButton b32= new JButton("C"); 
                                                   JButton b33= new JButton("SQ");
                                                     JButton b34= new JButton("%"); 
                                                       JButton b35= new JButton("."); 
                                    
JTextField jtf1= new JTextField();

 mIN (String Name){
    
    super (Name);

startcontrols();    
    
    }
public void startcontrols(){

              cnt = new JMenuBar();
                see= new JMenu("See");
                  edition=new JMenu("edition");
                     help=new JMenu("Help");

                        Standard = new JmenuItem("Standard");
                        


}


}
