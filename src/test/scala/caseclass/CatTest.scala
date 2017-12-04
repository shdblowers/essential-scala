package caseclass

import org.scalatest.FunSuite

class CatTest extends FunSuite {
  test("Cat creation with companion object") {
    assert(Cat("Ginger", "Smoked Salmon") === new Cat("Ginger", "Smoked Salmon"))
  }

  test("Cat field for each constructor argument") {
    val smudge = Cat("Tabby and White", "Milk")

    assert(smudge.food === "Milk")
  }

  test("Cat sensible default for toString") {
    val tom = Cat("Grey", "Mice")

    assert(tom.toString === "Cat(Grey,Mice)")
  }

  test("Cat equals and copy") {
    val sam = Cat("Black", "Rib-eye Steak")

    assert(sam.equals(sam.copy()))
  }
}
