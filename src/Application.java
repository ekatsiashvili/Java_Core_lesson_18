
public class Application {

	public static void main(String[] args) {

		MyMap<Integer, String> newMap = new MyMap<Integer, String>();
		newMap.addNewObject(8, "49");
		newMap.addNewObject(40, "Texas");
		newMap.addNewObject(1, "town");
		newMap.addNewObject(24, "city");
		newMap.addNewObject(99, "contry");
		newMap.printAllMap();
		System.out.println();
		System.out.println("Remove from map by key 90:");
		newMap.removeFromMapByKey(90);
		newMap.printAllMap();
		System.out.println();
		System.out.println("Remove from map by value 49:");
		newMap.removeFromMapByValue("49");
		newMap.printAllMap();
		System.out.println();
		System.out.println("Print keys:");
		newMap.printMapSet();
		System.out.println();
		System.out.println("Print values:");
		newMap.printMapValue();
	}

}