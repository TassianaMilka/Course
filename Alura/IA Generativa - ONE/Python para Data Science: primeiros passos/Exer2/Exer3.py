

#1-Crie uma variável chamada “frase” e atribua a ela uma string de sua escolha. Em seguida, imprima a frase na tela.

frase = input('Informe uma frase:')

print(f'{frase}')

######


#2-Crie um código que solicite uma frase à pessoa usuária e imprima a mesma frase digitada mas com todas as letras minúsculas.

frase = input('Informe uma frase:')
frase_minuscula = frase.lower()
print(frase_minuscula)

######

#3-Crie uma variável chamada “frase” e atribua a ela uma string de sua escolha. Em seguida, imprima a frase sem espaços em branco no início e no fim.

frase="Frasesemespaço";

print(frase)

######


#4-Crie um código que solicite uma frase à pessoa usuária e imprima a mesma frase sem espaços em branco no início e no fim e em letras minúsculas.

frase = input('Informe uma frase sem espaço:')
frase_minuscula = frase.lower()
print(frase_minuscula)

######


#5-Crie um código que solicite uma frase à pessoa usuária e imprima a mesma frase com todas as vogais “e” trocadas pela letra “f”.

frase = input('Informe uma frase com vogais que contém a letra "e":')
novo_texto = frase.replace("e", "f")
print(novo_texto)

######


#6-Crie um código que solicite uma frase à pessoa usuária e imprima a mesma frase com todas as vogais “a” trocadas pela caractere “@”.

frase = input('Informe uma frase com vogais que contém a letra "e":')
novo_texto = frase.replace("a", "@")
print(novo_texto)

######


#7-Crie um código que solicite uma frase à pessoa usuária e imprima a mesma frase com todas as consoantes “s” trocadas pelo caractere “$”.


frase = input('Informe uma frase com vogais que contém a letra "e":')
novo_texto = frase.replace("s", "$")
print(novo_texto)



