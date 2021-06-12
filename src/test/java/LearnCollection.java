import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Predicate;

public class LearnCollection {

	public static void testArrayList() {
		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("mango");
		fruitList.add("apple");
		fruitList.add("banana");
		fruitList.add("guava");
		fruitList.add("apple");
		fruitList.add("watermelon");

		// iterating over array list
		Iterator<String> itr = fruitList.iterator();
		System.out.println("normal iteration:\n");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// reversing the list
		Collections.reverseOrder();
		System.out.println("reverse order:\n");
		for (String list : fruitList) {
			System.out.println(list);
		}

		// sorting of arraylist
		Collections.sort(fruitList);
		Iterator<String> itr1 = fruitList.iterator();
		System.out.println("sorting array:\n" + itr1.next());
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		// reversing the list
		Collections.reverse(fruitList);
		System.out.println("reverse list:\n");
		for (String list : fruitList) {
			System.out.println(list);
		}

		// reversing the list
		Collections.reverseOrder();
		System.out.println("reverse order:\n");
		for (String list : fruitList) {
			System.out.println(list);
		}

		System.out.println("This is for each lamda");
		fruitList.forEach(a -> {
			System.out.println(a);
		});

		Spliterator<String> splitList = fruitList.spliterator();
		System.out.println("This is splited list");
		splitList.forEachRemaining(a -> {
			System.out.println(a);
		});
		
		
		ArrayList<String> fruitListNew = new ArrayList<String>();
		fruitListNew.add("banana");
		
		
		
		System.out.println(fruitListNew.retainAll(fruitList));
		
		fruitList.forEach(a -> {
			System.out.println(a);
		});
		
		List<String> unmodList = Collections.unmodifiableList(fruitList);
		
		//unmodList.add("pears");
		
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("abc");
		linkedHashSet.add("abc");
		linkedHashSet.add("cda");
		linkedHashSet.add("efg");
		
		linkedHashSet.forEach(a->{System.out.println(a);});
		linkedHashSet.removeIf(a -> (a.contains("abc")));
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"apple");
		map.put(2,"pears");
		map.put(3,"banana");
		
		System.out.println("this is map entry set"+ map.entrySet());
		System.out.println("this is map key set"+ map.keySet());
		for(Map.Entry<Integer,String> m : map.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}

	public static void main(String[] args) {
		testArrayList();
	}
}
