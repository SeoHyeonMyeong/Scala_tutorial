package tutor

object Variables:
    def test() =
        println("This is Variables Tutorial!")
        println("------------------------------")

        var variable_1 = "this is var"
        val variable_2 = "this is val"
        println(variable_1)
        println(variable_2)
        variable_1 = "this is changed var"

        println(variable_1)
        println(variable_2)
        println("val created an immutable variable!")
        println("------------------------------")
