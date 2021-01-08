import model.AccuracySummary;

import java.io.IOException;
import java.net.*;



public class Service {

    private final String HOST = "https://d22d6e9c0bea.ngrok.io/";

    private final String ACCURACY_SUMMARY_URL = "/v1/get-metrics/accuracy-measure";

    public static void main(String[] args)
            throws IOException {


    }

    public static AccuracySummary getAccuracySummary(String url){

        return new AccuracySummary();
    }
}
