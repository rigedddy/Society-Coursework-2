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
            SocMember addedMember = new SocMember(rName,rNumber);

            members[i] = addedMember;

        }

        // creating women society
        SocTeam women_soc = new SocTeam(members[0],members[1],members[2]);
        // print team members of women society
        System.out.println("Women Society Team Members:");
        System.out.println("President: " + women_soc.getPresidentName());
        System.out.println("Secretary: " + women_soc.getSecretary());
        System.out.println("Treasurer: " + women_soc.getTreasurer());

        // creating bame society
        SocTeam bame_soc = new SocTeam(members[randomMembers - 1],members[randomMembers - 2],members[randomMembers - 3]);
        // printing team members of bame society
        System.out.println("\nBame Society Team Members:");
        System.out.println("President: " + bame_soc.getPresidentName());
        System.out.println("Secretary: " + bame_soc.getSecretary());
        System.out.println("Treasurer: " + bame_soc.getTreasurer());

    }
}

