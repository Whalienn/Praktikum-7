public class MainProgram {
    public static void main(String[] args) {
        Jurusan jurusan = new Jurusan("Teknik Informatika");
        MataKuliah[] mataKuliah = {
          new MataKuliah("Pemograman Berorientasi Objek", 4),
          new MataKuliah("Sistem Basis Data", 3),
          new MataKuliah("Algoritma dan Struktur Data", 3)
        };
        Nilai nilai = new Nilai("Pemograman Berorientasi Objek", 85);
        Mahasiswa mahasiswa = new Mahasiswa("Anita Nofianti", "312110559", jurusan, mataKuliah, nilai);
    
        System.out.println("Nama Mahasiswa : "+mahasiswa.getNama());
        System.out.println("NIM : "+mahasiswa.getNim());
        System.out.println("Jurusan : "+mahasiswa.getJurusan().getNamaJurusan());
        System.out.println("Mata Kuliah : ");
        for (MataKuliah MataKuliah : mahasiswa.getMataKuliah()) {
          System.out.println("- "+MataKuliah.getNamaMataKuliah()+" ("+MataKuliah.getSks()+" SKS)");
        }
        System.out.println("Nilai : "+mahasiswa.getNilai().getMataKuliah()+" : "+mahasiswa.getNilai().getNilai());
      }
    
}
