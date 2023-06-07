public class SystemInformation {

    public static void getSystemInformation(){
        System.out.println("Информация о системе: ");
        System.out.print("ОС: ");
        System.out.println(System.getProperty("os.name") + " " + System.getProperty("os.version"));
        System.out.print("Количество ядер процессора: ");
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.print("Количество памяти, доступной JVM: ");
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024 + "Mb");
        System.out.println("");
    }
}
