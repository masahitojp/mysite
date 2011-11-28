package controllers

import play.api._
import play.api.mvc._
import play.api.data._

import models._


object Application extends Controller {
  
  def index = Action {
    val notes = Account.findByGroupId(AccountGroup.NOTE.id)
    val products = Account.findByGroupId(AccountGroup.PRODUCT.id)
    val accounts= Account.findByGroupId(AccountGroup.WEBSERVICEACCOUNT.id)

    Ok(views.html.index(notes, products, accounts))
  }
  
}


