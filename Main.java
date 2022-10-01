/*
 *
 * @author Victor Ojeda
 * @version 1.0
 * @since 9/30/2022
 */


import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println();

        int[] log10 = new int[10];
        int[] sqr10 = new int[10];

        int[] log100 = new int[100];
        int[] sqr100 = new int[100];

        int[] log1000 = new int[1000];
        int[] sqr1000 = new int[1000];

        int[] log10000 = new int[10000];
        int[] sqr10000 = new int[10000];

        int[] log100000 = new int[100000];
        int[] sqr100000 = new int[100000];

        for (int i = 0; i < 10; i++)
        {
            log10[i] = (int)(1 + (Math.random() * 100000));
            sqr10[i] = (int)(1 + (Math.random() * 100000));
        }

        for (int i = 0; i < 100; i++)
        {
            log100[i] = (int)(1 + (Math.random() * 100000));
            sqr100[i] = (int)(1 + (Math.random() * 100000));
        }

        for (int i = 0; i < 1000; i++)
        {
            log1000[i] = (int)(1 + (Math.random() * 100000));
            sqr1000[i] = (int)(1 + (Math.random() * 100000));
        }

        for (int i = 0; i < 10000; i++)
        {
            log100000[i] = (int)(1 + (Math.random() * 100000));
            sqr100000[i] = (int)(1 + (Math.random() * 100000));
        }

        for (int i = 0; i < 100000; i++)
        {
            log100000[i] = (int)(1 + (Math.random() * 100000));
            sqr100000[i] = (int)(1 + (Math.random() * 100000));
        }
        time10(log10, sqr10);
        System.out.println("--------------------------------------------------------");
        time100(log100, sqr100);
        System.out.println("--------------------------------------------------------");
        time1000(log1000, sqr1000);
        System.out.println("--------------------------------------------------------");
        time10000(log10000, sqr10000);
        System.out.println("--------------------------------------------------------");
        time100000(log100000, sqr100000);

    }

    public static void time10(int[] A, int[] B)
    {
        System.out.println("\nSorting 10 elements\n");

        long startTime = System.nanoTime();
        Arrays.sort(A);
        long stopTime = System.nanoTime();
        System.out.println("Array Sort took : " + (stopTime - startTime) + " millis\n");


        startTime = System.nanoTime();
        bubbleSort(B);
        stopTime = System.nanoTime();
        System.out.println("Bubble Sort took : " + (stopTime - startTime) + " millis\n");
    }

    public static void time100(int[] A, int[] B)
    {
        System.out.println("\nSorting 100 elements\n");

        long startTime = System.nanoTime();
        Arrays.sort(A);
        long stopTime = System.nanoTime();
        System.out.println("Array Sort took : " + (stopTime - startTime) + " millis\n");


        startTime = System.nanoTime();
        bubbleSort(B);
        stopTime = System.nanoTime();
        System.out.println("\nBubble Sort took : " + (stopTime - startTime) + " millis\n");
    }

    public static void time1000(int[] A, int[] B)
    {
        System.out.println("\nSorting 1000 elements\n");

        long startTime = System.nanoTime();
        Arrays.sort(A);
        long stopTime = System.nanoTime();
        System.out.println("Array Sort took : " + (stopTime - startTime) + " millis\n");


        startTime = System.nanoTime();
        bubbleSort(B);
        stopTime = System.nanoTime();
        System.out.println("\nBubble Sort took : " + (stopTime - startTime) + " millis\n");
    }

    public static void time10000(int[] A, int[] B)
    {
        System.out.println("\nSorting 10000 elements\n");

        long startTime = System.nanoTime();
        Arrays.sort(A);
        long stopTime = System.nanoTime();
        System.out.println("Array Sort took : " + (stopTime - startTime) + " millis\n");


        startTime = System.nanoTime();
        bubbleSort(B);
        stopTime = System.nanoTime();
        System.out.println("\nBubble Sort took : " + (stopTime - startTime) + " millis\n");
    }

    public static void time100000(int[] A, int[] B)
    {
        System.out.println("\nSorting 100,000 elements\n");

        long startTime = System.nanoTime();
        Arrays.sort(A);
        long stopTime = System.nanoTime();
        System.out.println("Array Sort took : " + (stopTime - startTime) + " millis\n");


        startTime = System.nanoTime();
        bubbleSort(B);
        stopTime = System.nanoTime();
        System.out.println("\nBubble Sort took : " + (stopTime - startTime) + " millis");
    }

    public static void bubbleSort(int A[])
    {
         
        for (int i = 0; i < A.length; i++)
        {
            for (int j = i+1; j < A.length; j++)
            {
                if (A[j] < A[i])
                {
                    int temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }
    }

}
