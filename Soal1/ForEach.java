package Soal1;

public class ForEach {
    public static void main(String[] args) {
        int[] angka = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int hasil = 0;
        for (int i : angka){
            hasil += i;
        }
        System.out.println(hasil);
    }
}
