import os
import platform
import webbrowser

def open_brave_with_gmail():
    # Detectar el sistema operativo
    current_os = platform.system()
    
    # Configurar la ruta del ejecutable de Brave según el sistema operativo
    if current_os == "Windows":
        brave_path = "C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe"
    elif current_os == "Darwin":  # macOS
        brave_path = "/Applications/Brave Browser.app/Contents/MacOS/Brave Browser"
    elif current_os == "Linux":
        brave_path = "/usr/bin/brave-browser"  # Ruta típica en Linux
    else:
        print("Sistema operativo no compatible.")
        return
    
    # Verificar si Brave está instalado
    if not os.path.exists(brave_path):
        print("Brave no está instalado en la ruta especificada.")
        return
    
    # Registrar Brave como controlador de URLs
    webbrowser.register('brave', None, webbrowser.BackgroundBrowser(brave_path))
    
    # Abrir Gmail en Brave
    print("Abriendo Gmail en Brave...")
    browser = webbrowser.get('brave')
    browser.open("https://mail.google.com")

if __name__ == "__main__":
    open_brave_with_gmail()