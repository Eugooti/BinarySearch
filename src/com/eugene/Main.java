package com.eugene;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int elements,number;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        elements=scanner.nextInt();

    int[] numbers =new int[elements];
        System.out.println("Enter elements value");

        for (int i=0;i<numbers.length;i++){
            System.out.print("Element "+(i+1)+": ");
            numbers[i]=scanner.nextInt();
        }

        System.out.print("Enter element to be searched: ");
        number=scanner.nextInt();

        int location=search(numbers, number);
        System.out.println(location);

    }

    public static int search(int[] numbers, int number){
        int low=0;
        int high=numbers.length;

        while (low<high){
            int midPoint=low+(high-low)/2;

            if (numbers[midPoint]==number)
                return midPoint;

            else if (numbers[midPoint]<number)
                low=midPoint+1;

            else if (numbers[midPoint]>number)
                high=midPoint-1;

        }
        return -1;
    }
}
