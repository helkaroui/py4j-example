package dev.sharek.examples

import py4j.GatewayServer

object Py4jExample {

  def main(args: Array[String]): Unit = {

    val server = new GatewayServer(new App, 25333, 0, 0)
    server.start()
  }
}


class App {
  def addition(first: Int, second: Int): Int = first + second
}