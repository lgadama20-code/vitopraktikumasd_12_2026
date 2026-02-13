import java.util.Scanner;

public class tugas2_12 {

    public static void vito12jadwal12(String[][] jadwal12, int n, Scanner vito12) {

        for (int i = 0; i < n; i++) {
            System.out.println("\njadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal12[i][0] = vito12.nextLine();

            System.out.print("Ruang            : ");
            jadwal12[i][1] = vito12.nextLine();

            System.out.print("Hari             : ");
            jadwal12[i][2] = vito12.nextLine();

            System.out.print("Jam              : ");
            jadwal12[i][3] = vito12.nextLine();
        }
    }

    public static void tampilSemua(String[][] jadwal12, int n) {

        System.out.println("\n=== Semua jadwal Kuliah ===");
        System.out.printf("%-25s %-15s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("=============================================================");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-15s %-10s %-15s\n",
                    jadwal12[i][0],
                    jadwal12[i][1],
                    jadwal12[i][2],
                    jadwal12[i][3]);
        }
    }

    public static void tampilByHari(String[][] jadwal12, int n, String hariCari) {

        System.out.println("\njadwal pada hari " + hariCari + ":");

        for (int i = 0; i < n; i++) {
            if (jadwal12[i][2].equalsIgnoreCase(hariCari)) {
                System.out.println(jadwal12[i][0] + " | " +
                                   jadwal12[i][1] + " | " +
                                   jadwal12[i][3]);
            }
        }
    }

    public static void tampilByMK(String[][] jadwal12, int n, String mkCari) {

        System.out.println("\njadwal untuk Mata Kuliah " + mkCari + ":");

        for (int i = 0; i < n; i++) {
            if (jadwal12[i][0].equalsIgnoreCase(mkCari)) {
                System.out.println("Ruang : " + jadwal12[i][1]);
                System.out.println("Hari  : " + jadwal12[i][2]);
                System.out.println("Jam   : " + jadwal12[i][3]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner vito12 = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal: ");
        int n = Integer.parseInt(vito12.nextLine());

        String[][] jadwal12 = new String[n][4];

        vito12jadwal12(jadwal12, n, vito12);

        tampilSemua(jadwal12, n);

        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = vito12.nextLine();
        tampilByHari(jadwal12, n, hari);

        System.out.print("\nCari jadwal berdasarkan nama MK: ");
        String mk = vito12.nextLine();
        tampilByMK(jadwal12, n, mk);

        vito12.close();
    }
}
