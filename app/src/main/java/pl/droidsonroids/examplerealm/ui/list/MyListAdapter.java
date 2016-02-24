package pl.droidsonroids.examplerealm.ui.list;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import pl.droidsonroids.examplerealm.R;
import pl.droidsonroids.examplerealm.model.MyBook;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {

    private final ArrayList<MyBook> mBooks;

    public MyListAdapter() {
        mBooks = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book, parent, false);
        return new ViewHolder((TextView) view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.mTextTitle.setText(":(");
    }

    @Override
    public int getItemCount() {
        return mBooks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView mTextTitle;
        
        public ViewHolder(final TextView textView) {
            super(textView);
            mTextTitle = textView;
        }
    }
}
