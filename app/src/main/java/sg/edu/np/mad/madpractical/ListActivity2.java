package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity2 extends AppCompatActivity implements selectListener {

    String title;
    ArrayList<User> userList = new ArrayList<User>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);

        for (int i = 0; i < 20; i++) {
            Random random2 = new Random();
            int randomNameNum = random2.nextInt(100000000 - 1) + 1;
            int randomDescriptionNum = random2.nextInt(999999999);
            boolean randomFollow = random2.nextBoolean();


            User userNum = new User();
            userNum.setName("Name-" + String.valueOf(randomNameNum));
            userNum.setFollowed(randomFollow);
            userNum.setDescription("Description- " + String.valueOf(randomDescriptionNum));
            userNum.setImageView(R.drawable.download);
            userList.add(userNum);
        }

        RecyclerView recyclerView = findViewById(R.id.recycleView2);
        adapter cuApapter = new adapter(userList);
        LinearLayoutManager sLayout = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(sLayout);
        recyclerView.setAdapter(cuApapter);

        TextView header1 = findViewById(R.id.textView4);
        header1.setText("    MAD Practical");
    }


    @Override
    public void onImageClicked(User user) {
        Intent toCataloguePage = new Intent(ListActivity2.this, MainActivity.class);
        startActivity(toCataloguePage);
    }





};
