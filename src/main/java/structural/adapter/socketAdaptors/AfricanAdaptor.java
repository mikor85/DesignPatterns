package structural.adapter.socketAdaptors;

import structural.adapter.sockets.AmericanSocket;
import structural.adapter.sockets.AsianSocket;
import structural.adapter.sockets.EuroSocket;
import structural.adapter.sockets.RussianSocket;

public class AfricanAdaptor extends Adaptor implements EuroSocket {

    AmericanSocket americanSocket;

    AsianSocket asianSocket;

    EuroSocket euroSocket;

    RussianSocket russianSocket;

    public AfricanAdaptor(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    public AfricanAdaptor(AsianSocket asianSocket) {
        this.asianSocket = asianSocket;
    }

    public AfricanAdaptor(EuroSocket euroSocket) {
        this.euroSocket = euroSocket;
    }

    public AfricanAdaptor(RussianSocket russianSocket) {
        this.russianSocket = russianSocket;
    }

    @Override
    public void getPower() {
        americanSocket.getPower();
    }
}