import java.util.Scanner;

public class BioskopWithScanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, pilihan;
        boolean pilih = true;
        String[][] penonton = new String[4][2];
        while (pilih) {
            System.out.println("MENU--------Fungsi");
            System.out.println("1.          Input data penonton");
            System.out.println("2.          Tampilkan daftar penonton");
            System.out.println("3.          Exit");
            System.out.println("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukan nama: ");
                        nama = sc.nextLine();
                        System.out.print("Masukan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.print("Input penonton lainnya? (y/n): ");
                        pilihan = sc.nextLine();

                        if (pilihan.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + " : " + isi);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    pilih = false;
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }
        }
        sc.close();
    }
}