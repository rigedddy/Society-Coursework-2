//Question 3
import java.util.Random;
public class Main {
    public static void main(String[] args){
        String[] allStudentNames = {"Karina", "Luken", "Ruhan", "Mia", "Priya", "Mike"};
        int[] allStudentNumbers = {2867,3975,4306,7386,2797,1207};

        // arbitrary (random) number of students generator between 4-6
        Random random =  new Random();
        int low = 4; //inclusive
        int high = 7; //exclusive
        int randomMembers = random.nextInt(high-low) + low;
        //System.out.println(randomMembers); // (testing to see if it only print between 4-6)

        // initializing members array
        SocMember[] members = new SocMember[randomMembers];

        // correctly setting a name and number for each member
        // requires a loop to add the members into the array until all members are added
        for (int i=0; i < randomMembers; i++){
            String rName = allStudentNames[random.nextInt(allStudentNames.length)];
            int rNumber = allStudentNumbers[random.nextInt(allStudentNumbers.length)];

            SocMember member = new SocMember(rName,rNumber);

            members[i] = member;
        }
    }
}