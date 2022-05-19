package bangun3d;

import bangun2d.Persegi;

public class Kubus extends Persegi {

    public Kubus(double sisi) {
        super(sisi);
    }

    @Override
    public double getLuas() {
        return 6 * super.getLuas();
    }

    @Override
    public double getKeliling() {
        return 12 * getLuas();
    }

    public double getLuasAlas() {
        return super.getLuas();
    }

    public double getVolume() {
        return super.getLuas() * getSisi();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
