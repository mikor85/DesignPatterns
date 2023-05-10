package structural.adapter.sockets;

public class SimpleAsianSocket implements AsianSocket {
    @Override
    public void getPower() {
        System.out.println("Radio adapted to Asian 220V");
    }
}