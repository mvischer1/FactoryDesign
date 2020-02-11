/**
 * 
 * @author Mason Vischer
 * Child class of cereal, constructs name and price for Frosted Flakes
 */
public class FrostedFlakes extends Cereal {
	
	/**
	 * 
	 * @param null
	 * purpose: constructor, set unique name and price for Frosted Flakes
	 */
	public FrostedFlakes() {
		this.name = "Frosted Flakes";
		this.price = 2.99; 
	}
	
	/**
	 * 
	 * param null
	 * purpose: override the prepare method from cereal class, add unique messages
	 * @return void
	 */
	public void prepare() {
		super.prepare();
		System.out.println("   -Gather the grain\n"
				+ "   -Shape into flakes\n   -Sprinkle with frosting");
	}
}
