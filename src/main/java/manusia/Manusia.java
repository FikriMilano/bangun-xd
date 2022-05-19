package manusia;

public class Manusia {
    private String nama;

    public Manusia(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "nama='" + nama + '\'' +
                '}';
    }
}
