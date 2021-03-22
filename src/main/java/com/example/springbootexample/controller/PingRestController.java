package com.example.springbootexample.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
public class PingRestController {

  @RequestMapping(method = RequestMethod.GET, path = "")

  public static String[] getStatus() {

    String result;
    String url = "https://6057fa1ec3f49200173ad23b.mockapi.io";
    String endResult [] = new String[3];
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
try {
      URL urlObj = new URL(url);
      HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
      con.setRequestMethod("GET");
      // Set connection timeout
      con.setConnectTimeout(3000);
      con.connect();

      int code = con.getResponseCode();
      if (code <500) {
        result = "UP";
        endResult[0]=url;
        endResult[1]=result;
        endResult[2]=timestamp.toString();
      }

    } catch (Exception e) {
        result = "DOWN";
        endResult[0]=url;
        endResult[1]=result;
        endResult[2]=timestamp.toString();
    }
    return endResult;
  }

}



