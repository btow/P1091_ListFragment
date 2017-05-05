package com.example.samsung.p1091_listfragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by samsung on 05.05.2017.
 */

public class MainList extends ListFragment {

    private final String data[] = {
            "One", "Two", "Three", "Four",
            "One", "Two", "Three", "Four",
            "One", "Two", "Three", "Four",
            "One", "Two", "Three", "Four",
            "One", "Two", "Three", "Four",
            "One", "Two", "Three", "Four"};

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                data
        );

        setListAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmen_list, null);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String message = "Position = " + position;
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }
}
