package data.user;

public class Student extends User implements Comparable<Student> {
    private int groupNumber;
    int checkedAge;

    public int getGroupNumber() {

        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {

        this.groupNumber = groupNumber;
    }

    public int getCheckedAge() {

        return checkedAge;
    }

    public void setCheckedAge(int checkedAge) {

        this.checkedAge = checkedAge;
    }

    public Student(String name, int age, int passport, int groupNumber) {
        super();
        this.groupNumber = groupNumber;
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

    @Override
    public int compareTo(Student st) {
        if(this.checkedAge==st.getCheckedAge())
            return 0;
        else if(this.checkedAge>st.getCheckedAge())
            return 1;
        else
            return -1;
    }
}

