package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json.Json
import services.TaxService

class TaxController @Inject()(cc: ControllerComponents, taxService: TaxService) extends AbstractController(cc) {
  def getBand(income: Double): Action[AnyContent] = Action {
    val tax = taxService.getBand(income)
    Ok(Json.obj("income" -> income, "tax" -> tax))
  }
}