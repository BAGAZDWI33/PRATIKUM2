# PRATIKUM2
##Setter_Getter

link = "https://github.com/BAGAZDWI33/setter_getter_PRATIKUM2.git"

Mendeklarasikan class Person, dengan atribut Nama, JenisKelamin, Umur.
access modifier = public,private,default, dan protected.

public class Person {   //public ini termasuk access modifier
    private String Nama;
    private String JenisKelamin;
    private int Umur;

setter_getter

    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setJenisKelamin(String JenisKelamin){
        this.JenisKelamin = JenisKelamin;
    }
    public void  setUmur(int Umur){
        this.Umur = Umur
    }
    public String getNama(){
        return this.Nama;
    }
    public String getJenisKelamin(){
        return this.JenisKelamin;
    }
    public int getUmur(){
        return this.Umur;
    }
}

    cara membaca setter dan getter

    public static void main(String[] args) {
         //person sebagai object
        Person person1 = new Person();
        Person person2 = new Person();
        /*memanggil atribut dan memberikan nilai             */
        person1.setNama("Anton");
        person1.setJenisKelamin("laki-laki");
        person1.setUmur(23);
        System.out.println("Nama          : " + person1.getNama());
        System.out.println("Jenis Kelamin : " + person1.getJenisKelamin());
        System.out.println("Umur          : " + person1.getUmur());

        person2.setNama("Riko");
        person2.setJenisKelamin("laki-laki");
        person2.setUmur(21);
        System.out.println("Nama          : " + person2.getNama());
        System.out.println("Jenis Kelamin : " + person2.getJenisKelamin());
        System.out.println("Umur          : " + person2.getUmur());
    }
}

person1 dipanggil menggunakan sintax System.out.println("Nama          : " + *person1.getNama()*); //person1 telah di setter sehingga saat pembacaan menggunakan getter. bila menggunakan setter maka tidak terbaca atau error seperti ini:

java: method setNama in class Person cannot be applied to given types;
  required: java.lang.String
  found: no arguments
  reason: actual and formal argument lists differ in length

jadi hasil dari pembacaan harus menggunakan getter.

hasil itu berada di gambar img = "screenshot1"

dengan hasil

Nama          : Anton
Jenis Kelamin : laki-laki
Umur          : 23
Nama          : Riko
Jenis Kelamin : laki-laki
Umur          : 21

Demikian penjelasan dari saya, Terima kasih

by.Bagas Dwi Prasetyo 312110053 kelas TI.21.C5



