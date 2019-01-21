package hr.foi.aplikacija;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OdabirStanice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odabir_stanice);


    }
    public void StanicaOdb(View view){
        String viewID = getResources().getResourceName(view.getId());

        Intent i = new Intent(OdabirStanice.this, Trenutno_stanje.class);
        i.putExtra("idGumba", viewID);
        startActivity(i);


    }


}
