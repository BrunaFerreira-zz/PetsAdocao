/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.entities;

import java.io.Serializable;

/**
 *
 * @author 31596861
 */
public class Pet implements Serializable{
    
    private String name, photo, description, age, race, city;
    State state;
    Country country;

    public Pet() {
    }

    public Pet(String name, String photo, String description, String age, String race, String city, State state, Country country) {
        this.name = name;
        this.photo = photo;
        this.description = description;
        this.age = age;
        this.race = race;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", photo=" + photo + ", description=" + description + ", age=" + age + ", race=" + race + ", city=" + city + ", state=" + state + ", country=" + country + '}';
    }
  
}
