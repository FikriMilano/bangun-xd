package manusia;

public class Mahasiswa extends Manusia {

    private static String prodi = "TRPL";
    private String nama;

    public Mahasiswa(String nama) {
        super(nama);
    }

    public static String getProdi() {
        return prodi;
    }

    public static void setProdi(String prodi) {
        Mahasiswa.prodi = prodi;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                "prodi='" + prodi + '\'' +
                '}';
    }
}
