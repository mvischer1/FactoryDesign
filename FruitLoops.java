/**
 * 
 * @author Mason Vischer
 * Child class of cereal, constructs name and price for Fruit Loops
 */
public class FruitLoops extends Cereal{
	
	/**
	 * 
	 * @param null
	 * purpose: constructor, set unique name and price for Fruit Loops
	 */
	public FruitLoops() {
		this.name = "Fruit Loops";
		this.price = 1.89;
	}
	
	/**
	 * 
	 * param null
	 * purpose: override the prepare method from cereal class, add unique messages
	 * @return void
	 */
	public void prepare() {
		super.prepare();
		System.out.println("   -Gather the grain\n   -Shape into circles\n"
				+ "   -Randomly color circles\n   -Let circles dry");
	}
}
