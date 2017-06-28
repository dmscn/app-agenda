package br.dmscn.agenda;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import br.dmscn.agenda.controller.DBController;

public class MainActivity extends AppCompatActivity {
    Button btnCallLogin;
    Button btnCallSignUp;
    Button btnLogin;
    Button btnSignUp;
    Button btnAlreadyMember;
    Button btnForgot;
    LinearLayout layMainButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // changin statusbar color
        Window w = this.getWindow();
        w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        w.setStatusBarColor(ContextCompat.getColor(this, R.color.desertSand));

        layMainButtons = (LinearLayout) findViewById(R.id.layMainButtons);

        // display login screen
        btnCallLogin = (Button) findViewById(R.id.btnCallLogin);

        btnCallLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchLoginScreen();
            }
        });

        // display sign up screen
        btnCallSignUp = (Button) findViewById(R.id.btnCallSignUp);

        btnCallSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSignUpScreen();
            }
        });


        // log in
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText username = (EditText) findViewById(R.id.edtUsername);
                EditText password = (EditText) findViewById(R.id.edtPassword);


                if(DBController.login(username.getText().toString(), password.getText().toString())) {
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    // TODO iplement intent extra
                    startActivity(intent);
                    finish();
                }
            }
        });


        // sign up
        btnSignUp = (Button) findViewById(R.id.btnSignUp);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText) findViewById(R.id.edtFullName);
                EditText email = (EditText) findViewById(R.id.edtEmail);
                EditText username = (EditText) findViewById(R.id.edtNewUsername);
                EditText password = (EditText) findViewById(R.id.edtNewPassword);

                DBController.newProfile(name.getText().toString(), email.getText().toString(), username.getText().toString(), password.getText().toString());
            }
        });

        btnAlreadyMember = (Button) findViewById(R.id.btnAlreadyMember);

        btnAlreadyMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchLoginScreen();
            }
        });

        btnForgot = (Button) findViewById(R.id.btnForgot);


    }

    @Override
    public void onBackPressed() {
        LinearLayout layLogo;
        LinearLayout layInputs;
        LinearLayout layButtons;

        layLogo = (LinearLayout) findViewById(R.id.layLogo);

        if(layMainButtons.getVisibility() == View.GONE) {

            layMainButtons.setVisibility(View.VISIBLE);
            layLogo.setWeightSum(3);

            layInputs = (LinearLayout) findViewById(R.id.layLoginInputs);
            layButtons = (LinearLayout) findViewById(R.id.layLoginButtons);

            layInputs.setVisibility(View.GONE);
            layButtons.setVisibility(View.GONE);

            layInputs = (LinearLayout) findViewById(R.id.laySignUpInputs);
            layButtons = (LinearLayout) findViewById(R.id.laySignUpButtons);

            layInputs.setVisibility(View.GONE);
            layButtons.setVisibility(View.GONE);
        } else {
            finish();
        }
    }

    private void launchLoginScreen() {
        LinearLayout layLogo;
        LinearLayout layInputs;
        LinearLayout layButtons;

        layLogo = (LinearLayout) findViewById(R.id.layLogo);

        layMainButtons.setVisibility(View.GONE);
        layLogo.setWeightSum(1);

        layInputs = (LinearLayout) findViewById(R.id.laySignUpInputs);
        layButtons = (LinearLayout) findViewById(R.id.laySignUpButtons);

        layInputs.setVisibility(View.GONE);
        layButtons.setVisibility(View.GONE);

        layInputs = (LinearLayout) findViewById(R.id.layLoginInputs);
        layButtons = (LinearLayout) findViewById(R.id.layLoginButtons);

        layInputs.setVisibility(View.VISIBLE);
        layButtons.setVisibility(View.VISIBLE);
    }

    private void launchSignUpScreen() {
        LinearLayout layLogo;
        LinearLayout layInputs;
        LinearLayout layButtons;

        layLogo = (LinearLayout) findViewById(R.id.layLogo);

        layMainButtons.setVisibility(View.GONE);
        layLogo.setWeightSum(1);

        layInputs = (LinearLayout) findViewById(R.id.layLoginInputs);
        layButtons = (LinearLayout) findViewById(R.id.layLoginButtons);

        layInputs.setVisibility(View.GONE);
        layButtons.setVisibility(View.GONE);

        layInputs = (LinearLayout) findViewById(R.id.laySignUpInputs);
        layButtons = (LinearLayout) findViewById(R.id.laySignUpButtons);

        layInputs.setVisibility(View.VISIBLE);
        layButtons.setVisibility(View.VISIBLE);
    }
}
