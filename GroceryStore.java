/**
 * 
 * @author Mason Vischer
 * Contains the cereal class and returns/creates different Cereals
 **/
public class GroceryStore {
	
	/**
	 * 
	 * @param String type
	 * purpose: to initiate, prepare, box, and price different cereals
	 * @return Cereal
	 */
	public Cereal orderCereal(String type) {
		if(type.equalsIgnoreCase("Frosted Flakes")) {
			FrostedFlakes newCereal = new FrostedFlakes();
			newCereal.prepare();
			newCereal.boxCereal();
			newCereal.priceCereal();
			return newCereal;
		}
		else if(type.equalsIgnoreCase("Lucky Charms")) {
			LuckyCharms newCereal = new LuckyCharms();
			newCereal.prepare();
			newCereal.boxCereal();
			newCereal.priceCereal();
			return newCereal;
		}
		else {
			FruitLoops newCereal = new FruitLoops();
			newCereal.prepare();
			newCereal.boxCereal();
			newCereal.priceCereal();
			return newCereal;
		}
	}
	
	/**
	 * 
	 * @param String type
	 * purpose: to initiate, prepare, box, and price different cereals
	 * @return Cereal
	 */
	public Cereal createCereal(String type) {
		if(type.equalsIgnoreCase("Frosted Flakes")) {
			FrostedFlakes newCereal = new FrostedFlakes();
			newCereal.prepare();
			newCereal.boxCereal();
			newCereal.priceCereal();
			return newCereal;
		}
		else if(type.equalsIgnoreCase("Lucky Charms")) {
			LuckyCharms newCereal = new LuckyCharms();
			newCereal.prepare();
			newCereal.boxCereal();
			newCereal.priceCereal();
			return newCereal;
		}
		else(type.equalsIgnoreCase("Fruit Loops")) {
			FruitLoops newCereal = new FruitLoops();
			newCereal.prepare();
			newCereal.boxCereal();
			newCereal.priceCereal();
			return newCereal;
		}
	}
}
