import tkinter as tk

# Crear ventana principal
ventana = tk.Tk()
ventana.title("Formulario de Registro")
ventana.geometry("420x320")

# ----- Encabezado -----
etiqueta_titulo = tk.Label(ventana, text="Registro rápido", font=("Arial", 16, "bold"))
etiqueta_titulo.pack(pady=10)

# ----- Zona de formulario -----
marco_formulario = tk.Frame(ventana)
marco_formulario.pack(pady=5)

# Label y Entry: Nombre
etiqueta_nombre = tk.Label(marco_formulario, text="Nombre:")
etiqueta_nombre.pack(anchor="w")
entrada_nombre = tk.Entry(marco_formulario, width=35)
entrada_nombre.pack(pady=5)

# Label y Entry: Edad
etiqueta_edad = tk.Label(marco_formulario, text="Edad:")
etiqueta_edad.pack(anchor="w")
entrada_edad = tk.Entry(marco_formulario, width=35)
entrada_edad.pack(pady=5)

# Checkbutton: Términos
aceptar_terminos = tk.IntVar(value=0)
casilla_terminos = tk.Checkbutton(
    ventana,
    text="Acepto los términos y condiciones",
    variable=aceptar_terminos
)
casilla_terminos.pack(pady=10)

# Label de resultado
etiqueta_resultado = tk.Label(ventana, text="", font=("Arial", 12))
etiqueta_resultado.pack(pady=10)

# ----- Lógica -----
def mostrar_datos(event=None):
    nombre = entrada_nombre.get().strip()
    edad = entrada_edad.get().strip()

    if aceptar_terminos.get() != 1:
        etiqueta_resultado.config(text="⚠️ Debes aceptar los términos para continuar.")
        return

    if not nombre:
        etiqueta_resultado.config(text="⚠️ Escribe tu nombre.")
        return

    if not edad.isdigit():
        etiqueta_resultado.config(text="⚠️ La edad debe ser un número entero.")
        return

    etiqueta_resultado.config(text=f"Hola {nombre}, tienes {edad} años. ✅")

def limpiar():
    entrada_nombre.delete(0, tk.END)
    entrada_edad.delete(0, tk.END)
    aceptar_terminos.set(0)
    etiqueta_resultado.config(text="")
    entrada_nombre.focus()

# ----- Botones -----
marco_botones = tk.Frame(ventana)
marco_botones.pack(pady=5)

boton_mostrar = tk.Button(marco_botones, text="Mostrar datos", command=mostrar_datos)
boton_mostrar.pack(side="left", padx=8)

boton_limpiar = tk.Button(marco_botones, text="Limpiar", command=limpiar)
boton_limpiar.pack(side="left", padx=8)

# Enter para confirmar
ventana.bind("<Return>", mostrar_datos)

# Focus inicial
entrada_nombre.focus()

# Ejecutar app
ventana.mainloop()