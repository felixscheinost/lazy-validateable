import spock.lang.Specification

class TestCommandSpec extends Specification {

  def "test validation"() {
    expect: "Command is invalid because someString is missing"
    !new TestCommand().validate()
  }

}
