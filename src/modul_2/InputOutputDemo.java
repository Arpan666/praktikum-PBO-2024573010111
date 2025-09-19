package modul_2;

import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args){
        //membuat objek scanner
        Scanner input = new Scanner(System.in);

        //membaca input string
        System.out.println("masukkan nama anda: ");
        String nama = input.nextLine();

        //membaca input integer
        System.out.println("masukkan umur anda: ");
        int umur=  input.nextInt();

        //membaca input double
        System.out.println("masukkan tinggi anda: ");
        double tinggi = input.nextDouble();

        //menampilkan output
        System.out.println("\n=== DATA ANDA ===");
        System.out.println("Nama: "+nama);
        System.out.println("Umur: "+umur);
        System.out.println("tinggi: "+tinggi +"cm");

        //membaca scanner
        input.close();;
    }
}
