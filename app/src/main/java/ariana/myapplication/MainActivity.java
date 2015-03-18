package ariana.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    TextView welcomeText;
    TextView welcomeTextFooter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        /*
        Sombra del float button en API 21
        int size = getResources().getDimensionPixelSize(R.dimen.fab_size);
        Outline outline = new Outline();
        outline.setOval(0, 0, size, size);
        ImageButton imageButton = (ImageButton) findViewById(R.id.float_bottom);
        imageButton.setOutline(outline);*/

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        setSupportActionBar(toolbar);

        Typeface roboto = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Regular.ttf");
        welcomeText = (TextView) findViewById(R.id.welcome_text);
        welcomeTextFooter = (TextView) findViewById(R.id.welcome_text_footer);
        welcomeText.setTypeface(roboto);
        welcomeTextFooter.setTypeface(roboto);
    }

    public void OnClick(View view){

        // Toast.makeText(this, "¡Funciona!", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MyMusic.class);
        startActivity(intent);
    }
}
