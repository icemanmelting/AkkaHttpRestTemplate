package pt.iceman.akkatemplate

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import pt.iceman.akkatemplate.routes.HealthRoute
import pt.iceman.akkatemplate.controllers.HealthController

import scala.io.StdIn

/**
  * Created by iCeMan on 18/01/2017.
  */
object Main {
  val host = "localhost"
  val port = 8080

  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem("simple-rest-system")
    implicit val materializer = ActorMaterializer()
    implicit val executionContext = system.dispatcher

    val healthController = new HealthController
    val routes = new HealthRoute(healthController)

    //Startup, and listen for requests
    val bindingFuture = Http().bindAndHandle(routes(), host, port)
    println(s"Waiting for requests at http://$host:$port/...\nHit RETURN to terminate")
    StdIn.readLine()

    //Shutdown
    bindingFuture.flatMap(_.unbind())
    system.terminate()
  }
}
