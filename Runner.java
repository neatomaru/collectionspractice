import entities.Student;
import entities.Tag;
import instruments.ObjectCreator;

import java.util.*;

public class Runner {


    public static void main(String[] args) {
        ObjectCreator oc = new ObjectCreator();
        Student student1 = oc.create("Ivanov", "Ivan", "Petrovich",
                new Date(1337543179), new Tag("animals", "animals are good"), new Tag("eat", "eat is good"));
        Student student2 = oc.create("Ivanov", "Ivan", "petrovich",
                new Date(1337522129), new Tag("eat", "eat is good"));
        Student student3 = oc.create("Petrov", "Ivan", "Ivanovich",
                new Date(232912717), new Tag("Java", "Java rules the internet"));

        HashSet<Student> students = new HashSet<Student>() {
            {
                add(student1);
                add(student2);
                add(student3);
            }
        };

        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.addAll(students);
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });

        Iterator<Student> it = studentList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            System.out.println();
        }

    }
}
