package models

case class TaxBand(name: String, rate: Double, lowerLimit: Double, upperLimit: Int)

object TaxBands {
  val bands: List[TaxBand] = List(
    TaxBand("Personal Allowance", 0.0, 0, 12570),
    TaxBand("Basic Rate", 0.2, 12571, 50270),
    TaxBand("Higher Rate", 0.4, 50271, 150000),
    TaxBand("Additional Rate", 0.45, 150001, 999_999_999),
  )
}