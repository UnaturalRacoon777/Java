/*
 *
 * @author Victor Ojeda
 * @version 1.0
 * @since 9/9/2022
 */


import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n\nWhat size do you want your Arrays to be?\n");
        System.out.print("ENTER : ");

        int SIZE = input.nextInt();
        System.out.println();

        int[] A = new int[SIZE];
        int[] B = new int[SIZE];

        // Generate two arrays in ascending order
        for (int i = 0; i < SIZE; i++)
        {
            if (i > 0)
            {
                A[i] = A[i-1] + (int)(1 + (Math.random() * 11));
                B[i] = B[i-1] + (int)(1 + (Math.random() * 11));
            }
            else
            {
                A[i] = A[i] + (int)(1 + (Math.random() * 11));
                B[i] = B[i] + (int)(1 + (Math.random() * 11));
            }
        }

        System.out.println(Arrays.toString(A) + "\n\n" + Arrays.toString(B));
        System.out.println();
        
        descending(A, B);
    }

    public static void descending(int[] A, int[] B)
    {
        int[] AB = new int[A.length * 2];

        int incrementor = 0;

        for (int i = A.length - 1; i >= 0; i--)
        {
            if (i == A.length - 1) // Set the initial elements in AB to start comparing previous element with the next position
            {
                if (A[i] > B[i])
                {
                    AB[0] = A[i];
                    incrementor++;
                    AB[incrementor] = B[i];
                    incrementor++;
                }
                else
                {
                    AB[0] = B[i];
                    incrementor++;
                    AB[incrementor] = A[i];
                    incrementor++;
                }
            }
            //Compare the two arrays, whichever is bigger, compare that with the previous element of AB, switch elements if the order is not correct
            // then move to the next position of AB array to add the next possible element from A or B, whichever is bigger
            else
            {
                if (A[i] > B[i])
                {
                    int previousIndex = incrementor - 1;
                    if (A[i] > AB[previousIndex])
                    {
                        int temp = AB[previousIndex];
                        AB[previousIndex] = A[i];
                        AB[incrementor] = temp;
                        incrementor++;

                        AB[incrementor] = B[i];
                        incrementor++;
                    }
                    else
                    {
                        AB[incrementor] = A[i];
                        incrementor++;

                        AB[incrementor] = B[i];
                        incrementor++;

                    }
                }
                else if (B[i] > A[i])
                {
                    int previousIndex = incrementor - 1;
                    if (B[i] > AB[previousIndex])
                    {
                        int temp = AB[previousIndex];
                        AB[previousIndex] = B[i];
                        AB[incrementor] = temp;
                        incrementor++;

                        AB[incrementor] = A[i];
                        incrementor++;
                    }
                    else
                    {
                        AB[incrementor] = B[i];
                        incrementor++;

                        AB[incrementor] = A[i];
                        incrementor++;
                    }
                }

                else
                {
                    AB[incrementor] = A[i];
                    incrementor++;

                    AB[incrementor] = B[i];
                    incrementor++;
                }
            }
        }

        System.out.println(Arrays.toString(AB));
    }

}
