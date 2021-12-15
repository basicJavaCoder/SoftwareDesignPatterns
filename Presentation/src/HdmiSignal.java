//T00200043
//This is the Adapter Class: Adapts the RCASignal into HDMI

public class HdmiSignal extends RCASignal implements SignalInterface {

    @Override //Implements the method stub from the Interface class
    public void SignalOut() {
        RCAOut();
    }

}
