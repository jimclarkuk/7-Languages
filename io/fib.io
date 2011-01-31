fib := method(num, 
    (
	if(num == 0, 0, if(num == 1, 1, return (call fib(num-1)) + call fib(num-2))))
	)             
(fib(0) == 0) println
(fib(1) == 1) println
(fib(2) == 1) println
(fib(3) == 2) println
(fib(4) == 3) println
(fib(5) == 5) println
(fib(6) == 8) println



