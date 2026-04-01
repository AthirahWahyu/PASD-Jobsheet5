package Praktikum05;

public class SortingMain3 {
    public static void main(String[] args) {
        
        int c[] = {40, 10, 4, 9, 3};
        
        Sorting3 dataurut3 = new Sorting3(c, c.length);

        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }
}
