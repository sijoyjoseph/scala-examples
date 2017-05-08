val oneTwo = List(1 ,2)
val threeFour = List(3, 4)

val all = oneTwo ::: threeFour

println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + all + " is a new list.")
