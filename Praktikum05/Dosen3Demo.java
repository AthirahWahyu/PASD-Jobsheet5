import java.util.Scanner;

public class Dosen3Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DataDosen3 list = new DataDosen3();

        int pilih;

        do {
            System.out.println("\n----- MENU DATA DOSEN -----");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia termuda - tertua)");
            System.out.println("4. Sorting DSC (Usia tertua - termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = Integer.parseInt(sc.nextLine());

            switch (pilih) {
                case 1:
                    System.out.print("Kode      : ");
                    String kode = sc.nextLine();

                    System.out.print("Nama      : ");
                    String nama = sc.nextLine();

                    boolean jk;
                    while (true) {
                        System.out.print("Jenis Kelamin (L/P): ");
                        String input = sc.nextLine().trim();

                        if (input.equalsIgnoreCase("L")) {
                            jk = true;
                            break;
                        } else if (input.equalsIgnoreCase("P")) {
                            jk = false;
                            break;
                        } else {
                            System.out.println("Input harus L atau P!");
                        }    
                    }

                    System.out.print("Usia      : ");
                    int usia = Integer.parseInt(sc.nextLine());

                    Dosen3 d = new Dosen3(kode, nama, jk, usia);
                    list.tambah(d);
                    break;
                
                case 2: 
                    System.out.println("\nData Dosen: ");
                    list.tampil();
                    break;

                case 3:
                    list.SortingASC();
                    System.out.println("Data berhasil diurutkan ASC!");
                    break;
                
                case 4:
                    list.SortingDSC();
                    System.out.println("Data berhasil diurutkan DSC!");
                    break;
                
                case 5: 
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
    } 
}
