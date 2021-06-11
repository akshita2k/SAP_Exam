package com.company;
import java.util.Scanner;

public class ProblemA {
    //public static int diff(int n, int arr[]) {}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z=0; z<t; z++){
            int n = sc.nextInt();
            int [] arr = new int [n];
            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int res =0;
            for (int i=0; i<n; i++) {
                int j;
                for ( j=0; j<n; j++) {
                    if (i!=j && arr[i]==arr[j]) {

                        break;
                    }
                }
                if (j==n) {
                    res = arr[i];
                }
            }
            System.out.println(res);
        }
    }
}
