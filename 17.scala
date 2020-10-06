//If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

// If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


// NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage. 

def speak(num: Int, printZero: Boolean = true): String = {
  if (num < 0) s"negative ${speak(-num)}"
  else if (num >= 1000000000) s"${speak(num / 1000000000)}billion${if (num % 100000000 != 0) "and" + speak(num % 1000000000, false) else ""}"
  else if (num >= 1000000) s"${speak(num / 1000000)}million${if (num % 1000000 != 0) "and" + speak(num % 1000000, false) else ""}"
  else if (num >= 1000) s"${speak(num / 1000)}thousand${if (num % 1000 != 0) "and" + speak(num % 1000, false) else ""}"
  else if (num >= 100) s"${speak(num / 100)}hundred${if (num % 100 != 0) "and" + speak(num % 100, false) else ""}"
  else if (num >= 20) (num/10) match {
            case 2 => s"twenty${speak(num % 10, false)}"
            case 3 => s"thirty${speak(num % 10, false)}"
            case 4 => s"forty${speak(num % 10, false)}"
            case 5 => s"fifty${speak(num % 10, false)}"
            case n@_ => s"${speak(n).stripSuffix("t")}ty${speak(num % 10, false)}"
        }
    else num match {
        case 0 => if (printZero) "zero" else ""
        case 1 => "one"
        case 2 => "two"
        case 3 => "three"
        case 4 => "four"
        case 5 => "five"
        case 6 => "six"
        case 7 => "seven"
        case 8 => "eight"
        case 9 => "nine"
        case 10 => "ten"
        case 11 => "eleven"
        case 12 => "twelve"
        case 13 => "thirteen"
        case 15 =>"fifteen";
        case n@_ => s"${speak(n-10).stripSuffix("t")}teen"
    }
}

def countLetters(numRange: Int): Int = {
  var sum : Int = 0;
  for (num <- 1 to numRange) {
    println(speak(num))   
    sum += speak(num).length()
  }
  return sum;
}


println(countLetters(1000))
// println(countLetters(5))

