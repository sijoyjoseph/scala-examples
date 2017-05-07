// More functional way.

// args.foreach(args => println(args))

// If you prefer to be more explicit, you can also mention the type name, but the 
// argument protion needs to be wrapped in parantheses.

args.foreach((args: String) => println(args))
