package ObserverPattern;

class MobileDisplay implements Observer{
    @Override
    public void update(float temperature) {
        System.out.println("Mobile display: Temperature updated to "+temperature+" C");
    }
}
