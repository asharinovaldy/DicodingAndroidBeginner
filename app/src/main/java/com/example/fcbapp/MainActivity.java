package com.example.fcbapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPlayer;
    private ArrayList<Player> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPlayer = findViewById(R.id.player);
        rvPlayer.setHasFixedSize(true);

        list.addAll(PlayerData.getListData());
        showRecyclerCard();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerCard() {
        rvPlayer.setLayoutManager(new LinearLayoutManager(this));
        CardViewAdapter cardViewAdapter = new CardViewAdapter(list);
        rvPlayer.setAdapter(cardViewAdapter);

//        cardViewAdapter.setOnItemClickCallback(new CardViewAdapter.OnItemClickCallback() {
//            @Override
//            public void onItemClicked(Player data) {
//                showSelectedPlayer(data);
//            }
//        });
    }

    public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.action_about:
                clickAbout();
                break;
        }
    }

    public void clickAbout(){
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

//    private void showSelectedPlayer(Player player){
//        Player player1 = new Player();
//        Intent intent = new Intent(this, DetailActivity.class);
//        intent.putExtra("PLAYER_NAME", player1.getName());
//        intent.putExtra("PLAYER_DETAIL", player1.getDetail());
//    }
}
