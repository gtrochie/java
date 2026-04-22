public class GymMembership {
    private String memberName;
    private String planType;
    private int monthlyFee;

    public GymMembership(String memberName){
        this.memberName = memberName;
        this.planType = "Basic";

    }
    public  GymMembership (String memberName, String requestedPlan){
        this.memberName = memberName;
        if (requestedPlan.equalsIgnoreCase("Gold")){
            this.planType = "Gold";
            this.monthlyFee = 500;
        }
        else {
            this.planType = "Basic";
            this.monthlyFee = 200;
            System.out.println(memberName + " has upgraded to Gold");
        }
    }
    public String getSummary(){
        // "Member: [Name] | Plan: [Plan] | Fee: R[Amount]"
        return "Member " + memberName +  " | Plan: " + planType + " | Fee: R" + monthlyFee;
    }
    public void upgradeToGold(){
        this.planType = "Gold";
        this.monthlyFee = 500;
    }
}
