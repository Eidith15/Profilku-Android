package id.ac.unpas.sab.profilku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by admin601 on 2/27/2018.
 */

public class LoginActivity extends AppCompatActivity {
    EditText edtUsername, edtPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUsername = (EditText) findViewById(R.id.username);
        edtPassword = (EditText) findViewById(R.id.password);
        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtUsername.getText().toString();
                String password = edtPassword.getText().toString();
                if (!username.isEmpty() || !password.isEmpty()){
                    if (username.equalsIgnoreCase("praktikan") && password.equalsIgnoreCase("sb601")){
                        Intent i = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(i);
                    }else{
                        Toast.makeText(LoginActivity.this,
                                "username dan password salah! harap masukan inputan yang benar", Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(LoginActivity.this, "Inputan tidak boleh kosong", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
