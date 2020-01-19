package com.example.mentaldisorderapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    String result;
    EditText txt_message;
    TextView phoneNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        result = intent.getStringExtra("Diagnosis");

        txt_message = (EditText) findViewById(R.id.txt_message);
        phoneNum = (TextView) findViewById(R.id.phoneNum);
    }

    public void btn_send(View view) {

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);

        if (permissionCheck == PackageManager.PERMISSION_GRANTED) {
            MyMessage();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, 0);
        }

    }

    private void MyMessage() {

        String phoneNumber = phoneNum.getText().toString().trim();
        String Message = "Hey I'm here for professional help! I have been diagnosed with: " +
                result + ". Personal Message: " + txt_message.getText().toString().trim();

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(phoneNumber, null, Message, null, null);

        Toast.makeText(this, "Message Sent", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {

            case 0:

                if (grantResults.length >= 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    MyMessage();

                } else {
                    Toast.makeText(this, "You don't have the Required Permission to Complete this Action", Toast.LENGTH_SHORT).show();
                }

                break;
        }
    }
}
