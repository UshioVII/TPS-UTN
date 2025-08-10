import random
from statistics import mode, median, mean

# Ejercicio 1
ej1edad = int(input("¿Cuantos años tienes?: "))

if ej1edad >= 18:
    print("Eres mayor de edad")
else:
    print("Eres menor de edad")
    
# Ejercicio 2

ej2nota = int(input("¿Cual es tu nota?: "))

if ej2nota >= 6:
    print("Aprobado")
else:
    print("Reprobado")
    
# Ejercicio 3
ej3edad = int(input("Ingrese un número par: "))

if ej3edad % 2 == 0:
    print("Ha ingresado un número par")
else:
    print("Ha ingresado un número impar")
    
# Ejercicio 4
ej4edad = int(input("¿Cuantos años tienes?: "))

if ej4edad >= 30:
    print("Eres un adulto/a")
elif ej4edad >= 18 and ej4edad < 30:
    print("Eres un adulto/a joven")
elif ej4edad >= 12 and ej4edad < 18:
    print("Eres un adolescente")
else:
    print("Eres un niño/a")
    
# Ejercicio 5
ej5contraseña = input("Ingrese la contraseña: ")

longitud = len(ej5contraseña)
if longitud >= 8 and longitud <= 14:
    print("Ha ingresado una contraseña correcta")
else:
    print("Por favor ingrese una contraseña de entre 8 y 14 caracteres")

# Ejercicio 6

ej6numeros_aleatorios = [random.randint(1, 100) for _ in range(50)]

ej6media_valor = mean(ej6numeros_aleatorios)
ej6mediana_valor = median(ej6numeros_aleatorios)
ej6moda_valor = mode(ej6numeros_aleatorios)

print("Lista de números aleatorios:" , ej6numeros_aleatorios)
print("Media:", ej6media_valor)
print("Mediana:", ej6mediana_valor)
print("Moda:", ej6moda_valor)

if ej6media_valor > ej6mediana_valor > ej6moda_valor:
    print("Sesgo positivo")
elif ej6media_valor < ej6mediana_valor < ej6moda_valor:
    print("Sesgo negativo")
elif ej6media_valor == ej6mediana_valor == ej6moda_valor:
    print("Sin sesgo")
else:
    print("No claramente sesgada")
    
# Ejercicio 7
ej7frase = input("Ingrese una frase: ")

if ej7frase[-1].lower() in "aeiou":
    print(ej7frase + "!")
else:
    print(ej7frase)
    
# Ejercicio 8
ej8nombre = input("Ingrese su nombre: ")
ej8opcion = int(input("Ingrese el número de la opción que desea (1: Mayúsculas, 2: Minúsculas, 3: Primera letra mayúscula): "))

if ej8opcion == 1:
    print(ej8nombre.upper()) 
elif ej8opcion == 2:
    print(ej8nombre.lower())  
elif ej8opcion == 3:
    print(ej8nombre.title())
else:
    print("Opción no válida")

# Ejercicio 9
ej9magnitud = float(input("Ingrese la magnitud del terremoto: "))

if ej9magnitud < 3:
    print("Muy leve (imperceptible)")
elif 3 <= ej9magnitud < 4:
    print("Leve (ligeramente perceptible)")
elif 4 <= ej9magnitud < 5:
    print("Moderado (sentido por personas, pero generalmente no causa daños)")
elif 5 <= ej9magnitud < 6:
    print("Fuerte (puede causar daños en estructuras débiles)")
elif 6 <= ej9magnitud < 7:
    print("Muy Fuerte (puede causar daños significativos)")
elif ej9magnitud >= 7:
    print("Extremo (puede causar graves daños a gran escala)")
else:
    print("Castatrofico (puede causar daños masivos)")
    
# Ejercicio 10
ej10hemisferio = input("¿En qué hemisferio se encuentra? (N/S): ").strip().upper()
ej10mes = input("Ingresar el mes actual (en minúsculas, por ejemplo, 'enero'): ").strip().lower()
ej10dia = int(input("Ingresar el día del mes: "))

if ej10hemisferio not in ["N", "S"]:
    print("Hemisferio no válido.")
else:
    if (ej10mes == "diciembre" and ej10dia >= 21) or ej10mes in ["enero", "febrero"] or (ej10mes == "marzo" and ej10dia <= 20):
        estacion = "Invierno" if ej10hemisferio == "N" else "Verano"
    elif (ej10mes == "marzo" and ej10dia >= 21) or ej10mes in ["abril", "mayo"] or (ej10mes == "junio" and ej10dia <= 20):
        estacion = "Primavera" if ej10hemisferio == "N" else "Otoño"
    elif (ej10mes == "junio" and ej10dia >= 21) or ej10mes in ["julio", "agosto"] or (ej10mes == "septiembre" and ej10dia <= 20):
        estacion = "Verano" if ej10hemisferio == "N" else "Invierno"
    elif (ej10mes == "septiembre" and ej10dia >= 21) or ej10mes in ["octubre", "noviembre"] or (ej10mes == "diciembre" and ej10dia <= 20):
        estacion = "Otoño" if ej10hemisferio == "N" else "Primavera"
    else:
        estacion = "Fecha no válida."

    print(f"La estación actual es: {estacion}")
