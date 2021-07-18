

object Q6 {
   def main(Args:Array[String]){
    print("Enter number :")
		val n=scala.io.StdIn.readInt()
    fibs(n)
  }
  def fib(x:Int):Int= x match{
    case 0 => 0
    case n if n==1 => 1
    case _ => fib(x-1)+fib(x-2)
  }
  def fibs(x:Int):Unit= {
    if (x > 0) {
      fibs(x-1)
    }
    println(fib(x))
  }
}