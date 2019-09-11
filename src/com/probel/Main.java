package com.probel;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Enter A  = new Enter();
        A.pri();
    }

    private static class Enter {
        Scanner scanner = new Scanner(System.in);
        String string;

        Enter(){
            System.out.print("Set string: ");
            string = scanner.nextLine();
        }

        void pri(){
            StringTokenizer st = new StringTokenizer(string," ,.!/?\\");
            while (st.hasMoreTokens()){
                System.out.println(st.nextToken());
            }
        }
    }
}
