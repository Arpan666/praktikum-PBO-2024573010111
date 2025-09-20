package modul_2;

import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("masukkan nama anda: ");
        String nama = input.nextLine();

        System.out.println("masukkan umur anda: ");
        int umur=  input.nextInt();

        System.out.println("masukkan tinggi anda: ");
        double tinggi = input.nextDouble();

        System.out.println("\n=== DATA ANDA ===");
        System.out.println("Nama: "+nama);
        System.out.println("Umur: "+umur);
        System.out.println("tinggi: "+tinggi +"cm");

        input.close();;
    }
}
