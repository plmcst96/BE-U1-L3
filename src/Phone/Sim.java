package Phone;

public class Sim {
    private final PhoneNumber number;
    private ListCall[] callList;
    private double credit;

    public Sim(PhoneNumber number){
        this.number = number;
        this.callList = new ListCall[5];
        this.credit = 0.0;
    }

    public void setListCall(PhoneNumber num, int durationCall){
        ListCall lastCall = new ListCall(this.number, num, durationCall);
        ListCall[] newCall = new  ListCall[callList.length];

        for (int i = 0; i <  callList.length; i++){
            if (i == 0) newCall[i] = lastCall;
            else newCall[i]= this.callList[i - 1];
        }
        this.callList = newCall;
        credit -= 0.20;
    }

    public  void printSimDetail(){
        System.out.println("Numero: " + this.number.getNumber());
        System.out.println("Credito: " + this.credit);
        System.out.println("Ultime chiamate: ");
        for (ListCall call : callList){
            if (call != null) call.printCall();
        }
    }
}
