package Task5D12;

public class MusicArtist {
    private String name;
    private int age;

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
