//T00200043
//This is the Client class that interacts with the Adapter class

public class AdapterTest {

    public static void main(String[] args) {

        SignalInterface newSignal = new HdmiSignal();
        newSignal.SignalOut();

    }

}