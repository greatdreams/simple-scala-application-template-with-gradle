package com.greatdreams.scala.template

import com.typesafe.config.ConfigFactory
import org.slf4j.LoggerFactory

object MainProgram {
  val logger = LoggerFactory.getLogger(MainProgram.getClass)

  def main(args: Array[String]): Unit = {
    logger.info("Application begins to run...")
    val config = ConfigFactory.load();
    val appName = config.getString("application.name")
    logger.info(s"application name: ${appName}")
    logger.info("Application exit normally...")
  }
}