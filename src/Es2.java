import Phone.PhoneNumber;
import Phone.Sim;

public class Es2 {
    public static void main(String[] args) {
        PhoneNumber myNumber = new PhoneNumber(331, 9762569);
        Sim mySim = new Sim(myNumber);
        mySim.printSimDetail();
        mySim.setListCall(new PhoneNumber(333, 3452678), 78);
        mySim.printSimDetail();
    }
}
