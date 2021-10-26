package lelang;
public class Laporan {

 public void laporan(Barang barang){
 int x=barang.getJmlBarang();
     
 System.out.println();
 System.out.println("Tabel Barang");
 System.out.println();
 System.out.println("Nama Buku \tStok \t harga ");
 for (int i = 0; i < x; i++) {
 System.out.println(barang.getNamaBarang(i)+"\t"+ barang.getStatus(i) +"\t"+ barang.getHargaAwal(i));
 }
 }
 public void laporan(Masyarakat masyarakat, Barang barang){
 int x=masyarakat.getJmlMasyarakat();

 System.out.println();
 System.out.println("Tabel Siswa");
 System.out.println();
 System.out.println("Nama \tAlamat \t\tTelepon \tStatus");
 for (int i = 0; i < x; i++) {
 System.out.println(masyarakat.getNama(i)+"\t"+
 masyarakat.getAlamat(i)+"\t"+masyarakat.getTelepon(i)+"\t"+
 barang.getStatus(i));
 }
 }

 public void laporan(Lelang lelang, Barang barang){
 int x=lelang.getJmlLelang();

 System.out.println();
 System.out.println("Laporan Peminjaman");
 System.out.println();
 System.out.println("Nama Buku\tQty \tHarga \tJumlah");

 int total=0;
 for (int i = 0; i < x; i++) {
 int
jumlah=lelang.getBanyaknya(i)*barang.getHargaAwal(lelang.getIdBarang(i));
 total+=jumlah;

System.out.println(barang.getNamaBarang(lelang.getIdBarang(i))+"\t"+

lelang.getBanyaknya(i)+"\t"+barang.getHargaAwal(lelang.getIdBarang(i))+"\t"
+
 jumlah);
 }
 System.out.println("Total Omset ="+total);
 
 }
}

