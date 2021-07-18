

object Q3 {
  def main(args:Array[String]){
		print("Enter number :")
		val n=scala.io.StdIn.readInt()
		print(add(n))
	}
  def add(x:Int,y:Int=0):Int= x match{
    case x if(x==0)=>y
    case x if(x>0)=>add(x-1,y+x)
  }
}