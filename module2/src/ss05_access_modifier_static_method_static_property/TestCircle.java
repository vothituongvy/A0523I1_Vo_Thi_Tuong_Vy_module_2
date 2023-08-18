package ss05_access_modifier_static_method_static_property;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle(3.0);
        System.out.println("Bán kính hình tròn là :"+circle.getRadius());
        System.out.println("Diện tích hình tròn là :"+circle.getArea());
    }
}
