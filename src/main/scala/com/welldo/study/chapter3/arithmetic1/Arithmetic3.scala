package com.welldo.study.chapter3.arithmetic1

/**
  * Scala中没有++、--操作符，需要通过+=、-=来实现同样的效果
  *
  * author welldo
  * 2019/11/17
  */
object Arithmetic3 {

  def main(args: Array[String]): Unit = {
    var i = 10

    i += 1  //i = i+1
    println(i)

    i -= 1  //i = i-1
    println(i)

  }

}
