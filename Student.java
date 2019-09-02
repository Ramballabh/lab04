package person;

public class Student extends Person{

    private long uniRollNumber;
    private String  courseName;
    public Student(String name, int age, char gender,long uniRollNumber,String courseName) {
        super(name, age, gender);
        this.uniRollNumber=uniRollNumber;
        this.courseName=courseName;
    }
    public long getUniRollNumber(){
        return uniRollNumber;
    }
    public String getCourseName(){
        return courseName;
    }
    @Override
    public String toString() {
        super.toString();
        StringBuilder result=new StringBuilder();
        result.append("Hello,my name is "+ getName() + ".");
        if(getGender()=='M'){
            result.append("I am a man and I am "+getAge()+" years old");
        }
        else{
            result.append("I am a woman and I am "+getAge()+" years old");
        }
        result.append("my university rollnumber is "+getUniRollNumber()+"my course Name is  "+getCourseName());
        return result.toString();

    }
}
