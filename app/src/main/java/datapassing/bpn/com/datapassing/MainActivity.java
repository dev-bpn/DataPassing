package datapassing.bpn.com.datapassing;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                getSupportFragmentManager().beginTransaction().add(R.id.container , new MyFragment() , "TAG").commit();

            }
        });


        /**
         *
         * Here to pass data from Activity to fragment we can use these methods:
         * 1. newInstance(Object obj)
         * 2. new MyFragment.methodName()
         * 3. Directly through arguments
         *
         * */

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void onDataSend(String data) {

        Toast.makeText(this , data , Toast.LENGTH_LONG).show();

    }
}
