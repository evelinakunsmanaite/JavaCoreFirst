public class Main {
    public static void main(String[] args) {
        SystemInformation.getSystemInformation();
        System.out.println("Конечная стоимость топлива " + FillingStation.countPrice());
    }
}
