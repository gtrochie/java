public class FitnessTracker {
    private int currentStepsToday;
    private int stepGoal;
    private String userName;
    private double totalCaloriesBurned;

    public FitnessTracker(String userName, int currentStepsToday) {
        this.userName = userName;
        this.currentStepsToday = currentStepsToday;
        this.totalCaloriesBurned = 0;
    }

    public void setStepGoal(int goal) {
        if (goal < 1000) {
            System.out.println("Too low! Set a more ambitious goal.");
        } else if (goal > 50000) {
            System.out.println("Too high for a human! Stay safe.");
        } else {
            this.stepGoal = goal;
            System.out.println("Daily goal set to " + goal + " steps.");
        }
    }

    public int getStepGoal() {
        return stepGoal;
    }


    public void logWorkout(int steps) {
        double burned = steps * 0.04;
        this.currentStepsToday += steps;
        this.totalCaloriesBurned += burned;

        System.out.println(userName + " walked " + steps + " steps. Burned: " + burned + " kcal.");


        if (this.stepGoal > 0 && this.currentStepsToday >= this.stepGoal) {
            System.out.println("Congratulations " + userName + "! You reached your daily goal of " + stepGoal + "!");
        }
    }


    public void logWorkout(String type, int minutes) {
        double burned = minutes * 7.0;
        totalCaloriesBurned += burned;
        System.out.println(userName + " did " + type + " for " + minutes + " minutes. Burned: " + burned + " kcal");
    }


    public void logWorkout(String type, int minutes, int intensity) {
        double burned = (minutes * 7.0) * (intensity / 5.0);
        totalCaloriesBurned += burned;
        System.out.println(userName + " did " + type + " for " + minutes + " mins at intensity " + intensity + ". Burned: " + burned + " kcal");
    }

    public double getTotalCalories() {
        return totalCaloriesBurned;
    }
}