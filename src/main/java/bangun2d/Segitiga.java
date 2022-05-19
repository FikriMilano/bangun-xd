package bangun2d;

public abstract class Segitiga extends Bangun2D {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double getLuas() {
        return alas * tinggi / 2;
    }

    @Override
    public abstract double getKeliling();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "alas=" + alas +
                ", tinggi=" + tinggi +
                '}';
    }
}
