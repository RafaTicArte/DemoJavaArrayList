package DemoJavaArrayList;

public class Main {
    public static void main(String[] args) {
        Group DAM1 = new Group("DAM1");

        System.out.println("Adding students to the group...");
        DAM1.addStudent(new Student("María", "Segovia Madrid", 22));
        DAM1.addStudent(new Student("Juan", "Pérez Pérez", 19));
        DAM1.addStudent(new Student("Juan", "Pérez Pérez", 21));
        DAM1.addStudent(new Student("Fran", "Rodas Martín", 24));
        DAM1.addStudent(new Student("Sandra", "Alba Ruz", 30));
        System.out.println(DAM1);

        System.out.println("Adding a student at a specific position 1...");
        DAM1.addStudentAt(1, new Student("Luis", "Jaén Murcia", 29));
        System.out.println(DAM1);

        System.out.println("Printing the group sorted by surname...");
        DAM1.sortStudentsBySurname();
        System.out.println(DAM1);

        System.out.println("Printing the group sorted by age...");
        DAM1.sortStudentsByAge();
        System.out.println(DAM1);

        System.out.println("Removing student by For...");
        DAM1.removeStudentByFor("María", "Segovia Madrid");
        System.out.println(DAM1);

        /*
        // Exception in thread "main" java.util.ConcurrentModificationException
        System.out.println("Removing student by ForEach...");
        DAM1.removeStudentByForEach("Juan", "Pérez Pérez");
        System.out.println(DAM1);
        */

        System.out.println("Removing student by Iterator...");
        DAM1.removeStudentByIterator("Fran", "Rodas Martín");
        System.out.println(DAM1);
    }
}
