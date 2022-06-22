package demo03_convert

// 非变：类A和类B之间是父子类关系，但是Pair[A]和Pair[B]之间没有任何关系（Scala默认非变）
// 协变：类A和类B之间是父子类关系，Pair[A]和Pair[B]之间也是父子类关系
// 逆变：类A和类B之间是父子类关系，但是Pair[A]和Pair[B]之间是子父类关系
object 非变协变逆变 {

  class Father

  class Son extends Father

  // 非变
  class Temp1[T]

  // 协变
  class Temp2[+T]

  // 逆变
  class Temp3[-T]

  def main(args: Array[String]): Unit = {

    // 非变
    val t1: Temp1[Father] = new Temp1[Father]
    // 编译报错，Temp1[Father]和Temp1[Son]无任何关系
    //    val t2: Temp1[Son] = t1

    // 协变
    val t3: Temp2[Son] = new Temp2[Son]
    val t4: Temp2[Father] = t3

    // 逆变
    val t5: Temp3[Father] = new Temp3[Father]
    val t6: Temp3[Son] = t5

  }

}
