package pt.iceman.akkatemplate.routes

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import pt.iceman.akkatemplate.controllers.HealthController
import pt.iceman.akkatemplate.jsonsupport.JsonSupport
import pt.iceman.akkatemplate.models.Health

/**
  * Created by iCeMan on 18/01/2017.
  */
class HealthRoute(templateController: HealthController) extends JsonSupport {
  def apply(): Route = path("health") {
    get {
      complete(templateController.getStuff)
    } ~ post {
      entity(as[Health]) { t =>
        complete(templateController.setStuff(t))
      }
    }
  }
}
