package election;

import java.util.ArrayList;
import java.util.List;

public class Party {

    private String name;
    private int voteCounting;
    private int numberMember;

    public Party(String name, int voteCounting, int numberMember) {
        this.name = name;
        this.voteCounting = voteCounting;
        this.numberMember = numberMember;
    }

    public String getName() { return name; }

    public int getVote() {
        return voteCounting;
    }

    public int getNumberMember() { return numberMember; }

}
