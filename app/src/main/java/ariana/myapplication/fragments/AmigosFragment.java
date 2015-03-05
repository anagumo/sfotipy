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
import ariana.myapplication.adapters.AmigosAdapter;
import ariana.myapplication.models.Amigo;

/**
 * A simple {@link Fragment} subclass.
 */
public class AmigosFragment extends Fragment {


    public AmigosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_amigos, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayList<Amigo> amigoArrayList = new ArrayList<Amigo>();

        for (int i = 0 ; i <= 5 ; i++) {
            Amigo chelsea = new Amigo();
            chelsea.setNombre("Chelsea Wolfe");
            chelsea.setTwitter("@cchelseawwolfe");
            chelsea.setUltimaCancion("Movie Screen");
            amigoArrayList.add(chelsea);
        }

        RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.my_awesome_recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new AmigosAdapter(amigoArrayList, R.layout.item_amigo));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
