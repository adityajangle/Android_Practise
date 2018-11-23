package com.example.adityajangle.fragmentsusingjava;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.example.adityajangle.fragmentsusingjava.MainActivity;

public class ValueFixfrag extends Fragment {
MainActivity obj=new MainActivity();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_value_fixfrag, container, false);
    }
    @Override
    public void onViewCreated(View view,@Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view,savedInstanceState);
        Button btCheck,btMap,btEntry;
        btCheck=view.findViewById(R.id.btnCheck);
        btMap=view.findViewById(R.id.btnMap);
        btEntry=view.findViewById(R.id.btnEntrySet);

        btCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obj.startsetterfrag();

            }
        });
    }



}
