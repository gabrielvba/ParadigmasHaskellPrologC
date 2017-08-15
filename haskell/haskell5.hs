main = do 
   x <- getLine
   let l1 = (map read $ words x :: [Int])
   y <- getLine
   let l2 = (map read $ words y :: [Int])
   nsei l1 l2
    
    

nsei:: [int]-> [int] -> int
nsei (a:as) (b:bs)  = print a + b
                    
    




