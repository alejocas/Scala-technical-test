

package PaqueteDePrueba


object HolaScala {
  
  val answerList: List[String] = List("")
  
  def main(args: Array[String]): Unit = {
  	//val inputString = "[1,[2,3,4,5,6,7],[8,null],[null],[null,1]]"//"[1,[2,3,null,4],[null],5]"
  	//val input = List(1,List(2,3,null,4),List(null),5)//List(1, List(2, 3, 4, 5, 6, null, 7), 8)
  	//val answer = FlattenArray.flattenArray(input)
    val answer = PigLatin.pigLatin("smile")
  	println(answer)
  }
  
  /**
   * Illegal way to resolve the first exercise of the technical test :v
   */
  def flattenArrayFromString(input: String): String = {
    var answer: String = ""
    val stringCollection = input.split(",")
    for(string <- stringCollection if(!string.contains("null"))) {
      for(letter <- string if(letter != '[' && letter != ']')){
        answer += s"$letter"
      }
      answer += ","
    }
    answer = s"[${answer.substring(0, answer.length - 1)}]"
    answer
  }
  
}