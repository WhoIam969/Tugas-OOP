package Pertemuan_6.Latihan;

public class PegawaiBeraksi {
    public static void main(String[] args) {
        //Membuat Objek
        Manager manager = new Manager();
        manager.Nama = "Rohmat";
        manager.GajiPokok = 6000000;
        manager.cetakinfo();
        manager.cetakTunjangan();
        System.out.println("============================");
        Programmer programer = new Programmer();
        programer.Nama = "Udin";
        programer.GajiPokok = 5000000;
        programer.cetakinfo();
        programer.cetakBonus();

    }
    
}
