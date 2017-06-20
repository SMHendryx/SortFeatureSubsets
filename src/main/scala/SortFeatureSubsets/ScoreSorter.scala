// Sorts feature subsets by specified score (e.g. F1)
// Should call ScoreExtractor

object SortByScore extends App {
  //Get args:
  val arguments = args
  
  val scoreMap = ScoreExtractor.getScores(arguments)

}