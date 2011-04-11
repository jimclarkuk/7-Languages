//part 1 - Use foldLeft to compute total size of strings
val expected_pt1 = 11
val input_pt1 = List("one", "two", "three")

//val result_pt1 = (0 /: input_pt1){(sum,str) => sum + str.length}
val result_pt1 = input_pt1.foldLeft(0)((sum,str) => sum + str.length)

if(result_pt1 == expected_pt1)
	println("pass 1st")
else
	println("fail 1st")
	         
	
// part 2 - Create censor trait                          
val inputStr_pt2 = List("blah", "boo", "Shoot", "shit", "Darn")
val expectedStr_pt2 = List("blah", "boo", "Pucky", "shit", "Beans")
	
val replacements = Map("Shoot" -> "Pucky", "Darn" -> "Beans")

// This is a bit pointless - it would be good to to pass in the strList during construction
class TextThing()

trait Censor {
	def censor(strList:List[String]) = {strList.map(word => if(replacements.contains(word)) replacements(word) else word)}
}                               
                                                             
class Fixture() extends TextThing with Censor

val instance = new Fixture()

if(instance.censor(inputStr_pt2) == expectedStr_pt2)
	println("pass 2nd")
else
	println("fail 2nd")                            
	

//part 3 - Load Censor from file
val inputStr_pt3 = List("blah", "boo", "Shoot", "shit", "Darn")
val expectedStr_pt3 = List("blah", "foo", "Shoot", "mitt", "Darn")

import scala.collection.mutable.HashMap
val loadedReplacements = new HashMap[String, String]

io.Source.fromFile("day2_replacements.txt").getLines().foreach {line => val sp = line.split(", "); loadedReplacements += sp(0) -> sp(1)}

val resultStr_pt3 = inputStr_pt3.map(word => if(loadedReplacements.contains(word)) loadedReplacements(word) else word)   
                       
if(resultStr_pt3 == expectedStr_pt3)
	println("pass 3rd")    
else
	println("fail 3rd")