package structural.adapter;

import structural.adapter.electricDevices.Radio;
import structural.adapter.socketAdaptors.Adaptor;
import structural.adapter.socketAdaptors.EuroAdaptor;
import structural.adapter.sockets.SimpleAfricanSocket;
import structural.adapter.sockets.SimpleAmericanSocket;

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

        return null;

    }


//    private String checkTheCountryOfOrigin(int locationCounter){
//        if (counter >= 0 && counter <= 20) {
//            return new EuroAdaptor();
//        }
//    }
}