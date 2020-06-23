package com.developers.perspective.Scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Postuser {

    val userString = "{\"firstName\":\"Scala\", \"lastName\":\"Java\",\"role\":\"ADMIN\"}"

    val postUserHttp = http("post user")
      .post("")
      .body(StringBody(userString))
      .check(status is 201)

    val postUser = scenario("post user")
      .exec(postUserHttp)

}