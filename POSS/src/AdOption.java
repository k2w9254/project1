


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AdOption extends JPanel  {
	JLabel jLabel1, jLabel2;
	JButton addButton, jButton3,jButton2;
	JComponent panel;
	
	public AdOption() {
		panel = new JPanel();
		setSize(1105, 693);
		setLayout(null);
			{
				jLabel1 = new JLabel();
				add(jLabel1);
				jLabel1.setText("Hi administer ?");
				jLabel1.setBounds(430, 115, 262, 49);
				jLabel1.setFont(new java.awt.Font("Segoe UI",0,36));
			}
			{
				jLabel2 = new JLabel();
				add(jLabel2);
				jLabel2.setText("What do you want to do?");
				jLabel2.setBounds(343, 184, 442, 85);
				jLabel2.setFont(new java.awt.Font("Segoe UI",0,36));
			}
			{
				addButton = new JButton();
				add(addButton);
				addButton.setText("ADD");
				addButton.setBounds(190, 394, 213, 72);
				addButton.setFont(new java.awt.Font("Segoe UI",0,24));
			}
			{
				jButton2 = new JButton();
				add(jButton2);
				jButton2.setText("DELETE");
				jButton2.setBounds(455, 394, 213, 72);
				jButton2.setFont(new java.awt.Font("Segoe UI",0,24));
			}
			{
				jButton3 = new JButton();
				add(jButton3);
				jButton3.setText("EDIT");
				jButton3.setBounds(720, 394, 213, 72);
				jButton3.setFont(new java.awt.Font("Segoe UI",0,24));
			}
			add(panel);
			addButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					CardLayoutEventTest.card.show(CardLayoutEventTest.slide,"4");
				}
			});
	}
	
}

