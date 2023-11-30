import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class testSelectionSort {

	@Test
	public void test() { //test positives
		
		SelectionSort sorted = new SelectionSort();
		int[] testArr = {1, 5, 23, 2, 56, 7};
		
		int[] expected = {1, 2, 5, 7, 23, 56};
		int[] actual = sorted.basicSelectionSort(testArr);
		
		System.out.println("Expected = " + Arrays.toString(expected));
		System.out.println("Acutal = " + Arrays.toString(actual));
		System.out.println("");
		
		assertArrayEquals(actual, expected);
	}

	
	@Test
	public void test2() { //test negatives
		
		SelectionSort sorted = new SelectionSort();
		int[] testArr = {-5, -4, -3, -1, -2};
		
		int[] expected = {-5, -4, -3, -2, -1};
		int[] actual = sorted.basicSelectionSort(testArr);
		
		System.out.println("Expected = " + Arrays.toString(expected));
		System.out.println("Acutal = " + Arrays.toString(actual));
		System.out.println("");
		
		assertArrayEquals(actual, expected);				
	}