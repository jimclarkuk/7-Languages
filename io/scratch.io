go := method(num,       
	if(num == 0, return 1)
    if(num == 1, return 1)
	num println
    return call go (num-1)
	)
go(3)
