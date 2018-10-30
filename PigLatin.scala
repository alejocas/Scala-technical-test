package PaqueteDePrueba

object PigLatin {
  /**
   * This method transform a word from PigLatin argot. 
   * The code below satisfies the rules:
   * 1. If a word begins with a vowel sound, add an "ay" sound to the end of the word.
   * 2. If a word begins with a consonant sound, move it to the end of the word, and then add 
   *	 	an "ay" sound to the end of the word.
   * 3. When words begin with consonant clusters (multiple consonants that form one sound), 
   * 		the whole sound is added to the end when speaking or writing
   */
  def pigLatin(input: String): String = {
    var wordInPigLatin: String = ""
    if(startsWithVowel(input)){
      wordInPigLatin = s"${input}ay"
    } else if(!startsWithVowel(input.substring(1))){
      wordInPigLatin = s"${input(2).toUpper}${input.substring(3, input.length)}${input.substring(0, 2)}ay"
    } else {
      wordInPigLatin = s"${input(1).toUpper}${input.substring(2, input.length)}${input(0).toLower}ay"
    }
    wordInPigLatin
  }
  
  /**
   * This method define if a string starts with a vowel or not
   */
  def startsWithVowel(input: String): Boolean = {
    input(0).toLower match {
      case 'a' => true
      case 'e' => true
      case 'i' => true
      case 'o' => true
      case 'u' => true
      case _ => false
    }
  }
}