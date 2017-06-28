package br.dmscn.agenda;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    Button btnSignUp;
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
        btnLogin = (Button) findViewById(R.id.btnCallLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchLoginScreen();

                // forgot passowrd button
            }
        });

        btnSignUp = (Button) findViewById(R.id.btnCallSignUp);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSignUpScreen();
            }
        });

        Button btnAlreadyMember = (Button) findViewById(R.id.btnAlreadyMember);

        btnAlreadyMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchLoginScreen();
            }
        });
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
