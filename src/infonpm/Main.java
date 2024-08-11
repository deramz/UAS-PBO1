
package infonpm;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan NPM : ");
            String npm = scanner.nextLine();

            if (npm.equalsIgnoreCase("exit")) {
                System.out.println("Terima kasih");
                break;
            }

            if (npm.isEmpty()) {
                System.out.println("NPM tidak boleh kosong.");
                continue;
            }

            if (npm.length() != 10) {
                System.out.println("NPM tidak sesuai. Harus terdiri dari 10 karakter.");
                continue;
            }

            System.out.println("================================");
            System.out.println("\nInfo NPM yang dimasukkan:");
            InfoNPM npmInfo = new InfoNPM(npm);
            System.out.println(npmInfo.toString());
            System.out.println("================================\n");


            System.out.print("Masukkan nilai tugas: ");
            double tugas = scanner.nextDouble();
            System.out.print("Masukkan nilai UTS: ");
            double uts = scanner.nextDouble();
            System.out.print("Masukkan nilai UAS: ");
            double uas = scanner.nextDouble();
            System.out.print("Masukkan nilai absen: ");
            double absen = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan buffer

            PerhitunganNilai perhitunganNilai = new PerhitunganNilai(tugas, uts, uas, absen);

            System.out.println("================================");
            System.out.println("Hasil Perhitungan Nilai:");
            perhitunganNilai.info();
            System.out.println("================================\n");
            System.out.println("- jika lanjut silahkan masukan nilai ");
            System.out.println("- jika mau keluar ketik exit ");
        }

        scanner.close();
    }
}