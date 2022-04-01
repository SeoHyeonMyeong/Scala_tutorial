package tutor

object Types:
    def test() =
        println("This is Types Tutorial!")
        println("------------------------------")

        val b: Byte = 1
        val x: Int = 1
        val l: Long = 1
        val s: Short = 1
        val d: Double = 2.0
        val f: Float = 3.0
        val c: Char = 'a'
        val str: String = "Hi"

        println("Byte   Type b: " + b)
        println("Int    Type x: " + x)
        println("Long   Type l: " + l)
        println("Short  Type s: " + s)
        println("Double Type d: " + d)
        println("Float  Type f: " + f)
        println("Char   Type c: " + c)
        println("String Type str: " + str)
        println()

        println("Explicit Declare")

        val explicit_int = 3
        val explicit_double = 3.0
        val explicit_char = 'c'
        val explicit_string = "aac"

        println("Integer   -> Int     Type: " + explicit_int)
        println("RealNum   -> Double  Type: " + explicit_double)
        println("Character -> Char    Type: " + explicit_char)
        println("String    -> String  Type: " + explicit_string)
        println("------------------------------")