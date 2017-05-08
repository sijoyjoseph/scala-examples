// Parametrizing both type and value

val greetings = new Array[String](3)

greetings(0) = "Hello"
greetings(1) = ", "
greetings(2) = "world!"

for (i <- 0 to 2)
  print(greetings(i))

println()


// In more explicit terms
// val greetings: Array[String] = new Array[String](3)
//
// Very Verbose. What scala does internally
/* val greetings: Array[String] = new Array[String](3)
 * greetings.update(0, "Hello")
 * greetings.update(1, ", ")
 * greetings.update(2, "world!")
 *
 * for (1 <- (1).to(2))
 *  print(greetings.apply(i))*/

// Another implementation
// val greetings = Array("zero", "one", "two")
// More verbose way of doing this is ----- val greetings = Array.apply("zero", "one", "two")
