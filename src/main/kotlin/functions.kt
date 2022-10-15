fun main() {
 isEvenNumber(1901)
    println(checkEvenNumber(13))

    println(addTwoNumber(
        y=34,
        x=23
    ))

    println(addNumbers(1,2,))

}

fun isEvenNumber(number: Int){
    if (number%2==0){
        println("Is even")
    }  else {
        println("Is odd")
    }
}
fun checkEvenNumber(number: Int)= number%2==0
fun addTwoNumber(x:Int,y:Int=10) =x+y
fun addNumbers(vararg numbers:Int):Int{
    var result =0

    numbers.forEach { number->
        result +=number
    }
    return  result
}