import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<Buku> DaftarBuku  = new Stack<>();

        DaftarBuku.push(new Buku("zenuar","001"));
        DaftarBuku.push(new Buku("askjdaskd","002"));
        DaftarBuku.push(new Buku("9232","003"));
       
        while(! DaftarBuku.isEmpty()){
            Buku buku = DaftarBuku.pop();
            System.out.println(buku.getJudul());

        }
    }
}
