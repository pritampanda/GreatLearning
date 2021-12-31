package com.greatlearning;

public class MergeSort {
	void merge(double arr[], int left, int mid, int right, int order) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		double leftArray[] = new double[n1];
		double rightArray[] = new double[n2];
		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[mid + 1 + j];

		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (order == 1)
			{	
				if (leftArray[i] <= rightArray[j]) {
					arr[k] = leftArray[i];
					i++;
				} else {
					arr[k] = rightArray[j];
					j++;
				}
				k++;
			}
			else
			{	
				if (leftArray[i] >= rightArray[j]) {
					arr[k] = leftArray[i];
					i++;
				} else {
					arr[k] = rightArray[j];
					j++;
				}
				k++;
			}
		}


		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	public void sort(double[] notes, int left, int right, int order) {
		if (left < right) {
			// Find the middle point
			int mid = (left + right) / 2;

			// Sort first and second halves
			sort(notes, left, mid, order);
			sort(notes, mid + 1, right, order);

			// Merge the sorted halves
			merge(notes, left, mid, right, order);
		}
	}
}
