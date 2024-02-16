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
    public String toString(){
        StringBuilder groupString = new StringBuilder();
        groupString.append("Group ").append(":\n");
        int i = 1;
        for(Student student: students){
            groupString.append(i).append(" ").append(student.toString()).append("\n");
            i++;
        }
        return groupString.toString();
    }

    public boolean addStudent(Student student) {
        boolean isStudentAdded = false;
        if(!students.contains(student)){
            isStudentAdded = this.students.add(student);
        }
        return isStudentAdded;
    }

    public boolean addStudentAt(int position, Student student) {
        boolean isStudentAdded = false;
        if(!students.contains(student)){
            this.students.add(position, student);
            isStudentAdded = true;
        }
        return isStudentAdded;
    }

    public Student removeStudentByFor(Student tmpStudent) {
        Student studentRemoved = null;
        for (int i=0; i<students.size(); i++) {
            if (students.get(i).equals(tmpStudent)) {
                studentRemoved = students.get(i);
                students.remove(i);
            }
        }
        return studentRemoved;
    }

    public Student removeStudentByForEach(Student tmpStudent) {
        Student studentRemoved = null;
        for (Student student : students) {
            if (students.equals(tmpStudent)) {
                studentRemoved = student;
                students.remove(student);
            }
        }
        return studentRemoved;
    }

    public Student removeStudentByIterator(Student tmpStudent) {
        Student studentRemoved = null;
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.equals(tmpStudent)) {
                studentRemoved = student;
                iterator.remove();
            }
        }
        return studentRemoved;
    }
    
    public void sortStudentsBySurname() {
        Collections.sort(students);
    }

    public void sortStudentsByAge() {
        //students.sort(new Student.AgeComparator());
        Collections.sort(students, new Student.AgeComparator());
    }
}
