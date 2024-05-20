package services

import models.TaxBands.bands

import javax.inject.Singleton

@Singleton
class TaxService {
  def getBand(income: Double): String = {
    bands.find { band =>
      income >= band.lowerLimit && income <= band.upperLimit
    }.map(_.name).getOrElse("No tax band found")
  }
}
