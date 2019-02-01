package com.lambton.magicalcardgame;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FirstShuffle extends MagicalCardGameCalculator{

    public static void getFirstShuffle(){
        Scanner s = new Scanner(System.in);
        System.out.println("Which column is your card in ?  /t 1 /t 2 /t 3");

        int n;
        n = s.nextInt();
        String M[][] = super.Matrix;
        String Matrix1[][] = new String[3][3];

        if(n == 1){
            for (int i = 0; i < 3; i++){
                Matrix1[n-1][i] = M[i][n];
            }
            for(int i =0; i< 3; i++){
                Matrix1[n][i] = M[i][n-1];
            }
            for(int i =0; i< 3; i++){
                Matrix1[n+1][i] = M[i][n+1];
            }
        }


    }
}