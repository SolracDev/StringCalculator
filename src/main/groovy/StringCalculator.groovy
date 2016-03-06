class StringCalculator {
    private int DEFAULTVALUE = 0

    int add(String input){
        input ? sum(input.trim()) : DEFAULTVALUE
    }

    private int sum(String input) {
        Arrays.stream(input.split("\\D+"))
            .mapToInt({ Integer.parseInt(it) })
            .sum()
    }
}
