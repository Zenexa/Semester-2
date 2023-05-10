import java.util.Stack;

public class kampus {
    public static void main(String[] args) {
        Stack<String> antrian = new Stack<String>();

        antrian.push("bola");
        antrian.push("basket");
        antrian.push("volybal");

        // int i = 2;
        // while(i >= 0){
        //     System.out.println(antrian.get(i));
        //     i--;
        // }

        int i = antrian.size() - 1;
        while(i >= 0){
            System.out.println(antrian.get(i));
            i--;
        }

    }
}
