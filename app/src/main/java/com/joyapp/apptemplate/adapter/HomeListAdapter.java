package com.joyapp.apptemplate.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.joyapp.apptemplate.MainActivity;
import com.joyapp.apptemplate.R;
import com.joyapp.apptemplate.model.Group;
import com.joyapp.apptemplate.model.NavDrawerItem;

import java.util.ArrayList;

/**
 * Created by JOY on 5/28/2016.
 */
public class HomeListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Group> groups;

    public HomeListAdapter(Context context, ArrayList<Group> groups) {
        this.context = context;
        this.groups = groups;
    }
    @Override
    public int getCount() {
        return groups.size();
    }

    @Override
    public Object getItem(int position) {
        return groups.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.home_list_item_template, null);
        }
        TextView groupId = (TextView) convertView.findViewById(R.id.group_id);
        TextView groupName = (TextView) convertView.findViewById(R.id.group_name);
        groupName.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Toast.makeText(v.getContext(),""+groups.get(position).getName(),Toast.LENGTH_SHORT).show();
            }
        });
        groupId.setText(groups.get(position).getId());
        groupName.setText(groups.get(position).getName());

        return convertView;
    }
}
