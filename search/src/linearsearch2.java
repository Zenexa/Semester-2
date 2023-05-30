import java.util.Scanner;

public class linearsearch2 {
    public static void main(String[] args) {
        int[] ray = {48,45,64,78,36,24,74,83,12,64};
        int[] valSearch;
        
        Scanner scan = new Scanner(System.in);    
        
        System.out.print("Mau cari berapa banyak array ? = ");
        int masukan = scan.nextInt();
        valSearch = new int[masukan];


        // looping untuk memasukan nilai yang mau di cari
        for(int i = 0; i < valSearch.length;i++){
            System.out.print("masukan nilai yang mau dicari : ");
            int cari = scan.nextInt();
            valSearch[i] = cari;
        }

        int nilai[] = cari(ray, valSearch);

        for (int i = 0; i < nilai.length; i++) {
            if(nilai[i] == -1){
                System.out.println("nilai array " + valSearch[i] + " tidak ditemukan");
            }
            else{
                System.out.println("nilai array " + valSearch[i] + " ditemukan di index " + nilai[i]);
            }
        }

        scan.close();
    }

    private static int[] cari(int[] arr,int[] cari){  
        int[] tampungIndex = new int[cari.length];
        for(int i = 0; i < cari.length;i++){
            boolean ditemukan = false;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == cari[i]){
                    tampungIndex[i] = j;
                    ditemukan = true;
                    break;
                }
            }
            if(!ditemukan){
                tampungIndex[i] = -1; // nilai -1 menandakan nilai tidak ditemukan
            }
        }
        return tampungIndex;
    }



}
