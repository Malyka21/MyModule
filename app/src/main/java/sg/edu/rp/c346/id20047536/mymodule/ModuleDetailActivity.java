package sg.edu.rp.c346.id20047536.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvModule, tvmName, tvmYear, tvmSem, tvmCred, tvmVen, tvModule2, tvmName2, tvmYear2, tvmSem2, tvmCred2, tvmVen2;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvModule = findViewById(R.id.textView3);
        Intent intentReceived = getIntent();
        String q = intentReceived.getStringExtra("mNum");
        tvModule.setText(q + " C346");

        tvmName = findViewById(R.id.textView4);
        String f = intentReceived.getStringExtra("mName");
        tvmName.setText(f + " Android Programming");

        tvmYear = findViewById(R.id.textView5);
        String r = intentReceived.getStringExtra("aYear");
        tvmYear.setText(r + " 2020");

        tvmSem = findViewById(R.id.textView6);
        String t = intentReceived.getStringExtra("sem");
        tvmSem.setText(t + " 1");

        tvmCred = findViewById(R.id.textView7);
        String y = intentReceived.getStringExtra("mCred");
        tvmCred.setText(y + " 4");

        tvmVen = findViewById(R.id.textView8);
        String u = intentReceived.getStringExtra("ven");
        tvmVen.setText(u + " W66M");

        tvModule2 = findViewById(R.id.textView9);
        String m2modNum = intentReceived.getStringExtra("m2Num");
        tvModule2.setText(m2modNum + " C349");

        tvmName2 = findViewById(R.id.textView10);
        String m2modName = intentReceived.getStringExtra("m2Name");
        tvmName2.setText(m2modName + " Ipad Programming");

        tvmYear2 = findViewById(R.id.textView11);
        String m2modYear = intentReceived.getStringExtra("a2Year");
        tvmYear2.setText(m2modYear + " 2020");

        tvmSem2 = findViewById(R.id.textView12);
        String m2modSem = intentReceived.getStringExtra("2sem");
        tvmSem2.setText(m2modSem + " 1");

        tvmCred2 = findViewById(R.id.textView13);
        String m2modCred = intentReceived.getStringExtra("m2Cred");
        tvmCred2.setText(m2modCred + " 4");

        tvmVen2 = findViewById(R.id.textView14);
        String m2modVen = intentReceived.getStringExtra("2ven");
        tvmVen2.setText(m2modVen + " W66E");

        }
    }