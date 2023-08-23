package ss7_abstract_class_interface.bai1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        IResizeable[] shapes = new IResizeable[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(3);

        Random random = new Random();

        for (IResizeable shape : shapes) {
            double percent = random.nextInt(100) + 1;
            double originalArea = shape.getArea();
            shape.resize(percent);
            double newArea = shape.getArea();

            System.out.println("Diện tích ban đầu: " + originalArea);
            System.out.println("Diện tích sau khi tăng kích thước: " + newArea);
        }
    }
}
