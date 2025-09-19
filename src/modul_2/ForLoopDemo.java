package modul_2;

public class ForLoopDemo {
    public static void main(String[] args){
        System.out.println("=== ANGKA 1-10 ===");
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n=== ANGKA GENAP 2-20 ===");
        for (int i = 2; i <= 20; i += 2){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n=== COUNTDOWN ===");
        for(int i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println("\nStart");

        System.out.println("\n=== TABEL PERKALIAN 5 ===");
        for(int i = 1; i <= 10; i++){
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}
