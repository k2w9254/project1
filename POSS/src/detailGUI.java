

import java.awt.Dimension;
import javax.swing.JButton;

import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
public class detailGUI extends javax.swing.JPanel {
	private JLabel categoryName;
	private JButton jButton1;
	private JButton jButton2;
	private JButton sizeb;
	private JLabel sizeLabel;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new detailGUI());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public detailGUI() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			this.setPreferredSize(new java.awt.Dimension(924, 411));
			this.setLayout(null);
			{
				categoryName = new JLabel();
				this.add(categoryName);
				categoryName.setText("Coffee");
				categoryName.setFont(new java.awt.Font("Segoe UI",0,36));
				categoryName.setBounds(356, 12, 121, 42);
			}
			{
				sizeLabel = new JLabel();
				this.add(sizeLabel);
				sizeLabel.setText("What size do you want?");
				sizeLabel.setBounds(341, 60, 323, 43);
				sizeLabel.setFont(new java.awt.Font("Segoe UI",0,20));
			}
			{
				sizeb = new JButton();
				this.add(sizeb);
				sizeb.setBounds(341, 109, 111, 44);
			}
			{
				jButton1 = new JButton();
				this.add(jButton1);
				jButton1.setText("jButton1");
				jButton1.setBounds(461, 109, 111, 44);
			}
			{
				jButton2 = new JButton();
				this.add(jButton2);
				jButton2.setText("jButton2");
				jButton2.setBounds(583, 109, 111, 44);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
