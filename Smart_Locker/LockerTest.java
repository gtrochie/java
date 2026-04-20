public class LockerTest {
    public static void main(String[] args) {
        // 1. Create the locker
        smartLocker myLocker = new smartLocker();
        System.out.println("Locker created. Is it open? " + myLocker.isOpen());

        // 2. Try to change PIN while closed (This should fail based on our rules)
        System.out.println("\n--- Attempting PIN change while closed ---");
        myLocker.changePin(1234, 9999);

        // 3. Unlock the locker
        System.out.println("\n--- Unlocking ---");
        myLocker.unlock(1234);
        System.out.println("Is it open now? " + myLocker.isOpen());

        // 4. Change PIN while open (This should succeed)
        System.out.println("\n--- Changing PIN while open ---");
        myLocker.changePin(1234, 9999);

        // 5. Lock it and try the NEW pin
        myLocker.lock();
        System.out.println("\n--- Locker Locked. Testing new PIN ---");
        myLocker.unlock(9999);
    }
}
