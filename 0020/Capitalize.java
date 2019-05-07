/**
 * AOJ 0020 Capitalize
 */

import java.util.Scanner;

public class Capitalize{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        str = str.toUpperCase();

        System.out.println(str);
    }
}