package Phone;

public class ListCall {
    private final PhoneNumber myNumber;
    private final PhoneNumber otherNumber;
    private final int durationCall;

    public ListCall(PhoneNumber my, PhoneNumber dest, int durationCall){
        this.myNumber = my;
        this.otherNumber = dest;
        this.durationCall = durationCall;
    }

    public void printCall(){
        System.out.println((this.myNumber.getNumber()) + "-->" + (this.otherNumber.getNumber()) + "-" + (this.durationCall / 60) + ":" + (this.durationCall % 60));
    }
}
