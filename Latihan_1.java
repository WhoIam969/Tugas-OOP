//Membuat Class
class Person{
    private String Nama;
    private String JenisKelamin;
    private int umur;

    //setter
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setJenisKelamin(String JenisKelamin){
        this.JenisKelamin = JenisKelamin;
    }
    public void setumur(int umur){
        this.umur = umur;
    }

    //getter
    public String getNama(){
        return this.Nama;
    }
    public String getJenisKelamin(){
        return this.JenisKelamin;
    }
    public int getumur(){
        return this.umur;
    }

}

public class Latihan_1{
    public static void main(String[] args) {

        //Membuat Object
        Person Person1 = new Person();

        //Memanggil atribut dan memberi nilai */
        Person1.setNama("Anton");
        Person1.setJenisKelamin("Laki-Laki");
        Person1.setumur(20);
        System.out.println("Nama: " + Person1.getNama());
        System.out.println("Gender: " + Person1.getJenisKelamin());
        System.out.println("Umur: " + Person1.getumur());
        System.out.println("==============================");
        //Memanggil atribut dan memberi nilai */
        Person1.setNama("Riko");
        Person1.setJenisKelamin("Laki-Laki");
        Person1.setumur(20);
        System.out.println("Nama: " + Person1.getNama());
        System.out.println("Gender: " + Person1.getJenisKelamin());
        System.out.println("Umur: " + Person1.getumur());
    }
}