fun main() {
var T=getTown("Nairobi")
    println(T)
   println (getCall("Elizabeth"))
}
fun getTown(town:String):String{
    val T=town
    return T
}
fun getCall(jina:String){
    if (jina=="Njeri"){
        println("thats me!")

    }else{
     println("i dont know who that is")
    }
}
