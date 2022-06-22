package demo02_upper_lower

// 如果既需要上界，又需要下届，那么下届在前，上界在后
object D03_泛型上下界 {

  class Person

  class PoliceMen extends Person

  class SuperMen extends PoliceMen

  // 只接收PoliceMen类型
  // def demo(arr: Array[PoliceMen]) = println(arr)
  // 上下界写法
  def demo[T >: PoliceMen <: PoliceMen](arr: Array[T]) = println(arr)

  def main(args: Array[String]): Unit = {
    demo(Array(new PoliceMen, new PoliceMen))
  }

}
