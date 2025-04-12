# Clona solo la última versión (--depth 1) en una carpeta temporal
git clone --depth 1 https://github.com/name temp_android_project

# Copia el contenido a tu repositorio (sin la carpeta .git)
cp -r temp_android_project/* name/

# Elimina la carpeta temporal
rm -r temp_android_project
Se los cambios a repositorio

git add .
git commit -m "Subido proyecto Android Race Tracker (sin historial original)"
git push origin main
