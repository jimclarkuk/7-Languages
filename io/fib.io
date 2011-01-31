fibr := method(num, 
    (
	if(num == 0, 0, if(num == 1, 1, return (call fibr(num-1)) + call fibr(num-2))))
	)
	
fibl := method(num,
	(
	if(num == 0, return 0)
	if(num == 1, return 1)
	valM1:=0
	val:=1
	for(i, 1, num-1, (
	newVal := valM1+val
	valM1 := val
	val := newVal)))
	return val
	)
	
"Results of the looping call" println
(fibr(0) == 0) println
(fibr(1) == 1) println
(fibr(2) == 1) println
(fibr(3) == 2) println
(fibr(4) == 3) println
(fibr(5) == 5) println
(fibr(6) == 8) println

"Results of the recursive call" println
(fibl(0) == 0) println
(fibl(1) == 1) println
(fibl(2) == 1) println
(fibl(3) == 2) println
(fibl(4) == 3) println
(fibl(5) == 5) println
(fibl(6) == 8) println
