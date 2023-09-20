package ss10_dsa_danh_sach;



public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Vy");
        Student b = new Student(3, "Vo");
        Student c = new Student(2, "Tuong");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newMyList = new MyList<>();
        studentMyList.add(a,0);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.Size();

        for (int i = 0; i < studentMyList.Size(); i++) {
            Student student = (Student) studentMyList.elements[i];
            System.out.println("Ds MSV: " + student.getId());
            System.out.println("Ds tên SV: " + student.getName());
        }

        System.out.println("Ten sinh vien duoc lay tu danh sach: " + studentMyList.get(1).getName());
        System.out.println("Ma sinh vien duoc lay tu danh sach: " + studentMyList.get(2).getId());
        System.out.println("Kiem tra co sinh vien: " + studentMyList.conntains(a));
        newMyList = studentMyList.clone();
        for (int i = 0; i < newMyList.Size(); i++) {
            System.out.println(newMyList.get(0).getName());
        }

        Student student = studentMyList.remove(2);
        System.out.println(student.getName());

    }

}






