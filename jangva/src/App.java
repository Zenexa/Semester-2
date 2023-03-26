import java.util.Scanner;  

public class App {
    // function convert minute to second
    
    public static int ToSecond(int num){ 
        return num * 60;
    }

    public static void main(String[] args) throws Exception {

        //Tittle
        System.out.println("TIME CONVERT"); 

        // scanner / input data from user
        System.out.print("Enter the number of minute = " );
        Scanner UserInput = new Scanner(System.in);
        
        // use function ToSecond for convert minute to second
        int Value = UserInput.nextInt();
        System.out.print(Value +" minute in second is " + ToSecond(Value));
        
        // closing scanner
        UserInput.close();
  
    }

}
