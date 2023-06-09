package Task5D12;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> musicBandMembers;

    public MusicBand(String name, int year, List<MusicArtist> musicBandMembers) {
        this.name = name;
        this.year = year;
        this.musicBandMembers = musicBandMembers;
    }

    public List<MusicArtist> getMusicBandMembers() {
        return musicBandMembers;
    }

    public void addMember(MusicArtist memberName) {
        musicBandMembers.add(memberName);
    }

    public String getName() {
        return name;
    }

    public void deleteMember(MusicArtist memberName) {
        musicBandMembers.remove(memberName);
    }

    public void printMembers() {
        for (MusicArtist member : musicBandMembers) {
            System.out.println(member);
        }
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        musicBand2.getMusicBandMembers().addAll(musicBand1.getMusicBandMembers());
        musicBand1.getMusicBandMembers().clear();
        System.out.println("Произошло слияние группы " + musicBand1.getName() + " в группу " + musicBand2.getName());
        System.out.println("\nСостав группы после слияния: \n");
        musicBand2.printMembers();
    }
}
