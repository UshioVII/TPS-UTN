# Ejercicio 1
def factorial(n):
    if n == 0 or n == 1:
        return 1
    return n * factorial(n - 1)

# Ejercicio 2
memo = {}
def fibonacci(n):
    if n in memo:
        return memo[n]
    if n == 0:
        memo[n] = 0
    elif n == 1:
        memo[n] = 1
    else:
        memo[n] = fibonacci(n - 1) + fibonacci(n - 2)
    return memo[n]

# Ejercicio 3
def potencia(base, exponente):
    if exponente == 0:
        return 1
    return base * potencia(base, exponente - 1)

# Ejercicio 4
def decimal_a_binario(n):
    if n == 0:
        return ""
    return decimal_a_binario(n // 2) + str(n % 2)

# Ejercicio 5
def es_palindromo(palabra):
    if len(palabra) <= 1:
        return True
    if palabra[0] != palabra[-1]:
        return False
    return es_palindromo(palabra[1:-1])

# Ejercicio 6
def suma_digitos(n):
    if n < 10:
        return n
    return n % 10 + suma_digitos(n // 10)

# Ejercicio 7
def contar_bloques(n):
    if n == 1:
        return 1
    return n + contar_bloques(n - 1)

# Ejercicio 8
def contar_digito(numero, digito):
    if numero == 0:
        return 0
    ultimo = numero % 10
    if ultimo == digito:
        return 1 + contar_digito(numero // 10, digito)
    else:
        return contar_digito(numero // 10, digito)

# Menú principal
def menu():
    while True:
        print("\n--- MENÚ DE EJERCICIOS RECURSIVOS ---")
        print("1. Calcular factorial del 1 al N")
        print("2. Serie de Fibonacci con memoización")
        print("3. Calcular potencia (base^exponente)")
        print("4. Convertir decimal a binario")
        print("5. Verificar si una palabra es palíndromo")
        print("6. Sumar los dígitos de un número")
        print("7. Contar bloques de una pirámide")
        print("8. Contar cuántas veces aparece un dígito")
        print("0. Salir")

        opcion = input("Elegí una opción: ")

        if opcion == "1":
            limite = int(input("Ingrese un número entero positivo: "))
            print(f"Factoriales del 1 al {limite}:")
            for i in range(1, limite + 1):
                print(f"{i}! = {factorial(i)}")

        elif opcion == "2":
            memo.clear()  # Limpiar memoria entre ejecuciones
            posicion = int(input("Ingrese la posición máxima para mostrar la serie de Fibonacci: "))
            print("Serie de Fibonacci:")
            for i in range(posicion + 1):
                print(f"F({i}) = {fibonacci(i)}")

        elif opcion == "3":
            base = int(input("Ingrese la base: "))
            exponente = int(input("Ingrese el exponente: "))
            resultado = potencia(base, exponente)
            print(f"{base}^{exponente} = {resultado}")

        elif opcion == "4":
            numero = int(input("Ingrese un número entero positivo: "))
            if numero == 0:
                print("0")
            else:
                binario = decimal_a_binario(numero)
                print(f"{numero} en binario es: {binario}")

        elif opcion == "5":
            palabra = input("Ingresá una palabra sin espacios ni tildes: ")
            resultado = es_palindromo(palabra)
            print("¿Es palíndromo?", resultado)

        elif opcion == "6":
            numero = int(input("Ingresá un número entero positivo: "))
            resultado = suma_digitos(numero)
            print("La suma de los dígitos es:", resultado)

        elif opcion == "7":
            nivel = int(input("¿Cuántos bloques hay en el nivel más bajo?: "))
            resultado = contar_bloques(nivel)
            print("Total de bloques necesarios:", resultado)

        elif opcion == "8":
            numero = int(input("Ingresá el número entero positivo: "))
            digito = int(input("¿Qué dígito querés contar (0-9)?: "))
            resultado = contar_digito(numero, digito)
            print(f"El dígito {digito} aparece {resultado} veces.")

        elif opcion == "0":
            print("¡Espero que te haya gustado el menu, profe!")
            break

        else:
            print("Opción inválida. Probá de nuevo.")

# Ejecutar el menú
menu()
