package ariana.myapplication.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ariana.myapplication.R;
import ariana.myapplication.adapters.SongsAdapter;
import ariana.myapplication.models.Song;

/**
 * A simple {@link Fragment} subclass.
 */
public class DestacadosFragment extends Fragment {


    public DestacadosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_destacados, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayList<Song> songArrayList = new ArrayList<Song>();

        for (int i = 0 ; i <= 5 ; i++) {
            Song chromatics = new Song();
            chromatics.setNombreCancion("Running from the sun");
            chromatics.setArtista("Chromatics");
            chromatics.setEstrellas(3);
            songArrayList.add(chromatics);
        }

        RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.my_awesome_recycler_song);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new SongsAdapter(songArrayList, R.layout.item_song));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
