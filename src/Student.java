public class Student extends User {

    String name;
    String surname;
    String group;
    double gpa;

    public Student(int id, String login, String password, String name, String surname, String group, double gpa) {
        super(id, login, password);
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.gpa = gpa;
    }

    @Override
    String getUserData() {
        return id + " " + login + " " + password + " " + name + " " + surname + " " + group + " " + gpa;
    }
}
