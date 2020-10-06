import scala.collection.immutable.Vector;


var input = Vector(
  Vector( 75 ),
  Vector( 95,64 ),
  Vector( 17,47,82 ),
  Vector( 18,35,87,10 ),
  Vector( 20,04,82,47,65 ),
  Vector( 19,01,23,75,03,34 ),
  Vector( 88,02,77,73,07,63,67 ),
  Vector( 99,65,04,28,06,16,70,92 ),
  Vector( 41,41,26,56,83,40,80,70,33 ),
  Vector( 41,48,72,33,47,32,37,16,94,29 ),
  Vector( 53,71,44,65,25,43,91,52,97,51,14 ),
  Vector( 70,11,33,28,77,73,17,78,39,68,17,57 ),
  Vector( 91,71,52,38,17,14,91,43,58,50,27,29,48 ),
  Vector( 63,66,04,68,89,53,67,30,73,16,69,87,40,31 ),
  Vector( 04,62,98,27,23,09,70,98,73,93,38,53,60,04,23 )
)

def process() = {
  for (row <- 2 to input.length) {
    var rowList = input(input.length - row)
    var lowerList = input(input.length - row + 1)
    for (entry <- 0 until rowList.length) {
      rowList = rowList.updated(entry, rowList(entry) + Math.max(lowerList(entry), lowerList(entry + 1)))
    }
    input = input.updated(input.length - row, rowList)
  }
  println(input(0)(0))
}

process()