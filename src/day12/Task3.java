package day12;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void getMusicBands() {
        List<MusicBand> bands = new ArrayList<>();

        MusicBand musicBand1 = new MusicBand("BTS", 2013);
        MusicBand musicBand2 = new MusicBand("Imagine Dragons", 2008);
        MusicBand musicBand3 = new MusicBand("The Vamps", 2012);
        MusicBand musicBand4 = new MusicBand("Ed Sheeran", 2011);
        MusicBand musicBand5 = new MusicBand("The Pretty Reckless", 2010);
        MusicBand musicBand6 = new MusicBand("Eminem", 1992);
        MusicBand musicBand7 = new MusicBand("Queen", 1970);
        MusicBand musicBand8 = new MusicBand("AC/DC", 1973);
        MusicBand musicBand9 = new MusicBand("Nirvana", 1987);
        MusicBand musicBand10 = new MusicBand("Etta James", 1954);

        bands.add(musicBand1);
        bands.add(musicBand2);
        bands.add(musicBand3);
        bands.add(musicBand4);
        bands.add(musicBand5);
        bands.add(musicBand6);
        bands.add(musicBand7);
        bands.add(musicBand8);
        bands.add(musicBand9);
        bands.add(musicBand10);

        System.out.println("Список всех музыкальных групп:\n");
        for (MusicBand musicBand : bands) {
            System.out.println(musicBand);
        }

        System.out.println("Список музыкальных групп после 2000:\n");
        System.out.println(groupsAfter2000(bands));
    }

    private static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsListAfter2000 = new ArrayList<>();
        for (MusicBand musicBand : bands) {
            if (musicBand.getYear() > 2000) {
                groupsListAfter2000.add(musicBand);
            }
        }
        return groupsListAfter2000;
    }
}
