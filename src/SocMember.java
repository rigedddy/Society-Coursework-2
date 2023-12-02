//Question 1
public class SocMember {
    private String name;
    private int number;

    public static int student_counter = 0; //this is a tracker for the amount of members in the society

    //constructor
    public SocMember(String name, int number){
        this.name = name;
        this.number = number;
        student_counter++; // this ensures that the student counter is incremented when a new member is added
    }

    // set and get for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //set and get for member number
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }



}
