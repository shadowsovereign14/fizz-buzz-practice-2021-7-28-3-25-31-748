package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int order) {
        String result = "";
        String nonSpecialNum = String.valueOf(order);

        if(order % 3 == 0){
            result = "Fizz";
        }
        if(order % 5 == 0) {
            result += "Buzz";
        } else {
            result = nonSpecialNum;
        }
        return result;
    }
}
