```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

object Main extends App {
  val obj = new MyClass(5)
  println(obj.myMethod(3)) // This will work fine

  val obj2 = new MyClass(5) 
  //val result = obj2.myMethod(3) //This will give error 
  //println(result)
}
```