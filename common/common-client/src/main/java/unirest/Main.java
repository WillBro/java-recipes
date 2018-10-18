package unirest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * @link{https://medium.com/@hanjchen/java-unirest-review-gradle-installation-coding-27864ad6658d}
 */
public class Main {

    private final static String REQUEST_URL = "https://raw.githubusercontent.com/DylanCh/Startupp/master/Startups.json";

    public static void main(String[] args) {

        try {
            Unirest.setDefaultHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");

            HttpResponse<JsonNode> response = Unirest.get(REQUEST_URL).asJson();

            // Hold the value of the JSON body (important)
            String json = response.getBody().toString();

            // (Optional) Save the data in a file
            PrintWriter writer = new PrintWriter("data.json", "UTF-8");
            writer.print(new JSONObject(json).toString(4));
            writer.close();

            // get the root object
            JSONObject root = new JSONObject(json);

            if (root.has("startups")) {
                // Get the startups array
                JSONArray startups = root.getJSONArray("startups");
                List<Object> list = new ArrayList<>();

                // Add them to a native Java data structure
                for (int i = 0; i < startups.length(); i++) {
                    if (!new JSONObject(startups.get(i).toString()).getBoolean("hidden")) {
                        list.add(startups.get(i));
                    }
                }

                list.forEach(System.out::println);
            }

        } catch (UnirestException | JSONException |
                FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
