package modul_2;

import java.util.Scanner;

public class gradeDemo {
    public static void  main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.println("masukkan nilai (0-100): ");
        int nilai =input.nextInt();

        char grade;
        String keterangan;

        //menggunakan if-else
        if (nilai >= 85) {
            grade ='A';
            keterangan= "exxelent";
        } else if (nilai >= 75) {
            grade ='B';
            keterangan = "Good";
        } else if (nilai >= 65) {
            grade ='C';
            keterangan ="Fair";
        } else if (nilai>=55) {
            grade = 'B';
            keterangan= "Poor";
        }else{
            grade ='E';
            keterangan= "Fail";
        }

        System.out.println("Nilai: "+nilai);
        System.out.println("Grade: "+grade);
        System.out.println("Keterangan: "+keterangan);

        input.close();
    }
}
