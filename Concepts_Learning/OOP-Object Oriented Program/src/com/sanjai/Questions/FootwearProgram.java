package com.sanjai.Questions;
/*

Create a class Footwear which consists of the below attributes.
  footwearId=int
  footwearName=String
  footwearType=String
  price =int

the above attributes should be private.
write getter and setter and parametrised constructor as required.

create the class footwearProgram with the main method.
implement the 1 static methods.getCountByType in the Solution class.

getCountByType method
   this method will take two input parameters.
array of the Footwear objects and string parameter footwear type.
this method will return the count of the footwears from array of the
footwear objects for the given type of footwear.
if no footwear with the given footwear type is found in the
array of footwear abjects,then the method should return 0.


for getCountByType method- the main method should print the count of the footwears ,if the returned value
is greater than zero. or it should print Footwear not available;


*/
import java.util.Arrays;
import java.util.Scanner;

public class FootwearProgram {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Footwear [] footwears = new Footwear[5];

        for (int i = 0; i < 5; i++) {
            int footwearId = in.nextInt();
            String footwearName = in.next();
            String footwearType = in.next();
            int price = in.nextInt();

            footwears[i] = new Footwear(footwearId,footwearName,footwearType,price);

        }

        System.out.println(" Enter Footwear Type : ");
        String footwearType = in.next();
        System.out.println("Enter Footwear Name : ");
        String footwearName = in.next();

        int count = getCountByType(footwears,footwearType);
        if(count == 0 ){
            System.out.println("Footwear Not available");
        }else System.out.println(count);

        Footwear obj = getSecondHighestPriceByBrand(footwears,footwearName);

        if(obj == null){
            System.out.println("Brand Not Available");
        }
        else {
            System.out.println(obj.getFootwearId());
            System.out.println(obj.getFootwearName());
            System.out.println(obj.getPrice());
        }
    }

    public static int getCountByType(Footwear[]footwears, String footwearType){
        int count = 0;

        for (int i = 0; i < 5; i++) {

            if(footwears[i].getFootwearType().equalsIgnoreCase(footwearType)){
                count++;
            }

        }

        return count;
    }

    public static Footwear getSecondHighestPriceByBrand(Footwear[]footwears,String footwearName){
        int [] arrofPrice = new int[0];
        for (int i = 0; i < 5; i++) {
            if(footwears[i].getFootwearName().equalsIgnoreCase(footwearName)){
                arrofPrice = Arrays.copyOf(arrofPrice,arrofPrice.length+1);
                arrofPrice[arrofPrice.length-1] = footwears[i].getPrice();
            }
        }

        Arrays.sort(arrofPrice);
        if(arrofPrice.length>0){
            int x = arrofPrice[arrofPrice.length-1];
            for (int i = 0; i < footwears.length; i++) {
                if(footwears[i].getPrice()==x){
                    return footwears[i];
                }
            }
        }

        return null;
    }
}

class Footwear{
    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    public Footwear(int footwearId,String footwearName , String footwearType, int price){
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }
    public int getFootwearId(){
        return footwearId;
    }

    public void setFootwearId(int footwearId) {
        this.footwearId = footwearId;
    }
    public String getFootwearName(){
        return footwearName;
    }

    public void setFootwearName(String footwearName) {
        this.footwearName = footwearName;
    }
    public String getFootwearType(){
        return footwearType;
    }

    public void setFootwearType(String footwearType) {
        this.footwearType = footwearType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}