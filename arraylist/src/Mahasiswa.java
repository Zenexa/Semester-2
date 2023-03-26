public class Mahasiswa {
    public String name,nim,jurusan,keterangan,Jenis_Kelamin;
    public int tahun_lahir;

    public Mahasiswa(String name, String nim, String jurusan,int tahun_lahir,String Jenis_Kelamin) {
        this.name = name.length() < 8 ? name+"\t" : name;
        this.nim = nim.length() < 8 ? nim+"\t" : nim;
        this.tahun_lahir = 2023 - tahun_lahir;
        this.Jenis_Kelamin = Jenis_Kelamin;
        this.jurusan = jurusan.length() < 8 ? jurusan+"\t\t" : (jurusan.length() < 16 ? jurusan+"\t" : jurusan);        
    }
}