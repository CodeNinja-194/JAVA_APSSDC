import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;


class H{

    private int hid;

    private String hn;

    private int vac;

    private double fee;

  public H(int hid,String hn,int vac,double fee){

        this.hid=hid;

        this.hn=hn;

        this.vac=vac;

        this.fee=fee;

    }

    int getHid(){

        return hid;

    }

    String getHn(){

        return hn;

    }

    int getVac(){

        return vac;

    }

    double getFee(){

        return fee;

    }

}

public class Solution {

    public static void main(String args[] ) throws Exception

    {

        H[] arr=new H[4];

        Scanner s=new Scanner(System.in);

        for(int i=0;i<4;i++){

            int hid=s.nextInt();s.nextLine();

            String hn=s.nextLine();

            int vac=s.nextInt();s.nextLine();

            double fee=s.nextDouble();s.nextLine();

            arr[i]=new H(hid,hn,vac,fee);

        }

        String str=s.nextLine();

        double d1=s.nextdouble();s.nextLine();

        

        if(vacf(arr,str)!=0){

            System.out.println(vacf(arr,str));

        }

        else{

            System.out.println("There is no such Hotel available.");

        }


H[] p=ret(arr,d1);

if(d1!=null){

    for(H i:arr){

        System.out.println(i.hetHn());

    }

}

else{

    System.out.println("No Hotel found");

}

}

static int vacf(H[] arr,String st){

    for(H i:arr){

        if((i.getHn()).equalsIgnoreCase(st)){

            return i.getVac();

        }

    }

    return 0;    

} 

static H[] ret(H[] arr,double d){

    H[] ar1=new H[0];

    for(H i:arr){

        if(i.getVac()<d){

            ar1=Arrays.copyOf(ar1,ar1.length+1);

            ar1[ar1.length-1]=i;

        } 

    }
int temp=0;
    if(ar1.length>0){

        for(int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr.length-1-i;j++){

                if(ar[j].getFee()>arr[j+1].getFee()){

                     temp=ar1[j];

                    ar1[j]=arr[j+1];

                    ar1[j+1]=temp;

                }

            }

        }

        return ar1;

    }

    return null;

}

}