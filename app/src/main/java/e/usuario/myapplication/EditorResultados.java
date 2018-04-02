package e.usuario.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EditorResultados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor_resultados);
        Intent intent = getIntent();
        String Equipo1 = intent.getStringExtra("Equipo1");
        String Equipo2 = intent.getStringExtra("Equipo2");
        TextView Primer = (TextView) findViewById(R.id.textView5);
        TextView Segundo = (TextView) findViewById(R.id.textView7);
        Primer.setText(Equipo1);
        Segundo.setText(Equipo2);

    }

    public void Regresar(View view){
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(i);
    }
}
