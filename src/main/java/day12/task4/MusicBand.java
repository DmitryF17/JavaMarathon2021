package day12.task4;

import java.util.List;

public class MusicBand {
    String nameband;
    int year;
    List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.nameband = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
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
