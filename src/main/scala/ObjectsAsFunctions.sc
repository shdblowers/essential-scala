class Adder(amount: Int) {
  def apply(in: Int): Int = in + amount
}

val add3 = new Adder(3)

add3.apply(2)
// can be short-handed to
add3(2)