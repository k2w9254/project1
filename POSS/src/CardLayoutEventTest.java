import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import Logic.*;

class CardLayoutEventTest extends Frame	{
	//Button first, prev, next, last;
	static Button win2;
	
	static Panel slide;
	//Window2 card6;
	AdOption adoption;
	static CardLayout card;
	
	
	CardLayoutEventTest(String title)	{
		super(title);
		slide = new Panel();
		card = new CardLayout();
		slide.setLayout(card);
		
		
		
		StartPage startPage=new StartPage();
		
		PinpadGUI pinpadGUI=new PinpadGUI();
		
		AdOption adOption=new AdOption();
		
		AddProduct addProduct = new AddProduct();
		
		MainMenu mainMenu= new MainMenu();
	
		
		slide.add(startPage,"1");
		slide.add(pinpadGUI,"2");
		slide.add(adOption,"3");
		slide.add(addProduct,"4");
		slide.add(mainMenu,"5");
		
		
		//slide.add(card6,"6");
		
		add("Center", slide);
		setSize(500,500);
		//setLocation(200,200);
		setVisible(true);
		card.show(slide,"1");
		
				
	}
	public static void main(String args[]){
		CardLayoutEventTest mainWin = new CardLayoutEventTest("CardLayoutTest");
		
	}
}