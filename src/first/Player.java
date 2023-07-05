package first;

public class Player {
    private int stamina;

    public int getStamina() {
        return stamina;
    }

    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private static int substitutePlayers = 0;

    public Player() {
        stamina = (int) (90 + Math.random() * 11);

        if (countPlayers < 6) {
            countPlayers++;
        } else {
            substitutePlayers++;
        }
    }

    public void run() {
        if ((stamina <= MAX_STAMINA) && (stamina > MIN_STAMINA)) {
            stamina--;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
                substitutePlayers++;
            }
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }

        System.out.println("Текущее количество на поле: " + countPlayers);
        System.out.println("Текущее количество на скамейке: " + substitutePlayers);
    }
}
