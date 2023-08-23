package ss7_abstract_class_interface.bai1;

public class Square implements IResizeable {
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    public void resize(double percent) {
        edge *= (1 + percent / 100);
    }

    public double getArea() {
        return Math.pow(edge, 2);
    }
}
