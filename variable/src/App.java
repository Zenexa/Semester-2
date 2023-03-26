import java.util.Scanner;

class parkir{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Jam Masuk 0-23: ");
        int jamMasuk = input.nextInt();

        System.out.print("Jam Keluar 0-23: ");
        int jamKeluar = input.nextInt();

        System.out.print("Biaya Per Jam: ");
        int biayaPerJam = input.nextInt();

        int lamaParkir = jamKeluar - jamMasuk;
        int biayaParkir = lamaParkir * biayaPerJam;

        System.out.println("Lama parkir: " + lamaParkir + " jam");
        System.out.println("Biaya parkir: " + biayaParkir + " rupiah");

        input.close();
    }
}
