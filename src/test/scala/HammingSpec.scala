import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class HammingSpec extends AnyFlatSpec with should.Matchers {
  behavior of "The hammingDistance method"

  it should "return Some with the number of differences for two strings of equal length" in {
    Hamming.hammingDistance("GAGCCTACTAACGGGAT", "CATCGTAATGACGGCCT") shouldBe Some(7)
  }

  it should "return None for sequences of different lengths" in {
    Hamming.hammingDistance("GAGCCTACTAACGGGAT", "CATCGTAA") shouldBe None
  }
}
