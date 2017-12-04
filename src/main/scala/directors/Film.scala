package directors

class Film(val name: String, val yearOfRelease: Int, val imdbRating: Double, val director: Director) {

  def directorsAge: Int = yearOfRelease - director.yearOfBirth

  def isDirectedBy(director: Director): Boolean = this.director == director

  def copy(name: String = this.name,
           yearOfRelease: Int = this.yearOfRelease,
           imdbRating: Double = this.imdbRating,
           director: Director = this.director): Film = {
    new Film(name, yearOfRelease, imdbRating, director)
  }
}

object Film {
  def apply(name: String, yearOfRelease: Int, imdbRating: Double, director: Director): Film = {
    new Film(name, yearOfRelease, imdbRating, director)
  }

  def highestRating(film1: Film, film2: Film): Double = {
    val film1Rating = film1.imdbRating
    val film2Rating = film2.imdbRating

    if (film1Rating > film2Rating) film1Rating else film2Rating
  }

  def oldestDirectorAtTheTime(film1: Film, film2: Film): Director = {
    if(film1.directorsAge > film2.directorsAge) film1.director else film2.director
  }
}