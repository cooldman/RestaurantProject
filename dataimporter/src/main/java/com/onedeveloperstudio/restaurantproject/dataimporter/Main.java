package com.onedeveloperstudio.restaurantproject.dataimporter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

/**
 * User: y.zakharov
 * Date: 13.07.14
 */
public class Main {
  public static void main(String ... args){
    try {
/*      URL uri = new URL("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=55.784519,49.118779&radius=500&types=restaurant&key=AIzaSyBRgTXX2ic4GyISDVb4tDupeDoU7LnJKUE");
      URLConnection connection = uri.openConnection();
      BufferedReader in = new BufferedReader(new InputStreamReader(
          connection.getInputStream()));
      String inputLine;
      while ((inputLine = in.readLine()) != null)
        System.out.println(inputLine);
      in.close();*/
      URL anotherURL = new URL("https://maps.googleapis.com/maps/api/place/details/json?reference=CnRnAAAAbAeZKlV5BQfCLCOhbGHi6Udt00hHgDPZ5w__zI3yn_H_jr6gsHImQwfnXKR_EcGn_0uBAKifNer8c5d288sXp2MFP0tcVeHVRo6gXb0UtCviMdKjzv63wQ5a06rBCziz-8Y4Vin2uH0i9yDXfO2aahIQtr52oN_FtmYspGm2YksdPRoU05rgivFMzyXGELiHa57hRsgtLXc&key=AIzaSyBRgTXX2ic4GyISDVb4tDupeDoU7LnJKUE");
      URLConnection connection1 = anotherURL.openConnection();
      String inputLine;
      BufferedReader in1 = new BufferedReader(new InputStreamReader(
          connection1.getInputStream()));
      while ((inputLine = in1.readLine()) != null)
        System.out.println(inputLine);
      in1.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
