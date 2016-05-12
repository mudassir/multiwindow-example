package io.github.mudassir.multiwindowexample;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.mudassir.multiwindowexample.R;

/**
 * Simple RecyclerView adapter
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {

	public static class RecyclerHolder extends RecyclerView.ViewHolder {
		public TextView textView;
		public RecyclerHolder(View v, RecyclerListener listener) {
			super(v);
			textView = (TextView) v.findViewById(R.id.recycler_text);
			v.setOnClickListener(view -> listener.onClick(v, getAdapterPosition()));
		}
	}

	public interface RecyclerListener {
		void onClick(View v, int pos);
	}

	private String[] data;
	private RecyclerListener listener;

	public RecyclerAdapter(String[] data, RecyclerListener listener) {
		this.data = data;
		this.listener = listener;
	}

	@Override
	public RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		return new RecyclerHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view, parent, false), listener);
	}

	@Override
	public void onBindViewHolder(RecyclerHolder holder, int position) {
		holder.textView.setText(data[position]);
	}

	@Override
	public int getItemCount() {
		return data.length;
	}
}
