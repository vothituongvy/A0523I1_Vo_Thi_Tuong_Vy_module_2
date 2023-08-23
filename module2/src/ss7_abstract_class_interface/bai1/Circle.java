package ss7_abstract_class_interface.bai1;
public class Circle implements IResizeable{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public void resize(double percent) {
        radius *= (1 + percent / 100);
    }
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
