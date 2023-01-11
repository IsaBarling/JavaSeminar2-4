package data;

public abstract class Student extends User //implements Comparable<Student>
{
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
        super(name, age, passport);
        this.groupNumber = groupNumber;
    }
    public int compareTo(Student st)
    {  
        if(this.checkedAge==st.getCheckedAge())  
            return 0;  
        else if(this.checkedAge>st.getCheckedAge())  
            return 1;  
        else  
            return -1;  
    }     


}

