


import java.awt.event.*;


import java.awt.*;
import javax.swing.*;


public class StartPage extends JPanel  {
	JLabel greetLabel, idenLabel;
	JButton userb,adminb;
	JComponent panel;

	public StartPage() {
		panel = new JPanel();
		
			panel.setPreferredSize(new Dimension(1500, 1000));
			panel.setBorder(BorderFactory.createTitledBorder("Coffe shop"));
			panel.setLayout(null);
			{
				greetLabel = new JLabel();
				panel.add(greetLabel);
				greetLabel.setText("Welcome to the Coffee shop");
				greetLabel.setFont(new java.awt.Font("Iskoola Pota",0,50));
				greetLabel.setBounds(305, 63, 600, 64);
				
			
				idenLabel = new JLabel();
				panel.add(idenLabel);
				idenLabel.setText("Select who you are");
				idenLabel.setBounds(423, 186, 388, 83);
				idenLabel.setFont(new java.awt.Font("Segoe UI",2,36));
			
				userb = new JButton();
				panel.add(userb);
				userb.setText("USER");
				userb.setBounds(187, 403, 283, 138);
				userb.setFont(new java.awt.Font("Segoe UI",0,36));
				//userb.addActionListener(this);
			
				adminb = new JButton();
				panel.add(adminb);
				adminb.setText("ADMINSTER");
				adminb.setBounds(699, 403, 283, 138);
				adminb.setFont(new java.awt.Font("Segoe UI",0,36));
				
			}
			add(panel);
			
			userb.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					CardLayoutEventTest.card.show(CardLayoutEventTest.slide,"5");
				}
			});
	adminb.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			CardLayoutEventTest.card.show(CardLayoutEventTest.slide,"2");
		}
	});
	
	 }
		
}
