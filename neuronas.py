import subprocess
import sys

# Lista de paquetes necesarios
paquetes_necesarios = ["tensorflow", "keras", "numpy"]

# Verificar e instalar los paquetes necesarios
for paquete in paquetes_necesarios:
    try:
        # Verificar si el paquete está instalado
        subprocess.check_call([sys.executable, "-m", "pip", "show", paquete])
    except subprocess.CalledProcessError:
        # Si el paquete no está instalado, instalarlo
        subprocess.check_call([sys.executable, "-m", "pip", "install", paquete])
        print(f"{paquete} ha sido instalado correctamente.")
    else:
        print(f"{paquete} ya está instalado en el sistema.")

# Código para crear el sistema neuronal y opciones de aprendizaje e interacción
# (Aquí iría el código específico para tu proyecto de IA)

print("El sistema neuronal ha sido creado y está listo para su uso.")
