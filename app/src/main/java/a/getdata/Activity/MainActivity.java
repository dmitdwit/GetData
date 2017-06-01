package a.getdata.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import a.getdata.Adapter.ListAdapter;
import a.getdata.Controller.HandleReq;
import a.getdata.R;

public class MainActivity extends AppCompatActivity {

    private HandleReq req;
    private RecyclerView mRecyclerView;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        req = new HandleReq();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ListAdapter();
        mRecyclerView.setAdapter(adapter);

        req.getAllUser(adapter);
    }
}
