public class TugasSesi4 {
    public static void main(String[] args) throws Exception {
        // NO 1
        System.out.println("NO 1");
        for(int i = 0;i <= 10;i += 2){
            System.out.print(i + " ");
        }

         // NO 2
        System.out.println(" ");
        System.out.println("\nNO 2");
        for(int i = 3; i > 0 ;i--){
            for(int x = 0;x < i;x++){
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        
        // NO 3
        System.out.println("\nNO 3");
        int n = 8,x = 0,y = 1,z;
        System.out.print(x + " " + y + " ");
        for(int i = 2 ; i < n; i++){
            z = x + y;
            System.out.print(z + " ");
            x = y; 
            y = z;
            
        }
          
        // NO 4
        System.out.println(" ");
        System.out.println("\nNO 4");
        int val = 4,hasil;
        for(int i = 4; i <= 6;i++){
            for(int j = 0;j < 3;j++){
                hasil = i * val;
                System.out.print(i + " X " + val + " = " + hasil +" \n");
                val++;
	        }
            val -= 2;
            System.out.println(" ");
        }

        // NO 5
        System.out.println("NO 5");
        String B = "B",C = "C";
        for(int i = 0; i < 4;i++){
            for(int j = 0; j < 2;j++){
                System.out.print(B +" "+ C +" ");
            }
            System.out.println(" ");
            String temp = B;
            B = C;
            C = temp;
        }
    }
}
