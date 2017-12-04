package tatooine

import org.scalatest.FunSuite

class StormtrooperTest extends FunSuite {
  test("Stormtrooper.inspect") {
    val obiWanKenobi = Passerby("Old", "Ben")
    val luke = Passerby("Luke", "Skywalker")
    val jawa = Passerby("Het", "Nkik")

    assert(Stormtrooper.inspect(obiWanKenobi) === "These aren't the droids we're looking for.")
    assert(Stormtrooper.inspect(luke) === "Halt, rebel scum!")
    assert(Stormtrooper.inspect(jawa) === "Move along Nkik")
  }
}
