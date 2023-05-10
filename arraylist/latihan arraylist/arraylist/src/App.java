import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <Biodata> biodata = new ArrayList<Biodata>();


        biodata.add(new Biodata("zenuar","Teknik Informatika","2"));


        for(int i = 0 ; i < biodata.size() ;i++ ){
            System.out.println(biodata.get(i).nama + "\t" +biodata.get(i).Jurusan + "\t" + biodata.get(i).Semester);
        }
    }
}
