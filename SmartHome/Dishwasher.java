package Pro.Lesson1.SmartHome;
public class Dishwasher extends Appliance {
    private boolean isCycleComplete; // Состояние завершения текущего цикла мойки

    public Dishwasher(String name) {
        super(name);
        isCycleComplete = true; // Изначально предполагаем, что цикл мойки завершен
    }

    @Override
    public void turnOn() {
        super.turnOn();
        isCycleComplete = false;
    }

    public boolean isCycleComplete() {
        return isCycleComplete;
    }

 }
