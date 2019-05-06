package devpro.vn.senddatabfroma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    private TextView tvDataA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        tvDataA = findViewById(R.id.tvDataA);

        String dataA = getIntent().getStringExtra("KEY_DATA_INPUT");
        tvDataA.setText(dataA);
    }
}
