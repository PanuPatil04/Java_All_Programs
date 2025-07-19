package com.dkte;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyWindow extends JFrame{
     private JLabel num1Label,num2Label;
     private JTextField num1TextField,num2TextField;
     private JButton addBtn,subBtn,mulBtn,divBtn;
     
     public MyWindow(){
     this.setTitle("Assignment01");
     this.setSize(550,300);
     this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(null);
    	 
     num1Label= new JLabel("Num1");
     num1Label.setBounds(90, 50, 70, 30);
     this.add(num1Label);
     
     num1TextField=new JTextField();
     num1TextField.setBounds(180, 50, 100, 20);
     this.add(num1TextField);
     
     num2Label= new JLabel("Num2");
     num2Label.setBounds(90, 80, 70, 30);
     this.add(num2Label);
     
     num2TextField=new JTextField();
     num2TextField.setBounds(180, 80, 100, 20);
     this.add(num2TextField);
     
     addBtn=new JButton("ADD");
     addBtn.setBounds(50,180,100,30);
     this.add(addBtn);
     
     subBtn=new JButton("SUB");
     subBtn.setBounds(160,180,100,30);
     this.add(subBtn);
     
     mulBtn=new JButton("MUL");
     mulBtn.setBounds(270,180,100,30);
     this.add(mulBtn);
     
     divBtn=new JButton("DIV");
     divBtn.setBounds(390,180,100,30);
     this.add(divBtn);
     
        addBtn.addActionListener((e) -> {
    	int num1=Integer.parseInt(num1TextField.getText());
    	int num2=Integer.parseInt(num2TextField.getText());
    	int res=num1+num2;
    	String message="Addition::" +res;
    	JOptionPane.showMessageDialog(this, message);
    	
     });
        
        subBtn.addActionListener((e) -> {
        	int num1=Integer.parseInt(num1TextField.getText());
        	int num2=Integer.parseInt(num2TextField.getText());
        	int res=num1-num2;
        	String message="Substraction::" +res;
        	JOptionPane.showMessageDialog(this, message);
        	
         });
        
        mulBtn.addActionListener((e) -> {
        	int num1=Integer.parseInt(num1TextField.getText());
        	int num2=Integer.parseInt(num2TextField.getText());
        	int res=num1*num2;
        	String message="Multiplication::" +res;
        	JOptionPane.showMessageDialog(this, message);
        	
         });
        
        divBtn.addActionListener((e) -> {
        	int num1=Integer.parseInt(num1TextField.getText());
        	int num2=Integer.parseInt(num2TextField.getText());
        	int res=num1/num2;
        	String message="Division::" +res;
        	JOptionPane.showMessageDialog(this, message);
        	
         });
    
     
     } 
     
}
