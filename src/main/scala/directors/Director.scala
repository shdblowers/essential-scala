package directors

case class Director(firstName: String, lastName: String, yearOfBirth: Int) {

  def name: String = s"$firstName $lastName"
}

object Director {
  def older(directorA: Director, directorB: Director): Director = {
    if (directorA.yearOfBirth < directorB.yearOfBirth) directorA else directorB
  }
}