class Person {
  val firstName = "Robert"
  val lastName = "Robertson"

  def name = firstName + " " + lastName
}

val bobby = new Person

bobby.firstName

val bobby2 = new Person

object Alien {
  def greet(p: Person) = {
    "Greetings human that is called " + p.name
  }
}

Alien.greet(bobby)

class BetterPerson(val firstName: String = "John",
                   val lastName: String = "Smith") {
  def name = firstName + " " + lastName
}

val david = new BetterPerson("David", "Grohl")

david.name