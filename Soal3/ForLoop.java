package Soal3;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        String kata;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Kata Menggunakan Camel case : ");
        kata = input.next();
        char[] huruf = kata.toCharArray();
        int hitung = 1;
        for (int i = 0; i < huruf.length; i++){
            if ((int)huruf[i] >= 65 && (int)huruf[i] <= 90){
                hitung++;
            }
        }
        System.out.println("Jumlah Kata = " + hitung);
    }
}
