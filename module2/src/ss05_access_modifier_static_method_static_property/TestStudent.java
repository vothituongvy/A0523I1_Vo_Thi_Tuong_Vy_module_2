package ss05_access_modifier_static_method_static_property;

import org.w3c.dom.ls.LSOutput;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Tên là : "+student.name);
        System.out.println("Tên là : "+student.classes);
        System.out.println("Tên là : "+ student.setName("Vy"));
        System.out.println("Lớp là : "+ student.setClasses("A05"));
    }
}
