package a.getdata.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import a.getdata.Controller.HandleReq;
import a.getdata.R;

public class MainActivity extends AppCompatActivity {

    private HandleReq req;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        req = new HandleReq();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        req.getAllUser();
    }
}
