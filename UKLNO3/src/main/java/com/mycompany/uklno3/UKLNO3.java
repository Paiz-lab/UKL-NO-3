/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno3;

/**
 *
 * @author LOQ
 */

import java.util.Scanner;
public class UKLNO3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int n = input.nextInt();
        int hasil = 1;

        System.out.print(n + "! = ");
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
            hasil = hasil * i;
        }

        System.out.println(" = " + hasil);
        input.close();
    }
}
