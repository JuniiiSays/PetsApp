package com.example.android.pets;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

public class PetCursorAdapter extends CursorAdapter {

    public PetCursorAdapter(Context context, Cursor c) {
        super(context, c, 0 /*flags*/);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        // Find fields to populate in inflated template
        TextView petName = (TextView) view.findViewById(R.id.name);
        TextView petBreed = (TextView) view.findViewById(R.id.summary);

        //Extract properties from the Cursor
        String name = cursor.getString(cursor.getColumnIndexOrThrow("name"));
        String breed = cursor.getString(cursor.getColumnIndexOrThrow("breed"));

        // Populate fields with extracted properties
        petName.setText(name);
        petBreed.setText(breed);



    }
}
