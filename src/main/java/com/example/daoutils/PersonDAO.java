package com.example.daoutils;

import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author jkidd
 */
public class PersonDAO {
    
    public static String getPerson(String id) {
        JSONArray jsonObject=getPersonList();
        JSONObject retVal = null;
        for (Object object : jsonObject) {
            JSONObject person = (JSONObject) object;
            if (person.containsValue(id)) {
                retVal = person;
            }
        }

        return retVal != null ? retVal.toJSONString() : "No Data Found for ID: "+id;
    }
    
    public static String getAllPeople()
    {
        return getPersonList().toJSONString();
    }
    
    protected static JSONArray getPersonList()
    {
        JSONParser parser = new JSONParser();
        InputStream path = null;
        Object obj = null;
        try {
            path = PersonDAO.class.getResourceAsStream("/people.json");
            obj = parser.parse(new InputStreamReader(path));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        JSONArray jsonObject = (JSONArray) obj;
        return jsonObject;
    }
}
