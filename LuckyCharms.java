/**
 * 
 * @author Mason Vischer
 * Child class of cereal, constructs name and price for Lucky Charms
 */
public class LuckyCharms extends Cereal{
	
	/**
	 * 
	 * @param null
	 * purpose: constructor, set unique name and price for Lucky Charms
	 */
	public LuckyCharms() {
		this.name = "Lucky Charms";
		this.price = 1.55;
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
				+ "   -Create marshmellow shapes\n   -Mix circles and marshmellows");
	}
}
