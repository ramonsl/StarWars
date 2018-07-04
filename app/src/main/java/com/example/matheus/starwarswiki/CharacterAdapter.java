package com.example.matheus.starwarswiki;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


import java.util.List;

public class CharacterAdapter extends ArrayAdapter<Characters>{


    public CharacterAdapter(@NonNull Context context,  @NonNull List<Characters> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {



        return null;
    }
}
