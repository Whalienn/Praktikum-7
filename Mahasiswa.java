public class Mahasiswa {

    private String nama;
    private String nim;
    private Jurusan jurusan;
    private MataKuliah[] mataKuliah;
    private Nilai nilai;
  
    public Mahasiswa(String nama, String nim, Jurusan jurusan, MataKuliah[] mataKuliah, Nilai nilai){
      this.nama = nama;
      this.nim = nim;
      this.jurusan = jurusan;
      this.mataKuliah = mataKuliah;
      this.nilai = nilai;
    }
  
    public String getNama() {
      return nama;
    }
  
    public void setNama(String nama) {
      this.nama = nama;
    }
  
    public String getNim() {
      return nim;
    }
  
    public void setNim(String nim) {
      this.nim = nim;
    }
  
    public Jurusan getJurusan() {
      return jurusan;
    }
  
    public void setJurusan(Jurusan jurusan) {
      this.jurusan = jurusan;
    }
  
    public MataKuliah[] getMataKuliah() {
      return mataKuliah;
    }
  
    public void setMataKuliah(MataKuliah[] mataKuliah) {
      this.mataKuliah = mataKuliah;
    }
  
    public Nilai getNilai() {
      return nilai;
    }
  
    public void setNilai(Nilai nilai) {
      this.nilai = nilai;
    }
  }
  