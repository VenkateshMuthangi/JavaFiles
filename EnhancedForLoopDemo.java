package arraysDemo;

/**
 * Author :Muthangi.Venkatesh
 * Date	  :01-Nov-2025
 * Time	  :10:19:54 am
 * Project :CoreJava
*/
public class EnhancedForLoopDemo {

	public static void main(String[] args) {
		String arr[] = {"Ron", "Harry", "Hermoine"};
		//enhanced for loop
		int j = 0;
		for(String i: arr) {			
			System.out.print(i);
			j++;
			if(j<arr.length)
				System.out.print(", ");
		}

	}

}
