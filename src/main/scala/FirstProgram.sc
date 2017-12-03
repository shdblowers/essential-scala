"Hello, world!".toUpperCase()

"Hello to you!" toUpperCase

"3".toInt

"4" toInt

"the quick brown fox" split " "

"foo" take 1

1.+(2).+(3)

6

'y'

object Test {}

Test

object Test2 {
  // method with 0 parameters
  def name: String = "Quite definitely a strong object!"
}

Test2.name

object Greeter {
  def hello(name: String): String = {
    "Hello " + name
  }
}

Greeter.hello("James Pond")

object NoelGreeter {
  val greeterName: String = "Noel"

  def hello(name: String):String = {
    "Hello " + name + " from " + greeterName
  }
}

NoelGreeter.hello("Arthur Balls")

NoelGreeter.greeterName