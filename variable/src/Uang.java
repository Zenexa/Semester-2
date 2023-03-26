import java.util.Scanner;

public class Uang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumblah uang = ");
        int ValInput = input.nextInt();

        input.close();

        int SeratusRibu = 0;
        int LimaPuluhRibu = 0;
        int DuaPuluhRibu = 0;
        int SepuluhRibu = 0;
        int LimaRibu = 0;
        int DuaRibu = 0;
        int Seribu = 0;
        int lima_ratus_perak = 0;
        int dua_ratus_perak = 0;
        int seratus_perak = 0;

        while (ValInput > 0){
        if (ValInput >= 100000){
            ValInput -= 100000;
            SeratusRibu++;
            }
        else if (ValInput >= 50000){
            ValInput -= 50000;
            LimaPuluhRibu++;
            }
        else if (ValInput >= 20000){
            ValInput -= 20000;
            DuaPuluhRibu++;
            }
        else if (ValInput >= 10000){
            ValInput -= 10000;
            SepuluhRibu++;
            }
        else if (ValInput >= 5000){
            ValInput -= 5000;
            LimaRibu++;
            }
        else if (ValInput >= 2000){
            ValInput -= 2000;
            DuaRibu++;
            }
        else if (ValInput >= 1000){
            ValInput -= 1000;
            Seribu++;
            }
        else if (ValInput >= 500){
            ValInput -= 500;
            lima_ratus_perak++;
            }
        else if (ValInput >= 200){
            ValInput -= 200;
            dua_ratus_perak++;
            }
        else if (ValInput >= 100){
            ValInput -= 100;
            seratus_perak++;
            }
        else{
            break;
            }
        }
     
        // Output dari variable
        System.out.println("Jumlah lembar uang seratus ribu = "+SeratusRibu);
        System.out.println("Jumlah lembar uang lima puluh ribu = "+LimaPuluhRibu);
        System.out.println("Jumlah lembar uang dua puluh ribu = "+DuaPuluhRibu); 
        System.out.println("Jumlah lembar uang sepuluh ribu = "+SepuluhRibu);
        System.out.println("Jumlah lembar uang lima ribu = "+LimaRibu);
        System.out.println("Jumlah lembar uang dua rebu = "+DuaRibu);
        System.out.println("jumlah lembar uang Seribu = "+Seribu);
        System.out.println("jumlah keping lima ratus perak = "+lima_ratus_perak);
        System.out.println("jumlah keping dua ratus perak = "+dua_ratus_perak);
        System.out.println("jumlah keping seratus perak = "+seratus_perak);
        System.out.println("sisa peraknya = "+ValInput);

    }
}
