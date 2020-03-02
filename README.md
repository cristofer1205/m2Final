# m2Final

Lastimosamente la implementación no logró ser completada, no se alcanzó a implementar todos los modelos diseñados. :'(

# Diagrama

Se diseñó la solución ocupado los patrones:
- Composite: Para componer y recorrer la estructura de directorios
- Interpreter: Combinado con el composite para recorrer la estructura de directorios y evaluar los archivos que cumplen el WHAT
- Strategy: Para generar el dateRange con las fechas en las que corresponde crear eventos (Para correr la reglas) segun el WHEN (En específico segun la frecuencia definida)
- Singleton: Para tener instancias unicas de los email senders
- Observer: Para notificar el mail en el momento que es creado a su observador (subscriber: Who)
- Factory Method: Para crear la instancia del sender correcto que va encargarse de enviar el mail usando la api del proveedor esperado.

https://drive.google.com/file/d/1pAffvRZDNKvVYoTx1lNTcd-swG9KONh3/view?usp=sharing
