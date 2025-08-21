import java.util.*;
	public class count {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    System.out.println("Enter the numbers separated by spaces:");
	    String input = scanner.nextLine();
	   
	    String[] inputArray = input.split(" ");
	    int[] numbers = new int[inputArray.length];
	        
	    for (int i = 0; i < inputArray.length; i++) {
	        numbers[i] = Integer.parseInt(inputArray[i]);
	    }

	    Map<Integer, Integer> result = new HashMap<>();

	    for (int divisor = 1; divisor <= 9; divisor++) {
	        int count = 0;
	        for (int num : numbers) {
	            if (num % divisor == 0) {
	                count++;
	            }
	        }
	        result.put(divisor, count);
	     }
	     System.out.println(result);
	}
}
