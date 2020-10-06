// 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
// What is the sum of the digits of the number 2^1000?
import scala.collection.mutable.ListBuffer

def function(exponent: Int): Int = {
  
  var digits : ListBuffer[Int] = ListBuffer.fill(exponent)(0)
  // var expo : Int = Math.pow(2, exponent).toInt;
  // printf("2 ^ %d = %d\t", exponent, expo)
  // var sum : Int = 0;
  digits(0) = 1;
  for (_ <- 1 to exponent) {
    var carryOver = false;
    for (placement : Int <- 0 to exponent - 1) {
      digits(placement) = digits(placement) * 2 + (if(carryOver) 1 else 0);
      if (digits(placement) >= 10) {
        carryOver = true;
        digits(placement) = digits(placement) % 10;
      } else {
        carryOver = false;
      }
    }
  }
  return digits.sum;
}


println(function(1000))
