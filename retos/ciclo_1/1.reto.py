def CDT(usuario: str, capital: int, tiempo: int):
    if tiempo > 2:
        interes = (capital * 0.03 * tiempo) / 12
        total = interes + capital

    else:
        perder = capital * 0.02
        total = capital - perder

    return f'Para el usuario {usuario} La cantidad de dinero a recibir, según el monto inicial {capital} para un tiempo de {tiempo} meses es: {total}'

# Test


print(CDT('AB1012', 1000000, 3))
print(CDT('ER3366', 650000, 2))
