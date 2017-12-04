package directors

class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {

  def name: String = s"$firstName $lastName"

  def copy(firstName: String = this.firstName,
           lastName: String = this.lastName,
           yearOfBirth: Int = this.yearOfBirth): Director = {
    new Director(firstName, lastName, yearOfBirth)
  }
}

object Director {
  def apply(firstName: String, lastName: String, yearOfBirth: Int): Director = {
    new Director(firstName, lastName, yearOfBirth)
  }

  def older(directorA: Director, directorB: Director): Director = {
    if (directorA.yearOfBirth < directorB.yearOfBirth) directorA else directorB
  }
}