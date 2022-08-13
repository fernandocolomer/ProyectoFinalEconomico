package com.aplicacion.ecomicospro.Screen2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Response;
import com.aplicacion.ecomicospro.Objects.Products;
import com.aplicacion.ecomicospro.R;

import org.json.JSONObject;

import java.util.ArrayList;

public class AdapterList extends BaseAdapter {

    private static final LayoutInflater inflater = null;
    Context context;
    ArrayList<Products> listaDatos;
    TextView id, nombreProducts;
    ImageView imgproduct;

    public AdapterList(Response.Listener<JSONObject> jsonObjectListener, Products productos) {
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        @SuppressLint("InflateParams") final View vista = inflater.inflate(R.layout.productos, null);

        return null;
    }






}



