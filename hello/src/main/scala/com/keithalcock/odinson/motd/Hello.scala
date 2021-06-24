package com.keithalcock.odinson.motd

import ai.lum.odinson.plugins.motd.MOTD

import java.io.PrintStream

class Hello extends MOTD {
  override def show(printWriter: PrintStream): Unit = {
    val user = System.getProperty("user.name")

    printWriter.println(s"Hello, $user!")
  }
}
