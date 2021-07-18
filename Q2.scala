

object Q2 {
  def main(args: Array[String]) = {
    
     print("Enter number :");
     val n = scala.io.StdIn.readInt()
     seq(n)
     
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
  def seq(n:Int):Unit={
    if(n>2){
      seq(n-1)
    }
    if(prime(n)){
      print(n+"\n")
    }
  }
}