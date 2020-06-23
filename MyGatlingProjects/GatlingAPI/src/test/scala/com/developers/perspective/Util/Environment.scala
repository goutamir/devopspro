package com.developers.perspective.Util

import java.util

object Environment{

  val baseURL = scala.util.Properties.envOrElse("baseURL","https://radar-webservices.apple.com/signon")
  val users = scala.util.Properties.envOrElse("numberofusers","1")
  val maxResponseTime = scala.util.Properties.envOrElse("maxResponseTime","500") //in milliseconds

}