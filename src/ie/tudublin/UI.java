package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	
	private String red;
	private String green;
	private String blue;
	private String orange;
	private String black;
	private String brown;
	private String violet;
	private String grey;
	private String white;
	private String yellow;

	public int value;
	public int ones;
	public int tens;
	public int hundreds;
	

	
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public	void FindColour(int value)
	{
		for (UI colour : colours){
			if (value == 1)
			{
				System.out.println(red);
			}
			else if(value == 2)
			{
				System.out.println(green);
			}
			else if(value == 3)
			{
				System.out.println(blue);
			}
			else if(value == 4)
			{
				System.out.println(brown);
			}
			else if(value == 5)
			{
				System.out.println(black);
			}
			else if(value == 6)
			{
				System.out.println(orange);
			}
			else if(value == 7)
			{
				System.out.println(yellow);
			}
			else if(value == 8)
			{
				System.out.println(violet);
			}
			else if(value == 9)
			{
				System.out.println(grey);
			}
			else if(value == 10)
			{
				System.out.println(white);
			}
			else
			{
				break;
			}
		}
	}
	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}


	public UI(TableRow row)
	{
		red = row.getString("red");
		green = row.getString("green");
		blue = row.getString("blue");
		black = row.getString("black");
		brown = row.getString("brown");
		violet = row.getString("violet");
		grey = row.getString("grey");
		white = row.getString("white");
		yellow = row.getString("yellow");



	}


	public void loadColours()
	{
		Table table = loadTable("colours.csv");

		for( TableRow row : table.rows())
		{
			UI colour = new UI(row);
			colours.add(colour);
		}
	}

	public void loadResistors()
	{
		Table table = loadTable("resistors.csv");

		for( TableRow row : table.rows())
		{
			UI resistor = new UI(row);
			resistors.add(resistor);
		}
	}

	public void printColours()
	{
		for (UI colour : colours){
			System.out.println(colour.toString());
		}
	}
	public String toString(){
		return red + "\t" + green + "\t" + blue + "\t" + orange + "\t" + black + "\t" + brown + "\t" + yellow + "\t" + violet + "\t" + white + "\t" + grey ;
	}
	public void setup() 
	{
		loadColours();
		loadResistors();
		FindColour(3);
	}
	
	public void draw()
	{	

	}

	private ArrayList<UI> colours = new ArrayList<UI>();
	private ArrayList<UI> resistors = new ArrayList<UI>();


	/**
	 * @return the red
	 */
	public String getRed() {
		return red;
	}

	/**
	 * @param red the red to set
	 */
	public void setRed(String red) {
		this.red = red;
	}

	/**
	 * @return the green
	 */
	public String getGreen() {
		return green;
	}

	/**
	 * @param green the green to set
	 */
	public void setGreen(String green) {
		this.green = green;
	}

	/**
	 * @return the blue
	 */
	public String getBlue() {
		return blue;
	}

	/**
	 * @param blue the blue to set
	 */
	public void setBlue(String blue) {
		this.blue = blue;
	}

	/**
	 * @return the orange
	 */
	public String getOrange() {
		return orange;
	}

	/**
	 * @param orange the orange to set
	 */
	public void setOrange(String orange) {
		this.orange = orange;
	}

	/**
	 * @return the black
	 */
	public String getBlack() {
		return black;
	}

	/**
	 * @param black the black to set
	 */
	public void setBlack(String black) {
		this.black = black;
	}

	/**
	 * @return the brown
	 */
	public String getBrown() {
		return brown;
	}

	/**
	 * @param brown the brown to set
	 */
	public void setBrown(String brown) {
		this.brown = brown;
	}

	/**
	 * @return the violet
	 */
	public String getViolet() {
		return violet;
	}

	/**
	 * @param violet the violet to set
	 */
	public void setViolet(String violet) {
		this.violet = violet;
	}

	/**
	 * @return the grey
	 */
	public String getGrey() {
		return grey;
	}

	/**
	 * @param grey the grey to set
	 */
	public void setGrey(String grey) {
		this.grey = grey;
	}

	/**
	 * @return the white
	 */
	public String getWhite() {
		return white;
	}

	/**
	 * @param white the white to set
	 */
	public void setWhite(String white) {
		this.white = white;
	}

	/**
	 * @return the yellow
	 */
	public String getYellow() {
		return yellow;
	}

	/**
	 * @param yellow the yellow to set
	 */
	public void setYellow(String yellow) {
		this.yellow = yellow;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the ones
	 */
	public int getOnes() {
		return ones;
	}

	/**
	 * @param ones the ones to set
	 */
	public void setOnes(int ones) {
		this.ones = ones;
	}

	/**
	 * @return the tens
	 */
	public int getTens() {
		return tens;
	}

	/**
	 * @param tens the tens to set
	 */
	public void setTens(int tens) {
		this.tens = tens;
	}

	/**
	 * @return the hundreds
	 */
	public int getHundreds() {
		return hundreds;
	}

	/**
	 * @param hundreds the hundreds to set
	 */
	public void setHundreds(int hundreds) {
		this.hundreds = hundreds;
	}

	/**
	 * @return the colours
	 */
	public ArrayList<UI> getColours() {
		return colours;
	}

	/**
	 * @param colours the colours to set
	 */
	public void setColours(ArrayList<UI> colours) {
		this.colours = colours;
	}

	/**
	 * @return the resistors
	 */
	public ArrayList<UI> getResistors() {
		return resistors;
	}

	/**
	 * @param resistors the resistors to set
	 */
	public void setResistors(ArrayList<UI> resistors) {
		this.resistors = resistors;
	}

}
