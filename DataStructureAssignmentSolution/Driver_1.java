package com.learning.main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Driver {

	
	
	
	
		public static void main(String[] args) {
			//int[] floors= {4,5,3,10,7,1,2};
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the total no of floors in the building");
			int	noOfFloors = sc.nextInt(); 
			int[] floors= new int[noOfFloors];
			
			for(int i=0;i<noOfFloors;++i) {
				System.out.println("enter the floor size given on day :" +(i+1));
				floors[i] = sc.nextInt();
			}
			
			
			
			
			
			
			
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			List<Integer> sortedFloors= new ArrayList<>();
			int max=0;
			for(int i=0;i<floors.length;++i) {
				sortedFloors.add(floors[i]);
				if(floors[i]>max)
					max=floors[i];
			}
			Collections.sort(sortedFloors);
			
			System.out.println();
			
			int currentFloor=0;
			
			System.out.println("The order of construction is as follows");
			for(int i=0;i<floors.length;++i) {
				System.out.println("Day: "+(i+1));
				
				if(max==floors[i]) {
					if(i==0) {
						System.out.println(floors[i]);
						currentFloor=floors[i];
					}
					else {
						System.out.print(floors[i]+" ");
						currentFloor=displayFromQueue(pq, sortedFloors, floors[i]);
						System.out.println();
					}
				}else if(floors[i]==getNextElement(currentFloor,sortedFloors)) {
					System.out.print(floors[i]+" ");
					currentFloor=displayFromQueue(pq, sortedFloors, floors[i]);
					System.out.println();
				}else {
					System.out.println();
					pq.add(floors[i]);
				}
			}
		}
		private static int getNextElement(int currentFloor, List<Integer> sortedFloors) {
			if(currentFloor==0)
				return -1;
			int nextElement=sortedFloors.indexOf(currentFloor)-1;
			return sortedFloors.get(nextElement);
		}
		private static int displayFromQueue(PriorityQueue<Integer> pq,List<Integer> sortedFloors, int floor) {
			while(1<=pq.size() && (pq.peek()==getNextElement(floor,sortedFloors))) {
				floor=(int) pq.peek();
				System.out.print(pq.poll()+" ");
			}
			return floor;
		}

	
}//