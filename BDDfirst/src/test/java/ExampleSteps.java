import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class ExampleSteps {

    private CreateStack myStack;
    private Object popped;
    private Object pushed;


    @Given("^I am officiating a FizzBuzz game$")
    public void i_am_officiating_a_FizzBuzz_game(){
        myStack = new CreateStack();

    }

    @When("^the number one is played$")
    public void the_number_is_played() {
//        Object out = myStack.pop();
//        popped = out;
        pushed = new Object();
        myStack.push(pushed);


    }

    @Then("^I should be told the correct answer is one$")
    public void i_should_be_told_the_correct_answer_is() {
        assertEquals(1,myStack.size());
    }
}
