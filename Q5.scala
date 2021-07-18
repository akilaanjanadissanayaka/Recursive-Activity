

object Q5 {
  def main(args:Array[String]){
    print("Enter number :")
		val n=scala.io.StdIn.readInt()
		Sum(n)
	}
  def Sum(n:Int,i:Int=2,result:Int=0):Any = {
    if(n<1){
      println("Enter positive integer")
    }
    else if(i<n){
      if(iseven(i)){
        return Sum(n,i+1,result+i)
      }
      else{
        return Sum(n,i+1,result)
      }
    }
    else{
      print(result)
    }
  }
  
  def iseven(n:Int):Boolean= n match{
  case x if(x==0)=> true
  case _ => isodd(n-1)
  }
  def isodd(n:Int):Boolean = !(iseven(n))
}
