/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.webservice;

import com.br.lp3.entities.Estado;
import com.br.lp3.entities.Pais;
import com.br.lp3.entities.Pet;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author 31596861
 */
public class JSONPetParse {

    public static List<Pet> parseFeed(String content) {

        JsonReader reader = Json.createReader(new StringReader(content));
        JsonObject root = reader.readObject();

        reader.close();
        
        JsonArray petLista = root.getJsonArray("pets");
        List<Pet> pet= new ArrayList();
        for(int i = 0; i < petLista.size();i++)
        {
        JsonObject petObj = petLista.getJsonObject(i);
        String name = petObj.getString("name");
        String photo = petObj.getString("photo");
        String description = petObj.getString("description");
        String age = petObj.getString("age");
        String race = petObj.getString("race");
        String city = petObj.getString("city");

        JsonObject stateObj = petObj.getJsonObject("state");
        String nameState = stateObj.getString("name");
        String initials = stateObj.getString("initials");

        JsonObject countryObj = petObj.getJsonObject("country");
        String nameCountry = countryObj.getString("name");
        String initialsCountry = countryObj.getString("initials");

        Pet petUnit = new Pet(name, photo, description, age, race, city,
                new Estado(nameState, initials),
                new Pais(nameCountry, initialsCountry));
        pet.add(petUnit);
        }
        
        return pet;
    }
}
