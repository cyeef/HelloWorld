package edu.cnm.bootcamp.cyeef.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final TextView textView = (TextView) findViewById(R.id.txtHellowWorld);
    Button btnHellWorld = (Button) findViewById(R.id.btnHelloWorld);
    btnHellWorld.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        TextView textView = (TextView) findViewById(R.id.txtHellowWorld);
        String text = textView.getText().toString();
        String expected = getString(R.string.message_recieved);

        if (Objects.equals(text, expected)) {
          textView.setText(R.string.hello_world);
        } else {
          textView.setText(getString(R.string.message_recieved));
        }

      }
    });


  }


}
