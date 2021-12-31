package com.algorithms.lab.solution.service;

import java.util.Scanner;

public class PayMoneyTransactionService {

	public static void main(String[] args) {

		Scanner inputScan = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");
		int arraySize = inputScan.nextInt();
		int[] array = new int[arraySize];

		System.out.println("Enter the values of array");
		for (int i = 0; i < arraySize; i++) {
			array[i] = inputScan.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");
		int totalNumberOfInputs = inputScan.nextInt();

		while (totalNumberOfInputs > 0) {
			boolean isTargetAchieved = false;

			System.out.println("Enter the value of target");
			int target = inputScan.nextInt();

			int sum = 0;
			int count = 0;

			for (int value : array) {
				count++;
				sum = sum + value;
				if (target <= sum) {
					isTargetAchieved = true;
					System.out.println(String.format("Target achieved after %d transactions", count));
					break;
				}

			}

			if (!isTargetAchieved) {
				System.out.println("Given target is not achieved \r\n");
			}

			totalNumberOfInputs--;
		}

		inputScan.close();
	}
}