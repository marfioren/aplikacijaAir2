package hr.foi.aplikacija;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText UserName_log, Password_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserName_log=(EditText)findViewById(R.id.UserName_login);
        Password_log=(EditText)findViewById(R.id.Pass_login);
    }
    public void onLogin(View view){

        String username=UserName_log.getText().toString();
        String password=Password_log.getText().toString();
        String type="login";
        Worker worker= new Worker(this);
        worker.execute(type,username, password);


    }



}
