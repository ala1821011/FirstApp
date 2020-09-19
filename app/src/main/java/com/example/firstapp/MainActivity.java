package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }

        public void sendMessage(View view){
            Intent intent = new Intent(this, DisplayMessageActivity.class);
            EditText edtMessage = findViewById(R.id.edtMessage);
            String message = edtMessage.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
            finish();
        }
}
