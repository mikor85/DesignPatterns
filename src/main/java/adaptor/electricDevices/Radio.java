package adaptor.electricDevices;

import adaptor.sockets.*;

public class Radio {

    private int locationCounter;
    private String countryOfOrigin;

    public Radio(String countryOfOrigin, int locationCounter) {
        this.countryOfOrigin = countryOfOrigin;
        this.locationCounter = locationCounter;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public int getLocationCounter() {
        return locationCounter;
    }

    public void turnOn(AfricanSocket africanSocket) {
        africanSocket.getPower();
    }

    public void turnOn(AmericanSocket americanSocket) {
        americanSocket.getPower();
    }

    public void turnOn(AsianSocket asianSocket) {
        asianSocket.getPower();
    }

    public void turnOn(EuroSocket euroSocket) {
        euroSocket.getPower();
    }

    public void turnOn(RussianSocket russianSocket) {
        russianSocket.getPower();
    }
}