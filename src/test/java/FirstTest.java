import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FirstTest {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Hello";
        String str4 = "Hello";
        String str5 = "Hello";
        String str9 = new String("Hello");

        System.out.println(str2 == str3);
        System.out.println(str2 == str9);
        System.out.println(str2.equals(str9));
        System.out.println(str2.equals(str3));
    }
/*
=
==
equals()*/







    //КРАТНО 3, ВОЗВРАЩАТЬ "I"
    //КРАТНО 5, ВОЗВРАЩАТЬ "F"
    //КРАТНО 3 И 5, ВОЗВРАЩАТЬ "A"
    //ВОЗВРАЩАТЬ "T"

    public String trialCode(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "A";
        } else if (number % 5 == 0) {
            return "F";
        } else if (number % 3 == 0) {
            return "I";

        } else return "T";
    }

    @Test
    public void checkIfatNubmer() {
       String actualResult = trialCode(9);
       assertEquals(actualResult, "I", "Ожидалось другое значение");
    }

    @Test
    public void checkIfatFiveNubmer() {
       String actualResult = trialCode(25);
       assertEquals(actualResult, "F", "Ожидалось другое значение");
    }

    @Test
    public void checkIfatBothNubmer() {
       String actualResult = trialCode(15);
       assertEquals(actualResult, "A", "Ожидалось другое значение");
    }

    @Test
    public void checkIfatNoneNubmer() {
       String actualResult = trialCode(19);
       assertEquals(actualResult, "T", "Ожидалось другое значение");
    }
}
