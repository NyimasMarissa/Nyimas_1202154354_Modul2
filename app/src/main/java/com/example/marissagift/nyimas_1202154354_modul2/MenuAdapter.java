package com.example.marissagift.nyimas_1202154354_modul2;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by HP on 17/02/2018.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private ArrayList<Menu> listMenu = new ArrayList<Menu>(); //deklarasi arraylist
    private LayoutInflater mInflater; //deklarasi layout inflater
    Context context;

    //konstruktor
    public MenuAdapter(Context context, ArrayList<Menu> menulist){
        mInflater = LayoutInflater.from(context);
        this.listMenu = menulist;
        this.context = context;
    }

    @Override
    public MenuAdapter.MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View menuView = mInflater.inflate(R.layout.daftar_item, parent, false); //bertanggung jawab untuk menginflate view
        return new MenuViewHolder(menuView); //mengembalikan object viewholder
    }

    @Override
    public void onBindViewHolder(MenuAdapter.MenuViewHolder holder, int position) {
        final Menu menu = listMenu.get(position);

        //menset data ke holder
        holder.gambarMenu.setImageResource(menu.getImg_res());
        holder.namaMenu.setText(menu.getMenu());
        holder.hargaMenu.setText(menu.getHarga());
    }

    @Override
    public int getItemCount() {
        return listMenu.size();
    } //jumlah item

    //menangani tiap list view yang ditampilkan pada recycler view
    class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        //inisiasi
        ImageView gambarMenu;
        TextView namaMenu, hargaMenu;
        LinearLayout parentLayout;
        ArrayList<Menu> listMenu = new ArrayList<>();
        Context context;

        public MenuViewHolder(View itemView) {
            super(itemView);
            //inisiasi data
            this.listMenu = listMenu;
            this.context = context;
            itemView.setOnClickListener(this);
            gambarMenu = itemView.findViewById(R.id.foto);
            namaMenu = itemView.findViewById(R.id.nama_menu);
            hargaMenu = itemView.findViewById(R.id.harga_menu);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }

        @Override
        public void onClick(View view) {
            int mPosition = getAdapterPosition();
            Menu menu = this.listMenu.get(mPosition);
            final int img = listMenu.get(mPosition).getImg_res();
            final String menuMakanan = listMenu.get(mPosition).getMenu();
            final String harga = listMenu.get(mPosition).getHarga();

            //bungkus data yang akan dikirim
            Intent i = new Intent(context, DetailMenu.class);
            i.putExtra("image_res", img);
            i.putExtra("menu", menuMakanan);
            i.putExtra("harga", harga);

            //panggil activity
            context.startActivity(i);
        }
    }
}