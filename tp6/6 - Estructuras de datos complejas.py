# Ejercicio 1
print("\nEjercicio 1\n")
precios_frutas = {'Banana': 1200, 'Anana': 2500, 'Melon': 3000, 'Uva': 1450}

precios_frutas['Naranja'] = 1200
precios_frutas['Manzana'] = 1500
precios_frutas['Pera'] = 2300

print(precios_frutas)

# Ejercicio 2
print("\nEjercicio 2\n")

precios_frutas['Naranja'] = 1330
precios_frutas['Manzana'] = 1700
precios_frutas['Pera'] = 2800

print(precios_frutas)

# Ejercicio 3
print("\nEjercicio 3\n")

lista_frutas = list(precios_frutas.keys())

print(lista_frutas)

# Ejercicio 4
print("\nEjercicio 4\n")

class Persona:
    def __init__(self, nombre, pais, edad):
        self.nombre = nombre
        self.pais = pais
        self.edad = edad
    def saludar(self):
        print(f"¡Hola! Soy {self.nombre}, vivo en {self.pais} y tengo {self.edad} años.")
        

persona1 = Persona("Diego", "Argentina", 22)
persona1.saludar()

# Ejercicio 5
print("\nEjercicio 5\n")

class Circulo:
    def __init__(self, radio):
        self.radio = radio
        
    def calcular_area(self):
        return 3.14 * (self.radio ** 2)
    
    def calcular_perimetro(self):
        return 2 * 3.14 * self.radio

circulo1 = Circulo(5)
print(f"Área: {circulo1.calcular_area()}")
print(f"Perímetro: {circulo1.calcular_perimetro()}")

# Ejercicio 6
print("\nEjercicio 6\n")


def balanceado(cadena):
    pila = []
    pares = {')': '(', '}': '{', ']': '['}
    for caracter in cadena:
        if caracter in '({[':
            pila.append(caracter)
        elif caracter in ')}]':
            if not pila or pila.pop() != pares[caracter]:
                return False
    return len(pila) == 0
  
  
print(balanceado("({[]})")) # True
print(balanceado("({[})")) # False

# Ejercicio 7

print("\nEjercicio 7\n")

from collections import deque

class Banco:
    def __init__(self):
        self.cola = deque()

    def agregar_cliente(self, cliente):
        self.cola.append(cliente)
        print(f"Cliente {cliente} agregado a la cola.")

    def atender_cliente(self):
        if self.cola:
            cliente = self.cola.popleft()
            print(f"Atendiendo al cliente {cliente}.")
        else:
            print("No hay clientes en la cola.")

    def siguiente_cliente(self):
        if self.cola:
            print(f"Siguiente cliente en la fila: {self.cola[0]}")
        else:
            print("No hay clientes en la cola.")

banco = Banco()
banco.agregar_cliente("Juan")
banco.agregar_cliente("María")
banco.siguiente_cliente()
banco.atender_cliente()
banco.siguiente_cliente()


# Ejercicio 8
print("\nEjercicio 8\n")
class Nodo:
    def __init__(self, valor):
        self.valor = valor
        self.siguiente = None

class ListaEnlazada:
    def __init__(self):
        self.cabeza = None

    def insertar_al_inicio(self, valor):
        nuevo_nodo = Nodo(valor)
        nuevo_nodo.siguiente = self.cabeza
        self.cabeza = nuevo_nodo
        print(f"Nodo con valor '{valor}' insertado al inicio.")

    def mostrar_lista(self):
        actual = self.cabeza
        while actual:
            print(actual.valor)
            actual = actual.siguiente

lista = ListaEnlazada()
lista.insertar_al_inicio(1)
lista.insertar_al_inicio(2)
lista.insertar_al_inicio(3)

print("\nLista enlazada:")
lista.mostrar_lista()

# Ejercicio 9
print("\nEjercicio 9\n")

class Nodo:
    def __init__(self, valor):
        self.valor = valor
        self.siguiente = None

class ListaEnlazada:
    def __init__(self):
        self.cabeza = None

    def insertar_al_inicio(self, valor):
        nuevo_nodo = Nodo(valor)
        nuevo_nodo.siguiente = self.cabeza
        self.cabeza = nuevo_nodo

    def mostrar_lista(self):
        actual = self.cabeza
        while actual:
            print(actual.valor, end=" -> ")
            actual = actual.siguiente
        print("None")

    def invertir(self):
        anterior = None
        actual = self.cabeza
        while actual:
            siguiente = actual.siguiente
            actual.siguiente = anterior
            anterior = actual
            actual = siguiente
        self.cabeza = anterior

lista = ListaEnlazada()
lista.insertar_al_inicio(3)
lista.insertar_al_inicio(2)
lista.insertar_al_inicio(1)

print("Lista original:")
lista.mostrar_lista()

lista.invertir()

print("Lista invertida:")
lista.mostrar_lista()
