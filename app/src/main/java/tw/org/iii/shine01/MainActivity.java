package tw.org.iii.shine01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    private View click;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = findViewById(R.id.click);
        tv = (TextView) findViewById(R.id.tv);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              showLottery();
            }
        });
    }
    private void showLottery(){
        HashSet<Integer> set = new HashSet<>();
        while (set.size()<6) {
            set.add((int) (Math.random() * 49 + 1));
        }
            tv.setText(set.toString());

    }
}
