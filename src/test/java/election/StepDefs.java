package election;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefs {

    private AllParty all;
    private int totalVote = 0;
    private int member = 0;

    @Before
    public void setup() {
        all = new AllParty();
    }

    @Given("party with name (.+) and vote counting (\\d+) with number of members (\\d+) exist")
    public void party_with_name_and_vote_counting_with_number_of_members_exist(String name, int voteCounting, int numberMember){
        all.addParty(new Party(name, voteCounting, numberMember));
    }

    @When("count all vote")
    public void count_all_vote() {
        totalVote = all.getTotalCount();
    }


    @Then("total vote for all party should be (\\d+)")
    public void total_party_list_of_party_should_be(int total) {
        assertEquals(totalVote, total);
    }

    @When("calculate member party (.+)")
    public void calculate_member(String name){
        for(Party p: all.getList()){
            if (p.getName().equals(name)){
                member = all.calculateMember(p);
            }
        }
    }

    @Then("total number for party should be (\\d+)")
    public void total_number_for_party(int expected){
        assertEquals(member, expected);
    }

    @When("calculate party-list member (.+)")
    public void calculate_party_list_member(String name) {
        for(Party p: all.getList()){
            if (p.getName().equals(name)){
                member = all.calculateMember(p);
            }
        }
    }

//    @Then("party-list member for party should be (\\d+)")

}
