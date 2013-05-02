

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListModel;

import Logic.*;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class MainMenu extends JPanel {
	private JLabel mmLabel,jLabel1,totalLabel,mPrice,totalLabel2,totalLabel3;
	private JButton categoryb;
	private	JScrollPane scrollPane;
	private	JList		listbox;
	private	Vector		listData;
	
	
	JButton cofb,sandb,teab,treatb,showpanel,btnPrint;
	JButton productb,jButton3,jButton2,cate1,cate2,cate3,cate4;
	JButton c1,c2,c3,c4;
	JTextArea infotxt,pricetxt;
	Regiser rg = new Regiser();
	POS ps = new POS();
	JButton key1[];
	String bills="";
	double totalPrice=0;
	JComponent panel;
	


	public MainMenu() {
		
		
			this.setPreferredSize(new java.awt.Dimension(867, 407));
			this.setLayout(null);
			{
				
				cate1 = new JButton();
				cate2 = new JButton();
				cate3 = new JButton();
				cate4 = new JButton();
				btnPrint = new JButton();
				
				jButton2 = new JButton();
				jButton3 = new JButton();
				jLabel1 = new JLabel();
				totalLabel = new JLabel();
				totalLabel2 = new JLabel();
				totalLabel3 = new JLabel();
				mmLabel = new JLabel();
				mPrice = new JLabel();
				this.add(mmLabel);
				
				mmLabel.setText("Please select Category");
				mmLabel.setBounds(37, 12, 356, 41);
				mmLabel.setFont(new java.awt.Font("Segoe UI",0,28));
				
				jButton3.setText("Back");
				jButton3.setBounds(100,550,100,50);
			
				categoryb = new JButton();				
				
				totalLabel.setText("Amout : $"+ totalPrice);
				totalLabel.setBounds(650, 500, 500, 300);
				totalLabel.setFont(new java.awt.Font("Segoe UI",0,20));
				
				totalLabel2.setText("Tax : $"+ totalPrice);
				totalLabel2.setBounds(650, 530, 500, 300);
				totalLabel2.setFont(new java.awt.Font("Segoe UI",0,20));
				
				totalLabel3.setText("Total : $"+ totalPrice);
				totalLabel3.setBounds(650, 560, 500, 300);
				totalLabel3.setFont(new java.awt.Font("Segoe UI",0,20));
			
				
				add(categoryb);	
				categoryb.setLayout(new GridLayout(2,2));
				categoryb.add(cofb = new JButton("Coffee"));
				cofb.setFont(new java.awt.Font("segoe UI",0,20));
				categoryb.add(sandb = new JButton("Sandwich"));
				sandb.setFont(new java.awt.Font("segoe UI",0,20));
				categoryb.add(teab = new JButton("Tea"));
				teab.setFont(new java.awt.Font("segoe UI",0,20));
				categoryb.add(treatb = new JButton("Treats"));	
				treatb.setFont(new java.awt.Font("segoe UI",0,20));
				categoryb.setBounds(59, 120, 500, 160);
				
			
				
				
				panel = new JPanel();
				
				listData = new Vector();

				// Create a new listbox control
				listbox = new JList( listData );
				//listbox.addListSelectionListener( this );

				scrollPane = new JScrollPane();
				scrollPane.getViewport().add( listbox );
				panel.add( scrollPane );
				//panel.setBounds(645, 138, 300, 450);
				key1 = new JButton[50];
				
				setSize(500, 400);
				setLayout(null);
				
				
				add(cate1);
				add(cate2);
				add(cate3);
				add(cate4);
				add(btnPrint);
				add(jButton2);
				add(jButton3);
				add(jLabel1);
				
				infotxt = new JTextArea(bills);
				this.add(mPrice);
				add(totalLabel);
				add(totalLabel2);
				add(totalLabel3);
				this.add(infotxt);
				
				infotxt.setBounds(645, 138, 300, 450);
				
				//infotxt.setVisible(false);
				
				
				
				jButton2.setText(" ");
				jButton3.setText("Back");
				jButton3.setBounds(100,50,100,50);
				
				btnPrint.setText("Print");
				btnPrint.setBounds(300,50,100,50);
				
				cate1.setLayout(new GridLayout(4,3));
				cate1.setBounds(128, 347, 346, 333);
				
				cate2.setLayout(new GridLayout(4,3));
				cate2.setBounds(128, 347, 346, 333);
				
				cate3.setLayout(new GridLayout(4,3));
				cate3.setBounds(128, 347, 346, 333);
				
				cate4.setLayout(new GridLayout(4,3));
				cate4.setBounds(128, 347, 346, 333);
				
				
				
				ps.readMenudata("menu.txt");
				
				for (int i = 0; i < ps.size; i++){
					
					
				
							if(ps.menus[i].getCategory().equals("coffee")){
								cate1.add(key1[i] = new JButton(ps.menus[i].getName()+"\n $"+ps.menus[i].getPrice()));	
								
								key1[i].addActionListener(new ActionListener(){
									
									
									public void actionPerformed(ActionEvent e){
										
										DecimalFormat df = new DecimalFormat("###.##");
																			
										String strl =e.getActionCommand().substring(e.getActionCommand().indexOf("$")+1, e.getActionCommand().length());
										//System.out.println(strl);
										totalPrice += Double.parseDouble(strl);
										//System.out.println(totalPrice);
										totalLabel.setText("Amout : $"+ df.format(totalPrice));
										totalLabel2.setText("Tax : $"+ df.format(totalPrice*0.05));
										totalLabel3.setText("Total : $"+ df.format(totalPrice*1.05));
												
										bills = bills +"\n"+e.getActionCommand();
										//bills=bills;
										infotxt.setText(bills);
										
										listData.addElement( bills );
										listbox.setListData( listData );
									}
									
								});
							
							}
							if(ps.menus[i].getCategory().equals("sandwich")){
								cate2.add(key1[i] = new JButton(ps.menus[i].getName()+"\n $"+ps.menus[i].getPrice()));	
								
								ps.foundLocations[i]= Double.parseDouble(ps.menus[i].getPrice());
								
								key1[i].addActionListener(new ActionListener(){
									
									
									public void actionPerformed(ActionEvent e){
										
										DecimalFormat df = new DecimalFormat("###.##");
										
										String strl =e.getActionCommand().substring(e.getActionCommand().indexOf("$")+1, e.getActionCommand().length());
										//System.out.println(strl);
										totalPrice += Double.parseDouble(strl);
										//System.out.println(totalPrice);
										totalLabel.setText("Amout : $"+ df.format(totalPrice));
										totalLabel2.setText("Tax : $"+ df.format(totalPrice*0.05));
										totalLabel3.setText("Total : $"+ df.format(totalPrice*1.05));
										
										bills = bills +"\n"+e.getActionCommand();
										infotxt.setText(bills);
									}
									
								});
							
							}
							if(ps.menus[i].getCategory().equals("tea")){
								cate3.add(key1[i] = new JButton(ps.menus[i].getName()+"\n $"+ps.menus[i].getPrice()));	
								
								ps.foundLocations[i]= Double.parseDouble(ps.menus[i].getPrice());
								
								key1[i].addActionListener(new ActionListener(){
									
									
									public void actionPerformed(ActionEvent e){
										DecimalFormat df = new DecimalFormat("###.##");
										
										String strl =e.getActionCommand().substring(e.getActionCommand().indexOf("$")+1, e.getActionCommand().length());
										//System.out.println(strl);
										totalPrice += Double.parseDouble(strl);
										//System.out.println(totalPrice);
										totalLabel.setText("Amout : $"+ df.format(totalPrice));
										totalLabel2.setText("Tax : $"+ df.format(totalPrice*0.05));
										totalLabel3.setText("Total : $"+ df.format(totalPrice*1.05));
										
										
										bills = bills +"\n"+e.getActionCommand();
										infotxt.setText(bills);
									}
									
								});
							
							}
							if(ps.menus[i].getCategory().equals("treat")){
								cate4.add(key1[i] = new JButton(ps.menus[i].getName()+"\n $"+ps.menus[i].getPrice()));	
								ps.foundLocations[i]= Double.parseDouble(ps.menus[i].getPrice());
								
								
								key1[i].addActionListener(new ActionListener(){
									
									
									public void actionPerformed(ActionEvent e){
										DecimalFormat df = new DecimalFormat("###.##");
										
										String strl =e.getActionCommand().substring(e.getActionCommand().indexOf("$")+1, e.getActionCommand().length());
										//System.out.println(strl);
										totalPrice += Double.parseDouble(strl);
										//System.out.println(totalPrice);
										totalLabel.setText("Amout : $"+ df.format(totalPrice));
										totalLabel2.setText("Tax : $"+ df.format(totalPrice*0.05));
										totalLabel3.setText("Total : $"+ df.format(totalPrice*1.05));
										
										
										bills = bills +"\n"+e.getActionCommand();
										infotxt.setText(bills);
									}
									
								});
							
							}
				}
			
				
				add(panel);
				
				cate1.setVisible(false);
				cate2.setVisible(false);
				cate3.setVisible(false);
				cate4.setVisible(false);
				
			}
			cofb.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					
					cate1.setVisible(true);
					cate2.setVisible(false);
					cate3.setVisible(false);
					cate4.setVisible(false);
				
				}
			});
			sandb.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					//categoryb.setVisible(false);
					cate1.setVisible(false);
					cate2.setVisible(true);
					cate3.setVisible(false);
					cate4.setVisible(false);
					
				}
			});
			teab.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					//categoryb.setVisible(false);
					cate1.setVisible(false);
					cate2.setVisible(false);
					cate3.setVisible(true);
					cate4.setVisible(false);
					
				}
			});
			treatb.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					//categoryb.setVisible(false);
					cate1.setVisible(false);
					cate2.setVisible(false);
					cate3.setVisible(false);
					cate4.setVisible(true);
					
				}
			});

			jButton3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					infotxt.setText("");
					bills="";
					totalPrice=0;
					totalLabel.setText("");
					totalLabel2.setText("");
					totalLabel3.setText("");
					cate1.setVisible(false);
					cate2.setVisible(false);
					cate3.setVisible(false);
					cate4.setVisible(false);
					
					CardLayoutEventTest.card.show(CardLayoutEventTest.slide,"1");
				}
			});
			
			btnPrint.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					infotxt.setText("");
					//bills="";
					//totalPrice=0;
					totalLabel.setText("");
					totalLabel2.setText("");
					totalLabel3.setText("");
					cate1.setVisible(false);
					cate2.setVisible(false);
					cate3.setVisible(false);
					cate4.setVisible(false);
					ps.writeBackToPrinter("printer.txt",bills,totalPrice);
					CardLayoutEventTest.card.show(CardLayoutEventTest.slide,"1");
				}
			});

				
	}	
	
	
		

	

}
