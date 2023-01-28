package adaptor.sockets;

public class SimpleEuroSocket implements EuroSocket {
    @Override
    public void getPower() {
        System.out.println("Radio adapted to European 230V");
    }
}