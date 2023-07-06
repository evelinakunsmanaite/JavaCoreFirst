package Task3D12;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    static MusicBand musicBand1 = new MusicBand("BTS", 2013, new ArrayList<>(List.of("Jin", "Suga", "J-Hope", "RM", "Jimin", "V")));
    static MusicBand musicBand2 = new MusicBand("AC/DC", 1973, new ArrayList<>(List.of("Angus Young", "Bon Scott", "Brian Johnson", "Malcolm Young", "Phil Rudd", "Dave Evans")));

    public static void band() {
        musicBand1.addMember("JK");
        musicBand1.addMember("Jily");
        System.out.println("\nСостав группы: \n");
        musicBand1.printMembers();
        musicBand1.deleteMember("Jily");
        System.out.println("\nСостав группы после изменения состава: \n");
        musicBand1.printMembers();
        System.out.println("\nСостав группы: \n");
        musicBand2.printMembers();
        MusicBand.transferMembers(musicBand1, musicBand2);

    }
}
