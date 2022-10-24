



public class Person {
    private String Nama;
    private String JenisKelamin;
    private int Umur;

    //setter
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setJenisKelamin(String JenisKelamin){
        this.JenisKelamin = JenisKelamin;
    }
    public void  setUmur(int Umur){
        this.Umur = Umur;
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