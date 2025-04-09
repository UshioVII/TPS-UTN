# Ejercicio 1
print("\nEjercicio 1\n")

def imprimir_hola_mundo():
    print("Hola Mundo!")
# Programa principal
imprimir_hola_mundo()

# Ejercicio 2
print("\nEjercicio 2\n")

def saludar_usuario(nombre):
    print(f"Hola, {nombre}!")
nombre_usuario  = input("Introduce tu nombre: ")
saludar_usuario(nombre_usuario )

# Ejercicio 3
print("\nEjercicio 3\n")

def informacion_personal(nombre, apellido, edad, residencia):
    print(f"Soy {nombre} {apellido}, tengo {edad} años y vivo en {residencia}.")
input_nombre = input("Introduce tu nombre: ")
input_apellido = input("Introduce tu apellido: ")

# Validación
while True:
    try:
        input_edad = int(input("Introduce tu edad: "))
        break
    except ValueError:
        print("Por favor, introduce un número válido para la edad.")
input_residencia = input("Introduce tu residencia: ")

informacion_personal(input_nombre, input_apellido, input_edad, input_residencia)

# Ejercicio 4
print("\nEjercicio 4\n")

def calcular_area_circulo(radio):
    area = 3.14 * radio ** 2
    return area
def calcular_perimetro_circulo(radio):
    perimetro = 2 * 3.14 * radio
    return perimetro

# Validación
while True:
    try:
        input_radio = float(input("Introduce el radio del círculo: "))
        break
    except ValueError:
        print("Por favor, introduce un número válido para el radio.")
# Llamo a las funciones para calcular el área y el perímetro
area = calcular_area_circulo(input_radio)
perimetro = calcular_perimetro_circulo(input_radio)

# Muestro los resultados
print(f"El área del círculo es: {area}")
print(f"El perímetro del círculo es: {perimetro}")

# Ejercicio 5
print("\nEjercicio 5\n")

def segundos_a_horas(segundos):
    horas = segundos // 3600
    minutos = (segundos % 3600) // 60
    segundos_restantes = segundos % 60
    return horas, minutos, segundos_restantes
# Validación
while True:
    try:
        input_segundos = int(input("Introduce el número de segundos: "))
        break
    except ValueError:
        print("Por favor, introduce un número válido para los segundos.")
horas, minutos, segundos_restantes = segundos_a_horas(input_segundos)

print(f"{input_segundos} segundos equivalen a {horas} horas, {minutos} minutos y {segundos_restantes} segundos.")

# Ejercicio 6
print("\nEjercicio 6\n")

def tabla_multiplicar(numero):
    for i in range(1, 11):
        print(f"{numero} x {i} = {numero * i}")
# Validación
while True:
    try:
        input_numero = int(input("Introduce un número para la tabla de Multiplicar: "))
        break
    except ValueError:
        print("Por favor, introduce un número válido para la tabla de multiplicar.")
        
tabla_multiplicar(input_numero)

# Ejercicio 7
print("\nEjercicio 7\n")


def operaciones_basicas(a, b):
    tupla = (a + b, a - b, a * b, a / b if b != 0 else "Error: División por cero")
    return tupla

# Validación
while True:
    try:
        input_a = float(input("Introduce el primer número: "))
        input_b = float(input("Introduce el segundo número: "))
        break
    except ValueError:
        print("Por favor, introduce números válidos.")
suma, resta, multiplicacion, division = operaciones_basicas(input_a, input_b)

print(f"Suma: {suma}")
print(f"Resta: {resta}")
print(f"Multiplicación: {multiplicacion}")
print(f"División: {division}")

# Ejercicio 8
print("\nEjercicio 8\n")

def calcular_imc(peso, altura):
    imc = peso / (altura ** 2)
    return imc
# Validación
while True:
    try:
        input_peso = float(input("Introduce tu peso (kg): "))
        input_altura = float(input("Introduce tu altura (m): "))
        if input_altura <= 0:
            print("La altura debe ser un número positivo.")
            continue
        break
    except ValueError:
        print("Por favor, introduce números válidos.")
imc = calcular_imc(input_peso, input_altura)

print(f"Tu índice de masa corporal (IMC) es: {imc:.2f}")

# Ejercicio 9
print("\nEjercicio 9\n")

def celsius_a_fahrenheit(celsius):
    fahrenheit = (celsius * 9/5) + 32
    return fahrenheit
# Validación
while True:
    try:
        input_celsius = float(input("Introduce la temperatura en grados Celsius: "))
        break
    except ValueError:
        print("Por favor, introduce un número válido.")
fahrenheit = celsius_a_fahrenheit(input_celsius)

print(f"{input_celsius} grados Celsius equivalen a {fahrenheit:.2f} grados Fahrenheit.")

# Ejercicio 10
print("\nEjercicio 10\n")

def calcular_promedio(a, b, c):
    promedio = (a + b + c) / 3
    return promedio
# Validación
while True:
    try:
        input_a = int(input("Introduce el primer número: "))
        input_b = int(input("Introduce el segundo número: "))
        input_c = int(input("Introduce el tercer número: "))
        break
    except ValueError:
        print("Por favor, introduce números válidos.")
promedio = calcular_promedio(input_a, input_b, input_c)

print(f"El promedio de los tres números es: {promedio}")

# Finalización de los ejercicios
print("\nFin del programa de funciones en Python.")