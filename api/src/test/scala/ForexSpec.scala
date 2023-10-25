import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class ForexSpec extends AnyFlatSpec with Matchers {
  "The Forex api" should "fetch 30 currencies" in {
    val exchangeRates = Forex.getExchangeRates()
    exchangeRates.size should be (30)
  }
}