import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Test {
	public static void main(String [] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("a", "alpha");
		map.put("b", "beta");
		map.put("e", "epsilon");
		
		for (String s:map.values()) {
			System.out.println(s);
		}
		
		System.out.println();
		
		Set<String> keys = map.keySet();
		keys.remove("a");
		
		for (String s:map.values()) {
			System.out.println(s);
		}
		
	}
}
