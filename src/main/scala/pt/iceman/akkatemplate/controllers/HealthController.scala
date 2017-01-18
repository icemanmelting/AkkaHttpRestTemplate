package pt.iceman.akkatemplate.controllers

import pt.iceman.akkatemplate.models.Health

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by iCeMan on 18/01/2017.
  */
class HealthController(implicit val executionContext: ExecutionContext) {
  var template = Health("Healthy", "Hi guys!")

  def getStuff: Future[Health] = Future {
    template
  }

  def setStuff(template: Health): Future[Health] = {
    this.template = template
    getStuff
  }
}
