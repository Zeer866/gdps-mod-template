# Plantilla de mods para GDPS

1. Tocá **Use this template** y creá tu repo.
2. Editá `mod.json` (id, nombre, autor, `main`).
3. Escribí tu código en `src/` (la clase tiene que implementar `ModEntry`).
4. Subí los cambios y andá a **Actions → Build mod → Run workflow**.
5. Descargá el artefacto `mod`: adentro están `id.dex` e `id.json`.
6. Copiá los dos archivos a `Android/data/<paquete del juego>/files/mods/`.

## Publicarlo en la Tienda
1. Creá un tag (por ejemplo `v1.0`): el workflow sube el `.dex` a Releases.
2. Copiá la entrada de `mod.json` al `mods/index.json` del repo del loader,
   con el link de descarga en `url`.

## Reglas
- La clase principal necesita un constructor público sin argumentos.
- Todo lo visual va dentro de `activity.runOnUiThread(...)`.
- Usá try/catch: si tu mod crashea el juego, el loader lo manda a cuarentena.
