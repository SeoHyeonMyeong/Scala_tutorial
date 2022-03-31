package math

class MathUtilsTests extends munit.FunSuite:

    // test 1
    test("'double' should handle 0") {
        val result = MathUtils.double(0)
        assert(result == 0)
    }

    // test2
    test("'double' should handle 1") {
        val result = MathUtils.double(1)
        assert(result == 2)
    }

end MathUtilsTests