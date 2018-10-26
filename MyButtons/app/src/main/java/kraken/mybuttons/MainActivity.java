package kraken.mybuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  TextView messText;
    private  Button mPlayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messText = (TextView) findViewById(R.id.mText);
        mPlayButton = (Button) findViewById(R.id.activity_main_play_btn);
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messText.setText("Bonjour Nicolas");

            }
        });
    }
}
