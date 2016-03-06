import spock.lang.Specification

class StringCalculatorTest extends Specification{

    def "Should return 0 when adding empty String"(){

        given:
        StringCalculator stringCalculator = new StringCalculator()

        when:
        int result = stringCalculator.add("")

        then:

        result == 0
    }

}
