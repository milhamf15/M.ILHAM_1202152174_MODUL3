package com.ilham.ilham_1202152174_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Judul;
    private ArrayList<String> Deskripsi;
    private ArrayList<Integer> Gambar;

    //array untuk daftar minuman
    private String[] judul = {"Ades","Amidis","Aqua","Cleo","Club","Equil","Evian","Leminerale","Nestle","Pristine","Vit"};

    //array untuk daftar minuman
    private String[] deskripsi = {"Ini adalah minuman merek Ades",
            "Ini adalah minuman merek Amidis","Ini adalah minuman merek Aqua",
            "Ini adalah minuman merek Cleo","Ini adalah minuman merek Club",
            "Ini adalah minuman merek Equil","Ini adalah minuman merek Evian",
            "Ini adalah minuman merek Leminerale","Ini adalah minuman merek Nestle",
            "Ini adalah minuman merek Pristine","Ini adalah minuman merek Vit"};

    //array untuk daftar gambar
    private int[] gambar = {R.drawable.ades,R.drawable.amidis,R.drawable.aqua,R.drawable.cleo,R.drawable.club,R.drawable.equil,R.drawable.evian,
            R.drawable.leminerale,R.drawable.nestle,R.drawable.pristine,R.drawable.vit};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        //Untuk menghitung kolom
        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

        Judul = new ArrayList<>();
        Deskripsi = new ArrayList<>();
        Gambar = new ArrayList<>();

        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        adapter = new RecyclerviewAdapter(Judul, Deskripsi, Gambar);

        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
        ListItem();

        int swipeDirs;
        if(gridColumnCount > 1){
            swipeDirs = 0;
        } else {
            swipeDirs = ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT;
        }
        ItemTouchHelper helper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback
                (ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT | ItemTouchHelper.DOWN
                        | ItemTouchHelper.UP, swipeDirs) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                int from = viewHolder.getAdapterPosition();
                int to = target.getAdapterPosition();

                //Swap the items and notify the adapter
                Collections.swap(Judul,from,to);
                Collections.swap(Deskripsi, from,to);
                Collections.swap(Gambar,from,to);
                adapter.notifyItemMoved(from, to);
                return true;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                Judul.remove(viewHolder.getAdapterPosition());
                Deskripsi.remove(viewHolder.getAdapterPosition());
                Gambar.remove(viewHolder.getAdapterPosition());
                //Notify the adapter
                adapter.notifyItemRemoved(viewHolder.getAdapterPosition());
            }
        });
        helper.attachToRecyclerView(recyclerView);
    }

    private void ListItem(){
        for (int x=0; x < judul.length; x++){
            Gambar.add(gambar[x]);
            Judul.add(judul[x]);
            Deskripsi.add(deskripsi[x]);
        }
    }
}
