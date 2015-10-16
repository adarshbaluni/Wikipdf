/**
 * Created by Adarsh on 10/14/2015.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Wikipdf {
    public static void main(String[] args) {
    try {
            URL website = new URL("http://adarshbaluni.com.s3-website-us-west-2.amazonaws.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(website.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
            // Process each line.
            System.out.println(inputLine);
            }
            in.close();

            } catch (MalformedURLException me) {
                System.out.println(me);

            } catch (IOException ioe) {
                System.out.println(ioe);
            }

    }
}
