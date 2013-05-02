
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
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
public class AddProduct extends JPanel {
	JLabel cateSelect,pricelabel;
	JTextField largePrice, mediumPrice, smallPrice, prodName;
	JButton coffeb, treatb, teab, sandwichb, doneb, returnb, finishb;
	JTextArea infotxt;
	JComponent panel;
	private JLabel prdlabel;
	String category,prdName,smPrice,miPrice,laPrice;
	POS ps = new POS();
	public AddProduct() {
			panel = new JPanel();
			setSize(1105, 693);
			setLayout(null);
			
			cateSelect = new JLabel();
			this.add(cateSelect);
			cateSelect.setText("Please choose the category");
			cateSelect.setFont(new java.awt.Font("Segoe UI",0,28));
			cateSelect.setBounds(306, 5, 613, 43);
			
			infotxt = new JTextArea();
			this.add(infotxt);
			infotxt.setText("");
			infotxt.setBounds(45, 138, 243, 270);
			
			coffeb = new JButton();
			this.add(coffeb);
			coffeb.setText("Coffee");
			coffeb.setBounds(325, 54, 123, 57);
			coffeb.setFont(new java.awt.Font("Segoe UI",0,20));

			sandwichb = new JButton();
			this.add(sandwichb);
			sandwichb.setText("sandwich");
			sandwichb.setBounds(446, 54, 123, 57);
			sandwichb.setFont(new java.awt.Font("Segoe UI",0,20));

			teab = new JButton();
			this.add(teab);
			teab.setText("tea");
			teab.setBounds(570, 54, 123, 57);
			teab.setFont(new java.awt.Font("Segoe UI",0,20));

			treatb = new JButton();
			this.add(treatb);
			treatb.setText("treat");
			treatb.setBounds(693, 54, 123, 57);
			treatb.setFont(new java.awt.Font("Segoe UI",0,20));

			prodName = new JTextField();
			this.add(prodName);
			prodName.setText("Input product name here");
			prodName.setBounds(325, 218, 236, 48);
			prodName.setVisible(false);
			
			smallPrice = new JTextField();
			this.add(smallPrice);
			smallPrice.setText("small");
			smallPrice.setBounds(330, 357, 193, 27);
			smallPrice.setVisible(false);
				
			pricelabel = new JLabel();
			this.add(pricelabel);
			pricelabel.setText("Enter the prodoct's price for each size");
			pricelabel.setBounds(306, 301, 485, 50);
			pricelabel.setFont(new java.awt.Font("Segoe UI",0,28));
			pricelabel.setVisible(false);
				
			mediumPrice = new JTextField();
			this.add(mediumPrice);
			mediumPrice.setText("Midium");
			mediumPrice.setBounds(330, 408, 191, 27);
			mediumPrice.setVisible(false);
						
			largePrice = new JTextField();
			this.add(largePrice);
			largePrice.setText("Large");
			largePrice.setBounds(330, 452, 193, 32);
			largePrice.setVisible(false);
							
			/*returnb = new JButton();
			this.add(returnb);
			returnb.setText("Return");
			returnb.setBounds(677, 538, 114, 63);
			returnb.setFont(new java.awt.Font("Segoe UI",0,20));
			*/
			doneb = new JButton();
			this.add(doneb);
			doneb.setText("Done");
			doneb.setBounds(721, 527, 114, 63);
			doneb.setFont(new java.awt.Font("Segoe UI",0,20));
			doneb.setVisible(false);

			prdlabel = new JLabel();
			this.add(prdlabel);
			prdlabel.setText("Enter the Product Name");
			prdlabel.setBounds(306, 152, 416, 49);
			prdlabel.setFont(new java.awt.Font("Segoe UI",0,28));
			prdlabel.setVisible(false);
			
			coffeb.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					prdlabel.setVisible(true);
					prodName.setVisible(true);
					pricelabel.setVisible(true);
					doneb.setVisible(true);
					smallPrice.setVisible(true);
					mediumPrice.setVisible(true);
					largePrice.setVisible(true);
					coffeb.setVisible(false);
					sandwichb.setVisible(false);teab.setVisible(false);treatb.setVisible(false);
					category = "Coffee";
					infotxt.setText(category);
					
					
				}
			});
			
			add(panel);
			{
				finishb = new JButton();
				this.add(finishb);
				finishb.setText("Finish");
				finishb.setBounds(846, 527, 114, 63);
				finishb.setFont(new java.awt.Font("Segoe UI",0,20));
			}

			sandwichb.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					prdlabel.setVisible(true);
					prodName.setVisible(true);
					pricelabel.setVisible(true);
					smallPrice.setVisible(true);
					doneb.setVisible(true);
					coffeb.setVisible(false);
					sandwichb.setVisible(false);
					teab.setVisible(false);
					treatb.setVisible(false);
					smallPrice.setText("");
					category = "Sandwich";
					infotxt.setText(category);
				}
			});
			teab.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					
					prdlabel.setVisible(true);
					prodName.setVisible(true);
					pricelabel.setVisible(true);
					doneb.setVisible(true);
					smallPrice.setVisible(true);
					mediumPrice.setVisible(true);
					largePrice.setVisible(true);
					coffeb.setVisible(false);
					sandwichb.setVisible(false);
					teab.setVisible(false);
					treatb.setVisible(false);
					category = "Tea";
					infotxt.setText(category);
				}
			});
			treatb.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					prdlabel.setVisible(true);
					prodName.setVisible(true);
					pricelabel.setVisible(true);
					smallPrice.setVisible(true);
					doneb.setVisible(true);
					coffeb.setVisible(false);
					sandwichb.setVisible(false);
					teab.setVisible(false);
					treatb.setVisible(false);
					smallPrice.setText("");
					category = "Treat";
					infotxt.setText(category);
				}
			});
			finishb.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					
					ps.readMenudata("menu.txt");
					CardLayoutEventTest.card.show(CardLayoutEventTest.slide,"5");
				}
			});
			doneb.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){					
					prdName = prodName.getText();
					smPrice = smallPrice.getText();
					double dPrice = Double.parseDouble(smPrice);
					miPrice = mediumPrice.getText();
					laPrice = largePrice.getText();	
					POS ps = new POS();
					ps.readMenudata("menu.txt");
					int strId = ps.getSize();
					
					ps.addMenu(prdName,dPrice,category.toLowerCase(),strId+1);
					System.out.println(ps.toString());
					if(category.equals("Coffee")||category.equals("Tea")){
						infotxt.setText("Category = "+category+"\n"+"Product Name : "+prdName+"\n"+"Small Price = "+smPrice+"\n"+"Midium Price = "+miPrice+"\n"+"Large Price = "+laPrice);
						prdlabel.setVisible(false);
						prodName.setVisible(false);
						pricelabel.setVisible(false);
						doneb.setVisible(false);
						smallPrice.setVisible(false);
						mediumPrice.setVisible(false);
						largePrice.setVisible(false);
						coffeb.setVisible(true);
						sandwichb.setVisible(true);
						teab.setVisible(true);
						treatb.setVisible(true);
					}else{
						infotxt.setText("Category = "+category+"\n"+"Product Name : "+prdName+"\n"+"Small Price = "+smPrice);
						prdlabel.setVisible(false);
						prodName.setVisible(false);
						pricelabel.setVisible(false);
						smallPrice.setVisible(false);
						doneb.setVisible(false);
						coffeb.setVisible(true);
						sandwichb.setVisible(true);
						teab.setVisible(true);
						treatb.setVisible(true);
					}
					
				}
			});
	}

}
