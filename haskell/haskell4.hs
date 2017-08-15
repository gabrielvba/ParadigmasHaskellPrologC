main = do 
   x <- getLine
   let l1 = (words x)
   y <- getLine
   let l2 = (words y)
   nsei l1 l2
    
  

nsei:: String -> String -> IO ()
nsei (a:as) (b:bs)  =  if a == as 
                            then print a 
                       else print  a 
                            nsei as bs
    


