	@Test
	public void test3() { //test positives and negatives
		
		SelectionSort sorted = new SelectionSort();
		int[] testArr = {1, -2, 3, 4, -5};
		
		int[] expected = {-5, -2, 1, 3, 4};
		int[]actual = sorted.basicSelectionSort(testArr);
		
		System.out.println("Expected = " + Arrays.toString(expected));
		System.out.println("Acutal = " + Arrays.toString(actual));
		System.out.println("");
		
		assertArrayEquals(actual, expected);		
	}
	
	@Test
	public void test4() { //test duplicates
		
		SelectionSort sorted = new SelectionSort();
		int[] testArr = {1, 1, 2, 3, 2, 5, 5, 3};
		
		int[] expected = {1, 1, 2, 2, 3, 3, 5, 5};
		int[] actual = sorted.basicSelectionSort(testArr);
		
		System.out.println("Expected = " + Arrays.toString(expected));
		System.out.println("Acutal = " + Arrays.toString(actual));
		System.out.println("");
		
		assertArrayEquals(actual, expected);			
	}
}