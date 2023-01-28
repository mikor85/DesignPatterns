package adaptor.sockets;

public class SimpleRussianSocket implements RussianSocket {
    @Override
    public void getPower() {
        System.out.println("Radio adapted to Russian 230V");
    }
}