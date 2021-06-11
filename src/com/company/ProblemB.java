package com.company;
import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String pat = sc.nextLine();
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(replace(s.charAt(i)));
        }
    }

    private static String replace(char s) {
        String c= "";
        if (s=='A'|| s=='a')
        {
            c = "@";
        }
        else if (s=='B'|| s=='b')
        {
            c = "8";
        }
        else if (s=='C'|| s=='c')
        {
            c = "(";
        }
        else if (s=='D'|| s=='d')
        {
            c = "|)";
        }
        else if (s=='E'|| s=='e')
        {
            c = "3";
        }
        else if (s=='F'|| s=='f')
        {
            c = "#";
        }
        else if (s=='G'|| s=='g')
        {
            c = "6";
        }
        else if (s=='H'|| s=='h')
        {
            c = "[-]";
        }
        else if (s=='I'|| s=='i')
        {
            c = "|";
        }
        else if (s=='J'|| s=='j')
        {
            c = "_|";
        }
        else if (s=='K'|| s=='k')
        {
            c = "|<";
        }
        else if (s=='L'|| s=='l')
        {
            c = "1";
        }
        else if (s=='M'|| s=='m')
        {
            c = "[]\\/[]";
        }
        else if (s=='N'|| s=='n')
        {
            c = "[]\\[]";
        }
        else if (s=='O'|| s=='o')
        {
            c = "0";
        }
        else if (s=='P'|| s=='p')
        {
            c = "|D";
        }
        else if (s=='Q'|| s=='q')
        {
            c = "(,)";
        }else if (s=='R'|| s=='r')
        {
            c = "|Z";
        }
        else if (s=='S'|| s=='s')
        {
            c = "$";
        }
        else if (s=='T'|| s=='t')
        {
            c = "']['";
        }
        else if (s=='U'|| s=='u')
        {
            c = "|_|";
        }
        else if (s=='V'|| s=='v')
        {
            c = "\\/";
        }
        else if (s=='W'|| s=='w')
        {
            c = "\\/\\/";
        }
        else if (s=='X'|| s=='X')
        {
            c = "}{";
        }
        else if (s=='Y'|| s=='y')
        {
            c = "`/";
        }
        else if (s=='Z'|| s=='z')
        {
            c = "2";
        }
        else if (s==' ')
        {
            c = " ";
        }
        else if (s=='.')
        {
            c = ".";
        }
        else if (s=='?')
        {
            c ="?";
        }
        else if (s=='!')
        {
            c = "!";
        }
        else if (s==',')
        {
            c =",";
        }
        return c;
    }

}
