package lelang;
import java.util.ArrayList;
import java.util.Scanner;

public class Lelang {

    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();

    public Lelang() {
        this.idMasyarakat.add(0);
        this.idBarang.add(0);
        this.hargaTawar.add(2);
        this.idMasyarakat.add(0);
        this.idBarang.add(1);
        this.hargaTawar.add(3);
        this.idMasyarakat.add(1);
        this.idBarang.add(0);
        this.hargaTawar.add(1);
        this.idMasyarakat.add(1);
        this.idBarang.add(2);
        this.hargaTawar.add(2);
    }

    public void prosesLelang(Petugas petugas, Masyarakat masyarakat, Lelang lelang, Barang barang) {
        Scanner myObj = new Scanner(System.in);
        
        
        System.out.println("Masukkan Barang yang mau dilelang");
        String namaBarang  = myObj.next();
        barang.setNamaBarang(namaBarang);
        
        System.out.println("Masukkan harga awal lelang");
        int hargaAwal  = myObj.nextInt();
        barang.setHargaAwal(hargaAwal);
        
        System.out.println("Apakah barang bisa ditawar?");
        boolean status  = myObj.nextBoolean();
        barang.setStatus(status);
        System.out.println("Status " +  barang.getNamaBarang(3) + " = "+  barang.getStatus(3));
        if(barang.getStatus(3)){
            System.out.println("Dapat ditawar");
        } else{
            System.out.println("Tidak boleh ditawar");
        }
        
    }
    
    public void dataBarang(Barang barang){
    int x=barang.getJmlBarang();

    System.out.println();
    System.out.println("Tabel Barang");
    System.out.println();
    System.out.println("Nama Buku \tStok \t harga ");
    for (int i = 0; i < x; i++) {
    System.out.println(barang.getNamaBarang(i)+"\t"+ barang.getStatus(i) +"\t"+ barang.getHargaAwal(i));
    }
    }
        
    public void prosesPenawaran(Masyarakat masyarakat, Lelang lelang, Barang barang) {    
        Scanner myObj = new Scanner(System.in);
        System.out.println("Silahkan melakukan penawaran barang");
        System.out.println("Masukkan ID Measyarakat");
        int idMasyarakat = myObj.nextInt();
        System.out.println("Selamat datang " + masyarakat.getNama(idMasyarakat));
        ArrayList<Integer> idBarang = new ArrayList<Integer>();
        ArrayList<Integer> hargaTawar = new ArrayList<Integer>();
       
        int i = 0;
        int temp = 0;
        do {
            System.out.println("Masukkan kode barang");
            temp = myObj.nextInt();
            
            if (temp != 99) {
                idBarang.add(temp);
                System.out.print(barang.getNamaBarang(idBarang.get(i)) + " harga tawar : ");
                hargaTawar.add(myObj.nextInt());
                i++;
            }
        } while (temp != 99);

        System.out.println("Transaksi belanja " + masyarakat.getNama(idMasyarakat) + "sebagai berikut");
        System.out.println("Nama Barang \tHargaTawar \tHarga \tJumlah \t");

        int total = 0;
        int x = idBarang.size();
        for (int j = 0; j < x; j++) {
            int jumlah = hargaTawar.get(j) * barang.getHargaAwal(idBarang.get(j));
            total += jumlah;
            System.out.println(barang.getNamaBarang(idBarang.get(j)) + "\t"
                    + hargaTawar.get(j) + "\t"
                    + barang.getHargaAwal(idBarang.get(j)) + "\t"
                    + jumlah);
            lelang.setLelang(barang, idMasyarakat, idBarang.get(j),
                    hargaTawar.get(j));
        }

        System.out.println("Total Belanja : " + total);
        barang.editStatus(idMasyarakat, true);
        
       
        
    }
    
    

    public void setLelang(Barang barang, int idMasyarakat, int idBarang, int hargaTawar) {
        this.idMasyarakat.add(idMasyarakat);
        this.idBarang.add(idBarang);
        this.hargaTawar.add(hargaTawar);
        barang.editStatus(idBarang, barang.getStatus(idBarang));
    }

    public int getIdBarang(int id) {
        return this.idBarang.get(id);
    }

    public int getBanyaknya(int id) {
        return this.hargaTawar.get(id);
    }

    public int getIdMasyarakat(int id) {
        return this.idMasyarakat.get(id);
    }

    public int getJmlLelang() {
        return this.idMasyarakat.size();
    }
    
    public void setHargaTawar(int hargaTawar ){
 this.hargaTawar.add(hargaTawar);
 }
 public int getHargaTawar(int idBarang){
 return this.hargaTawar.get(idBarang);
 }
}

