public class Dosen3{
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen3(String kd, String name, Boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    void tampil(){
        System.out.println("Nama: " + nama);
        System.out.println("Kode: " + kode);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-Laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
    }
}