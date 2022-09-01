package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int order) {
        String result;

        if(order % 3 == 0){
            result = "Fizz";
        } else if(order % 5 == 0) {
            result = "Buzz";
        } else {
            result = String.valueOf(order);
        }
        return result;
    }
}
