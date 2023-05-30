import java.util.Scanner;
public class linearsearch_ {
    public static void main(String[] args) throws Exception {
        int[] ray = {48,45,64,78,36,24,74,83,12,64};
        
        Scanner scan = new Scanner(System.in);    
    
        System.out.print("Mau cari berapa nilai");
        int cari = scan.nextInt();

        for(int i = 0 ; i < cari;i++){
            System.out.print("masukan nilai nya : ");
            int nilai = scan.nextInt();
            nilai = linearsearch(ray, nilai);
            System.out.println("nilai = " + nilai + "ada di index = " + nilai);
        }
        scan.close();
        

    }

    private static int linearsearch(int[] arr,int valSearch){
        for(int i = 0; i < valSearch; i++){
            for(int j = 0; j < arr.length;j++){
                if(arr[j] == valSearch){
                    return j;
                }
                else{
                    System.out.println("nilai tidak ditemukan");
                }
            }
        }
        return -1;
    }



}
