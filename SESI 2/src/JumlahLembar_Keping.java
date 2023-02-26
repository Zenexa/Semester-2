import java.util.Scanner;

public class JumlahLembar_Keping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input dari user
        System.out.print("Masukan jumlah uang / nominal uang = ");
        int ValInput = input.nextInt();
        input.close();

        //variable untuk menampung setiap lembar / keping uang nya ;
        int SeratusRibu = 0,LimaPuluhRibu = 0,DuaPuluhRibu = 0,SepuluhRibu = 0,LimaRibu = 0,DuaRibu = 0,Seribu = 0,lima_ratus_perak = 0,dua_ratus_perak = 0,seratus_perak = 0;

        //melakukan while sampai < 100 perak
        while (true){
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
     
        // Akan melakukan print out jika nilai variable lebih dari 0
        if (SeratusRibu > 0){
                System.out.println("Jumlah lembar uang seratus ribu = "+SeratusRibu);
            }
        if (LimaPuluhRibu > 0){
                System.out.println("Jumlah lembar uang limapuluh ribu =  "+LimaPuluhRibu);
            }

        if (DuaPuluhRibu > 0){
                System.out.println("Jumlah lembar uang dua puluh ribu = "+DuaPuluhRibu); 
            }

        if (SepuluhRibu > 0){
            System.out.println("Jumlah lembar uang dua puluh ribu = "+SepuluhRibu); 
            }

        if (LimaRibu > 0){
            System.out.println("Jumlah lembar uang lima ribu = "+LimaRibu);
            }

        if (DuaRibu > 0){
            System.out.println("Jumlah lembar uang dua rebu = "+DuaRibu);
            }

        if (Seribu > 0){
            System.out.println("jumlah lembar uang Seribu = "+Seribu);
            }

        if (lima_ratus_perak > 0){
            System.out.println("jumlah keping lima ratus perak = "+lima_ratus_perak);
            }
        
        if (dua_ratus_perak > 0){
            System.out.println("jumlah keping lima ratus perak = "+dua_ratus_perak);
            }
        
        if (dua_ratus_perak > 0){
            System.out.println("jumlah keping lima ratus perak = "+dua_ratus_perak);
            }

        if (dua_ratus_perak > 0){
            System.out.println("jumlah keping lima ratus perak = "+seratus_perak);
            }

        if (ValInput > 0){
            System.out.println("sisa peraknya = "+ValInput);
            }

    }
}
