class board {
	var rows = List(new Array[String](3), new Array[String](3), new Array[String](3))
	rows.foreach{row =>
		row(0) = " "     
  		row(1) = " "     
		row(2) = " "     
	}
		
	def printBoard {
		 rows.foreach{row =>
			row.foreach{cell => 
				print(cell)
			}
			println
		    println("---")
		}
	}
	
	def setCell(x: Int, y: Int, value: String) {
		var row = rows(x)
		row(y) = value
	}
	
	def solved: Boolean = {
		rows.foreach{ row =>
			if(!row(0).equals(" ") && row(0).equals(row(1)) && row(0).equals(row(2))){
				return true
			}
		}
		for(column <- 0 to 2){
			if(!rows(0)(column).equals(" ") &&rows(0)(column).equals(rows(1)(column)) && rows(0)(column).equals(rows(2)(column))){
				return true
			}
		}
		if(!rows(0)(0).equals(" ") && rows(0)(0).equals(rows(1)(1)) && rows(0)(0).equals(rows(2)(2))){
			return true
		}                                                    
		if(!rows(0)(2).equals(" ") && rows(0)(2).equals(rows(1)(1)) && rows(0)(2).equals(rows(2)(0))){
			return true
		}
		return false
	}
}	
val b = new board()
b. setCell(0, 0, "x")
b.printBoard       
var turn = "x"
while(!b.solved){
	println("Player "+turn+" make your move")
	println("enter row:")
	val row = Console.readInt
	if(row<3){
		println("enter column:")
		val col = Console.readInt
		if(col<3) {
			b.setCell(row, col, turn)
			b.printBoard
			turn = (if(turn == "x") "o" else "x")
		} else {
			println("oops, try again")
		}
	} else {
		println("oops, try again")
	}
}                                        
println("Congrats "+ (if(turn == "x") "o" else "x"))
