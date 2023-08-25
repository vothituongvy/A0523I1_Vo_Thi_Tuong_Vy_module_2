package ss7_abstract_class_interface.bai2;

import ss7_abstract_class_interface.bai1.IResizeable;
import ss7_abstract_class_interface.bai1.Square;

public class Test {
    public static void main(String[] args) {
        Shape [] shapes={new Squares(3),new Squares(4) ,new Squares(5)};
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Square "+ (i+1));
            System.out.println("Area "+shapes[i].getArea());
            System.out.println("How to color: "+((Squares)shapes[i]).howToColor());
        }
    }
}
