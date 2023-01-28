package adaptor;

import adaptor.electricDevices.Radio;
import adaptor.socketAdaptors.Adaptor;
import adaptor.socketAdaptors.AfricanAdaptor;
import adaptor.socketAdaptors.EuroAdaptor;
import adaptor.sockets.SimpleAfricanSocket;
import adaptor.sockets.SimpleAmericanSocket;

public class Main {
    public static void main(String[] args) {
        SimpleAmericanSocket simpleAmericanSocket
                = new SimpleAmericanSocket();
        //Adaptor adaptor = new Adaptor(simpleAmericanSocket);


        //  0 - 20   - Africa
        // 21 - 40   - America
        // 41 - 60   - Asia
        // 61 - 80   - Europe
        // 81 - 100  - Russia
        Radio radio = new Radio("Africa", 21);
        //radio.turnOn(adaptor);
    }

    private Adaptor getAdapterByLocation(Radio radio) {
        String countryOfOrigin = radio.getCountryOfOrigin();
        int counter = radio.getLocationCounter();

        switch (countryOfOrigin) {
            case "Africa":
                SimpleAfricanSocket simpleAfricanSocket = new SimpleAfricanSocket();
                if (counter >= 0 && counter <= 20) {
                    return new EuroAdaptor(simpleAfricanSocket);
                }
                if (counter > 20 && counter <= 40) {
                    return new EuroAdaptor(simpleAfricanSocket);
                }
        }


    }


//    private String checkTheCountryOfOrigin(int locationCounter){
//        if (counter >= 0 && counter <= 20) {
//            return new EuroAdaptor();
//        }
//    }
}