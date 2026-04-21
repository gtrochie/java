public class HealthMonitor {
    private int steps;
    private int heartRate;
    private boolean isExercising;

    public HealthMonitor(){
        this.steps = 0;
        this.heartRate = 0;
        this.isExercising = false;

    }
    public void addSteps (int newsteps){
        if (newsteps < 0){
            System.out.println("you cannot have negative steps");
        }
        else {
            steps += newsteps;
        }
    }
    public void updateHeartRate(int currentHR){
        this.heartRate = currentHR;
        if (this.heartRate > 180){
            this.isExercising = false;
            System.out.println("DANGER: Slow down!");
        }
        else if (heartRate > 100){
            this.isExercising = true;

        }
        else {
            this.isExercising = false;
        }
    }

    public String getStatus(){
        if (heartRate < 100){
          this.steps = 0;
          return "Resting";
        }
        else if(heartRate > 180){
            return "DANGER!!,slow down";
        }
        else {
            return "exercising";
        }
    }
    public void resetDailyStats(){
        if (heartRate < 100){
            this.steps = 0;

        }
    }

    public  String getSummary(){
        return "Steps: " + steps + " | HR: " + heartRate + " | Status: " + getStatus();
    }


}
