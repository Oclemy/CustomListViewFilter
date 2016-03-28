package com.tutorials.hp.lvfilter;

import android.widget.Filter;

import java.util.ArrayList;

/**
 * Created by Hp on 3/24/2016.
 */
public class CustomFilter extends Filter {

    ArrayList<Movie> filterList;
    MyAdapter adapter;

    public CustomFilter(ArrayList<Movie> filterList, MyAdapter adapter) {
        this.filterList = filterList;
        this.adapter = adapter;
    }

    //FILTERING
    @Override
    protected FilterResults performFiltering(CharSequence constraint) {

        //RESULTS
        FilterResults results=new FilterResults();

        //VALIDATION
        if(constraint != null && constraint.length()>0)
        {

            //CHANGE TO UPPER FOR CONSISTENCY
            constraint=constraint.toString().toUpperCase();

            ArrayList<Movie> filteredMovies=new ArrayList<>();

            //LOOP THRU FILTER LIST
            for(int i=0;i<filterList.size();i++)
            {
                //FILTER
                if(filterList.get(i).getName().toUpperCase().contains(constraint))
                {
                    filteredMovies.add(filterList.get(i));
                }
            }

            results.count=filteredMovies.size();
            results.values=filteredMovies;
        }else
        {
            results.count=filterList.size();
            results.values=filterList;
        }

        return results;
    }


    //PUBLISH RESULTS

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {

        adapter.movies= (ArrayList<Movie>) results.values;
        adapter.notifyDataSetChanged();

    }
}
