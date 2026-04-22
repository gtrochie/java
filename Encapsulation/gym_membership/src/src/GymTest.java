public class GymTest {
    public static void main(String[] args) {
        GymMembership member1 = new GymMembership("Rochie");
        GymMembership member2 = new GymMembership("Steven", "gold");

        System.out.println(member1.getSummary());
        member1.upgradeToGold();
        System.out.println( member2.getSummary());
    }
}
