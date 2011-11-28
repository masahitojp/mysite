package models

import java.util.{Date}

import play.api.db._
import play.api.Play.current

import anorm._
import anorm.SqlParser._

case class Account(id: Pk[Long], url: String, title: String)

object Account {
  
  // -- Parsers
  
  /**
  * Parse a Computer from a ResultSet
  */
  val simple = {
    get[Pk[Long]]("id") ~/
    get[String]("url") ~/
    get[String]("title")^^ {
      case id~url~title => Account(id, url, title)
    }
  }

  // -- Queries
  
  /**
   * Retrieve all accounts.
  */
  def findAll: Seq[Account] = {
    DB.withConnection { implicit connection =>
      SQL("select * from account").as(Account.simple *)
    }
  }

  /**
  * Retrieve all accounts.
  */
  def findByGroupId(GroupId: Long): Seq[Account] = {
    DB.withConnection { implicit connection =>
      SQL("select * from account where group_id = {GroupId}").on(
        'GroupId -> GroupId
      ).as(Account.simple *)
    }
  }
}   

object AccountGroup extends Enumeration {
  type AccountGroup = Value
  val NONE, NOTE, PRODUCT, WEBSERVICEACCOUNT = Value
}