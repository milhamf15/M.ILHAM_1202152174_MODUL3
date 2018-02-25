package com.ilham.ilham_1202152174_modul3;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder> {

    //digunakan untuk menerima dan menyimpan list item
    private ArrayList<String> arrayListJudul, arrayListDeskripsi;
    private ArrayList<Integer> arrayListGambar;

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    RecyclerviewAdapter(ArrayList<String> arrayListJudul, ArrayList<String> arrayListDeskripsi, ArrayList<Integer> arrayListGambar){
        this.arrayListJudul = arrayListJudul;
        this.arrayListDeskripsi = arrayListDeskripsi;
        this.arrayListGambar = arrayListGambar;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView Judul, Deskripsi;
        private ImageView Gambar;
        private LinearLayout itemList;

        public ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            Judul = itemView.findViewById(R.id.judul);
            Deskripsi = itemView.findViewById(R.id.deskripsi);
            Gambar = itemView.findViewById(R.id.gambar);
            itemList = itemView.findViewById(R.id.listItem);
        }
    }

    @Override
    public RecyclerviewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent,false);
        ViewHolder viewholder = new ViewHolder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(RecyclerviewAdapter.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String judul = arrayListJudul.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final String deskripsi = arrayListDeskripsi.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final Integer gambar = arrayListGambar.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.Judul.setText(judul);// Mengambil text sesuai posisi yang telah ditentukan
        holder.Deskripsi.setText(deskripsi); // Mengambil text sesuai posisi yang telah ditentukan
        holder.Gambar.setImageResource(gambar); // Mengambil gambar sesuai posisi yang telah ditentukan
        //Membuat Aksi Saat List Ditekan
        holder.itemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                String desc = " 70 persen tubuh Anda terdiri dari air. Bila kebutuhan air dalam tubuh tidak terpenuhi, maka tubuh akan menanggung sejumlah konsekuensi kesehatan jangka pendek dan jangka panjang yang negatif.\n" +
                        "\n" +
                        "Dehidrasi yang berkepanjangan misalnya, dapat menyebabkan rheumatoid arthritis, migrain, angina, kolitis, dispepsia, hipertensi, obesitas, wasir, kanker payudara, tuberkulosis paru, batu ginjal, sinusitis, dan kanker rahim.\n" +
                        "\n" +
                        "Agar tubuh Anda terhindar dari penyakit-penyakit serius tersebut, bantu tubuh Anda untuk lebih banyak mengkonsumsi air putih agar tetap terhidrasi sepanjang hari.";
                switch (position){
                    case 0:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("desc", desc);
                        v.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListJudul.size();
    }
}
