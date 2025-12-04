package tech.bouncystream.sub

fun greet(customGreet: String) {
    println(customGreet)
}

fun greet() {
    println("Hello!")
}

/**
 * Printing the name of the file that contains the function
 *
 * 1. instancing Throwable class
 * 2. calling the method stackTrace()
 * 3. calling the getter of the member variable 'fileName' in the class [StackTraceElement]
 * 4. printing the file name in a new line
 */
fun dynamicCall() {
    println(Throwable().stackTrace[0].fileName)
}

class JavaStylePerson {
    private val name: String

    constructor(pName: String) {
        this.name = pName;
    }

    fun getName() : String {
        return "Java-style person called $name."
    }
}

/*
    straightforward:
    1. defining a member variable, which is public, but immutable
    2. getter is automatically included
    3. full-args constructor is also included

    This type of class definition is very similar to record in Java.
 */
class KotlinStylePerson(val name:String )

/*
    this doesn't seem right -> adding another member variable, which is public and
    immutable, attaching getter to it and returning the value of the _name

    however it works
 */
class StrangeKotlinStylePerson(private val _name:String) {
    val name: String
        get() = "Very strange Kotlin-style person called $_name."

}

/*
    this is constructor delegation
    since what's after the class name is always the primary constructor,
    the one I define with the keyword 'constructor' delegates to the primary one for
    the initialization of the member 'name'.
 */
class YetAnotherKotlinStylePerson(private val name: String) {
    private var surname: String = ""

    constructor(nameValue: String, surnameValue: String) : this(nameValue)  {
        this.surname = surnameValue;
    }

    fun fullName() : String {
        return "Yet another Kotlin-style person called $name $surname.";
    }
}






