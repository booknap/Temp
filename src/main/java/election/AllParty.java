package election;

import java.util.ArrayList;
import java.util.List;

public class AllParty {

    private int totalCount;
    private List<Party> list = new ArrayList<>();

    public AllParty(){
        this.totalCount = 0;
    }

    public void addParty(Party party) {
        list.add(party);
        totalCount += party.getVote();
    }

    public int calculateMember(Party party) {
        return party.getVote()/(totalCount/500);
    }

    public int calculatePartyList(Party party) {
        if(calculateMember(party) - party.getNumberMember() > 0)
            return calculateMember(party) - party.getNumberMember() ;
        else return 0;
    }

    public List<Party> getList() { return this.list; }

    public int getTotalCount() { return this.totalCount; }

}
