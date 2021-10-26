package lelang;
import java.util.ArrayList;
public class Barang {

 private ArrayList<String> namaBarang = new ArrayList<String>();
 private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
 private ArrayList<Boolean> status = new ArrayList<Boolean>();

 public Barang() {
 this.namaBarang.add("Mobil");
 this.status.add(true);
 this.hargaAwal.add(100000000);
 this.namaBarang.add("Lukisan");
 this.status.add(true);
 this.hargaAwal.add(50000);
 this.namaBarang.add("Motor");
 this.status.add(true);
 this.hargaAwal.add(15000000);
 }
 public int getJmlBarang(){
 return this.namaBarang.size();
 }
 public void setNamaBarang(String namaBarang ){
 this.namaBarang.add(namaBarang);
 }
 public String getNamaBarang(int idBarang){
 return this.namaBarang.get(idBarang);
 }

 public void setStatus(boolean status ){
 this.status.add(status);
 }
 public boolean getStatus(int idBarang){
 return this.status.get(idBarang);
 }
 public void editStatus(int idBarang, boolean status){
 this.status.set(idBarang, status);;
 }
 public void setHargaAwal(int hargaAwal ){
 this.hargaAwal.add(hargaAwal);
 }
 public int getHargaAwal(int idBarang){
 return this.hargaAwal.get(idBarang);
 }
}
