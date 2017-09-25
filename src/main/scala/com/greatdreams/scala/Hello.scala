package com.greatdreams.scala

import org.slf4j.LoggerFactory

object Hello {
  val logger = LoggerFactory.getLogger(Hello.getClass)

  def main(args: Array[String]): Unit = {
    logger.info("Application begins to run...")

  }
}