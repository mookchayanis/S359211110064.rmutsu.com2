package ooplab8;

public class PersonApp {
    public static void main (String[]arge){
        //create object as student
        Student student = new Student("1111111111111","Boy saiyai","109 M.2 Thungsong",
                "Male","STD0001","Information System");
        System.out.println(student.toString());
        student.setName("Boy saiyong");
        System.out.println(student.toString());



}//main
}//class
