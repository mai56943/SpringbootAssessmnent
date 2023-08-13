package com.example.demo2;

public class MedianCalculator {

  public static double calculateMedian(int [] arr) {

    int i = arr.length;

    if (i % 2 == 0) { //even
      int a = i / 2;
      double b = arr[a];
      double c = arr[a -1];

      double result = (b + c) / 2;
      return result; 
    }
    else { //odd
      int d = Math.round(i / 2);
      return arr[d];
    }
  }
  
}
