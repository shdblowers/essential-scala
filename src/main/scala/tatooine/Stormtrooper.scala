package tatooine

object Stormtrooper {
  def inspect(passerby: Passerby): String = {
    passerby match {
      case Passerby("Old", "Ben") => "These aren't the droids we're looking for."
      case Passerby("Luke", "Skywalker") => "Halt, rebel scum!"
      case Passerby(_, lastName) => s"Move along $lastName"
    }
  }
}
