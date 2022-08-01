def cliente(informacion: dict) -> dict:
    ed = informacion['edad']
    pir = informacion['primer_ingreso']

    if ed > 18:
        atraccion = 'X-Treme'
        apto = True
        if pir == True:
            tb = 20000 - (20000 * 0.05)
        else:
            tb = 20000
    elif ed >= 15 and ed <= 18:
        atraccion = 'Carros chocones'
        apto = True
        if pir == True:
            tb = 5000 - (5000 * 0.07)
        else:
            tb = 5000
    elif ed >= 7 and ed < 15:
        atraccion = 'Sillas voladoras'
        apto = True
        if pir == True:
            tb = 10000 - (10000 * 0.05)
        else:
            tb = 10000
    else:
        atraccion = 'N/A'
        apto = False
        tb = 'N/A'
    ds = {'nombre': informacion['nombre'], 'edad': ed, 'atraccion': atraccion,
          'apto': apto, 'primer_ingreso': pir, 'total_boleta': tb}
    return ds


e = {'id_cliente': 1, 'nombre': 'Johana Fernandez',
     'edad': 20, 'primer_ingreso': True}

# Test

print(cliente(e))
