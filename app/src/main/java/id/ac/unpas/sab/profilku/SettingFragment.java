package id.ac.unpas.sab.profilku;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * Created by admin601 on 2/27/2018.
 */

public class SettingFragment extends Fragment {
    public static MainActivity mainActivity;
    public Button btnLogout;

    public static SettingFragment newInstance(MainActivity activity) {
        mainActivity = activity;
        return new SettingFragment();
    }


    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = LayoutInflater.from(mainActivity).inflate(R.layout.fragment_setting, container, false);
        return view;
    }

//    public void onCreate(Bundle savedInstanceState){
//        btnLogout = (Button) getView().findViewById(R.id.btn_logout);
//        btnLogout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent in = new Intent(getActivity(),LoginActivity.class);
//                getActivity().startActivity(in);
//
//            }
//        });
//    }

}







