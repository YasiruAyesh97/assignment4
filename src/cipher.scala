object cipher{
  val str="This is a pattern"

  val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val E=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)
  val D=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)-key +a.size)%a.size)

  val cipher=(algo:(Char,Int,String)=> Char,str:String,key:Int,a:String)=> str.map(algo(_,key,a))

  val ct=cipher(E,str,5,alphabet)
  val pt=cipher(D,ct,5,alphabet)

  def main(args: Array[String])={
    println("Text :"+str)
    println("Encrypted :"+ct)
    println("Decrypted :"+pt)
  }
}