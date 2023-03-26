import java.util.Arrays;
import java.util.Scanner;

public class Buatnantiarray {

    public static int Sum(int[] RakTahu){
        int sum = 0;
        for (int i = 0; i < RakTahu.length; i++){
            sum += RakTahu[i];
        }
        return sum;
    }
    public static void main(String[] args) throws Exception {
        int[] RakTahu = {10,10,10,10,10,10,10,10,10,10};
        int harga = 1000;

        Scanner Input = new Scanner(System.in);
        
        System.out.print("Mau beli berapa tahu = ");
        int InputValTahu = Input.nextInt();
        
        System.out.print("Masukan Uang nya = ");
        int InputValMoney = Input.nextInt();

        Input.close();

        for(int i = 0; i < InputValTahu; i++){
            if (i < 10){
                RakTahu[0]--;
            }
            else if (i <= 20){
                RakTahu[1]--;
            }
            else if (i <= 30){
                RakTahu[2]--;
            }
            else if (i <= 40){
                RakTahu[3]--;
            }
            else if (i <= 50){
                RakTahu[4]--;
            }
            else if (i <= 60){
                RakTahu[5]--;
            }
            else if (i <= 70){
                RakTahu[6]--;
            }
            else if (i <= 80){
                RakTahu[7]--;
            }
            else if (i <= 90){
                RakTahu[8]--;
            }
            else{
                RakTahu[9]--;
            }
        }

        // Calculate Total Pay
        int TotalPay = InputValTahu * harga;

        // Output
        // System.out.println("Total Pembayaran = " + TotalPay);
        System.out.printf("Total Pembayaran = %d \n",TotalPay);
        System.out.println("Uang Kembalian = " + (InputValMoney - TotalPay));
        System.out.println("Sisa tahu sekarang = " + Sum(RakTahu));
        System.out.println("Posisi akhir rak = " + Arrays.toString(RakTahu));

        // for(int i = 0;i<RakTahu.length;i++){
        //     System.out.print(RakTahu[i] + " ");
        // }

    }
}
