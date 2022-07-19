package starter.FacilityCreate;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST {
    protected String url = "https://go-hospital-server.herokuapp.com/";

    @Step("I success create facility")
    public String successCreateFacility() {

        return url + "api/facility";
    }

    @Step("I request POST for create facility with authorization and name facility")
    public void requestPostForCreateFacilityWithAuthorizationAndNameFacility() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Apotek");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(successCreateFacility());

    }

    @Step("I validate the status code 200")
    public void validateTheStatus() {
        restAssuredThat(response -> response.statusCode(200));

    }

    @Step("I validate the response message")
    public void validateTheResponseMessage() {
        Response resp = SerenityRest.lastResponse();
        String Name = resp.getBody().jsonPath().get("datamv.Name");
        System.out.println("Apotek: " + Name);
    }
}
