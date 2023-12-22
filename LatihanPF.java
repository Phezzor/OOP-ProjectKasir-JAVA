import java.util.Scanner;

class Kasir{
    int bayar;
    int total;
    int jumba;
    int harba;
    int kembali;
    String namba;

   /* Kasir(String namba,int jumba,int total,int bayar){
        this.namba= namba;
        this.jumba=jumba;
        this.total=total;
        this.bayar=bayar;
    }*/

   void setNamba(){
       System.out.println("Masukan Nama Barang");
        Scanner sc = new Scanner(System.in);
        namba = sc.nextLine();
   }
   void setJumba(){
       System.out.println("Masukan Jumlah Barang");
        Scanner sc = new Scanner(System.in);
        jumba = sc.nextInt();
   }
   void setHarba(){
       System.out.println("Masukan Harga Barang");
        Scanner sc = new Scanner(System.in);
        harba = sc.nextInt();
   }
   void setTotal(){
       System.out.println("Total Belanja: ");
        total = harba*jumba;
       System.out.println(total);

   }
   void setBayar(){
       System.out.println("Masukan Jumlah Uang Yang Dibayar: ");
       Scanner sc = new Scanner(System.in);
       bayar = sc.nextInt();
   }
   void setKembali(){
       System.out.println("Kembali Uang Anda: ");
        kembali = bayar-total;
       System.out.println(kembali);
   }


}


public class LatihanPF {
    public static void main(String[] args) {

    Kasir LatihanPF = new Kasir();
    LatihanPF.setNamba();
    LatihanPF.setJumba();
    LatihanPF.setHarba();
    LatihanPF.setBayar();
    LatihanPF.setTotal();
    LatihanPF.setKembali();



    }

}
