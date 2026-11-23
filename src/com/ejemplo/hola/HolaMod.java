package com.ejemplo.hola;

import android.app.Activity;
import android.widget.Toast;
import com.gdpsmods.loader.ModEntry;

public class HolaMod implements ModEntry {
    @Override
    public void onLoad(final Activity activity) {
        // Todo lo visual tiene que correr en el hilo de la interfaz
        activity.runOnUiThread(new Runnable() {
            public void run() {
                Toast.makeText(activity, "Hola Mod cargado", Toast.LENGTH_LONG).show();
            }
        });
    }
}
