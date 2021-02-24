package james.my.recyclerviewdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDataLists[] myData = new MyDataLists[]
                {
                        new MyDataLists(R.drawable.kohli,"Jaimin","Hello How are you..!", android.R.drawable.alert_dark_frame),
                        new MyDataLists(R.drawable.kohli,"Jayesh","Hello How are you..!", android.R.drawable.alert_dark_frame),
                        new MyDataLists(R.drawable.kohli,"Hitesh","Hello How are you..!", android.R.drawable.alert_dark_frame),
                        new MyDataLists(R.drawable.kohli,"Jignesh","Hello How are you..!", android.R.drawable.alert_dark_frame),
                        new MyDataLists(R.drawable.kohli,"Ketan","Hello How are you..!", android.R.drawable.alert_dark_frame),
                        new MyDataLists(R.drawable.kohli,"Dharmik","Hello How are you..!", android.R.drawable.alert_dark_frame),
                        new MyDataLists(R.drawable.kohli,"Utsav","Hello How are you..!", android.R.drawable.alert_dark_frame),
                        new MyDataLists(R.drawable.kohli,"Mayur","Hello How are you..!", android.R.drawable.alert_dark_frame),
                        new MyDataLists(R.drawable.kohli,"Pankaj","Hello How are you..!", android.R.drawable.alert_dark_frame),
                        new MyDataLists(R.drawable.kohli,"Rahul","Hello How are you..!", android.R.drawable.alert_dark_frame),
                        new MyDataLists(R.drawable.kohli,"Pranav","Hello How are you..!", android.R.drawable.alert_dark_frame),
                        new MyDataLists(R.drawable.kohli,"Karan","Hello How are you..!", android.R.drawable.alert_dark_frame),
                        new MyDataLists(R.drawable.kohli,"Harshil","Hello How are you..!", android.R.drawable.alert_dark_frame),
                        new MyDataLists(R.drawable.kohli,"Pruthvi","Hello How are you..!", android.R.drawable.alert_dark_frame),
                        new MyDataLists(R.drawable.kohli,"Mahesh","Hello How are you..!", android.R.drawable.alert_dark_frame)
                };

        recyclerView = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(myData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}