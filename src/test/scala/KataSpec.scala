import org.scalatest.{MustMatchers, WordSpec}

class KataSpec extends WordSpec with MustMatchers {

  "Kata" must {

    "when given 'X' this should return Y" in {
      Kata.switcher("X") mustEqual "Y"
    }

    "when given 'Y' this should return Z" in {
      Kata.switcher("Y") mustEqual "Z"
    }

    "when given 'Z' this should return X" in {
      Kata.switcher("Z") mustEqual "X"
    }
  }

}
