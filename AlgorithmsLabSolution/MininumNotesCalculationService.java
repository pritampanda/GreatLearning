package com.algorithms.lab.solution.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MininumNotesCalculationService {
	public static void main(String[] args) {

		Scanner inputScan = new Scanner(System.in);

		System.out.println("Enter the size of currency denominations");
		int arraySize = inputScan.nextInt();
		int[] array = new int[arraySize];

		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < arraySize; i++) {
			array[i] = inputScan.nextInt();
		}

		System.out.println("Enter the amount you want to pay");
		int transactionAmount = inputScan.nextInt();

		BubbleSortImplementation.bubbleSort(array);

		Map<Integer, Integer> resultantMap = new HashMap<>();

		try {
			int pendingAmount = calculateMinimumNotes(array, transactionAmount, resultantMap);

			System.out.println("Your payment approach in order to give min no of notes will be");

			for (Integer denomination : array) {
				int count = resultantMap.get(denomination);
				if (count > 0) {
					System.out.println(denomination + ":" + resultantMap.get(denomination));

				}
			}

			if (pendingAmount > 0) {
				System.out.println("Pending amount which couldn't be mapped: " + transactionAmount);
			}

		} catch (ArithmeticException e) {
			System.out.println("Exception occured during calculation, please enter valid inputs!");
		} finally {
			inputScan.close();
		}

	}

	private static int calculateMinimumNotes(int[] array, int transactionAmount, Map<Integer, Integer> resultantMap) {
		try {
			for (int i = 0; i < array.length; i++) {
				int remainder = transactionAmount % array[i];
				int count = transactionAmount / array[i];
				transactionAmount = remainder;
				resultantMap.put(array[i], count);
			}
			return transactionAmount;
		} catch (ArithmeticException e) {
			throw e;
		}

	}

}