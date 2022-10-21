
//Membuat Class
class Person{
    String Nama;
    String JenisKelamin;
    int umur;
}

public class Main {
    public static void main(String[] args) throws Exception {

        //Membuat Object
        Person Person1 = new Person();
        Person1.Nama = "Anton";
        Person1.JenisKelamin = "Laki-Laki";
        Person1.umur = "20";
        
        System.out.println(Person1.Nama);
        System.out.println(Person1.JenisKelamin);
        System.out.println(Person1.umur);

        Person Person2 = new Person();
        Person2.Nama = "Riko";
        Person2.JenisKelamin = "Laki-Laki";
        Person2.umur = "20";

        System.out.println(Person2.Nama);
        System.out.println(Person2.JenisKelamin);
        System.out.println(Person2.umur);
    }
}