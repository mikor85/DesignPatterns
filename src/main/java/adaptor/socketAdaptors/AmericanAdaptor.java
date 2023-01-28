package adaptor.socketAdaptors;

import adaptor.sockets.*;

public class AmericanAdaptor extends Adaptor implements EuroSocket {

    AfricanSocket africanSocket;

    AsianSocket asianSocket;

    EuroSocket euroSocket;

    RussianSocket russianSocket;

    public AmericanAdaptor(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    public AmericanAdaptor(AsianSocket asianSocket) {
        this.asianSocket = asianSocket;
    }

    public AmericanAdaptor(EuroSocket euroSocket) {
        this.euroSocket = euroSocket;
    }

    public AmericanAdaptor(RussianSocket russianSocket) {
        this.russianSocket = russianSocket;
    }

    @Override
    public void getPower() {
        americanSocket.getPower();
    }
}