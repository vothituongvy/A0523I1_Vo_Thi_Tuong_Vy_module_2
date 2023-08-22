package ss6_ke_thua;

public class Cricle {
    private double banKinh;
    private String mauSac;

    public Cricle() {
    }

    public Cricle(double banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public double dienTich() {
        return Math.PI * Math.pow(banKinh, 2);
    }

    @Override
    public String toString() {
        return "Cricle: " +
                "banKinh =" + banKinh +
                ", mauSac =" + mauSac ;
    }
}
