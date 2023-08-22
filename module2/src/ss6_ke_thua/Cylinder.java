package ss6_ke_thua;

public class Cylinder extends Cricle {
    private double chieuCao;

    public Cylinder() {
    }

    public Cylinder(double banKinh, String mauSac, double chieuCao) {
        super(banKinh, mauSac);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    public double theTich(){
        return dienTich()*chieuCao;
    }

    @Override
    public String toString() {
        return "Cylinder:" +
                "banKinh ="+super.getBanKinh()+
                ",mauSac ="+super.getMauSac()+
                ",chieuCao =" + chieuCao;
    }
}
