package demo02_upper_lower

object D01_泛型上界 {

  class Person

  class Student extends Person

  // 只能接收Person或者其子类型
  def demo[T <: Person](arr: Array[T]) = println(arr)

  def main(args: Array[String]): Unit = {
    demo(Array(new Person, new Person))
    demo(Array(new Student, new Student))
  }

}
