package modul_2;

import java.util.Scanner;

public class menuDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU PILIHAN ===");
        System.out.println("1. Hitung luas persegi");
        System.out.println("2. Hitung luas lingkaran");
        System.out.println("3. Hitung luas segitiga");
        System.out.println("4. Keluar");

        System.out.println("pilih menu (1-4): ");
        int pilihan = input.nextInt();

        switch(pilihan){
            case 1:
                System.out.println("masukkan nilai persegi: ");
                double sisi = input.nextDouble();
                double luaspPersegi = sisi*sisi;
                System.out.println("luas persegi: "+luaspPersegi);
                break;
            case 2:
                System.out.println("masukkan jari-jari lingkaran");
                double jari2 = input.nextDouble();
                double luaslingkarang = Math.PI + jari2 *jari2;
                System.out.println("luas lingkarang: "+luaslingkarang);
                break;
            case 3:
                System.out.println("masukkan alas segitiga");
                double alas = input.nextDouble();
                System.out.println("masukkan tinggi segitiga");
                double tinggi =input.nextDouble();
                double luassegitiga =0.5*alas*tinggi;
                System.out.println("luas segitiga: "+luassegitiga);
                break;
            case 4:
                System.out.println("terima kasih");
                break;
            default:
                System.out.println("pilihan tidak tersedia");
        }
        input.close();
    }
}
