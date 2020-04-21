
contient(r1, oeuf).
contient(r1, carotte).
contient(r1, pommeTerre).
contient(r1, oignon).
contient(r1, farine).
contient(r1, poudrePate).

contient(r2, brocoli).
contient(r2, pain).
contient(r2, pimentRouge).
contient(r2, ail).
contient(r2, cheddar).

contient(r3, bouillonLegume).
contient(r3, chouHache).
contient(r3, carotte).
contient(r3, haricot).
contient(r3, tomate).
contient(r3, poudreAil).

contient(r4, huileOlive).
contient(r4, oignon).
contient(r4, cummin).
contient(r4, rizBrun).
contient(r4, lentille).

contient(r5, thon).
contient(r5, mayonnaise).
contient(r5, moutardeJaune).
contient(r5, jusCitron).
contient(r5, celeri).
contient(r5, poivronVert).
contient(r5, poivreNoir).
contient(r5, laitueRomaine).
contient(r5, tortillas).

contient(X, poisson):- contient(X,thon).

vegetarien(X):- not(contient(X,porc)), not(contient(X,boeuf)), not(contient(X,poulet)), not(contient(X,poisson)), not(contient(X,fruitMer)).
