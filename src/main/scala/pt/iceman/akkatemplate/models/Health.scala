package pt.iceman.akkatemplate.models

/**
  * Created by iCeMan on 18/01/2017.
  */
case class Health(status: String, description: String) {
  require(status == "Healthy" || status == "Degraded" || status == "Critical" || status == "Unknown",
    "status must be one of: [\"Healthy\",\"Degraded\",\"Critical\", or \"Unknown\"]")
}
