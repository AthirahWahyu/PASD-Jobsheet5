public class DataDosen3 {
    Dosen3 [] dataDosen3 = new Dosen3 [10];
    int idx;
    
    
    void tambah(Dosen3 dsn){
        if (idx < dataDosen3.length) {
            dataDosen3[idx] = dsn;
            idx++;
        }else{
            System.out.println("Data penuh!");
        }
    }

    void tampil(){
        for (int i = 0; i < idx; i++){
            dataDosen3[i].tampil();
            System.out.println("--------------------");
        }
    }

    // ASC (termuda - tertua) Bubble Sort
    void SortingASC(){
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen3[j].usia < dataDosen3[j-1].usia) {
                    Dosen3 temp = dataDosen3[j];
                    dataDosen3[j] = dataDosen3[j-1];
                    dataDosen3[j-1] = temp;
                } 
            }
        }
    }

    // DSC (tertua - termuda) Selection Sort 
    void SortingDSC(){
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen3[j].usia > dataDosen3[idxMax].usia) {
                    idxMax = j;   
                }
            }
            Dosen3 temp = dataDosen3[i];
            dataDosen3[i] = dataDosen3[idxMax];
            dataDosen3[idxMax] = temp;
        }
    }
}
