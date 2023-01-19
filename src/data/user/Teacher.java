package data.user;

public class Teacher extends User {

    private String faculty;
    public Teacher(String name, int age, int passport, String faculty) {
        super();
        this.faculty = faculty;
    }

    @Override
    public void write(String path) {

    }

    @Override
    public void read(String path) {

    }

    @Override
    public int compareTo(User o) {
        return 0;
    }


}
