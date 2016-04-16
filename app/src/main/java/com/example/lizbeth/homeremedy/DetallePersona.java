

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class DetallePersona extends AppCompatActivity {
    TextView Nombre;
    TextView Descripcion;
    ImageView imgPersona;
    TextView edad;
    TextView Profesion_Persona;



    TextView EstadoCivil_persona;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);
        setContentView(R.layout.activity_detalle_persona);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();

        //DECLARACION DE UNA VARIABLE TIPO INTENT PARA OBTENER EL O LOS DATOS ENVIADOS DESDE LA ACTIVIDAD ANTERIOR
        Intent intent = getIntent();
        int obj = (int) intent.getExtras().get("Datos");
        final Personas item = Personas.PERSONAS_LIST.get(obj);


        //IF PARA SABER EL ACTION ES DISTINTO DE NULO, EN ESE CASO
        //CAMBIAR EL TITULO POR EL NOMBRE DE LA PERSONA Y MOSTRAR EL BACKARROW ICON
        if (actionBar != null) {
            actionBar.setTitle(item.getNombre_Persona());
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setHomeButtonEnabled(true);
        }

        //INFLAR LOS VIEWS CON SUS REPECTIVOS IDS
        Descripcion = (TextView) findViewById(R.id.decripcionDetalle);
        imgPersona = (ImageView) findViewById(R.id.imgPersona_banner);
        edad = (TextView) findViewById(R.id.edadDetalle);
        Profesion_Persona = (TextView) findViewById(R.id.profesionDetalle);
        EstadoCivil_persona = (TextView) findViewById(R.id.civilDetalle);


        //INYECTAR DATOS A LOS VIEWS
        Descripcion.setText(item.getDescripcion_Persona());
        Glide.with(this)
                .load(item.getImg_persona())
                .centerCrop()
                .crossFade()
                .into(imgPersona);

        //LOS TEXTOS EN ESTE SEGMENTO DE CÓDIGO ESTAN FORAZADOS. USAR EL VALUE STRING
        edad.setText("Remedio Nº1: " + getString(item.getEdad_Persona()));
        Profesion_Persona.setText("Remedio Nº2:  " + getString(item.getProfesion_Persona()));
        EstadoCivil_persona.setText("Remedio Nº3: " + getString(item.getEstadoCivil_persona()));


        //ONCLICKLISTENER DE TEXTVIEW PARA REALIZAR UNA LLAMADA SIN INTERACCIÓN DEL USUARIO

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void finish() {
        super.finish();

    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "DetallePersona Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.lizbeth.mensajes/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "DetallePersona Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.lizbeth.mensajes/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
