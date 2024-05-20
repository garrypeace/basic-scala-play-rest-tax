package models

case class TaxBand(name: String, rate: Double, lowerLimit: Double, upperLimit: Int)

object TaxBands {
   private val bands = List(
    TaxBand("Personal Allowance", 0.0, 0, 12570),
    TaxBand("Basic Rate", 0.2, 12571, 50270),
    TaxBand("Higher Rate", 0.4, 50271, 150000),
    TaxBand("Additional Rate", 0.45, 150001, 999_999_999)
  )

  def getBand(income: Double): String = {
    bands.find { band =>
      income >= band.lowerLimit && income <= band.upperLimit
    }.map(_.name).getOrElse("No tax band found")
  }
}