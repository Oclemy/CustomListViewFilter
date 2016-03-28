package com.tutorials.hp.lvfilter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Hp on 3/24/2016.
 */
public class MyViewHolder implements View.OnClickListener {

    ImageView img;
    TextView nameTxt;
    ItemClickListener itemClickListener;

    public MyViewHolder(View v) {
        img= (ImageView) v.findViewById(R.id.movieImage);
        nameTxt= (TextView) v.findViewById(R.id.nameTxt);

        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v);
    }

    public void setItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener=ic;
    }
}
