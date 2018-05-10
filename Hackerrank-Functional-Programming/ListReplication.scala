def f(num:Int,arr:List[Int]):List[Int] = {
  for{x <- arr
      y <- 1 to num
     } yield(x)
}
