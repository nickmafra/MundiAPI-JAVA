package examples.charge;

import com.mundipagg.api.MundiAPIClient;
import com.mundipagg.api.controllers.ChargesController;
import com.mundipagg.api.http.client.*;
import com.mundipagg.api.models.CreateCaptureChargeRequest;
import com.mundipagg.api.models.GetChargeResponse;


public class CaptureCharge {
	
	public static void main(String[] args) {

        String basicAuthUserName = "sk_test_4tdVXpseumRmqbo"; // The username to use with basic authentication
        String basicAuthPassword = ""; // The password to use with basic authentication

        MundiAPIClient client = new MundiAPIClient(basicAuthUserName, basicAuthPassword);

        ChargesController charges_controller = new ChargesController();

        String chargeId = "ch_PLoQOAxFLycVra5z";

        CreateCaptureChargeRequest request = new CreateCaptureChargeRequest();

        request.setCode("capture_total_operation");

        charges_controller.captureChargeAsync(chargeId, request, null, new APICallBack<GetChargeResponse>() {
            @Override
            public void onSuccess(HttpContext context, GetChargeResponse response) {

                System.out.println("Status response: " + context.getResponse().getStatusCode());
                System.out.println("Charge is total captured !");
                System.out.println("Captured amount:" + response.getAmount());
                System.out.println("Charge status: " + response.getStatus());
                System.out.println("Last transaction status: " + response.getLastTransaction().getStatus());
                System.out.println("Last transaction amount: " + response.getLastTransaction().getAmount());
                System.out.println("Last transaction id: " + response.getLastTransaction().getId());

            }

            @Override
            public void onFailure(HttpContext context, Throwable error) {

                System.out.println("Status response: " + context.getResponse().getStatusCode());
                System.out.println(error.getMessage());
                error.printStackTrace();

            }
        });
    }
}
