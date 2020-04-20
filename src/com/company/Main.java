package com.company;

import java.awt.*;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for (int i = 1;i<=x;i++){
            int w = 0;
            int nw = 0;
            while (true){
                int y = scan.nextInt();
                if (y!=0){
                    if (y>0){
                        w++;
                    }
                    else {
                        nw++;
                    }
                }
                else {
                    break;
                }
            }
            System.out.printf("%d %d %.2f%%\n",w,nw,(float)(100*w)/(w+nw));
        }
    }
}
