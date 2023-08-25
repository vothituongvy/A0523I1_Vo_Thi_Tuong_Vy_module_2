package ss7_abstract_class_interface.bai2;

public class Squares extends Shape implements IColorable {
    private double edge = 1.0;
    public Squares() {
    }
    public Squares(double edge) {
        this.edge = edge;
    }


    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return edge*edge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge+
                '}';
    }
    public String howToColor(){
        return "Color all four sides";
    }
}
