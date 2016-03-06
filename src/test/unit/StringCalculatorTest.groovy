import spock.lang.Specification

class StringCalculatorTest extends Specification {

    private StringCalculator stringCalculator

    def setup() {
        stringCalculator = new StringCalculator()
    }

    def "Should return 0 when adding empty String"() {

        when:
        int result = stringCalculator.add("")

        then:

        result == 0
    }

    def "should return that number if one number passed"() {

        when:
        int result = stringCalculator.add(inputWithOneNumber)

        then:
        result == expectedResult

        where:
        inputWithOneNumber || expectedResult
        "0"                || 0
        "1"                || 1
        "10"               || 10


    }


}
