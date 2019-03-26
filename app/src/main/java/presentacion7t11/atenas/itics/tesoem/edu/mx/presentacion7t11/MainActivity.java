package presentacion7t11.atenas.itics.tesoem.edu.mx.presentacion7t11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler()=postDelayed(new_Runnable() {
            œOverride
            public void run( ) {
                Intent intent = new Intent(MainActivity.this,.Pantalla2Activity.class);
                starActivity(intent);
            }
        }
    }
}
