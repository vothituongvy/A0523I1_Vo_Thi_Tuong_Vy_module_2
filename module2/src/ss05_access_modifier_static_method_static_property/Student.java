package ss05_access_modifier_static_method_static_property;

public class Student {
    //private chạy chương trình ko được
    //private String name="John";
    //private String classes="C02";
    public String name="John";
    public String classes="C02";
    public Student(){
    }
    public String setName(String name) {
        return name;
    }
    public String setClasses(String classes) {
        return classes;
    }

}
