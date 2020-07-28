package com.example.infs3634_group23;

import java.util.ArrayList;


//dummy db for testing
public class CharacterDB {


    private int exp;


    public CharacterDB() {

    }

    public CharacterDB(int exp){
        this.exp = exp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }


    public static ArrayList<CharacterDB> getChar(){
        ArrayList<CharacterDB> character = new ArrayList<>();
        character.add(new CharacterDB(0));
        return character;
    }


}
