package com.example.finalyearprojectadmin.centerData;


import android.os.Bundle;

import androidx.appcompat.widget.PopupMenu;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.finalyearprojectadmin.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PersonsDetailFragment extends Fragment {


    public PersonsDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_persons_detail, container, false);
    }
//    public void showPopup(View v) {
//        PopupMenu popup = new PopupMenu(this,v)
//        popup.setOnMenuItemClickListener(this);
//        popup.inflate(R.menu.menu_item_for_missing_people_catogory);
//        popup.show();
//    }
//
//
//    @Override
//    public boolean onMenuItemClick(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.children_catagory:
//                Toast.makeText(this, "Item 1 clicked", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.widows:
//                Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.Orphans:
//                Toast.makeText(this, "Item 3 clicked", Toast.LENGTH_SHORT).show();
//                return true;
//            default:
//                return false;
//        }
//    }

}
