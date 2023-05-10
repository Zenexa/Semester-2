package stackobject;
import java.io.Console;
import java.util.Stack;

public class stackobject {

    private Stack<Pembeli> ListPembeli;
    public static void main(String[] args) {


    Main Screen = new main();
    Screen.Menu();
    Screen.inputData();
    Screen.cetakData();

    }


    private void Menu(){
        System.out.println("==============================");
        System.out.println("        Daftar Menu");
        System.out.println("==============================");
        System.out.println("1. Teuing");
        System.out.println("2. Teunyaho ");
        System.out.println("3. kurang apal");
        System.out.println("4. Nu mana tea");
        System.out.println("==============================");
    }

    private void inputData(){
        ListPembeli = new stack<pembeli>();

        String jawaban;
        int OrderNumber = 1;

        do{
            System.out.println("________________________________");
            System.out.println("Masukan Nama pembeli = ");
            String CostumerName = System.console().readLine();
            


        }while(jawaban.equals("Y")|| jawaban.equals("y"));



    }
}
