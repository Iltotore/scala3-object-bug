//Does not compile if a match type is involved
type Foo[T] = T match
  case _ => FooImpl[T]

trait FooImpl[A]:

  def apply(value: String): Any = ???