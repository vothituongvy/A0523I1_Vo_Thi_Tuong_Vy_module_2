package ss7_abstract_class_interface.bai1;

public class Rectangle implements IResizeable{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void resize(double percent) {
        width*= (1 + percent / 100);
        length *= (1 + percent / 100);
    }
    public double getArea() {
        return length*width;
    }
}
