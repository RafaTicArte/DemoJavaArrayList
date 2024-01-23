package DemoJavaArrayList;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private int age;

    public Student() {
        this.name = "";
        this.surname = "";
        this.age = 0;
    }

    public Student(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return surname+", "+name+" ("+age+")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else {
            Student student = (Student) obj;
            return Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
        }
    }

    @Override
    public int compareTo(Student student) {
        return this.surname.compareTo(student.surname);
    }

    public static class AgeComparator implements java.util.Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getAge() - student2.getAge();
        }
    }
}
