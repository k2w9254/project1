package Logic;

public class Regiser {
	private String name;
	private String category;
	private double price;
	private int id;
	

	public Regiser (   )
	{
		name = "";
		category = "";
		price = 0;
		id = 0;
		
	}

	public Regiser (String nName, String nCategory, double nPrice, int nid)
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
	public void setName (String strName)
	{
		name = strName;
	}
	public String getName()
	{
		return name;
	}

}
