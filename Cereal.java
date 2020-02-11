/**
 * 
 * @author Mason Vischer
 * To create the parent type Cereal with basic implementations and methods to be used by child cereal classes
 */
public class Cereal {
	protected String name;
	protected double price;
	
	/**
	 * 
	 * @param null
	 * purpose: to print the initial preparation statement
	 * @return void
	 */
	public void prepare() {
		System.out.println("Preparing the "+this.name);
	}
	
	/**
	 * 
	 * @param null
	 * purpose: prints out the process of boxing the cereal
	 * @return void
	 */
	public void boxCereal() {
		System.out.println("Drawing fun pictures of "+this.name+" on a box");
		System.out.println("Pouring the "+this.name+" into the box");
	}
	
	/**
	 * 
	 * @param null
	 * purpose: prints price tag message with price of the cereal
	 * @return null
	 */
	public void priceCereal() {
		System.out.println("Putting price tags of $"+this.price+" on the "+this.name+" box");
	}
}
