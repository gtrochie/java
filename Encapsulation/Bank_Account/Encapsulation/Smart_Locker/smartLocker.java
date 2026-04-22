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
        if (isOpen && this.pin == oldPin) {
            this.pin = newPin;
        } else if (!isOpen) {
            System.out.println("Locker must be OPEN to change the PIN.");
        } else {
            System.out.println("Old PIN is incorrect.");
        }
    }
    public boolean isOpen() {
            return isOpen;
        }

}

