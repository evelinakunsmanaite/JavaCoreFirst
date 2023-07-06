package Task5D12;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    static MusicArtist MusicArtist1 = new MusicArtist("Jin", 31);
    static MusicArtist MusicArtist2 = new MusicArtist("Suga", 30);
    static MusicArtist MusicArtist3 = new MusicArtist("J-Hope", 29);
    static MusicArtist MusicArtist4 = new MusicArtist("RM", 28);
    static MusicArtist MusicArtist5 = new MusicArtist("Jimin", 27);
    static MusicArtist MusicArtist6 = new MusicArtist("V", 27);
    static MusicArtist MusicArtist7 = new MusicArtist("JK", 25);
    static MusicArtist MusicArtist8 = new MusicArtist("Jilly", 20);
    static MusicArtist MusicArtist9 = new MusicArtist("Angus Young", 68);
    static MusicArtist MusicArtist10 = new MusicArtist("Bon Scott", 77);
    static MusicArtist MusicArtist11 = new MusicArtist("Brian Johnson", 75);
    static MusicArtist MusicArtist12 = new MusicArtist("Malcolm Young", 70);
    static MusicArtist MusicArtist13 = new MusicArtist("Phil Rudd", 69);
    static MusicArtist MusicArtist14 = new MusicArtist("Dave Evans", 69);


    static MusicBand musicBandFirst = new MusicBand("BTS", 2013,
            new ArrayList<>(List.of(MusicArtist1, MusicArtist2, MusicArtist3, MusicArtist4, MusicArtist5, MusicArtist6)));
    static MusicBand musicBandSecond = new MusicBand("AC/DC", 1973,
            new ArrayList<>(List.of(MusicArtist9, MusicArtist10, MusicArtist11, MusicArtist12, MusicArtist13, MusicArtist14)));

    public static void band() {
        musicBandFirst.addMember(MusicArtist7);
        musicBandFirst.addMember(MusicArtist8);
        System.out.println("\nСостав группы: \n");
        musicBandFirst.printMembers();
        musicBandFirst.deleteMember(MusicArtist8);
        System.out.println("\nСостав группы после изменения состава: \n");
        musicBandFirst.printMembers();
        System.out.println("\nСостав группы: \n");
        musicBandSecond.printMembers();
        MusicBand.transferMembers(musicBandFirst, musicBandSecond);

    }
}
