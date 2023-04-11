fun main() {
//    You are creating an app to capture student records. Some of the data you will
//capture includes full name, age, phone number, weight in kg and citizen. For the
//citizen field you will track whether a student is a Kenyan or not.
//Create variables and assign them some values for each of these fields.
    var name = "lekishonsheila"
    println(name)
    var age: Byte = 15
    println(15)
    var phonenumber: Long = +27645787960
    println(+27645787960)
    var weight: Short = 55
    println(55)
    var citizenshipIsKenyan: Boolean = false
    println(citizenshipIsKenyan)

    val strings = arrayOf("Hello", "world", "!")
    val joinedString = joinStrings(strings)
    println(joinedString) // Output: HelloWorld!

}
//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun joinStrings(strings: Array<String>): String {
    return strings.joinToString("")
}

