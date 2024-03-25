//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

   println(calculations(20,30,40))

    println(volume(14*14*14,3.14159,4/3))
    println()
    println( isPalindrome("madam"))
    println( isPalindrome("wow"))
    }


//  Question1
fun words(name2:String){
   var  name2=  listOf("barnie bakes brown bagels and burns")
    println(name2)
}

//QUESTION2
fun calculations (num1:Int,num2:Int,num3:Int):Int{
    var num1= 20
    var num2 = 30
    var num3 = 40
    var num4 = num1+num2+num3
    return(num4)


}
//QUESTION3
fun volume(radius:Int,pi: Double,num:Int):Double{
    var radius = 14*14*14
    var pi = 3.14159
    var num = 4/3
    var result = radius*pi*num
    return(result)

}
//QUESTION4
fun isPalindrome(word:String):Boolean {
    if (word.equals("madam")) {
        return(true)
    } else {
        return(false)
    }
}