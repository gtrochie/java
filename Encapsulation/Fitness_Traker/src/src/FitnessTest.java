public class FitnessTest {
    public static void main(String[] args) {
        HealthMonitor first = new HealthMonitor();
        first.addSteps(52);
        first.updateHeartRate(78);
        first.getStatus();
        System.out.println(first.getSummary());
    }
}
