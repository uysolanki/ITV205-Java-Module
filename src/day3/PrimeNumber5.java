package day3;

import java.util.Scanner;

public class PrimeNumber5 {

	public static void main(String[] args) {
		int flag=0 ;
		int primeCounts=0;
		for (int n = 2; n <= 100; n++) {
			
			for (int i = 2; i <= n / 2; i++) {
				flag = 0;
				if (n % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n);
				primeCounts++;
			}
		}
		System.out.println("Total Prime Numbers between 1 - 100 are "+ primeCounts);
	}

}
