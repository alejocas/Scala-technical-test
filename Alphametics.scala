package PaqueteDePrueba

object Alphametics {
  def solveAlphametics(puzzle: String): Any = {
    val partition = puzzle.trim().split("==")
    val operators = partition(0).trim().split("+")
    val result = partition(1)
  }
}