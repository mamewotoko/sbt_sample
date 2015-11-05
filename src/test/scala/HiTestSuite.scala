import org.scalatest.FunSuite

class HiTestSuite extends FunSuite {
	test("addition") {
		assert(Hi.plus(1, 2) == 3)
		//assert(Hi.plus(1, 2) == 4)
	}
}
