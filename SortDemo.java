package arraysDemo;

import java.util.Arrays;

/**
 * Author :Muthangi.Venkatesh
 * Date	  :01-Nov-2025
 * Time	  :11:13:09 am
 * Project :CoreJava
*/
public class SortDemo {

	public static void main(String[] args) {
		String[] lanaguages ={"Java","Ruby","Python","C++","Scala","Oak","C"};
        String[] lanaguages1 ={"Java","Ruby","Python","C++","Scala","Oak","C"};
        int[] numbers={34,12,5,66,23,1,89,2,100,45};
        

        System.out.println("Original Array : "+ Arrays.toString(lanaguages));
        Arrays.sort(lanaguages); //Inbuilt function of Arrays
        System.out.println("Sorted Array : "+ Arrays.toString(lanaguages));
        
        System.out.println("Original Array : "+ Arrays.toString(numbers));
        Arrays.sort(numbers); //Inbuilt function of Arrays
        System.out.println("Sorted Array : "+ Arrays.toString(numbers));

        //Partial Sort
        Arrays.sort(lanaguages1,2,lanaguages1.length);
        System.out.println("Array after Partial Sorting :");
        for(String x:lanaguages1){
            System.out.print(x+"\t");
        }
        
        Arrays.sort(numbers,3, numbers.length);
        System.out.println("Array after Partial Sorting :"+ Arrays.toString(numbers));

	}

}
