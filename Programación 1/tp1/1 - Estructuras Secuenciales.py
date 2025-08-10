#Nombre: Diego Raul Montes.
#TP 1 Secuenciales

#1. Crear un programa que imprima por pantalla el mensaje: “Hola Mundo!”.

print("¡Hola Mundo!")

#2. Crear un programa que pida al usuario su nombre e imprima por pantalla un saludo usando el nombre ingresado.
#Por ejemplo: si el usuario ingresa “Marcos”, el programa debe imprimir por pantalla “Hola Marcos!”. Consejo: esto será más sencillo si utilizas print(f…) para realizar la impresión por pantalla.

ej2nombre = input("¿Cómo te llamas?: ")
print(f"¡Hola {ej2nombre}!")

#3. Crear un programa que pida al usuario su nombre, apellido, edad y lugar de residencia e imprima por pantalla una oración con los datos ingresados.
#Por ejemplo: si el usuario ingresa “Marcos”, “Pérez”, “30” y “Argentina”, el programa debe imprimir “Soy Marcos Pérez, tengo 30 años y vivo en Argentina”. Consejo: esto será más sencillo si utilizas print(f…) para realizar la impresión por pantalla.

ej3nombre = input("Ingrese su nombre: ")
ej3apellido = input("Ingrese su apellido: ")
ej3edad = input("Ingrese su edad: ")
ej3residencia = input("Ingrese su lugar de residencia: ")

print(f"“Soy {ej3nombre} {ej3apellido}, tengo {ej3edad} años y vivo en {ej3residencia}.")

#4) Crear un programa que pida al usuario el radio de un círculo e imprima por pantalla su área y su perímetro.

ej4radio = float(input("Ingrese el radio del circulo: "))
ej4area = 3.1416 * ej4radio ** 2
ej4perimetro = 2 * 3.1416 * ej4radio
print(f"El área del circulo es: {ej4area} y el perimetro es: {ej4perimetro}")

#5. Crear un programa que pida al usuario una cantidad de segundos e imprima por pantalla a cuántas horas equivale.

ej5segundos = int(input("Ingrese la cantidad de segundos: "))
ej5horas = ej5segundos / 3600
print(f"{ej5segundos} segundos son {ej5horas} horas")

#6. Crear un programa que pida al usuario un número e imprima por pantalla la tabla de multiplicar de dicho número.

ej6numero = int(input("Ingrese un número: "))
for i in range(1, 11):
    print(f"{ej6numero} x {i} = {ej6numero * i}")

#7. Crear un programa que pida al usuario dos números enteros distintos del 0 y muestre por pantalla el resultado de sumarlos, dividirlos, multiplicarlos y restarlos.

ej7numero = int(input("Ingrese un número: "))
ej7numero2 = int(input("Ingrese otro número: "))
if ej7numero != 0 and ej7numero2 != 0:
    print(f"La suma de los números es: {ej7numero + ej7numero2}")
    print(f"La división de los números es: {ej7numero / ej7numero2}")
    print(f"La multiplicación de los números es: {ej7numero * ej7numero2}")
    print(f"La resta de los números es: {ej7numero - ej7numero2}")
    
#8) Crear un programa que pida al usuario su altura y su peso e imprima por pantalla su índice de masa corporal. Tener en cuenta que el índice de masa corporal se calcula del siguiente modo: 

#𝐼𝑀𝐶 = 𝑝𝑒𝑠𝑜 𝑒𝑛 𝑘𝑔 / (𝑎𝑙𝑡𝑢𝑟𝑎 𝑒𝑛 𝑚)°2

ej8altura = float(input("¿Cuantos metros mides?: "))
ej8peso = float(input("¿Cuanto pesas?: "))
ej8imc = ej8peso / ej8altura ** 2
print(f"Tu indice de masa corporal es: {ej8imc}")

#9. Crear un programa que pida al usuario una temperatura en grados Celsius e imprima por pantalla su equivalente en grados Fahrenheit. Tener en cuenta la siguiente equivalencia:

#𝑇𝑒𝑚𝑝𝑒𝑟𝑎𝑡𝑢𝑟𝑎 𝑒𝑛 𝐹𝑎ℎ𝑟𝑒𝑛ℎ𝑒𝑖𝑡 = 9 / 5 . 𝑇𝑒𝑚𝑝𝑒𝑟𝑎𝑡𝑢𝑟𝑎 𝑒𝑛 𝐶𝑒𝑙𝑠𝑖𝑢𝑠 + 32

ej9temperatura = float(input("Ingrese la temperatura en grados Celsius: "))
ej9fahrenheit = ej9temperatura * 9 / 5 + 32
print(f"La temperatura en grados Fahrenheit es: {ej9fahrenheit}")

#10. Crear un programa que pida al usuario 3 números e imprima por pantalla el promedio de dichos números.

ej10numero1 = int(input("Ingrese un número: "))
ej10numero2 = int(input("Ingrese otro número: "))
ej10numero3 = int(input("Ingrese un ultimo número: "))
ej10numero = (ej10numero1 + ej10numero2 + ej10numero3) / 3
print(f"El promedio de los números es: {ej10numero}")

