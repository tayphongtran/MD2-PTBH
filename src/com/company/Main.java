package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("nhap b: ");
        double b = scanner.nextDouble();
        System.out.println("nhap c: ");
        double c = scanner.nextDouble();

        QuadraticEquation result = new QuadraticEquation(a,b,c);
        System.out.println("ket qua thu duoc: ");
      if (result.getDiscriminant()>0){
          System.out.println(result.getRoot1()+" "+ result.getRoot2());
      }else if (result.getDiscriminant()==0){
          System.out.println("nghiem pt: " + result.getRoot1());
      } else {
          System.out.println("vo nghiem");
      }
    }
}
