package example

case class Foo(value: Int)

case class MyClass(a: Int)
object MyClass extends scalikejdbc.SQLSyntaxSupport[MyClass]

object Test {
  def bar: scalikejdbc.SQLSyntaxSupport[_] = ???

  def test(): Unit = {
    scalikejdbc.withSQL(
      scalikejdbc.update(bar).set().where.eq(MyClass.column.a, Foo(1))
    )
  }
}
