import utest._

object ApplicationTest extends TestSuite {

  val tests = Tests {

    "dummy test should pass" - {
      assert(true == true && true)
    }

  }

}
