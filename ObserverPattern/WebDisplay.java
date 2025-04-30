package ObserverPattern;

class WebDisplay implements Observer{
    @Override
    public void update(float temperature) {
        System.out.println("Web display: Temperature updated to "+temperature+" C");
    }
}
