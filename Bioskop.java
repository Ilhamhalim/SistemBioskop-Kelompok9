import java.util.ArrayList;
import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> historiPesanan = new ArrayList<>();
        
        System.out.println("Selamat datang di Sistem Pemesanan Tiket Bioskop");
        System.out.println("Silakan pilih film yang ingin ditonton:");
        System.out.println("1. Film Jurig");
        System.out.println("2. Film upun");
        System.out.println("3. Film Ipin");
        System.out.print("Masukkan pilihan Anda (1/2/3): ");
        
        int pilihanFilm = input.nextInt();
        
        String[] film = {"Film Jurig", "Film Upun", "Film Ipin"};
        int[] hargaTiket = {50000, 45000, 55000};
        int harga = hargaTiket[pilihanFilm - 1];
        
        System.out.println("Anda telah memilih " + film[pilihanFilm - 1]);
        System.out.println("Harga tiket: Rp " + harga);
        
        // Tambahkan fitur jadwal penayangan
        String[][] jadwalFilm = {
            {"Film Jurig", "10:00", "13:00", "16:00"},
            {"Film Upun", "11:00", "14:00", "17:00"},
            {"Film Ipin", "12:00", "15:00", "18:00"}
        };
        
        System.out.println("Jadwal Penayangan Film:");
        for (int i = 0; i < jadwalFilm.length; i++) {
            if (i == pilihanFilm - 1) {
                System.out.print(film[i] + ": ");
                for (int j = 1; j < jadwalFilm[i].length; j++) {
                    System.out.print(jadwalFilm[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        System.out.print("Silakan pilih waktu penayangan (1/2/3): ");
        int pilihanWaktu = input.nextInt();
        
        System.out.println("Anda telah memilih waktu penayangan: " + jadwalFilm[pilihanFilm - 1][pilihanWaktu]);
        
        // Fitur pesanan makanan/minuman
        System.out.println("Apakah Anda ingin memesan makanan/minuman? (ya/tidak)");
        String pesanMakanan = input.next();
        int totalHargaMakanan = 0;
        
        if (pesanMakanan.equalsIgnoreCase("ya")) {
            System.out.println("Daftar Menu:");
            System.out.println("1. Kopikap - Rp 20000");
            System.out.println("2. Sisri - Rp 15000");
            System.out.print("Pilih menu (1/2): ");
            int pilihanMenu = input.nextInt();
            
            switch(pilihanMenu) {
                case 1:
                    totalHargaMakanan = 20000;
                    break;
                case 2:
                    totalHargaMakanan = 15000;
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }
        }
        
        // Fitur jumlah tiket
        System.out.print("Silakan pilih jumlah tiket yang ingin dipesan: ");
        int jumlahTiket = input.nextInt();
        
        // Hitung total harga
        int totalHarga = harga * jumlahTiket;
        int totalBiaya = totalHarga + totalHargaMakanan;
        
        // Tambahkan fitur tempat duduk
        System.out.println("Silakan pilih tempat duduk:");
        System.out.println("1. Baris 1");
        System.out.println("2. Baris 2");
        System.out.println("3. Baris 3");
        System.out.println("4. Baris 4");
        System.out.println("5. Baris 5");
        System.out.println("6. Baris 6");
        System.out.println("7. Baris 7");
        System.out.println("8. Baris 8");
        System.out.println("9. Baris 9");
        System.out.println("10. Baris 10");
        System.out.print("Pilih baris (1-10): ");
        String baris = input.next();
        
        System.out.println("Silakan pilih nomor kursi (1-10): ");
        int nomorKursi = input.nextInt();
        
        // Tambahkan detail pesanan ke histori
        historiPesanan.add("Film: " + film[pilihanFilm - 1]);
        historiPesanan.add("Waktu Penayangan: " + jadwalFilm[pilihanFilm - 1][pilihanWaktu]);
        historiPesanan.add("Jumlah Tiket: " + jumlahTiket);
        historiPesanan.add("Total Harga Tiket: Rp " + totalHarga);
        if (totalHargaMakanan > 0) {
            historiPesanan.add("Makanan/Minuman: Rp " + totalHargaMakanan);
        }
        historiPesanan.add("Total Biaya: Rp " + totalBiaya);
        historiPesanan.add("Tempat Duduk: " + baris.toUpperCase() + nomorKursi);
        
        // Konfirmasi pesanan
        System.out.println("Terima kasih! Pesanan Anda:");
        for (String pesanan : historiPesanan) {
            System.out.println(pesanan);
        }
        System.out.println("Silakan melakukan pembayaran. Selamat menonton!");
    }
}