package com.example.demo2;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

// import com.example.demo2.MedianCalculator;

public class Calculate {
  @Test
  public static void testCalculateMedianExample1() {
    
    int[] numbers1 = {1, 3};
		int[] numbers2 = {2};

		sorting(numbers1, numbers2);
  }

  @Test
  public static void testCalculateMedianExample2() {
    
    int[] numbers1 = {1, 2};
    int[] numbers2 = {3, 4};
    
    sorting(numbers1, numbers2);

  }

  private static void sorting(int [] numbers1, int [] numbers2) {
    int i = numbers1.length;
		int j = numbers2.length;

		int[] merge = new int[i + j];

		System.arraycopy(numbers1, 0, merge, 0, i);
		System.arraycopy(numbers2, 0, merge, i, j);

		Arrays.sort(merge);
    System.out.println("array " + Arrays.toString(merge));

    double result = MedianCalculator.calculateMedian(merge);
    System.out.println("result " + result);
  }
  
}
