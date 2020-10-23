
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ApplicationList {
	public static void main(String[] args) {

		// List

		List<Object> data = new ArrayList<>();
		data.add(8);
		data.add("30");
		data.add(9.5);

		System.out.println(data);

		// Map

		Map<Integer, String> newMap = new HashMap<Integer, String>();
		newMap.put(22, "50");
		newMap.put(44, "60");
		Iterator<Entry<Integer, String>> iter = newMap.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<Integer, String> next = iter.next();
			System.out.println(next.getKey().toString() + " ==== " + next.getValue().toString());
		}
	}

}