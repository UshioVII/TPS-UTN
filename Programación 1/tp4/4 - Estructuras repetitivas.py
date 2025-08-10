import random

# Ejercicio 1
print("Ejercicio 1:")
for i in range(101):
    print(i)

# Ejercicio 2
print("\nEjercicio 2:")
num = input("Ingresá un número entero: ")
print("Cantidad de dígitos:", len(num.strip("-")))

# Ejercicio 3
print("\nEjercicio 3:")
a = int(input("Ingresá el primer número: "))
b = int(input("Ingresá el segundo número: "))
inicio = min(a, b) + 1
fin = max(a, b)
suma = sum(range(inicio, fin))
print("La suma entre los números (sin incluirlos) es:", suma)

# Ejercicio 4
print("\nEjercicio 4:")
total = 0
while True:
    num = int(input("Ingresá un número (0 para salir): "))
    if num == 0:
        break
    total += num
print("Suma total:", total)

# Ejercicio 5
print("\nEjercicio 5:")
numero_secreto = random.randint(0, 9)
intentos = 0
while True:
    intento = int(input("Adiviná el número (entre 0 y 9): "))
    intentos += 1
    if intento == numero_secreto:
        print("¡Correcto! Lo lograste en", intentos, "intentos.")
        break
    else:
        print("Incorrecto, probá otra vez.")

# Ejercicio 6
print("\nEjercicio 6:")
for i in range(100, -1, -1):
    if i % 2 == 0:
        print(i)

# Ejercicio 7
print("\nEjercicio 7:")
n = int(input("Ingresá un número entero positivo: "))
suma = sum(range(n + 1))
print("La suma de los números entre 0 y", n, "es:", suma)

# Ejercicio 8
print("\nEjercicio 8:")
cantidad = 100 # Definimos la cantidad de números a ingresar
pares = impares = negativos = positivos = 0
for _ in range(cantidad):
    num = int(input("Ingresá un número: "))
    if num % 2 == 0:
        pares += 1
    else:
        impares += 1
    if num < 0:
        negativos += 1
    elif num > 0:
        positivos += 1
print("Pares:", pares)
print("Impares:", impares)
print("Negativos:", negativos)
print("Positivos:", positivos)

# Ejercicio 9
print("\nEjercicio 9:")
cantidad = 100 # Definimos la cantidad de números a ingresar
total = 0
for _ in range(cantidad):
    num = int(input("Ingresá un número: "))
    total += num
media = total / cantidad
print("La media de los números es:", media)

# Ejercicio 10
print("\nEjercicio 10:")
numero = input("Ingresá un número para invertir: ")
invertido = numero[::-1]
print("Número invertido:", invertido)