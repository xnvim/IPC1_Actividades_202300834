Algoritmo palindromo // Josu� Javier Carrera Soy�s - 202300834 - IPC1 A
	
	Definir cadena_usuario Como Caracter
	
	Escribir "Ingresa una cadena: "
	Leer cadena_usuario
	
	longitud_cadena = Longitud(cadena_usuario)
	
	Para i <- 0 Hasta (longitud_cadena) Hacer // formando una nueva cadena, desde el �ltimo car�cter hasta el primero..
		cadena_invertida = cadena_invertida + Subcadena(cadena_usuario, longitud_cadena-i, longitud_cadena-i) 
	FinPara
	
	Si cadena_usuario = cadena_invertida Entonces
		Escribir "�La cadena es un pal�ndromo!"
	SiNo
		Escribir "�La cadena no es un pal�ndromo!"
	Fin Si
	
	Escribir "Cadena ingresada: " + cadena_usuario
	Escribir "cadena_invertida: " + cadena_invertida
		
FinAlgoritmo
