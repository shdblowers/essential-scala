class FriendlyPerson(val firstName: String, val lastName: String)

object FriendlyPerson {
  def apply(fullName: String): FriendlyPerson = {
    val parts = fullName.split(" ")

    new FriendlyPerson(parts(0), parts(1))
  }
}