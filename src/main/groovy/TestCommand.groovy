import grails.compiler.GrailsCompileStatic
import grails.validation.Validateable

@GrailsCompileStatic
class TestCommand implements Validateable {

  @Lazy
  String someProperty = null

  static constraints = {
    someProperty nullable:false
  }

}
