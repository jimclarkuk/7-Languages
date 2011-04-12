val movies = 
	<movies>
		<movie genre="action">Pirates</movie>
		<movie genre="fairytale">Edward</movie>
	</movies>

def doChore(chore: String): String = chore match {
	case "clean dishes" => "scrub, dry"
	case "cook dinner" => "chop, sizzle"
	case _ => "whine, complain"
} 

//println(doChore("cook dinner"))

def factorial(n: Int): Int = n match {
	case 0 => 1
	case x if x > 0 => factorial(n-1)*n
} 

//println(factorial(3)) 
//println(factorial(0)) 

import scala.actors._
import scala.actors.Actor._

case object Poke
case object Feed

class Kid() extends Actor {
	def act() {
		loop {
			react {
				case Poke => {
					println("ow ...")
					println("quit it ...")
				}                        
				case Feed => {
					println("Gurgle ...")
					println("Burp ...")
				}
			}
		}
	}
}

val bart = new Kid().start
val lisa = new Kid().start

println("ready")
bart ! Poke
lisa ! Poke
bart ! Feed
lisa ! Feed

println("done") 