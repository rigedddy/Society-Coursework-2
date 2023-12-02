//Question 3
import java.util.Random;
public class Main {
    public static void main(String[] args){
        String[] allStudentNames = {"Karina", "Luken", "Winter", "NingNing", "Giselle", "Eunha"};
        int[] allStudentNumbers = {2867,3975,4306,7386,2797,1207};

        // arbitrary (random) number of students generator between 4-6
        Random random =  new Random();
        int low = 4; //inclusive
        int high = 7; //exclusive
        int maxMembers = random.nextInt(high-low) + low;
        // System.out.println(maxMembers); // (testing to see if it only print between 4-6)

        // initializing members array
        SocMember[] members = new SocMember[maxMembers];

        // correctly setting a name and number for each member
        // requires a loop to add the members into the array until all members are added
        for (int i=0; i < maxMembers; i++){
//            String rName = allStudentNames[random.nextInt(allStudentNames.length)]; (this created random members which is not required)
//            int rNumber = allStudentNumbers[random.nextInt(allStudentNumbers.length)];
            String rName = allStudentNames[i];
            int rNumber = allStudentNumbers[i];
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
        //the following line makes sure it sees how long the members array is and chooses the last three names
        SocTeam bame_soc = new SocTeam(members[members.length - 1] ,members[members.length - 2] ,members[members.length - 3]);
        // printing team members of bame society
        System.out.println("\nBame Society Team Members:");
        System.out.println("President: " + bame_soc.getPresidentName());
        System.out.println("Secretary: " + bame_soc.getSecretary());
        System.out.println("Treasurer: " + bame_soc.getTreasurer());

        // success


    }


}

