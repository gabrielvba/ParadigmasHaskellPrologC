
main = do 
   x <- getLine
   let ideal = read x:: Double
   y <- getLine
   let diferenca = read y:: Double
   nsei(ideal,ideal,diferenca)

nsei:: Double -> Double -> Double  -> String
nsei ideal alturaAnterior altura  	=
    if(altura == 0)
        then print "ok"
        else if (alturaAnterior-altura)> 0
		    then print "PERIGO"
		         nsei(ideal,altura,recebe)
		    else print "ADEQUADO"
		         nsei(ideal,altura,recebe)


recebe:: Double
recebe = z <- getLine
let diferenca = read z:: Double

