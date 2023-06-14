package universitas;

public class Mahasiswa {
    private String npm;
    private String nama;
    private String prodi;

    public Mahasiswa(String npm, String nama, String prodi) {
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Getter dan setter (opsional)
    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getDetail() {
        return "NPM: " + npm + "\nNama: " + nama + "\nProdi: " + prodi;
    }
    
}
