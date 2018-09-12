frase = input("ingrese una frase:")

temp = frase.replace(' ','')

if temp == temp[::-1]:
	print('La frase es palindromo')
else:
	print('la frase no es palindromo')