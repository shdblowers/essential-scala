import org.scalatest.FunSuite
import Calc.square

class CalcTest extends FunSuite  {
  test("Calc.square") {
    assert(square(2.0) == 4.0)
    assert(square(2) == 4)
    assert(square(3.0) == 9.0)
    assert(square(3) == 9)
    assert(square(-2.0) == 4.0)
    assert(square(-2) == 4)
  }
}
