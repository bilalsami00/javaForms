package com.example.forms;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextName, editTextAge, editTextClass, editTextPhone, editTextEmail;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);
        editTextClass = findViewById(R.id.editTextClass);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextEmail = findViewById(R.id.editTextEmail);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitForm();
            }
        });
    }

    private void submitForm() {
        String name = editTextName.getText().toString().trim();
        String age = editTextAge.getText().toString().trim();
        String className = editTextClass.getText().toString().trim();
        String phone = editTextPhone.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();

        // Perform validation
        if (name.isEmpty() || age.isEmpty() || className.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            Toast.makeText(MainActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
        } else {
            // Submit form or perform further actions
            // For now, let's just display the entered data
            String message = "Name: " + name + "\n"
                    + "Age: " + age + "\n"
                    + "Class: " + className + "\n"
                    + "Phone Number: " + phone + "\n"
                    + "Email: " + email;
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
        }
    }
}
