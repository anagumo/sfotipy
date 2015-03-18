package ariana.myapplication.adapters;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

import ariana.myapplication.R;
import ariana.myapplication.models.Song;

/**
 * Created by ariana on 16/03/15.
 */
public class SongsAdapter extends RecyclerView.Adapter<SongsAdapter.ViewHolder> {

    private ArrayList<Song> songs;
    private int ItemLayout ;

    public SongsAdapter(ArrayList<Song> songs, int ItemLayout){
        this.songs = songs;
        this.ItemLayout = ItemLayout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(ItemLayout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        //Setear info y plasmar en widgets
        Song song = songs.get(i);

        viewHolder.nombreSong.setText(song.getNombreCancion());
        viewHolder.artistaSong.setText(song.getArtista());
        viewHolder.stars.setNumStars(song.getEstrellas());
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nombreSong;
        public TextView artistaSong;
        public RatingBar stars;

        public ViewHolder(View view){
            super(view);

            Typeface roboto = Typeface.createFromAsset(view.getContext().getAssets(), "fonts/Roboto-Regular.ttf");
            nombreSong = (TextView) view.findViewById(R.id.title_song);
            artistaSong = (TextView) view.findViewById(R.id.band_song);
            stars = (RatingBar) view.findViewById(R.id.ratingBar);

            this.nombreSong.setTypeface(roboto);
            this.artistaSong.setTypeface(roboto);
        }

    }
}
