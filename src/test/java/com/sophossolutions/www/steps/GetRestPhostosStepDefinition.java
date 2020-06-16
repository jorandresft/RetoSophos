package com.sophossolutions.www.steps;

import com.sophossolutions.www.tasks.ConsultarPhoto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

public class GetRestPhostosStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Necesito consultar una photo en \"([^\"]*)\"$")
    public void necesitoConsultarUnaPhotoEn(String url) {
        theActorCalled("Jorge").whoCan(CallAnApi.at(url));
    }

    @When("^El id de la photo es (\\d+)$")
    public void elIdDeLaPhotoEs(int id) {
        theActorInTheSpotlight().attemptsTo(ConsultarPhoto.consultPhotoById(String.valueOf(id)));
    }

    @Then("^Valido el album con id (\\d+) y el title sea \"([^\"]*)\"$")
    public void validoElAlbumConIdYElTitleSea(int id, String title) {
        theActorInTheSpotlight().should(
                seeThatResponse(response -> response.body("result.album_id", equalTo(String.valueOf(id))))
        );

        theActorInTheSpotlight().should(
                seeThatResponse(response -> response.body("result.title", equalTo(title)))
        );
    }
}
