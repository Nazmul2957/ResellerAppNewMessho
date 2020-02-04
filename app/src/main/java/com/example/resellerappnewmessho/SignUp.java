package com.example.resellerappnewmessho;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class SignUp extends AppCompatActivity {
    Button next;
    TextView otpcode, setphnnumber, varifyresult, t2;
    Button continuebtn;
    String varificationcode;
    EditText codetext1,
            codetext2,
            codetext3,
            codetext4,
            codetext5,
            codetext6,
            phnedit;
    String phnnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        FirebaseApp.initializeApp(this);
        next = findViewById(R.id.next);
        phnedit = findViewById(R.id.getphnnumber);

        otpcode = findViewById(R.id.otpcode);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // startActivity(new Intent(SignUpActivity.this,HomeActivity.class));

                phnnumber = phnedit.getText().toString();
                if (phnnumber.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please Enter your phone number", Toast.LENGTH_SHORT).show();
                } else {


                    setContentView(R.layout.otp_verification);
                    setphnnumber = findViewById(R.id.numberphn);
                    setphnnumber.setText(phnnumber);
                    t2 = findViewById(R.id.otpnotification);
                    varifyresult = findViewById(R.id.varifiynumber);
                    codetext1 = findViewById(R.id.code1);
                    codetext2 = findViewById(R.id.code2);
                    codetext3 = findViewById(R.id.code3);
                    codetext4 = findViewById(R.id.code4);
                    codetext5 = findViewById(R.id.code5);
                    codetext6 = findViewById(R.id.code6);
                    continuebtn = findViewById(R.id.continuebtn);
                    t2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        }
                    });

                    sendverificationcode();
                }
            }
        });

    }

    public void sendverificationcode() {

        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                "+88" + phnnumber,
                60,
                TimeUnit.SECONDS,
                TaskExecutors.MAIN_THREAD,
                mCallback

        );

    }

    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallback = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
        @Override
        public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            super.onCodeSent(s, forceResendingToken);
            varificationcode = s;
            Toast.makeText(SignUp.this, "Code sent", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
            String code = phoneAuthCredential.getSmsCode();
            otpcode.setText(code);
            codetext1.setText(code.substring(0, 1));
            codetext2.setText(code.substring(1, 2));
            codetext3.setText(code.substring(2, 3));
            codetext4.setText(code.substring(3, 4));
            codetext5.setText(code.substring(4, 5));
            codetext6.setText(code.substring(5, 6));
            TextView t = findViewById(R.id.otpnotget);
            t.setText("");

            t2.setText("");
            varifyresult.setText("Your Number is Successfully varified!! ");
            continuebtn.setEnabled(true);
            continuebtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                    finish();
                }
            });
            Toast.makeText(SignUp.this, "verification completed", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onVerificationFailed(@NonNull FirebaseException e) {
            Toast.makeText(SignUp.this, "verification fialed" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    };
}
