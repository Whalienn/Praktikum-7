public class Nilai {
    private String mataKuliah;
    private int nilai;
  
    public Nilai(String mataKuliah, int nilai){
      this.mataKuliah = mataKuliah;
      this.nilai = nilai;
    }
  
    public String getMataKuliah() {
      return mataKuliah;
    }
  
    public void setMataKuliah(String mataKuliah) {
      this.mataKuliah = mataKuliah;
    }
  
    public int getNilai() {
      return nilai;
    }

    public void setNilai(int nilai) {
    this.nilai = nilai;
    }
    
}
