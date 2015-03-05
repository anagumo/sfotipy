package ariana.myapplication.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import ariana.myapplication.R;
import ariana.myapplication.models.Amigo;

/**
 * Created by ariana on 5/03/15.
 */
public class AmigosAdapter extends RecyclerView.Adapter<AmigosAdapter.ViewHolder>{

    private ArrayList<Amigo> amigos;
    private int ItemLayout;

    public AmigosAdapter(ArrayList<Amigo> amigos, int itemLayout){
        this.amigos = amigos;
        this.ItemLayout = itemLayout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(ItemLayout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Amigo amigo = amigos.get(i);

        viewHolder.amigoNombre.setText(amigo.getNombre());
        viewHolder.amigoTwitter.setText(amigo.getTwitter());
        viewHolder.ultimaCancion.setText(amigo.getUltimaCancion());
    }

    @Override
    public int getItemCount() {
        return amigos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

       public TextView amigoNombre;
       public TextView amigoTwitter;
       public TextView ultimaCancion;

       public ViewHolder(View itemView) {
           super(itemView);

           amigoNombre = (TextView) itemView.findViewById(R.id.nombre_amigo);
           amigoTwitter = (TextView) itemView.findViewById(R.id.twitter_amigo);
           ultimaCancion = (TextView) itemView.findViewById(R.id.ultimcancion_amigo);
       }
   }
}
