fun main(args: Array<String>) {
    var isBlank : Boolean = false
    println(isBlank)
    println(isBlank.not())

    var isWhatever : Boolean = true
    println(isWhatever.not())
    println(isWhatever)


// isBlank makes the isWhatver to be blank as well.
    isWhatever= "".isBlank()
    println(isWhatever)

//  isNotBlank makes the isWhatever to be not blank.
    isWhatever= "".isNotBlank()
    println(isWhatever)


// write sth inside isWhatever then use isNotblank and isblank

    isWhatever = "hi friend". isNotBlank()
    println(isWhatever)

    isWhatever= "hi friend".isBlank()
    println(isWhatever)

/* isEmpty vs isBlank :

    isEmpty is used to return true if ,and only if ,string length is 0.
    isBlank is used to return for non-whitespace characters. It doesnt check the string length.
 */

    isWhatever= "hi friend".isEmpty()
    println(isWhatever)

// boolean with operators

    val q1 = true && true
    println(q1)
    println(q1.not())

    val q2 = false || false
    println(q2)

    val q3 = false || true
    // q3= false
    println(q3.not())


    val q4 = false && true
    // q4= true
    println(q4.not())

    val q5: Boolean = (true && 1 != 2) || (4 > 3 && 100 <1)
    // q5= true
    println(q5)

    val q6: Boolean = ((10/2)>3) && ((10%2)==0)
    //q6= true
    println(q6)

    val myBoolean : Boolean = true
    println("$myBoolean")
    println(myBoolean)

//Boolean with expression if and else

    var a:Int = 10
    var b:Int =1000
    var max:Int = 0
    //var max: Int

    if (a>b){
        max=a
        println(max)
    }
    else {
        max=b
        println(max)
    }

    var compareAB: Boolean = a > b
    println(compareAB)




}