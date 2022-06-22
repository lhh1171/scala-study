package demo01_introduction

object D02_泛型类 {

  class Pair[T](var a: T, var b: T)

  def main(args: Array[String]): Unit = {
    val p1 = new Pair[Int](1, 2)
    println(p1.a, p1.b)

    val p2 = new Pair[String]("jk", "kl")
    println(p2.a, p2.b)

  }

}
