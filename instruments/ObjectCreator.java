package instruments;

import entities.Student;
import entities.Tag;

import java.util.Date;

public class ObjectCreator {

    public Student create(String surname, String firstName, String patronym, Date bday, Tag ... tag) {

        Student student = new Student();
        student.setSurname(surname);
        student.setFirstName(firstName);
        student.setPatronymic(patronym);
        student.setBirthday(bday);
        for (Tag t : tag) {
            student.setTags(t);
            }


        return student;
    }
}
