package com.company;

public class Main {

    public static void main(String[] args) {
        String []shirts=new String[11];
        shirts[0]="S001,Black Polo Shirt,Black,XL";
        shirts[1]="S002,Black Polo Shirt,Black,L";
        shirts[2]="S003,Blue Polo Shirt,Blue,M";
        shirts[3]="S004,Blue Polo Shirt,Blue,XS";
        shirts[4]="S005,Tan Polo Shirt,Tan,XL";
        shirts[5]="S006,White T-Shirt,White,XL";
        shirts[6]="S007,White T-Shirt,White,M";
        shirts[7]="S008,Black Polo Shirt,Black,XL";
        shirts[8]="S009,Green T-Shirts,Green,S";
        shirts[0]="S010,Orange T-Shirt,Orange,XL";
        shirts[0]="S011,Maroon Polo Shirt,Maroon,S";

        for (int i=0;i<shirts.length;i++){
            Shirt sh =new Shirt(shirts[i]);
            System.out.println(sh.toString());
        }
    }
}
