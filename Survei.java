import java.util.Scanner;
public class Survei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survei = new int[6][10]; 
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                int nilai;
                do {
                    System.out.print("Pertanyaan " + (i + 1) + ", responden " + (j + 1) + " (1-5): ");
                    nilai = sc.nextInt();
                } while (nilai < 1 || nilai > 5);
                survei[i][j] = nilai;
            }
        }
        for (int j = 0; j < 10; j++) {
            double total = 0;
            for (int i = 0; i < 6; i++) {
                total += survei[i][j];
            }
            System.out.println("Rata-rata responden " + (j + 1) + ": " + total / 6);
        }
        for (int i = 0; i < 6; i++) {
            double total = 0;
            for (int j = 0; j < 10; j++) {
                total += survei[i][j];
            }
            System.out.println("Rata-rata pertanyaan " + (i + 1) + ": " + total / 10);
        }
        double total = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                total += survei[i][j];
            }
        }
        System.out.println("Rata-rata keseluruhan: " + total / 60);
    }
}