package e.usuario.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickIngresar(View view){
        EditText usernameEditText = (EditText) findViewById(R.id.editText2);
        String sUsername = usernameEditText.getText().toString();
        EditText usernameEditTextt = (EditText) findViewById(R.id.editText5);
        String sUsernamey = usernameEditTextt.getText().toString();
        if(sUsername.equals("admin") && sUsernamey.equals("admin") ) {
            Intent i = new Intent(getApplicationContext(), SecondActivity.class);
            startActivity(i);
        }
        if(sUsername.equals("user") && sUsernamey.equals("user") ) {
            Intent i = new Intent(getApplicationContext(), ThirdActivity.class);
            startActivity(i);
        }
    }
}
