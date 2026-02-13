
import java.util.Scanner;

public class pemilihan_12 {

    public static void main(String[] args) {
        Scanner vito12 = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");

        System.out.print("Masukkan Nilai tugas12 : ");
        double tugas12 = vito12.nextDouble();

        System.out.print("Masukkan Nilai kuis12  : ");
        double kuis12 = vito12.nextDouble();

        System.out.print("Masukkan Nilai uts12   : ");
        double uts12 = vito12.nextDouble();

        System.out.print("Masukkan Nilai uas12   : ");
        double uas12 = vito12.nextDouble();

        if (tugas12 < 0 || tugas12 > 100 ||
                kuis12 < 0 || kuis12 > 100 ||
                uts12 < 0 || uts12 > 100 ||
                uas12 < 0 || uas12 > 100) {

            System.out.println("=============================");
            System.out.println("=============================");
            System.out.println("NILAI TIDAK VALID");
            System.out.println("=============================");
            System.out.println("=============================");
            return;
        }

        double nilaiakhir12 = (0.2 * tugas12) + (0.2 * kuis12) + (0.3 * uts12) + (0.4 * uas12);

        String nilaihuruf12;

        if (nilaiakhir12 > 80 && nilaiakhir12 <= 100) {
            nilaihuruf12 = "A";

        } else if (nilaiakhir12 > 73) {
            nilaihuruf12 = "B+";

        } else if (nilaiakhir12 > 65) {
            nilaihuruf12 = "B";

        } else if (nilaiakhir12 > 60) {
            nilaihuruf12 = "C+";

        } else if (nilaiakhir12 > 50) {
            nilaihuruf12 = "C";

        } else if (nilaiakhir12 > 39) {
            nilaihuruf12 = "D";

        } else {
            nilaihuruf12 = "E";

        }

        System.out.println("=============================");
        System.out.println("=============================");

        System.out.println("\nNilai Akhir  : " + nilaiakhir12);
        System.out.println("Nilai Huruf  : " + nilaihuruf12);

        System.out.println("=============================");
        System.out.println("=============================");

        System.out.println("SELAMAT ANDA LULUS");

        vito12.close();
    }
}
