public class Track implements Vehicle{
    @Override
    public void jazd(int speed) {
        System.out.println("Jadę ciężarówką z prędkością");
    }

    @Override
    public void stop() {
        System.out.println("Hamuję ciężarówką");
    }

    @Override
    public String info() {
        return "Ciężarówka";
    }
}
