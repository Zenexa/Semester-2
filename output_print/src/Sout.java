public class Sout {
    public static void main(String[] args){
        // System out / print yang pertama itu adalah print line yang meng-esksekusi 1 bari penuh 
        System.out.println("ini print line");

        //System out / yang kedua adalah print jika kedapatan 2 print kamu akan melihat perbedaan nya
        System.out.print("ini print biasa");
        System.out.print("ini juga \n");


        // System out / print yang ketiga yaitu print formating string
        int a = 10;
        int b = 20;
        System.out.printf("nilai pertama yaitu %s | dan nilai kedua yaitu %s",a,b);



        int n1 = 47;
        float n2 = 35.864f;
        double n3 = 44534345.76d;
    
        // format as an octal number
        System.out.println(String.format("n1 in octal: %o", n1));  // 57
    
    
        // format as hexadecimal numbers
        System.out.println(String.format("n1 in hexadecimal: %x", n1));  // 2f
        System.out.println(String.format("n1 in hexadecimal: %X", n1));  // 2F
    
        // format as strings
        System.out.println(String.format("n1 as string: %s", n1));  // 47
        System.out.println(String.format("n2 as string: %s", n2));  // 35.864
    
        // format in scientific notation
        System.out.println(String.format("n3 in scientific notation: %g", n3)); // 4.45343e+07


    }
}
