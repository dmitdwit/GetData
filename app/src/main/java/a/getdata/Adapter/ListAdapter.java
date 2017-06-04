package a.getdata.Adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import a.getdata.DTO.User;
import a.getdata.R;

/**
 * Created by Jonathan-S on 6/1/2017.
 */

public class ListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<User> users;
    private Context context;

    public ListAdapter(Context context) {
        this.context = context;
    }

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
        ((UserHolder)holder).txtName.setText(users.get(position).getName());
        Picasso.with(context).load(users.get(position).getPhotoUrl()).placeholder(R.mipmap.ic_launcher).into(((UserHolder) holder).profileImg);

        ((UserHolder)holder).cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"asd",Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        if (users != null){
            return users.size();
        }
        return 0;
    }

    public static class UserHolder extends RecyclerView.ViewHolder{

        private CardView cardview;
        private TextView txtName;
        private ImageView profileImg;
        public UserHolder(View itemView) {
            super(itemView);
            cardview = (CardView) itemView.findViewById(R.id.card_view);
            txtName = (TextView) itemView.findViewById(R.id.txt_name);
            profileImg = (ImageView) itemView.findViewById(R.id.profile_img);
        }
    }
}
