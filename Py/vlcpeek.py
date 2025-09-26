import os
import subprocess
import sys
import tempfile

# Paso 1: Obtener el archivo seleccionado en el Explorador
def get_selected_file():
    ps_script = """
    $shell = New-Object -ComObject Shell.Application
    foreach ($window in $shell.Windows()) {
        try {
            if ($window.Document.SelectedItems().Count -gt 0) {
                return $window.Document.SelectedItems().Item(0).Path
            }
        } catch {}
    }
    return $null
    """
    with tempfile.NamedTemporaryFile(mode='w', suffix='.ps1', delete=False) as f:
        f.write(ps_script)
        ps_path = f.name

    try:
        result = subprocess.run(
            ["powershell", "-ExecutionPolicy", "Bypass", "-File", ps_path],
            capture_output=True, text=True, timeout=5
        )
        selected = result.stdout.strip()
        return selected if selected and os.path.exists(selected) else None
    except:
        return None
    finally:
        os.remove(ps_path)

# Paso 3: Abrir en VLC con modo "vista previa"
def open_in_vlc_preview(filepath):
    vlc_path = r"C:\Program Files\VideoLAN\VLC\vlc.exe"
    if not os.path.exists(vlc_path):
        print("VLC no encontrado. Instálalo en la ruta predeterminada.")
        return

    # --play-and-exit: cierra VLC al terminar
    # --fullscreen: opcional, quítalo si quieres ventana pequeña
    subprocess.Popen([
        vlc_path,
        "--play-and-exit",
        "--video-on-top",
        "--no-embedded-video",
        "--no-video-title-show",
        filepath
    ])

if __name__ == "__main__":
    file = get_selected_file()
    if file:
        print(f"Reproduciendo: {file}")
        open_in_vlc_preview(file)
    else:
        print("No hay archivo seleccionado.")