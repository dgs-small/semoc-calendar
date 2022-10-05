package br.ucsal.semoccalendar.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import br.ucsal.semoccalendar.R;
import br.ucsal.semoccalendar.model.Event;

public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.ViewHolder> {

    private final List<Event> events;

    public EventListAdapter(List<Event> events) {
        this.events = events;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bindView(Event event) {
            TextView schedule = itemView.findViewById(R.id.event_schedule);
            schedule.setText(event.getSchedule());
            TextView name = itemView.findViewById(R.id.event_title);
            name.setText(event.getName());
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Event event = events.get(position);
        holder.bindView(event);
    }

    @Override
    public int getItemCount() {
        return events.size();
    }
}


