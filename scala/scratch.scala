def whileloop {
	var i = 1
	while(i<=3){
		println(i)     
		i = i+1
	}
}

def forloop {
	println("java style for")
	for(i <- 0 until args.length){
		println(args(i))
	}
}

def rubyfor {
	println("ruby for")
	args.foreach{ arg => println(arg)
	}
}   
