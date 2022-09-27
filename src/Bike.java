public class Bike implements Vehicle {

    @Override
    public void jazd(int speed) {
        System.out.println("Jadę rowerem z prędkością");
    }

    @Override
    public void stop() {
        System.out.println("Hamuję rowerem!");
    }

    @Override
    public String info() {
        return "Rower";
    }

    public void zatankuj() {
        System.out.println("Aby mieć siłę muszę zjeść");
    }
}
