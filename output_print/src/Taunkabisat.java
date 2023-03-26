import java.util.Scanner;

public class Taunkabisat {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan tahun nya");
        int tahun = input.nextInt();
        input.close();

        if (tahun % 400 == 0){
            System.out.println(tahun + "tahun kabisat ");
        }
        else if (tahun % 100 == 0){
            System.out.println(tahun + "bukan tahun kabisat kabisat ");
        }
        else if (tahun % 4 == 0){
            System.out.println(tahun + "tahun kabisat ");
        }
        else{
            System.out.println(tahun + "bukan tahun kabisat kabisat ");
        }


    }
}
