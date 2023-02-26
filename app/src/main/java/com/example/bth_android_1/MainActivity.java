package com.example.bth_android_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Contact> ContactList;
    private Adapter adapter;
    private ListView lstContact;
    private Button btnAdd;
    private Button btnDelete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ContactList = new ArrayList<>();
        ContactList.add(new Contact(1, "img1", "Nguyen Van Quynh", "189481646"));
        ContactList.add(new Contact(2, "img2", "Tran Thi Be", "26265646"));
        ContactList.add(new Contact(3, "img3", "An", "3677849646"));
        ContactList.add(new Contact(4, "img4", "Nguyen Van Quynh", "189481646"));
        ContactList.add(new Contact(5, "img5", "Tran Thi Be", "26265646"));
        ContactList.add(new Contact(6, "img6", "An", "3677849646"));
        adapter = new Adapter(ContactList, this);
        lstContact = findViewById(R.id.lstContact);
        btnAdd = findViewById(R.id.btnAdd);
        btnDelete = findViewById(R.id.btnDelete);
        lstContact.setAdapter(adapter);
        btnDelete.setOnClickListener(view -> {
            for (int i = 0; i < ContactList.size(); i++) {
                if (ContactList.get(i).getCheck()) {
                    ContactList.remove(i);
                    i--;
                }
            }
            adapter.notifyDataSetChanged();
        });


    }
}