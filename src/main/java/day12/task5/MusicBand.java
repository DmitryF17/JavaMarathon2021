package day12.task5;

import java.util.List;

public class MusicBand {
    String nameband;
    int year;
    List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.nameband = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand bandfirst, MusicBand bandsecond) {
        bandsecond.members.addAll(bandfirst.members);
        bandfirst.members.clear();
    }

    @Override
    public String toString() {
        return nameband + " " + year;
    }

    public void printMembers() {
        System.out.println(members);
    }
}
