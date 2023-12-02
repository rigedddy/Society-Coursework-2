//Question 2
public class SocTeam {
    // object references
    private final SocMember president; // declare these variables as final as they are constant (optimisation)
    private final SocMember secretary;
    private final SocMember treasurer;

    // constructor
    public SocTeam(SocMember president, SocMember secretary, SocMember treasurer) {
        this.president = president;
        this.secretary = secretary;
        this.treasurer = treasurer;
    }

    // getter methods to return the name of a member depending on their role
    // this refers back to SocMember getters to get the names of the soc team
    public String getPresidentName() {
        return president.getName();
    }

    public String getSecretary() {
        return secretary.getName();
    }

    public String getTreasurer() {
        return treasurer.getName();
    }
}
