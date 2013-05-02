package Logic;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class POS
{
	public Products [ ] menus;
	public int capacity;
	public int size;
	public double [ ] foundLocations;
	public int foundCount;

	public POS ( )
	{
		capacity = 30;
		menus = new Products [capacity];
		size = 0;
		foundLocations = new double [30];
		foundCount = 0;
	}
	public int getSize()
	{
		int returnsize= size;
		
		return returnsize;
	}
	public void readMenudata (String infileName)
	{
		//read menu file
		Scanner infile = null;
		try
		{
			infile = new Scanner (new File (infileName));
		}
		catch (FileNotFoundException ex)
		{
			System.out.println ("file not found");
			System.exit (0);
		}
		// each line read and insert array
		while (infile.hasNext ( ))
		{
			String strid = infile.nextLine ( );
			int nid = Integer.parseInt(strid);
			String nName = infile.nextLine ( );
			String nCategory = infile.nextLine ( );
			String temp2 = infile.nextLine ( );
			double nPrice = Double.parseDouble(temp2);
			
			
			Products aMenu = new Products ( nName,  nCategory,  nPrice,  nid);
			append (aMenu);
			foundCount++;

		}

		infile.close ( );
	}


	public void writeBackToFile (String outfileName)
	{
		//save the file
		PrintWriter outfile = null;

		try
		{
			outfile = new PrintWriter (outfileName);
		}
		catch (FileNotFoundException ex)
		{
			System.out.println ("fail to open file");
			System.exit (0);
		}

		for (int i = 0; i < size; i++)
		{
			outfile.print (menus[i].pureToString ( ));
			if (i != size-1)
				outfile.println ( );
		}

		outfile.close ( );
	


	}
	
	public void writeBackToPrinter (String outfileName, String data, double price)
	{
		//save the file
		PrintWriter outfile = null;

		try
		{
			outfile = new PrintWriter (outfileName);
		}
		catch (FileNotFoundException ex)
		{
			System.out.println ("fail to open file");
			System.exit (0);
		}

		
			outfile.println (data );
			outfile.println (price );
		

		outfile.close ( );
	


	}


	public String toString ( )
	{
		//making string value
		String outString = "\n\nMenus in the POS........\n\n";
		for (int i = 0; i < size; i++)
			outString += menus[i];

		return outString;

	}



	public void sequentialSearch (String key, int choice)
	{
		//find value and give key are   id  = 1 , category =2 
		foundLocations = new double [30];
		foundCount = 0;
		int temp = 0;
		
		for (int i = 0; i < size; i++)
		{
			//System.out.println(key);
			//System.out.println(choice);
			System.out.println(menus[i].getCategory());
			
			
			//if (choice == 1)
				temp = menus[i].getID();
			
		//	else if (choice == 2)
		//		temp = menus[i].getCategory();
			
			if (key.equals (temp))
				foundLocations [foundCount++] = i;
		}

		printResultOfMenu (key);
		ChoiceMenu();
		

	}
	private void ChoiceMenu ()
	{
		System.out.println ("\nMenu found with the key..........\n\n");
		//for (int i = 0; i < foundCount; i++)
			//System.out.println (menus[foundLocations[i]]);
	}
	
	private void printResultOfMenu (String key)
	{
		System.out.println ("\nMenu found with the key..........\n\n");
		//for (int i = 0; i < foundCount; i++)
			//System.out.println (i+1+"."+ menus[foundLocations[i]]);
	}
	private void printResultOfSearch (String key)
	{
		System.out.println ("\nMenu found with the key..........\n\n");
		//for (int i = 0; i < foundCount; i++)
			//System.out.println (menus[foundLocations[i]]);
	}

    private void expand ( )
    {
       // System.out.println ("\n\narray being expanded.......\n\n");
        capacity += 10;
        Products[ ] temp = new Products [capacity];
        for (int i = 0; i < size; i++)
            temp[i] = menus[i];
        menus = temp;

    }

     //the memeber to be deleted has been located
     //move the last member over
     public void delete1 (int pos)
     {
		 menus[pos] = menus[-- size];

	 }

	//shift forward
	public void delete2 (int pos)
	{
		for (int i = pos; i < size-1; i++)
			menus[i] = menus[i+1];
		size--;

	}

	public void append (Products newMenu)
	{
		if (size == capacity)
			expand ( );

		menus[size++] = newMenu;
		//System.out.println ("\n\na new  Menu added......\n");
               
	}

	public boolean insert (Products newMenu, int pos)
	{
		if ((pos < 0) || (pos > size))
		{
			System.out.println ("illegal position");
				return false;
		}
		else
		{
			if (pos == size)
				append (newMenu);
			else
			{
				for (int i = size-1; i >= pos; i--)
					menus[i+1] = menus[i];
				menus[pos] = newMenu;
				size++;

			}
			System.out.println ("\n\na new Menu inserted........\n\n");
                        writeBackToFile ("Menu.txt");
			return true;
		}
	}


	public boolean write (Products newMenu, int pos)
	{
		if ((pos < 0) || (pos > size-1))
		{
				System.out.println ("illegal position");
				return false;
		}
		else
		{
			menus[pos] = newMenu;
			System.out.println ("\n\na Menu written over at index " + pos + "........\n\n");
                        writeBackToFile ("menu.txt");
			return true;
		}

	}

	private int menu ( )
	{
		Scanner kbd = new Scanner (System.in);
		String instring = "";
		
		do
		{
			System.out.print ("\n\n***welcome to MY POS: \n\n" +
			"Choice Category you want Menu!!.......\n" +
			"1: Coffee\n" +
			"2: Tea\n" +
			"3: Sandwich\n" +
			"4: Treat\n\n" +
			"5: Exit\n\n" +
			"enter your choice: ");

		 	instring = kbd.nextLine ( );
		 	if ((!instring.equals ("1")) && (!instring.equals ("2")) && (!instring.equals ("3"))
		 	 && (!instring.equals ("4")) && (!instring.equals ("5")))
					System.out.println ("illegal input");
			else
				break;
		} while (true);

		return Integer.parseInt (instring);
	}


	public void arrival ( )
	{
		int choice ;
		do{
			choice = menu ( );

			switch (choice)
			{
				case 1: sequentialSearch ("coffee",2 ); break;
				case 2: sequentialSearch ("tea",2 ); break;
				case 3: sequentialSearch ("sandwich",2 ); break;
				case 4: sequentialSearch ("treat",2 ); break;
				case 5: System.out.println ("\n\ngood bye!\n");
			}
		}
		while(choice!=5);
		
	}

	private int searchMenu ( )
	{
		Scanner kbd = new Scanner (System.in);
		String instring = "";

		do
		{
			System.out.print ("search by: \n\n" +
			"1: author\n" +
			"2: title\n" +
			"3: id\n" +
			"4: publisher\n" +
			"5: year\n\n" +
			"enter your choice: ");

		 	instring = kbd.nextLine ( );
		 	if ((!instring.equals ("1")) && (!instring.equals ("2")) && (!instring.equals ("3"))
		 	 && (!instring.equals ("4")) && (!instring.equals ("5")))
					System.out.println ("illegal input");
			else
				break;
		} while (true);

		return Integer.parseInt (instring);
	}
	public int MainMenu ( )
	{
		Scanner kbd = new Scanner (System.in);
		String instring = "";

		do
		{
			System.out.print (
			"1: Amdin\n" +
			"2: User\n" +
			"3: Exit\n" +
			"enter your choice: ");

		 	instring = kbd.nextLine ( );
		 	if ((!instring.equals ("1")) && (!instring.equals ("2")) && (!instring.equals ("3")))
					System.out.println ("illegal input");
			else
				break;
		} while (true);

		return Integer.parseInt (instring);
	}


	public void search ( )
	{
		Scanner kbd = new Scanner (System.in);
		int choice = searchMenu ( );
		String key = "";
		switch (choice)
		{
			case 1:
			System.out.println ("enter Menu name: " );
			key = kbd.nextLine ( );
			sequentialSearch (key,1);
			break;
			case 2:
			System.out.println ("enter Menu title: " );
			key = kbd.nextLine ( );
			sequentialSearch (key,2);
			break;
			case 3:
			System.out.println ("enter book id: " );
			key = kbd.nextLine ( );
			sequentialSearch (key,3);
			break;
			case 4:
			System.out.println ("enter publisher name: " );
			key = kbd.nextLine ( );
			sequentialSearch (key,4);
			break;
			case 5:
			System.out.println ("enter year: " );
			key = kbd.nextLine ( );
			sequentialSearch (key,5);
			break;
		}




	}


	public void purchase ( )
	{
			Scanner kbd = new Scanner (System.in);
			System.out.println ("enter men id: " );
			String key = kbd.nextLine ( );
			sequentialSearch (key,3);
			if (foundCount == 0)
				System.out.println ("\n\nmenu not found! ");
			else
			{
				
			}
		}
        
        public void manager ( )
        {
            Scanner kbd = new Scanner (System.in);
            String password = "1234";
            int countLimit = 3;
            int failCount = 0;
            do
            {
                System.out.print ("enter the password: ");
                String pwd = kbd.nextLine ( );
                if (pwd.equals (password))
                {
                    System.out.println ("log in successful");
                    break;
                }
                else
                {
                    System.out.println ("illegal password");
                    failCount++;
                    if (failCount == countLimit)
                    {
                        System.out.println ("you have failed " + failCount + " times and you are locked out");
                        return;
                    }
                    
                }
                    
            } while (true);
            
            
            managerFunctions ( );
            
             
            
        }
        
        public int managerMenu ( )
        {
            Scanner kbd = new Scanner (System.in);
            String instring = "";

            do
            {
		System.out.print ("\n\n***manager menu: \n\n" +
                        "0: search for Menu\n" +
			"1: add a Menu\n" +
			"2: delete a Menu\n" +
			"3: update a Menu\n" +
			"4: exit\n\n" +
			"enter your choice: ");

		instring = kbd.nextLine ( );
		if ((!instring.equals ("0")) && (!instring.equals ("1")) && (!instring.equals ("2")) && (!instring.equals ("3"))
		 && (!instring.equals ("4")))
                    System.out.println ("illegal input");
		else
                    break;
            } while (true);

            return Integer.parseInt (instring);            
            
        }
        
        public void managerFunctions ( )
        {
            int choice = 0;
            do
            {
                choice = managerMenu ( );
                switch (choice)
                {
                    case 0: search ( ); break;
                    case 1: addMenu ( ); break;
                    case 2: deleteMenu ( ); break;
                    case 3: updateMenu ( ); break;
                    case 4: exitManager ( ); break;
                } 
            } while (choice != 4);
            
            
        }
        
        public void exitManager ( )
        {
            System.out.println ("\n\nsuccessfully log out of manager mode!\n");
        }
        
        public void addMenu ( )
        {
            Scanner kbd = new Scanner (System.in);
            System.out.println ("\n\nadding a new Menu..........\n");
            System.out.println ("Menu id? ");
            String nid = kbd.nextLine ( );
            System.out.println ("Menu Category? ");
            String nCategory = kbd.nextLine ( );
            System.out.println ("Menu Name? ");
            String nName = kbd.nextLine ( );        
            System.out.println ("Menu Price? ");
            String nPriceString = kbd.nextLine ( );
            //error checking for double needed
            double nPrice = Double.parseDouble(nPriceString);
                        
           // Products aMenu = new Products ( nName,  nCategory,  nPrice,  nid);
                
          //  append (aMenu);
        }
        public void addMenu(String prdName,double smPrice,String category,int nid)
        {
        	
            Products aMenu = new Products ( prdName,  category,  smPrice,  nid);
                
            append (aMenu);
            writeBackToFile ("menu.txt");
            readMenudata("menu.txt");
        }
        public void updateMenu ( )
        {
            Scanner kbd = new Scanner (System.in);
            System.out.println ("enter Menu id: " );
            String key = kbd.nextLine ( );
            sequentialSearch (key,3);
            if (foundCount == 0)
                System.out.println ("\n\nMenu not found! "); 
            else
            {
                System.out.println ("\n\nupdating a Menu..........\n");
                System.out.println ("Menu Name? ");
                String nName = kbd.nextLine ( );
                System.out.println ("Menu Category? ");
                String nCategory = kbd.nextLine ( );
                System.out.println ("Menu Price? ");
                String nPriceString = kbd.nextLine ( );        
                System.out.println ("Menu id? ");
                String nid = kbd.nextLine ( );  
        
                double nPrice = Double.parseDouble(nPriceString);
               
              //  Products aMenu = new Products ( nName,  nCategory,  nPrice,  nid);
                   
                
               // menus [foundLocations[0]] = aMenu;
               // writeBackToFile ("menu.txt");
            }
            
        }
        
        public void deleteMenu ( )
        {
            Scanner kbd = new Scanner (System.in);
            System.out.println ("enter Menu id: " );
            String key = kbd.nextLine ( );
            sequentialSearch (key,3);
            if (foundCount == 0)
                System.out.println ("\n\nMenu not found! "); 
            else
            {
                //delete function
            }
            
        }
       
}









