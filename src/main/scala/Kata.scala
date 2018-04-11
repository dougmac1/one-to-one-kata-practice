object Kata {


  val letterSwitch: Map[Char, Char] = Map(

    'Y' -> 'Z',
    'Z' -> 'X',
    'X' -> 'Y')

  def switcher(letter: String): String = {

    letter.map(letterSwitch)
  }
}