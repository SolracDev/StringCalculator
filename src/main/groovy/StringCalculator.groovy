import static java.lang.Integer.parseInt

class StringCalculator {
    private int DEFAULTVALUE = 0


    int add(String input){
        input ? sum(input) : DEFAULTVALUE
    }

    private int sum(String input) {
        if (input.contains(",")) {
            sum(input.split(",")[0].trim()) + sum(input.split(",")[1].trim())
        } else {
            parseInt(input)
        }
    }
}
