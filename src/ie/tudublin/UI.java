package ie.tudublin;

import java.util.ArrayList;

import com.sun.corba.se.impl.naming.namingutil.CorbalocURL;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	
	private String r;
	private String g;
	private String b;

	
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}


	public void colour(TableRow row)
	{
		r = row.getString("r");
		g = row.getString("g");
		b = row.getString("b");

	}

	public void loadColours()
	{
		Table table = loadTable("colours.csv");

		for(int i =0; i < table.getRowCount() ; i++)
		{
			TableRow row = table.getRow(i);
			System.out.println(row.getString("r"));
			System.out.println(row.getString("g"));
			System.out.println(row.getString("b"));
		}
	}
	public String toString(){
		return r + "\t" + g + "\t" + b;
	}
	public void setup() 
	{
		loadColours();
	}
	
	public void draw()
	{			
	}

	/**
	 * @return the r
	 */
	public String getR() {
		return r;
	}

	/**
	 * @param r the r to set
	 */
	public void setR(String r) {
		this.r = r;
	}

	/**
	 * @return the g
	 */
	public String getG() {
		return g;
	}

	/**
	 * @param g the g to set
	 */
	public void setG(String g) {
		this.g = g;
	}

	/**
	 * @return the b
	 */
	public String getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(String b) {
		this.b = b;
	}

	private ArrayList<String> colours = new ArrayList<String>();
}
