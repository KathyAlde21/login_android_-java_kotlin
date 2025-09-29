package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText et_nombre_usuario, et_password;
    private Button btn_ingresar;
    private TextView btn_tv_password_olvidada, btn_tv_crear_cuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Obtener referencias a los elementos de la interfaz de usuario
        et_nombre_usuario = findViewById(R.id.et_nombre_usuario);
        et_password = findViewById(R.id.et_password);
        btn_ingresar = findViewById(R.id.btn_ingresar);
        btn_tv_password_olvidada = findViewById(R.id.btn_tv_password_olvidada);
        btn_tv_crear_cuenta = findViewById(R.id.btn_tv_crear_cuenta);

        // Configurar el botón de inicio de sesión
        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Verificar las credenciales del usuario
                if (et_nombre_usuario.getText().toString().equals("") || et_password.getText().toString().equals("")) {
                    // Credenciales correctas, iniciar sesión
                    Toast.makeText(LoginActivity.this, "No deben haber campos vacios", Toast.LENGTH_SHORT).show();
                }else if (et_nombre_usuario.getText().toString().equals("usuario") && et_password.getText().toString().equals("123")) {
                    // Credenciales correctas, iniciar sesión
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                } else {
                    // Credenciales incorrectas, mostrar mensaje de error
                    Toast.makeText(LoginActivity.this, "Nombre de usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
