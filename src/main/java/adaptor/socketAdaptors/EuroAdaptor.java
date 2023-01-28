package adaptor.socketAdaptors;

import adaptor.sockets.*;

public class EuroAdaptor extends Adaptor implements EuroSocket {

    AfricanSocket africanSocket;

    AmericanSocket americanSocket;

    AsianSocket asianSocket;

    RussianSocket russianSocket;

    public EuroAdaptor(AfricanSocket africanSocket) {
        this.africanSocket = africanSocket;
    }

    public EuroAdaptor(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    public EuroAdaptor(AsianSocket asianSocket) {
        this.asianSocket = asianSocket;
    }

    public EuroAdaptor(RussianSocket russianSocket) {
        this.russianSocket = russianSocket;
    }

    @Override
    public void getPower() {
        americanSocket.getPower();
    }
}