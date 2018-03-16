package com.appium.config;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JSonParser {
    public static JSONObject getUserData(int threadID) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(System.getProperty("user.dir") + "/" +
                "credentials.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray msg = (JSONArray) jsonObject.get("credentials");
            JSONObject a = (JSONObject) msg.get(threadID);
            System.out.println(msg.get(threadID));
            return a;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}


