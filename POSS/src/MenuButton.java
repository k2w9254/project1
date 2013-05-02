import Logic.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class MenuButton extends JPanel {  
	JButton key1[];
	JComponent panel;
	JButton jButton2,jButton3;
	JLabel jLabel2,pricelabel;
	JLabel jLabel1;
	JTextArea infotxt;
	POS ps = new POS();
	
	private String bills ="";
	String password = "";
	
	public MenuButton() {
		panel = new JPanel();
		
		setSize(1105, 693);
		setLayout(null);
		
		jButton2 = new JButton();
		
		add(jButton2);
		
		jButton2.setText("jButton2");
		
		jButton2.setLayout(new GridLayout(4,3));
		jButton2.setBounds(128, 247, 346, 333);
		
	}
	public MenuButton(int categoryNum) {
		panel = new JPanel();
		
		key1 = new JButton[50];
		
		setSize(1105, 693);
		setLayout(null);
		
		jButton2 = new JButton();
		jButton3 = new JButton();
		jLabel1 = new JLabel();
		add(jButton2);
		add(jButton3);
		add(jLabel1);
		infotxt = new JTextArea(bills);
		this.add(infotxt);
		
		infotxt.setBounds(645, 138, 243, 270);
		
		
		jButton2.setText(" ");
		jButton3.setText("Back");
		jButton3.setBounds(100,50,100,50);
		jButton2.setLayout(new GridLayout(4,3));
		jButton2.setBounds(128, 247, 346, 333);
		
		MainMenu mm = new MainMenu();
		
		
		ps.readMenudata("menu.txt");
		
		for (int i = 0; i < ps.size; i++){
			
			
			switch (categoryNum)
			{
				case 1: 
					if(ps.menus[i].getCategory().equals("coffee")){
						jButton2.add(key1[i] = new JButton(ps.menus[i].getName()+"\n $"+ps.menus[i].getPrice()));	
						
						
						key1[i].addActionListener(new ActionListener(){
							
							
							public void actionPerformed(ActionEvent e){
								
								bills = bills +"\n"+e.getActionCommand();
								infotxt.setText(bills);
							}
							
						});
					
					}
					break;
				case 2: 
					if(ps.menus[i].getCategory().equals("sandwich")){
					jButton2.add(key1[i] = new JButton(ps.menus[i].getName()+"\n $"+ps.menus[i].getPrice()));
					key1[i].addActionListener(new ActionListener(){
						
						
						public void actionPerformed(ActionEvent e){
							
							bills = bills +"\n"+e.getActionCommand();
							infotxt.setText(bills);
							
						}
						
					});
					}
					break;
				case 3: 
					if(ps.menus[i].getCategory().equals("tea")){
						jButton2.add(key1[i] = new JButton(ps.menus[i].getName()+"\n $"+ps.menus[i].getPrice()));
						key1[i].addActionListener(new ActionListener(){
							
							
							public void actionPerformed(ActionEvent e){
								
								bills = bills +"\n"+e.getActionCommand();
								infotxt.setText(bills);
							}
							
						});
						}		
					break;
				case 4: 
					if(ps.menus[i].getCategory().equals("treat")){
						jButton2.add(key1[i] = new JButton(ps.menus[i].getName()+"\n $"+ps.menus[i].getPrice()));
						key1[i].addActionListener(new ActionListener(){
							
							
							public void actionPerformed(ActionEvent e){
								
								bills = bills +"\n"+e.getActionCommand();
								infotxt.setText(bills);
							}
							
						});
					}		
					break;
				
					
			}
			
			
			
		}
	
		
		add(panel);
		
		
		
		jButton3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				CardLayoutEventTest.card.show(CardLayoutEventTest.slide,"5");
			}
		});
	}
		

		
	
	

}	


