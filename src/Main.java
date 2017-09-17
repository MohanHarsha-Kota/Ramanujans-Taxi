/***
* Ramanujan's Taxi. The following program verifies whether a given number can be expressed as a cubic sum of two numbers.
* If so, it prints the integers whose cubic sum is equivalent tothe given number.
* Try the famous number 1729.
* Harsha Kota
***/

import java.util.*;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
	int N, c1 = 0, c2 = 0;
	int[] tempi;
	int[] tempj;
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter a Number");
	N = obj.nextInt();
    tempi = new int[2];
    tempj = new int[2];
	for(int i = 1; i<=N; i++)
    {
        for(int j = 1; j<=N; j++)
        {
            if((Math.pow(i, 3) + Math.pow(j , 3)) == N)
            {
                if(c1<2 && c2<2) {
                    tempi[c1++] = i;
                    tempj[c2++] = j;
                }

            }
        }
    }
    if(c1!=0 && c2!=0)
    {
        for(int i = 0;i<c1;i++)
        {
            for(int j = 0; j<c2; j++)
            {
                if(i==j)
                    System.out.println("The given number "+ N +" can be expressed as the cubic sum of the numbers " + tempi[i] + " & " + tempj[j]);
            }
        }
    }
    else
    {
        System.out.println("The given number "+ N +" cannot be expressed as the cubic sum of two numbers in two different ways");
    }

    }
}
