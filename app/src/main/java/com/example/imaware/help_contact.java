package com.example.imaware;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class help_contact extends Fragment {



    public help_contact() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_help_contact,container,false);
        Button call=(Button) view.findViewById(R.id.call);
        Button call_us=(Button) view.findViewById(R.id.call_us);
        Button mail=(Button) view.findViewById(R.id.mail);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent idial=new Intent(Intent.ACTION_DIAL);
                idial.setData(Uri.parse("tel: 1098"));
                startActivity(idial);

            }
        });
        call_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent idial=new Intent(Intent.ACTION_DIAL);
                idial.setData(Uri.parse("tel: 4788965310"));
                startActivity(idial);

            }
        });
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imail=new Intent(Intent.ACTION_SEND);
                imail.setType("message/rfc822");
                imail.putExtra(Intent.EXTRA_EMAIL, new String[]{"complaints@bba.org.in","mwcd@gov.in"});
                imail.putExtra(Intent.EXTRA_SUBJECT, "I need help");
                imail.putExtra(Intent.EXTRA_TEXT, "Describe your problem:");
                startActivity(Intent.createChooser(imail,"email through"));

            }
        });
        return view;


    }
}