package br.com.gatling.demo

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import scala.concurrent.duration._

class BasicSimulation extends Simulation {

  val httpConf = http.baseURL("https://github.com")

  val scn = scenario("Basic Login Simulation")
    .exec(http("Request Login")
      .get("/"))

  setUp(
    scn.inject(atOnceUsers(12))
  ).protocols(httpConf)
    .maxDuration(5 minutes)
}
