public class LockerTest {
    public static void main(String[] args) {
        // Create the locker
        smartLocker myLocker = new smartLocker();
        System.out.println("Locker created. Is it open? " + myLocker.isOpen());

        // Try to change PIN while closed

        myLocker.changePin(1234, 9999);

        //Unlock the locker

        myLocker.unlock(1234);
        System.out.println("Is it open now? " + myLocker.isOpen());

        // Change PIN while open
        myLocker.changePin(1234, 9999);

        //Lock it and try the NEW pin
        myLocker.lock();
        myLocker.unlock(9999);
    }
}
