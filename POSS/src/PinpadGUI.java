


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class PinpadGUI extends JPanel {  
	JComponent panel;
	JButton jButton2;
	JLabel jLabel2;
	JLabel jLabel1;
	
	String password = "";
	JButton key1,key2,key3,key4,key5,key6,key7,key8,key9,key0,keyc,keye;
	
	public PinpadGUI() {
		panel = new JPanel();
		
		setSize(1105, 693);
		setLayout(null);
		
		jLabel1 = new JLabel();
		add(jLabel1);
		jLabel1.setText("Please Enter the Pin number");
		jLabel1.setBounds(539, 138, 494, 92);
		jLabel1.setFont(new java.awt.Font("Segoe UI",0,36));
		
		jLabel2 = new JLabel();
		add(jLabel2);
		jLabel2.setText("");
		jLabel2.setBounds(139, 138, 494, 92);
		jLabel2.setFont(new java.awt.Font("Segoe UI",0,36));
		
		jButton2 = new JButton();
		
		add(jButton2);
		
		jButton2.setText("jButton2");
		
		jButton2.setLayout(new GridLayout(4,3));
		jButton2.setBounds(128, 247, 346, 333);
		jButton2.add(key1 = new JButton("1"));
		jButton2.add(key2 = new JButton("2"));
		jButton2.add(key3 = new JButton("3"));
		jButton2.add(key4 = new JButton("4"));
		jButton2.add(key5 = new JButton("5"));
		jButton2.add(key6 = new JButton("6"));
		jButton2.add(key7 = new JButton("7"));
		jButton2.add(key8 = new JButton("8"));
		jButton2.add(key9 = new JButton("9"));
		jButton2.add(keyc = new JButton("cancel"));
		jButton2.add(key0 = new JButton("0"));
		jButton2.add(keye = new JButton("Enter"));

			
		add(panel);
	
		
	
	key1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			password += "1";
		}
	});
	key2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			password += "2";
		}
	});
	key3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			password += "3";
		}
	});
	key4.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			password += "4";
		}
	});
	key5.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			password += "5";
		}
	});
	key6.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			password += "6";
		}
	});
	key7.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			password += "7";
		}
	});
	key8.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			password += "8";
		}
	});
	key9.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			password += "9";
		}
	});
	key0.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			password += "0";
		}
	});
	keyc.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			password = "";
		}
	});
	keye.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){				
				if(password.equals("1234"))
				{
					CardLayoutEventTest.card.show(CardLayoutEventTest.slide,"3");
				}else{
					jLabel2.setText("Wrong Password");
					password = "";
				}
		}
	});
		
		}
	
}
	


