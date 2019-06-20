package com.sphoorthi;

public class Main {

    public static void main(String[] args) {
	/*int age = 3;
	if(age==1){
        System.out.println("Age is 1");
    }else if(age==2){
        System.out.println("Age is 2");
    }else{
        System.out.println("Any other age");
    }*/

	int age = 8;
	switch(age){
        case 1:
            System.out.println("Age is 1");
            break;
        case 2:
            System.out.println("Age is 2");
            break;
        case 3:case 4:case 5:case 6:
            System.out.println("age is 3, or 4, or 5, or 6");
            System.out.println("Actually the age is " +age);
            break;
        default:
            System.out.println("Any other age");
            break;

    }

    char alphabet = 'A';
	switch (alphabet){
        case 'A':
            System.out.println("Alphabet is A");
            break;
    }

    String month = "Jan";
	switch (month){
        case "Jan":
            System.out.println("Month was Jan");
            break;

    }
    }
}
