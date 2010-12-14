Car := Object clone
Car wheels ::= 4
reliant := Car clone
reliant setWheels(3)     
reliant drive := method(("rollin' on " .. self wheels .. " wheels") println)
methodName := "drive"
reliant perform(methodName)
