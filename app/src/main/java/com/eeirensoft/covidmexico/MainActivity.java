package com.eeirensoft.covidmexico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo Para Mostrar u Ocultar Menu
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.ciudad, menu);
        return true;
    }

    //Metodo para asignar funciones correspondientes a las opciones
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        System.out.println("El valor de id "+id);

        if(id == R.id.cdmx){
            Toast.makeText(this, "Ciudad de Mexico", Toast.LENGTH_LONG).show();
        }
        else if (id == R.id.guadalajara){
            Toast.makeText(this, "Guadalajara", Toast.LENGTH_LONG).show();
        }
        else if (id == R.id.monterrey){
            Toast.makeText(this, "Monterrey", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }
}