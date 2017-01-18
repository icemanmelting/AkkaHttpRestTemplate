package pt.iceman.akkatemplate.jsonsupport

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import pt.iceman.akkatemplate.models.Health
import spray.json.DefaultJsonProtocol

/**
  * Created by iCeMan on 18/01/2017.
  */
trait JsonSupport extends SprayJsonSupport with DefaultJsonProtocol {
  implicit val healthFormat = jsonFormat2(Health)
}