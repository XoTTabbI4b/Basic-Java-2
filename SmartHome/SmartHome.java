package Pro.Lesson1.SmartHome;
import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome();

        // Создание и добавление устройств
        Light light = new Light("Свет");
        Television television = new Television("Телевизор");
        Dishwasher dishwasher = new Dishwasher("Посудомоечная машина");

        smartHome.addAppliance(light);
        smartHome.addAppliance(television);
        smartHome.addAppliance(dishwasher);

        // Симуляция ухода из дома
        System.out.println("Уход из дома:");
        smartHome.simulateLeavingHome();

        // Симуляция возвращения домой
        System.out.println("Возвращение домой:");
        smartHome.simulateReturningHome();

        // Установка состояния посудомоечной машины
        smartHome.setDishesInsideDishwasher(true);

        // Симуляция завершения цикла мойки посуды
        System.out.println("Цикл мойки посуды завершен:");
        smartHome.simulateDishwasherCycleComplete();
    }

    private boolean presence; // Признак присутствия человека в доме
    private boolean alarmSystem; // Состояние сигнализации
    private boolean light; // Состояние света
    private boolean television; // Состояние телевизора
    private boolean dishwasher; // Состояние посудомоечной машины
    private boolean dishesInsideDishwasher; // Наличие посуды в посудомоечной машине

    private List<Appliance> appliances; // Список бытовой техники в доме

    public SmartHome() {
        presence = false;
        alarmSystem = false;
        light = false;
        television = false;
        dishwasher = false;
        dishesInsideDishwasher = false;
        appliances = new ArrayList<>();
    }

    public void addAppliance(Appliance appliance) {
        if (appliances.size() < 10) {
            appliances.add(appliance);
        } else {
            System.out.println("Превышено максимальное количество предметов бытовой техники.");
        }
    }

    public void removeAppliance(Appliance appliance) {
        appliances.remove(appliance);
    }

    public void setPresence(boolean presence) {
        this.presence = presence;
    }

    public void simulateLeavingHome() {
        setPresence(false);
        turnOnAlarmSystem();
        turnOffLight();
        turnOffTelevision();

        if (dishesInsideDishwasher) {
            startDishwasher();
        }
    }

    public void simulateReturningHome() {
        setPresence(true);
        turnOffAlarmSystem();
        turnOnLight();
        turnOnTelevision();
    }

    public void simulateDishwasherCycleComplete() {
        dishesInsideDishwasher = false;
        turnOffDishwasher();
    }

    private void turnOnAlarmSystem() {
        alarmSystem = true;
        System.out.println("Сигнализация включена");
    }

    private void turnOffAlarmSystem() {
        alarmSystem = false;
        System.out.println("Сигнализация выключена");
    }

    private void turnOnLight() {
        light = true;
        System.out.println("Свет включен");
    }

    private void turnOffLight() {
        light = false;
        System.out.println("Свет выключен");
    }

    private void turnOnTelevision() {
        television = true;
        System.out.println("Телевизор включен");
    }

    private void turnOffTelevision() {
        television = false;
        System.out.println("Телевизор выключен");
    }

    private void startDishwasher() {
        dishwasher = true;
        System.out.println("Посудомоечная машина включена");
    }

    private void turnOffDishwasher() {
        dishwasher = false;
        System.out.println("Посудомоечная машина выключена");
    }

    public void setDishesInsideDishwasher(boolean dishesInsideDishwasher) {
        this.dishesInsideDishwasher = dishesInsideDishwasher;
    }
}
