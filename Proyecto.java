import java.awt.*;
    import java.awt.event.*;
        import java.math.MathContext;
            import javax.management.StringValueExp;
                import javax.swing.*;
                
                   import java.awt.event.ActionListener;
                     import java.awt.event.ActionEvent;
                 


public class Proyecto extends JFrame implements ActionListener
   {   
String tm="";
String txt="";
        float c,b;
                  double cn;
                            int op;
                                     JMenuBar cnt;
                                      JMenu see,edition,help;
                                       JRadioButtonMenuItem radians, centimeters;
                                        JMenuItem standard, scientific,programmer,copy,paste,history,see_help,about_calculator;
                             
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

royecto (String Name){
    
    super (Name);

startcontrols();    
    
    }
public void startcontrols(){

              cnt = new JMenuBar();
                see= new JMenu("See");
                  edition=new JMenu("edition");
                     help=new JMenu("Help");

                        standard = new JMenuItem("Standard");
                          scientific = new JMenuItem("scientific");
                            programmer = new JMenuItem("programmer");
                              copy = new JMenuItem("copy");
                                paste = new JMenuItem("paste");
                                  history = new JMenuItem("history");
                                    see_help = new JMenuItem("see_help");
                                        about_calculator = new JMenuItem("about_calculator");
              this.setJMenuBar(cnt);
               cnt.add(see);
               
                   cnt.add(edition);
                     cnt.add(help);
                       cnt.add(standard);
                          cnt.add(scientific);
                             cnt.add(programmer);
                                 cnt.add(copy);
                                    cnt.add(paste);
                                       cnt.add(history);
                                         cnt.add(see_help);
                                           cnt.add(about_calculator);
                                       

              help.add(about_calculator);
               help.add(see_help);
                 radians = new JRadioButtonMenuItem("Radians");
                  centimeters = new JRadioButtonMenuItem("centimeters");
                    radians.setBounds(50,100,80,45);
                    radians.setBackground(Color.DARK_GRAY);
                    
                   centimeters.setBounds(50,100,90,45);
                     centimeters.setBackground(Color.DARK_GRAY);
                     
                    jtf1.setBounds(50,50,405,35);
                     b1.setBounds(50,150,60,25);
                      b2.setBounds(115,150,60,25);
                       b3.setBounds(180,150,60,25);
                        b4.setBounds(50,180,60,25);
                          b5.setBounds(115,180,60,25);
                           b6.setBounds(180,180,60,25);
                            b7.setBounds(50,210,60,25);
                              b8.setBounds(115,210,60,25);
                             b9.setBounds(180,210,60,25);
                            b10.setBounds(50,240,60,25);
                           b11.setBounds(115,240,60,25);
                          b12.setBounds(180,240,60,25);
                         b13.setBounds(260,125,45,25);
                          b14.setBounds(310,125,45,25);
                           b15.setBounds(360,125,45,25);
                            b16.setBounds(410,125,45,25);
                             b17.setBounds(260,155,45,25);
                            b18.setBounds(310,155,45,25);
                           b19.setBounds(360,155,45,25);
                          b20.setBounds(410,155,45,25);
                         b21.setBounds(260,185,45,25);
                          b22.setBounds(310,185,45,25);
                           b23.setBounds(360,185,45,25);
                            b24.setBounds(410,185,45,25);
                             b25.setBounds(260,215,45,25);
                               b26.setBounds(308,215,50,25);
                                b27.setBounds(360,215,45,25);
                                 b28.setBounds(410,215,45,25);
                                  b29.setBounds(410,245,42,25);
                                   b30.setBounds(260,95,93,25);
                                    b31.setBounds(356,95,50,25);
                                     b32.setBounds(409,95,44,25);
                                
                             
      this.getContentPane().add(jtf1);          
        this.getContentPane().add(radians);    
          this.getContentPane().add(centimeters);    
            this.getContentPane().add(b1);    
              this.getContentPane().add(b2);    
                this.getContentPane().add(b3);    
                  this.getContentPane().add(b4);    
                    this.getContentPane().add(b5);    
                      this.getContentPane().add(b6);    
                        this.getContentPane().add(b7);    
                          this.getContentPane().add(b8);    
                            this.getContentPane().add(b9);    
                              this.getContentPane().add(b10);    
                                this.getContentPane().add(b11);    
                                  this.getContentPane().add(b12);    
                                    this.getContentPane().add(b13);    
                                   this.getContentPane().add(b14);    
                                  this.getContentPane().add(b15);   
                                 this.getContentPane().add(b16);
                                this.getContentPane().add(b17);
                               this.getContentPane().add(b18);    
                              this.getContentPane().add(b19);    
                             this.getContentPane().add(b20);    
                            this.getContentPane().add(b21);    
                           this.getContentPane().add(b22);    
                          this.getContentPane().add(b23);
                         this.getContentPane().add(b24);
                        this.getContentPane().add(b25);
                       this.getContentPane().add(b26);
                      this.getContentPane().add(b27);
                     this.getContentPane().add(b28);
                    this.getContentPane().add(b29);
                   this.getContentPane().add(b30);
                  this.getContentPane().add(b31);
                 this.getContentPane().add(b32);
                this.getContentPane().add(b33);
                  this.getContentPane().add(b34);
                    this.getContentPane().add(b35);
                   
                   
                          
                      
                                   
                b1.addActionListener(this); 
                 b1.addActionListener(this); 
                  b1.addActionListener(this); 
                   b1.addActionListener(this); 
                    b1.addActionListener(this); 
                     b1.addActionListener(this); 
                      b1.addActionListener(this); 
                       b1.addActionListener(this); 
                        b1.addActionListener(this); 
                         b1.addActionListener(this); 
                          b1.addActionListener(this); 
                           b1.addActionListener(this); 
                            b1.addActionListener(this); 
                             b1.addActionListener(this); 
                              b1.addActionListener(this); 
                               b1.addActionListener(this); 
                                b1.addActionListener(this); 
                                                          b1.addActionListener(this); 
                                                           b1.addActionListener(this); 
                                                            b1.addActionListener(this); 
                                                             b1.addActionListener(this); 
                                                              b1.addActionListener(this); 
                                                               b1.addActionListener(this); 
                                                                b1.addActionListener(this); 
                                                                 b1.addActionListener(this); 
                                                                  b1.addActionListener(this); 
                                                              
                                                
                  
              



                       
               


}


}
