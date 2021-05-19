package sg.edu.rp.c346.id20047536.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvm1,tvm2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvm1 = findViewById(R.id.textView);
        tvm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("mNum", "Module Number: ");
                intent.putExtra("mName", "Module Name: ");
                intent.putExtra("aYear", "Academic Year: ");
                intent.putExtra("sem", "Semester: ");
                intent.putExtra("mCred", "Module Credit: ");
                intent.putExtra("ven", "Venue: ");
                startActivity(intent);
            }
        });

        tvm2 = findViewById(R.id.textView2);
        tvm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("m2Num", "Module Number: ");
                intent.putExtra("m2Name", "Module Name: ");
                intent.putExtra("a2Year", "Academic Year: ");
                intent.putExtra("2sem", "Semester: ");
                intent.putExtra("m2Cred", "Module Credit: ");
                intent.putExtra("2ven", "Venue: ");
                startActivity(intent);
            }
        });

    }
}