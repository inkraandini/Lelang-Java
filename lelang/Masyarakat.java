package lelang;
import java.util.ArrayList;
public class Masyarakat implements User{

 private ArrayList<String> namaMasyarakat = new ArrayList<String>();
 private ArrayList<String> alamat = new ArrayList<String>();
 private ArrayList<String> telepon = new ArrayList<String>();

 public Masyarakat() {
 this.namaMasyarakat.add("Inkra");
 this.alamat.add("sawojajar");
 this.telepon.add("08123456666");

 this.namaMasyarakat.add("Iinn");
 this.alamat.add("bululawang");
 this.telepon.add("081222233344");
 }
 
 @Override
 public void setNama(String namaMasyarakat ){
 this.namaMasyarakat.add(namaMasyarakat);
 }

 @Override
 public void setAlamat(String alamat ){
 this.alamat.add(alamat);
 }
 @Override
 public void setTelepon(String telepon ){
 this.telepon.add(telepon);
 }
 
 public int getJmlMasyarakat(){
 return this.namaMasyarakat.size();
 } 

 @Override
 public String getNama(int idMasyarakat){
 return this.namaMasyarakat.get(idMasyarakat);
 }

 @Override
 public String getAlamat(int idMasyarakat){
 return this.alamat.get(idMasyarakat);
 }

 @Override
 public String getTelepon(int idMasyarakat){
 return this.telepon.get(idMasyarakat);
 } 
}

