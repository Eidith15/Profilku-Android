package id.ac.unpas.sab.profilku;

import android.app.Fragment;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //deklarasi variable
    Button buttonProfile, buttonGallery, buttonContact, buttonSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //memanggil fragment profile saat aplikasi pertama di create
        changeContent(ProfileFragment.newInstance(this));
        //inisialisai variable berdasarkan id yang terdapat pada activiy_main.xml
        buttonProfile = (Button) findViewById(R.id.btn_profile);
        buttonGallery = (Button) findViewById(R.id.btn_gallery);
        buttonContact = (Button) findViewById(R.id.btn_contact);
        buttonSetting = (Button) findViewById(R.id.btn_setting);
        //action
        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeContent(ProfileFragment.newInstance(MainActivity.this));
            }
        });
        buttonGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeContent(GalleryFragment.newInstance(MainActivity.this));
            }
        });
        buttonContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeContent(ContactFragment.newInstance(MainActivity.this));
            }
        });
        buttonSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeContent(SettingFragment.newInstance(MainActivity.this));
            }
        });


    }
    //memanggil fragment
    public void changeContent(Fragment fragment){
        getFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, fragment)
                .commitAllowingStateLoss();
    }


}
