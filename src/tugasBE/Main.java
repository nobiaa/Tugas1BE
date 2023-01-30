package tugasBE;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser;
        int pilih, bil1, bil2, hasil;
        inputUser = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.println("5. Sisa Bagi");
        System.out.print("Masukan Pilihan : ");
        pilih = inputUser.nextInt();

        System.out.println("Masukan bilangan pertama");
        bil1 = inputUser.nextInt();
        System.out.println("Masukan bilangan kedua");
        bil2 = inputUser.nextInt();

        if (pilih == 1) {
            hasil = bil1 + bil2;
            System.out.println("Input User : " + bil1 + " + " + bil2);
            System.out.println("Hasil penjumlahan :" + hasil);
            save(hasil);
        } else if (pilih == 2) {
            hasil = bil1 - bil2;
            System.out.println("Input User : " + bil1 + " - " + bil2);
            System.out.println("Hasil Pengurangan :" + hasil);
            save(hasil);
        } else if (pilih == 3) {
            hasil = bil1 / bil2;
            System.out.println("Input user : " + bil1 + " / " + bil2);
            System.out.println("Hasil pembagian :" + hasil);
            save(hasil);
        } else if (pilih == 4) {
            hasil = bil1 * bil2;
            System.out.println("Input User : " + bil1 + " * " + bil2);
            System.out.println("Hasil perkalian :" + hasil);
            save(hasil);
        } else if (pilih == 5) {
            hasil = bil1 % bil2;
            System.out.println("Input User : " + bil1 + " % " + bil2);
            System.out.println("Hasil sisa bagi " + hasil);
            save(hasil);
        } else {
            System.out.println("Pilihan tidak ada");
        }
    }

    static void save(int hasil) {
        try {
            File writer = new File("result.txt");
            FileWriter fw = new FileWriter(writer);
            PrintWriter pw = new PrintWriter(fw);
            pw.write(String.valueOf("Hasil = " + hasil));
            pw.close();
            System.out.println("succes");

        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
