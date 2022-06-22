package demo02_upper_lower

object D02_泛型下界 {

  class Person

  class PoliceMen extends Person

  class SuperMen extends PoliceMen

  // 只能接收PoliceMen或者其父类型
  def demo[T >: PoliceMen](arr: Array[T]) = println(arr)

  def main(args: Array[String]): Unit = {
    demo(Array(new Person, new Person))
    demo(Array(new PoliceMen, new PoliceMen))

    // 运行会报错
    // demo(Array(new SuperMen, new SuperMen))
  }

}
