import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class primeLamda {

	public static void main(String[] args) {
		
		//getting random list
		List<Integer> list = populateList();
		
		//iterate list and check for prime using lamba expression
		List<Integer> primeNumberList = new ArrayList<Integer>();
		list.forEach(num -> {
			if(isPrime(num)) {
				primeNumberList.add(num);
			}
		});
		
		//printing prime list using lamba expressions
		primeNumberList.forEach(num -> System.out.println(num));
	
	}
	
	private static List<Integer> populateList() {
		//using IntStream to populate the list with random numbers
		List<Integer> list = new ArrayList<Integer>();
		IntStream.range(1, 100)
		.forEach(x -> {
			Random random = new Random();
			list.add(random.nextInt(100));
		});
		return list;
	}

	private static boolean isPrime(int num) {
		//using IntStream to check prime
		return !IntStream.rangeClosed(2, num/2)
		.anyMatch(y -> num%y == 0);
	}

}
