package com.company;

public class Main {


    public static void main(String[] args) {
        System.out.println(multadd(1.0, 2.0, 3.0));

        // beregne sin pi/4+ (cos pi/4/2)
        double beregn_1 = Math.cos(Math.PI/4+(Math.cos(Math.PI/4/2)));
        System.out.println("første beregner "+beregn_1);

        //beregne log10+log20
        double beregn_2 = Math.log(10.0)+Math.log(20.0);
        System.out.println("anden beregner "+beregn_2);

        //expSum sin(PI/4)+(cos(PI/4))/2
        System.out.println("stor beregning "+expSum(2));
    }

    public static double multadd (double a, double b, double c){
        return a*b+c;
    }


       public static double expSum (double x){
            return (x * Math.exp(-x) + Math.sqrt(1 - Math.exp(-x)));
        }



}