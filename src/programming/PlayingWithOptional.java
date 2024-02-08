package programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {

	public static void main(String[] args) {
		List<String> fruits = List.of("apple", "banana", "mango");
		
		Predicate< ? super String> predicate = fruit-> fruit.startsWith("c");
		Optional <String> optional =fruits.stream().filter(predicate).findFirst();
		System.out.println(optional.isEmpty() ? "None" :optional.get() );
		 predicate = fruit-> fruit.startsWith("b");
		optional =fruits.stream().filter(predicate).findFirst();
		System.out.println(optional.isEmpty() ? "None" :optional.get() );
		

	}

}