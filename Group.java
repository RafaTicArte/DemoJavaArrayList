package DemoJavaArrayList;

import java.util.*;

public class Group {
    private String name;
    private List<Student> students;

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    @Override
    public String toString() {
        String studentsString = "";
        for (int i=0; i<students.size(); i++) {
            studentsString += i+1 + ". " + students.get(i).toString() + "\n";
        }
        return "Group" + name + ":\n" + studentsString;
    }

    public boolean addStudent(Student student) {
        boolean studentAdded = false;
        if(!students.contains(student)){
            studentAdded = this.students.add(student);
        }
        return studentAdded;
    }

    public boolean addStudentAt(int position, Student student) {
        boolean studentAdded = false;
        if(!students.contains(student)){
            this.students.add(position, student);
            studentAdded = true;
        }
        return studentAdded;
    }

    public void sortStudentsBySurname() {
        Collections.sort(students);
    }

    public void sortStudentsByAge() {
        students.sort(new Student.AgeComparator());
    }

    public Student removeStudentByFor(String name, String surname) {
        Student studentRemove = null;
        for (int i=0; i<students.size(); i++) {
            if (students.get(i).getName().equals(name) && students.get(i).getSurname().equals(surname)) {
                studentRemove = students.remove(i);
            }
        }
        return studentRemove;
    }

    public Student removeStudentByForEach(String name, String surname) {
        Student studentRemove = null;
        for (Student student : students) {
            if (student.getName().equals(name) && student.getSurname().equals(surname)) {
                students.remove(student);
                studentRemove = student;
            }
        }
        return studentRemove;
    }

    public Student removeStudentByIterator(String name, String surname) {
        Student studentRemove = null;
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equals(name) && student.getSurname().equals(surname)) {
                iterator.remove();
                studentRemove = student;
            }
        }
        return studentRemove;
    }
}
