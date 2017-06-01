package a.getdata.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import a.getdata.DTO.User;
import a.getdata.R;

/**
 * Created by Jonathan-S on 6/1/2017.
 */

public class ListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_row,parent,false);
        return new UserHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((UserHolder)holder).txtName.setText(users.get(position).getUsername());
    }

    @Override
    public int getItemCount() {
        if (users != null){
            return users.size();
        }
        return 0;
    }

    public static class UserHolder extends RecyclerView.ViewHolder{

        private TextView txtName;
        public UserHolder(View itemView) {
            super(itemView);
            txtName = (TextView) itemView.findViewById(R.id.txt_name);
        }
    }
}
