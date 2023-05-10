import java.util.Stack;


public class App {
    public static void main(String[] args) throws Exception {
        Stack<String> antrian = new Stack<String>();

        int val = 8;
        do{
            System.out.println("\n=====================================");
            System.out.println("\n1.Tambahkan data");
            System.out.println("2.Hapus data");
            System.out.println("3.Mengambil data yang pertama");
            System.out.println("4.Mengambil data yang terakhir");
            System.out.println("5.Menghitung jumlah data pada Stack");
            System.out.println("6.Mendapatkan nilai pada index tertentu");
            System.out.println("7.hapus semua data");
            System.out.println("8.Keluar");
            System.out.println("=====================================");

            System.out.print("masukan pilihan = ");
    
            int inputVal = Integer.parseInt(System.console().readLine());
            
            if(inputVal == 1){
                System.out.print("Masukan data = ");
                String valAdd = System.console().readLine();
                antrian.push(valAdd);
            }
            
            else if(inputVal == 2){
                antrian.pop();
                System.out.println("data sekarang" + antrian);
            }
            
            else if(inputVal == 3){
                System.out.print("\ndata pada index pertama adalah = " + antrian.firstElement());
            }

            else if(inputVal == 4){
                System.out.print("data pada index terakhir = " + antrian.lastElement());
            }

            else if(inputVal == 5){
                System.out.print("jumlah data pada stack = " + antrian.size());
            }

            else if(inputVal == 6){
                int valget = Integer.parseInt(System.console().readLine());
                System.out.print("isi data index " + valget + " adalah = " + antrian.get(valget));
            }

            else if(inputVal == 7){
                antrian.clear();
                System.out.println("data sudah di clear");
            }
            else{
                break;
            }



        }while(val == 8);

    }
}
