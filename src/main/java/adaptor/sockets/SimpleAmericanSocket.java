package adaptor.sockets;

public class SimpleAmericanSocket implements AmericanSocket {
    @Override
    public void getPower() {
        System.out.println("Radio adapted to American 110V");
    }
}