

object Q1 {
  def main(args: Array[String]) = {
    
     print("Enter number :");
     val n = scala.io.StdIn.readInt()
     if(prime(n)){
       print("True")
     }
     else{
       print("false")
     }
     
  }
  def GCD(a:Int,b:Int):Int=b match{
      case 0 => a
      case b if b>a => GCD(b,a)
      case _ => GCD(b,a%b)
  }
  def prime(x:Int , y:Int=2):Boolean= y match{
      case n if(x==n)=>true
      case n if(GCD(x,n)>1)=>false
      case n => prime(x,n+1)
  }
}