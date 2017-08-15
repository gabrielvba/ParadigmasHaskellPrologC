contaLetra(L, [] , 0).
contaLetra(L, [L|T] , S):- contaLetra(L, T, G), S is 1 + G.
contaLetra(L, [H|T] , S):- contaLetra(L, T, G), S is G.

:- initialization main.

main:-

  read_line_to_codes(user_input,P),
  string_to_atom(P,P1),

  read_line_to_codes(user_input,X),
  string_to_atom(X,P2),
  string_chars(P2,L2),
 
  contaLetra(P1,L2,S),
  write(S),nl.


