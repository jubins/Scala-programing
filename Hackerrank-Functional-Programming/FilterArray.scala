//Solution 1
def f(delim:Int,arr:List[Int]):List[Int] ={
	arr.filter(_ < delim)
}


//Solution 2

def f(delim:Int,arr:List[Int]):List[Int] ={
	var flt_arr = for {i <- arr if (i < delim)} yield (i)

	flt_arr
}
