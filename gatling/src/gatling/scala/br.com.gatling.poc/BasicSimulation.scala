package br.com.gatling.poc

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import scala.concurrent.duration._

class BasicSimulation extends Simulation {

  val httpConf = http.baseURL("https://www.sp.senac.br")

  val scn = scenario("Basic Login Simulation")
    .exec(http("Request Login")
      .get("/login/Login"))

  setUp(
    scn.inject(atOnceUsers(12))
  ).protocols(httpConf)
    .maxDuration(5 minutes)

}