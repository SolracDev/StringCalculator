import spock.lang.Ignore
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

    def "Should return sum of two numbers"() {
        when:
        int result = stringCalculator.add(input)

        then:
        result == expectedResult

        where:
        input    || expectedResult
        "0,0"    || 0
        "1,2"    || 3
        "3,4"    || 7
        "23,45 " || 68
    }

    def "Should return the sum of an unknown amount of numbers"() {

        when:
        int result = stringCalculator.add(input)

        then:
        result == expectedResult

        where:
        input         || expectedResult
        "0,0,0"       || 0
        "1,2,3"       || 6
        "100,102,103" || 305

    }


}
