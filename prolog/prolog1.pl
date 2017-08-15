v(carro,10).
v(moto,5).
v(largo,30).
	
	
:- initialization main.

main:-
	read_line_to_codes(user_input,X),
	string_to_atom(X,Z),
	v(Z,Y),
	write(Y),nl.

	

