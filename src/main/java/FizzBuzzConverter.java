public class FizzBuzzConverter {
    public String convertToFizzbuzz(int number){
        if(number % 15 == 0){
            return "FizzBuzz";
        }

        if(number % 3 == 0){
            return "Fizz";
        }

        if(number % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
