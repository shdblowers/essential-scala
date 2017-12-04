package directors

case class Film(name: String, yearOfRelease: Int, imdbRating: Double, director: Director) {

  def directorsAge: Int = yearOfRelease - director.yearOfBirth

  def isDirectedBy(director: Director): Boolean = this.director == director
}

object Film {

  def highestRating(film1: Film, film2: Film): Double = {
    val film1Rating = film1.imdbRating
    val film2Rating = film2.imdbRating

    if (film1Rating > film2Rating) film1Rating else film2Rating
  }

  def oldestDirectorAtTheTime(film1: Film, film2: Film): Director = {
    if (film1.directorsAge > film2.directorsAge) film1.director else film2.director
  }
}