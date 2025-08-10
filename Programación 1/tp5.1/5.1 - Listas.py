# Ejercicio 1
print("\nEjercicio 1\n")
lista_numeros = list(range(1, 101, 4))

print("Lista de números del 1 al 101 que son múltiplos de 4:")
for numero in lista_numeros:
    print(numero, end=" ")
    print()
# Ejercicio 2
print("\nEjercicio 2\n")
lista_elementos = ["Panqueues", "Vodka", "Anime", "Mate", "Juegos", "Programar", "Gimnasio"]

print(lista_elementos[-2])
# Ejercicio 3
print("\nEjercicio 3\n")

lista_vacia = []

lista_vacia.append("Quiero, ")
lista_vacia.append("Panqueques, ")
lista_vacia.append("Mate.")

print("Lista de Resultados: ")
for elemento in lista_vacia:
    print(elemento, end=" ")
    print()
# Ejercicio 4
print("\nEjercicio 4\n")

animales = ["perro,", "gato,", "conejo,", "pez."]
animales[-3] = "loro,"
animales[-1] = "oso."

print("Lista de animales: ")
for animal in animales:
    print(animal, end=" ")
    print()
# Ejercicio 5
print("\nEjercicio 5\n")

numeros = [8, 15, 3, 22, 7] #Acá tenemos una lista de numeros que contiene 5 elementos y esos enelemtos son numeros enteros
numeros.remove(max(numeros)) #Acá removemos el mayor elemento de la lista que seria el 22
print("Lista de números sin el mayor elemento:") 
print(numeros) #Y por ultimo imprimimos la lista de numeros sin el mayor elemento que seria el 22
# Ejercicio 6
print("\nEjercicio 6\n")

lista_numeros_saltados = list(range(10, 31, 5))

print("Los dos primeros numeros imprimidos por pantalla: ")
print(lista_numeros_saltados[0])
print(lista_numeros_saltados[1])
# Ejercicio 7
print("\nEjercicio 7\n")

autos = ["sedan", "polo", "suran", "gol"]

autos[1] = 23
autos[2] = False 

print("Lista de autos: ")
for auto in autos:
    print(auto, end=" ")
    print()
# Ejercicio 8
print("\nEjercicio 8\n")

dobles = []

dobles.append(5)
dobles.append(10)
dobles.append(15)

print("Lista de números dobles: ")
for numero in dobles:
    print(numero, end=" ")
    print()
# Ejercicio 9
print("\nEjercicio 9\n")
compras = [["pan", "leche"], ["arroz", "fideos", "salsa"],
["agua"]]

compras[2].append("jugo")
compras[1][1] = "tallarines"
compras[0].remove("pan")

print("Lista de compras: ")
for compra in compras:
    for producto in compra:
        print(producto, end=" ")
    print()
# Ejercicio 10
print("\nEjercicio 10\n")

lista_anidada = [15, True, [25.5, 57.9, 30.6], False]

print("Lista anidada: ")

print(lista_anidada)

