package com.company;

import java.util.StringTokenizer;

public class Shirt {
    private String id;
    private String description;
    private String color;
    private String size;

    public Shirt(String str) {
        StringTokenizer stringTokenizer=new StringTokenizer(str,",");
        id=stringTokenizer.nextToken();
        description=stringTokenizer.nextToken();
        color=stringTokenizer.nextToken();
        size=stringTokenizer.nextToken();
    }

    public String toString(){
        return "\nID tovara: "+id
                +"\nOpisanie: "+description
                +"\nCvet: "+color
                +"\nRazmer: "+size;
    }
}
