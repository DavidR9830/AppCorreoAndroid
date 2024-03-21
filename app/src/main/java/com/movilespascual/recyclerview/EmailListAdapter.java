package com.movilespascual.recyclerview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EmailListAdapter extends RecyclerView.Adapter<EmailListAdapter.ViewHolder> {
    private List<ListaElementos> emailItems;
    private LayoutInflater inflater;

    public EmailListAdapter(List<ListaElementos> emailItems, Context context) {
        this.emailItems = emailItems;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.email_element, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListaElementos emailItem = emailItems.get(position);
        holder.bind(emailItem);
    }

    @Override
    public int getItemCount() {
        return emailItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iconImage;
        TextView senderTextView, subjectTextView, dateTextView, messageTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iconImage = itemView.findViewById(R.id.emailIconImageView);
            senderTextView = itemView.findViewById(R.id.senderTextView);
            subjectTextView = itemView.findViewById(R.id.subjectTextView);
            dateTextView = itemView.findViewById(R.id.dateTextView);
            messageTextView = itemView.findViewById(R.id.messageTextView);
        }

        public void bind(ListaElementos emailItem) {
            iconImage.setColorFilter(Color.parseColor(emailItem.getColor()), PorterDuff.Mode.SRC_IN);
            senderTextView.setText(emailItem.sender);
            subjectTextView.setText(emailItem.subject);
            dateTextView.setText(emailItem.date);
            messageTextView.setText(emailItem.message);
        }
    }
}
