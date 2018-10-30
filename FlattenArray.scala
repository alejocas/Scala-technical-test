package PaqueteDePrueba

import scala.reflect.ClassTag

object FlattenArray {
  /**
   * This method take an arbitrarily-deep nested list-like structure and returns a flattened
   * structure without any nil/null values. Doesn't reject repeated values.  
   */
  def flattenArray(input: List[Any]): List[Int] = {
    val formattedList = input
                        .toString()
                        .split(",")
                        .flatMap(_.split("[(]"))
                        .flatMap(_.split(" "))
                        .flatMap(_.split("[)]"))
    var flatData: String = ""
    for(item <- formattedList if(item.length > 0 && (item(0).toLower != 'l' && item(0).toLower != 'n'))){
  	  flatData += s"$item,"
    }
    flatData = flatData.substring(0, flatData.length - 1)
    val flatList: List[Int] = arrayToList(flatData.split(",").map(element => element.toInt))
    flatList
  }
  
  /**
   * Method that determine the type of a variable.
   */
  def typeOf[T](v: T)(implicit ev: ClassTag[T]) = ev.toString
  
  /**
   * Method to convert an Array to a List.
   */
  implicit def arrayToList[A](a: Array[A]) = a.toList
}