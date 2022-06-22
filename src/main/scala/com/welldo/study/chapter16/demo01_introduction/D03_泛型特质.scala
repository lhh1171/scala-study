package demo01_introduction

object D03_泛型特质 {

  trait Logger[T] {
    val a: T

    def show(b: T)
  }

  object ConsoleLogger extends Logger[String] {
    override val a: String = "李智恩"

    override def show(b: String): Unit = println(b)
  }

  def main(args: Array[String]): Unit = {
    println(ConsoleLogger.a)
    ConsoleLogger.show("xxx")
  }

}
