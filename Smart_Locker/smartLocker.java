public class smartLocker {
    private boolean isOpen;
    private int pin;

    public smartLocker(){
        this.isOpen = false;
        this.pin = 1234;

    }
    public void unlock (int enteredpin){
        if (pin == enteredpin){
            isOpen = true;
            System.out.println("the locker is opened");
        }
        else{
            System.out.println("wrong pin");
        }
    }
    public void lock(){
        isOpen = false;
    }
    public void changePin(int oldPin, int newPin) {
        if (this.pin == oldPin) {
            this.pin = newPin;
        }


    }
}

