package termproject;

import java.util.*;

public class code3 {
	public static void bubble(int size) {

		int arr[] = new int[size];
		long total = 0;
		long timeElapsed = 0;
		long endTime = 0;

		for (int o = 0; o < 1000; o++) {
			for (int l = 0; l < arr.length; l++) {
				arr[l] = (int) (Math.random() * (size*10)) + 1;
			}
				long startTime = System.currentTimeMillis();
				for (int i = 0; i < arr.length; i++) {
					for (int j = i + 1; j < arr.length; j++)
						if (arr[j] < arr[i]) {
							int temp = arr[j];
							arr[j] = arr[i];
							arr[i] = temp;
				
						}
		
					endTime = System.currentTimeMillis();
					timeElapsed = endTime - startTime;
				}
				total = total + timeElapsed;

			}
		System.out.println("Bubble Sorting time for array size of " +size+ " is " +total+ " milliseconds");

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter an array size");
		int size=sc.nextInt();
		bubble(size);
		bubble(500);
		bubble(2500);

		bubble(5000);

	}
}

