package universitas;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa dengan nama sendiri
       Mahasiswa mhs = new Mahasiswa("2110010467", "Muhammad Faisal", "Teknik Informatika");
        
        // Memanggil method getDetail() dan mencetak hasilnya
        String detail = mhs.getDetail();
        System.out.println(detail);
    }
}
