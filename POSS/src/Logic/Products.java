package Logic;
public class Products
{
	private String name;
	private String category;
	private double price;
	private int id;
	

	public Products (   )
	{
		name = "";
		category = "";
		price = 0;
		id = 0;
		
	}

	public Products (String nName, String nCategory, double nPrice, int nid)
	{
		name = nName;
		category = nCategory;
		price = nPrice;
		id = nid;
		
	}

	public String toString ( )
	{
		return "\n name: " + name + "\n category: " + category + "\n price: " + price +
		"\n id: " + id;
	}

	public String pureToString ( )
	{
		return id + "\n" + name + "\n" + category +
		"\n" + price;
	}

	public int getID ( )
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public String getPrice ( )
	{
		return (new Double (price)).toString ( );
	}
	
	public String getCategory ( )
	{
		return category;
	}
	
	public void setPrice (double xPrice)
	{
		price = xPrice;
	}
	
	public void setName (String strName)
	{
		name = strName;
	}
	public void setCategory (String strCategory)
	{
		category = strCategory;
	}
	public void setID (int strID)
	{
		id = strID;
	}
	
	
	


}











