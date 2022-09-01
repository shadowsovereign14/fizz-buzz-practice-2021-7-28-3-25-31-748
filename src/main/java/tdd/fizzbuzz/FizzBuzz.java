package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int order) {
        String result;

        if(order % 3 == 0){
            result = "Fizz";
        } else {
            result = String.valueOf(order);
        }
        return result;
    }
}
