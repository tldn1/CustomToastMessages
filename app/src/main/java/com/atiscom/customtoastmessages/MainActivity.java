package com.atiscom.customtoastmessages;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configToasty();
    }

    private void configToasty(){
        Toasty.Config.getInstance()
                .setErrorColor(ContextCompat.getColor(this,R.color.error_color))
                .setInfoColor(ContextCompat.getColor(this,R.color.info_color))
                .setWarningColor(ContextCompat.getColor(this,R.color.warning_color))
                .setSuccessColor(ContextCompat.getColor(this,R.color.success_color))
                .apply();
    }



    public void showErrorTosty(View view) {
        Toasty.error(this,"This is an error message", Toast.LENGTH_SHORT,true).show();
    }

    public void showWarningTosty(View view) {
        Toasty.warning(this,"This is an warning message", Toast.LENGTH_SHORT,true).show();

    }

    public void showSuccessTosty(View view) {
        Toasty.success(this,"This is an success message", Toast.LENGTH_SHORT,true).show();
    }

    public void showInfoTosty(View view) {
        Toasty.info(this,"This is an info message", Toast.LENGTH_SHORT,true).show();
    }
}
