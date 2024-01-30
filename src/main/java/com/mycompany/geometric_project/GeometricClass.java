package com.mycompany.geometric_project;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class GeometricClass extends JFrame implements ActionListener{
   
    double s1;
    
    Circle c9 ;
    Square c8 ;
    Rectangle c7;
    
    JButton b1;
    
    JTextField t1,t2,t3;
    
    JLabel l1,l2,l3,l4, l5,la;
    
    JComboBox c;
    
    String arr[]={"---------------","circle","square","rectangle"};
    
    double hight,width,side;
    
    Font font = new Font("Serif", Font.BOLD, 18);
    Font myfont = new Font("Serif", Font.BOLD, 15);

    
    public GeometricClass (){
        b1= new JButton("Calculate and Display");
        t1= new JTextField();
        t2= new JTextField();
        t3= new JTextField();
    l1= new JLabel("Welcome To Our Project");
    l2= new JLabel("Select One Shape :");
    l3= new JLabel("Length");
    l4= new JLabel("Width");
    l5= new JLabel("Radius");
    la= new JLabel();  
        c= new JComboBox(arr);
        
    setTitle("PROJECT OOP");
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocation(550,200);
    setLayout(null);
    
    l1.setFont(font);
    l2.setFont(font);
    l3.setFont(font);
    l4.setFont(font);
    l5.setFont(font);
    la.setFont(myfont);
    
    l1.setBounds(50, 20, 300, 40);
    l2.setBounds(20, 100, 180, 40);
    c.setBounds( 200, 100,100 , 40);
    l3.setBounds( 20,135 , 80, 40);
    t1.setBounds(100,150 ,100 ,20);
    l4.setBounds( 20,185 , 80, 40);
    t2.setBounds(100,200 ,100 ,20);
    l5.setBounds( 20,240 , 80, 40);
    t3.setBounds(100, 250,100 ,20);
    la.setBounds( 10, 280,400 ,40 );
    b1.setBounds(210, 245,170 ,30);

        c.addActionListener(this);
        b1.addActionListener(this);         
           
        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(b1);
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);
        this.add(c);
        
        this.setVisible(true);}
    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) {
        try {
            switch (c.getSelectedIndex()) {
                case 1: {
                    s1 = Double.parseDouble(t3.getText());
                    if (s1 > 0 && s1 != 0) {
                        c9 = new Circle(s1);
                        this.add(la);
                        t3.setText(" ");
                        la.setText("Area = " + c9.getArea() + " ,  Perimeter = " + c9.getPerimeter());}
                    else
                        throw new Exception("Invalid Value");
                             break;}
                case 2: {
                    side = Double.parseDouble(t1.getText());
                    if (side > 0 && side != 0) {
                        c8 = new Square();
                        c8.setSide(side);
                        this.add(la);
                        t1.setText(" ");
                        la.setText("Area = " + c8.getArea() + " ,  Perimeter = " + c8.getPerimeter());}
                    else
                        throw new Exception("Invalid Value");
                            break;}
                case 3: {
                    hight = Double.parseDouble(t1.getText());
                    width = Double.parseDouble(t2.getText());
                    if (hight > 0 && width > 0 && hight != 0 && width != 0) {
                        c7 = new Rectangle();
                        c7.setWidth(width);
                        c7.setHeight(hight);
                        this.add(la);
                        t1.setText(" "); t2.setText(" ");
                        la.setText("Area = " + c7.getArea() + " ,  Perimeter = " + c7.getPerimeter()); }  
                    else
                      throw new Exception("Invalid Value");
                         break;}}
} catch (Exception x) {
    t1.setText(" "); t2.setText(" "); t3.setText(" ");
    this.add(la);
    la.setText("Invalid Value");}}}}