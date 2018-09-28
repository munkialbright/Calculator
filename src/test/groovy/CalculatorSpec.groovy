import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class CalculatorSpec extends Specification {

    @Shared
    Calculator app = new Calculator()

    @Shared
    int counter = 0

    def setupSpec() {
        Calculator.metaClass.static.getNextInt = { 1 }
    }

    def 'test initInput'() {
        when:
        int c = app.initInput()

        then:
        c == 1
    }

    @Unroll
    def 'test calculation for action #input'() {
        when:
        int result = app.calculation(input)

        then:
        result == calculation

        where:
        input | calculation
        1     | 1
        2     | 1
        3     | 2
        4     | 0
    }
}