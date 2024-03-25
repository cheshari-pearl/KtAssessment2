import kotlin.reflect.typeOf

fun main() {
   exclude("Barnie bakes brown bagels and buns")
    numbers(4, 2, 6,6)
    //volume(3.14159)
    isPalindrome("hannah")

}



//Qn1
fun exclude(text: String){
    println(text.removeSurrounding("b"))
}


//Qn2

fun numbers(num1: Int, num2:Int, num3: Int, num4: Int) {
    var numbers: Array<Int> = arrayOf(num1, num2, num3, num4)
     println(numbers.sum())
    println(numbers.count())
    println(numbers.sum() / numbers.count())
}


//Qn3
fun volume(pie: Float) {
 var radius = 2
    var volume = 4/3 * $pie * 2**3
    println(volume)


}


//Qn4
fun isPalindrome(word: String) : Boolean {
 var word = "hannah"
    if(word == "hannah"){
        return true
    }
    else{return false
    }

}
