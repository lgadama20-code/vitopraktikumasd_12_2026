public class fungsi_12 {

    public static int hitungpendapatan12(int[] stok12, int[] harga12) {
        int total12 = 0;
        for (int i = 0; i < stok12.length; i++) {
            total12 += stok12[i] * harga12[i];
        }
        return total12;
    }

    public static String cekStatus(int pendapatan12) {
        if (pendapatan12 > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {

        String[] cabang12 = {
                "RoyalGarden 1",
                "RoyalGarden 2",
                "RoyalGarden 3",
                "RoyalGarden 4"
        };

        String[] bunga12 = { "Aglonema", "Keladi", "Alocasia", "Mawar" };

        int[][] stok12 = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };

        int[] harga12 = { 75000, 50000, 60000, 10000 };

        System.out.println("pendapatan12 RoyalGarden\n");

        for (int i = 0; i < stok12.length; i++) {

            int pendapatan12 = hitungpendapatan12(stok12[i], harga12);

            System.out.println(cabang12[i]);
            System.out.println("pendapatan12 : Rp." + pendapatan12);
            System.out.println("Status     : " + cekStatus(pendapatan12));
            System.out.println("----------------------------");
        }
    }
}
