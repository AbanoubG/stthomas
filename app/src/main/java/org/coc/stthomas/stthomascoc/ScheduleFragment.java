package org.coc.stthomas.stthomascoc;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v4.app.Fragment;



/**
 * A simple {@link Fragment} subclass.
 * */
public class ScheduleFragment extends Fragment {

    public ScheduleFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_schedule, container, false);
        //Button
        Button main_button = (Button) view.findViewById(R.id.main_button);
        main_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.main_button:
                        //what to put here
                        android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.relative_frame, new AltarFragment(), "fragment_altar" );
                        fragmentTransaction.commit();
                        break;
                }
            }
        });



        //Inflate the layout for this fragment
        return view;
    }




}
