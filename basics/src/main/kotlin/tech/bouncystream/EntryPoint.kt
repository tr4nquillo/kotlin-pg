package tech.bouncystream


import tech.bouncystream.sub.JavaStylePerson
import tech.bouncystream.sub.KotlinStylePerson
import tech.bouncystream.sub.StrangeKotlinStylePerson
import tech.bouncystream.sub.YetAnotherKotlinStylePerson
import tech.bouncystream.sub.dynamicCall
import tech.bouncystream.sub.greet

fun main() {

    // calling a function in a file from the same package
    show("Basic function call from another file in the same package.")

    // calling a function in a file from another package
    greet()
    
    // calling a function with a param
    greet("Ciao!")

    // calling a function in a file from another package that
    dynamicCall()

    val jp = JavaStylePerson("Francesco")
    println(jp.getName())

    val kp = KotlinStylePerson("Fredo")
    println(kp.name)

    val skp = StrangeKotlinStylePerson("Aurelio")
    println(skp.name)

    val ykp = YetAnotherKotlinStylePerson("Fernando", "Magellan")
    println(ykp.fullName())
}
