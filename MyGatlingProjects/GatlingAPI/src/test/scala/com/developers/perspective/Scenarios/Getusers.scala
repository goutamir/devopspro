package com.developers.perspective.Scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Getusers {

  val getusersHttp = http("get all users")
    .get("/")
    .check(status is 200)

  val getusers = scenario("Get All users")
    .exec(getusersHttp)

}