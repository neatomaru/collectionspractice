package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String surname;
    private String firstName;
    private String patronymic;
    private Date birthday;


    public Student() {

    }

    List<Tag> list = new ArrayList<Tag>() {

        @Override
        public int hashCode() {
            int hash = 1;

            Iterator<Tag> it = this.iterator();

            while (it.hasNext()) {
                hash += it.next().hashCode();
            }
            return hash;
        }

        @Override
        public boolean equals(Object object) {
            if(this == object) {
                return true;
            } else if(object instanceof List) {
                return this.containsAll((List) object) && this.size() == ((List) object).size();
            } else {
                return false;
            }
        }


    };

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public List<Tag> getTags() {
        return list;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setTags(Tag tag) {
        this.list.add(tag);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass() ) {


            Student student = (Student) obj;



            if (this.surname.equals(student.surname) && this.firstName.equals(student.firstName)
                    && this.patronymic.equals(student.patronymic)
                    && this.birthday.equals(student.birthday) && this.list.equals(student.list) || student == this) {
                return true;
            }
        }
            return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((surname == null) ? 0 : surname.hashCode()) +
                ((firstName == null) ? 0 : firstName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Фио: " + surname + " " + firstName + " " + patronymic + "\nBirthday: " + birthday + "\nTags:" + list;
    }


}
