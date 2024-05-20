package controllers

import models.TaxBands

import javax.inject._
import play.api.mvc._
import play.api.libs.json.Json

@Singleton
class TaxController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def calculateTax(income: Double): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    val tax = TaxBands.getBand(income)
    Ok(Json.obj("income" -> income, "tax" -> tax))
  }
}