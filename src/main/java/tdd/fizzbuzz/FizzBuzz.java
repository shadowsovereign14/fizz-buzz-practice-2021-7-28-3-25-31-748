package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int order) {
        String result = "";

        if(order % 3 == 0){
            result = "Fizz";
        }
        if(order % 5 == 0) {
            result += "Buzz";
        }
        if(order % 7 == 0) {
            result += "Whizz";
        }
        if(result.isEmpty()) {
            result = String.valueOf(order);
        }

        return result;
    }
}
