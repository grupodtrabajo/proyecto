def decimal_a_binario(numero):
    if numero == 0:
        return '0'
    binario = ''
    while numero > 0:
        residuo = numero % 2
        binario = str(residuo) + binario
        numero = numero // 2
    return binario

while True:
    numero_decimal = int(input("Ingresa un número decimal: "))
    binario_resultante = decimal_a_binario(numero_decimal)
    print("El número binario equivalente es:", binario_resultante)

    opcion = input("¿Deseas convertir otro número? (1 para sí, 2 para terminar): ")
    if opcion == '2':
        print("¡Hasta luego!")
        break
    elif opcion != '1':
        print("Opción no válida. Por favor, ingresa 1 para continuar o 2 para terminar.")
