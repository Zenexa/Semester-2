import java.util.Scanner;

public class keteranganlulus {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 1 untuk sarjana dan input 2 untuk Magister = ");
        int InputVal = input.nextInt();
     

        if (InputVal == 1){
            System.out.print("Masukan IPK = ");
            float Ipk = input.nextFloat();

            if (Ipk >= 3.51f ){
                System.out.print(Ipk + "  = Cuma Laude");
            }

            else if (Ipk >= 3.01f && Ipk <= 3.5f ){
                System.out.print(Ipk + "  = Sangat Menuaskan");
            }

            else if (Ipk >= 2.76f && Ipk <= 3.0f ){
                System.out.print(Ipk + "  = memuaskan");
            }
            else if (Ipk >= 2.0f){
                System.out.print(Ipk + "  = Lulus");
            }
            else{
                System.out.print(Ipk + "  =  Tidak Lulus");
            }

        }

        else{
            
            System.out.print("Masukan IPK = ");
            float Ipk = input.nextFloat();

            if (Ipk >= 3.76f ){
                System.out.print(Ipk + "  = Cuma Laude");
            }

            else if (Ipk >= 3.51f && Ipk <= 3.75f ){
                System.out.print(Ipk + "  = Sangat Menuaskan");
            }

            else if (Ipk >= 3.01f && Ipk <= 3.5f ){
                System.out.print(Ipk + "  = memuaskan");

            }
            else if (Ipk >= 3.0f){
                System.out.print(Ipk + "  = Lulus");

            }
            else{
                System.out.print(Ipk + "  =  Tidak Lulus");
            }

        }


        input.close();  
    }
}
