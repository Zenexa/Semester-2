import java.util.Scanner;

public class nilai {
    public static void main(String[] args) throws Exception {
        String indeks;
        Scanner input = new Scanner(System.in);
        System.out.print("masukan nilai nya = ");
        int nali = input.nextInt();

        input.close();
        
        if (nilai >= 85){
            indeks = "A";
        }
        else if (nilai >= 75){
            indeks = "B";
        }
        else if (nilai >= 65){
            indeks = "C";
        }
        else if (nilai >= 55){
            indeks = "D";
        }
        else{
            indeks = "E";
        }

        System.out.println("Nilai " + nilai + "dengan indeks " + indeks);
       
    }
}
