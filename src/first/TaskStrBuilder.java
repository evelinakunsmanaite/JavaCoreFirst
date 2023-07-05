package first;

public class TaskStrBuilder {
    public static void getStr() {
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 1; i <= 20000; i++) {
            str += i + " ";
        }
        System.out.println(str);
        long end = System.currentTimeMillis() - start;
        System.out.println("Время работы без StringBuilder: " + end);

        long start1 = System.currentTimeMillis();
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 1; i <= 20000; i++) {
            strBuilder.append(i).append(" ");
        }

        System.out.println(strBuilder);
        long end1 = System.currentTimeMillis() - start1;
        System.out.println("Время работы c StringBuilder: " + end1);
    }
}
