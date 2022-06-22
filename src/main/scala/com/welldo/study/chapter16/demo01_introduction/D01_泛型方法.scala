package demo01_introduction

object D01_泛型方法 {

  // 定义方法用于获取任意类型数组的中间元素

  // 方式1：普通方法
  //  def getMiddleElement(arr: Array[Any]) = arr(arr.length / 2)

  // 方式2：泛型实现
  def getMiddleElement[T](arr: Array[T]): T = arr(arr.length / 2)

  def main(args: Array[String]): Unit = {

    println(getMiddleElement(Array(1, 2, 3, 4, 5, 6)))
    println(getMiddleElement(Array("a", "b", "c", "d", "e", "f")))

  }
}
