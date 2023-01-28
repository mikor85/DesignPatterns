package adaptor.sockets;

public class SimpleAfricanSocket implements AfricanSocket {
    @Override
    public void getPower() {
        System.out.println("Radio adapted to African 220V");
    }
}