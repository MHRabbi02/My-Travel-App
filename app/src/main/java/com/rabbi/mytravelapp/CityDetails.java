package com.rabbi.mytravelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.imageview.ShapeableImageView;

public class CityDetails extends AppCompatActivity {

    ShapeableImageView mainimage, attr1img, attr2img, food1img, food2img;
    TextView city, description, duration, timetovisit, attr1name, attr1des, attr2name, attr2des, food1name, food1des, food2name, food2des;
    Button locationbtn;
    String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_details);

        mainimage = findViewById(R.id.citydetails_image);
        attr1img = findViewById(R.id.citydetails_place1image);
        attr2img = findViewById(R.id.citydetails_place2image);
        food1img = findViewById(R.id.citydetails_food1image);
        food2img = findViewById(R.id.citydetails_food2image);
        city = findViewById(R.id.citydetails_name);
        description = findViewById(R.id.citydetails_description);
        duration = findViewById(R.id.citydetails_tripduration);
        timetovisit = findViewById(R.id.citydetails_besttime);
        attr1name = findViewById(R.id.citydetails_place1name);
        attr2name = findViewById(R.id.citydetails_place2name);
        food1name = findViewById(R.id.citydetails_food1name);
        food2name = findViewById(R.id.citydetails_food2name);
        attr1des = findViewById(R.id.citydetails_place1description);
        attr2des = findViewById(R.id.citydetails_place2description);
        food1des = findViewById(R.id.citydetails_food1description);
        food2des = findViewById(R.id.citydetails_food2description);
        locationbtn = findViewById(R.id.citydetails_getlocationbtn);

        String city_str = getIntent().getStringExtra("putextra_city");

        if (city_str.equals("Jaflong")) {
            city.setText("Jaflong, Sylhet");
            attr1name.setText("Khasia Polli");
            attr2name.setText("Songram Punji Waterfalls");
            attr1des.setText("It's a very nice place to visit. It's a Tribal society near Jaflong known as 'Khasia Polli'.");
            attr2des.setText("It's also be called Mayabi waterfalls");
            attr1img.setImageResource(R.drawable.khasia);
            attr2img.setImageResource(R.drawable.songram);
            food1name.setText("Shatkora");
            food2name.setText("Akhni");
            food1des.setText("it is very delicious food.");
            food2des.setText("It is a traditional food.");
            food1img.setImageResource(R.drawable.shatkora);
            food2img.setImageResource(R.drawable.akhni);
            description.setText("Jaflong is a place where you can see the beauty of stone river near indian hill.");
            location = "https://www.google.com/maps/place/%E0%A6%9C%E0%A6%BE%E0%A6%AB%E0%A6%B2%E0%A6%82/@25.1611693,91.9901561,14z/data=!3m1!4b1!4m5!3m4!1s0x375044bd7d747f47:0xef2b6cb5bcade375!8m2!3d25.1633829!4d92.0175242";

            timetovisit.setText("July to September");
            duration.setText("2 Days");
            mainimage.setImageResource(R.drawable.jaflong);
        }
        if (city_str.equals("Bichanakandi")) {
            city.setText("Bichanakandi, Sylhet");
            attr1name.setText("Colorful Stones");
            attr2name.setText("Hill and River");
            attr1des.setText("It have many colorful stones.");
            attr2des.setText("This place is so beautiful.");
            attr1img.setImageResource(R.drawable.colorfulstone);
            attr2img.setImageResource(R.drawable.hill);
            food1name.setText("Duck Curry");
            food2name.setText("Chicken Tikka Masala");
            food1des.setText("It is so delicious");
            food2des.setText("Tasty dish with lot of butter.");
            food1img.setImageResource(R.drawable.duck);
            food2img.setImageResource(R.drawable.chicken);
            description.setText("Bichanakandi a new attraction of sylhet.It's a area full of different types of rocks and water comes from a fountain flows over it.");
            location = "https://www.google.com/maps/place/%E0%A6%AC%E0%A6%BF%E0%A6%9B%E0%A6%A8%E0%A6%BE%E0%A6%95%E0%A6%BE%E0%A6%A8%E0%A7%8D%E0%A6%A6%E0%A6%BF/@25.1700575,91.8815803,16z/data=!3m1!4b1!4m5!3m4!1s0x37505936b3e510e7:0x840163039a06ef35!8m2!3d25.1695436!4d91.8867263";
            timetovisit.setText("Any time");
            duration.setText("2 Days");
            mainimage.setImageResource(R.drawable.bichanakandi);
        }


        if (city_str.equals("Chandronath Hill")) {
            city.setText("Chandronath Hill, Chittagong");
            attr1name.setText("Chandronath Temple");
            attr2name.setText("1152 feet upper Hill view");
            attr1des.setText("Chandranath Temple is a Hindu Temple dedicated to Lord Shiva");
            attr2des.setText("The height of the highest peak of this hill is 1152 feet or 365 meters. It is the highest point in Chattogram.");
            attr1img.setImageResource(R.drawable.temple);
            attr2img.setImageResource(R.drawable.hillview);
            food1name.setText("Mejbani Beef");
            food2name.setText("Kala Bhuna");
            food1des.setText("It is so delicious");
            food2des.setText("Tasty dish with lot of butter.");
            food1img.setImageResource(R.drawable.mejbani);
            food2img.setImageResource(R.drawable.kalabhuna);
            description.setText("Chandronath hill is a attraction of Chittagong.");
            location = "https://www.google.com/maps/place/%E0%A6%9A%E0%A6%A8%E0%A7%8D%E0%A6%A6%E0%A7%8D%E0%A6%B0%E0%A6%A8%E0%A6%BE%E0%A6%A5+%E0%A6%AA%E0%A6%BE%E0%A6%B9%E0%A6%BE%E0%A6%A1%E0%A6%BC/@22.6780691,91.4034675,10z/data=!3m1!4b1!4m5!3m4!1s0x30acd72db66a8123:0xc53a0083d8e81998!8m2!3d22.8498441!4d91.637215";
            timetovisit.setText("Any time");
            duration.setText("2 Days");
            mainimage.setImageResource(R.drawable.chandronath);
        }

        if (city_str.equals("Nill-Giri")) {
            city.setText("Nill-Giri, Bandarban");
            attr1name.setText("Nilachol");
            attr2name.setText("Sairu Hill Resort");
            attr1des.setText("It is situated on a hill in Tiger Para at an altitude of about two thousand feet above sea level.");
            attr2des.setText("SAIRU offers you the perfect blend of nature with luxurious accommodation facilities at bandarban.");
            attr1img.setImageResource(R.drawable.nilachol);
            attr2img.setImageResource(R.drawable.sairu);
            food1name.setText("Mundi");
            food2name.setText("Pahari Kabab");
            food1des.setText("The main ingredients are noodles made from rice,egg and hot water.");
            food2des.setText("It is so delicious.");
            food1img.setImageResource(R.drawable.mundi);
            food2img.setImageResource(R.drawable.paharichicken);
            description.setText("Nil Giri is one of the tallest peaks and beautiful tourist spot in Bangladesh. It is about 3500 feet high and situated at Thanci Thana.");
            location = "https://www.google.com/maps/place/%E0%A6%AC%E0%A6%BE%E0%A6%A8%E0%A7%8D%E0%A6%A6%E0%A6%B0%E0%A6%AC%E0%A6%BE%E0%A6%A8+-+%E0%A6%A5%E0%A6%BE%E0%A6%A8%E0%A6%9A%E0%A6%BF+%E0%A6%B0%E0%A7%8B%E0%A6%A1/@21.9494878,92.3076067,17z/data=!3m1!4b1!4m5!3m4!1s0x30ad79f269ee1ca1:0xe20af8c3ae6b3cb!8m2!3d21.9494878!4d92.3097954";
            timetovisit.setText("May and June");
            duration.setText("2 Days");
            mainimage.setImageResource(R.drawable.nillgiri);
        }


        if (city_str.equals("Saint-Martin")) {
            city.setText("Saint-Martin, Cox's Bazar");
            attr1name.setText("Scuba Diving");
            attr2name.setText("Chera Dip");
            attr1des.setText("You can explore explore underwater environments and It may cost around BDT 2000 for dive");
            attr2des.setText(" Chera Dip  is an island and extension of St. Martin's Island at the mouth of the Naf River in the Bay of Bengal.");
            attr1img.setImageResource(R.drawable.scuba);
            attr2img.setImageResource(R.drawable.chera);
            food1name.setText("Local Sea Food");
            food2name.setText("Coral BBQ");
            food1des.setText("Here local sea food is very fresh and so tasty.");
            food2des.setText("It is so delicious.");
            food1img.setImageResource(R.drawable.localse);
            food2img.setImageResource(R.drawable.coral);
            description.setText("Saint-martin has fresh blue water with corals, beautiful sandy beaches, a lot of coconut trees, and huge natural beauties. Sunrise and sunset are two most striking things you can enjoy.");
            location = "https://www.google.com/maps/place/%E0%A6%B8%E0%A7%87%E0%A6%A8%E0%A7%8D%E0%A6%9F%E0%A6%AE%E0%A6%BE%E0%A6%B0%E0%A7%8D%E0%A6%9F%E0%A6%BF%E0%A6%A8+%E0%A6%A6%E0%A7%8D%E0%A6%AC%E0%A7%80%E0%A6%AA/@20.6255359,92.3362113,13z/data=!4m9!1m2!2m1!1ssaint+martin+island+bd!3m5!1s0x30ae23666ddf01b1:0xfb9c82c83dacf078!8m2!3d20.6236972!4d92.3233938!15sChZzYWludCBtYXJ0aW4gaXNsYW5kIGJkWhgiFnNhaW50IG1hcnRpbiBpc2xhbmQgYmSSAQZpc2xhbmSaASNDaFpEU1VoTk1HOW5TMFZKUTBGblNVTmxYMGxsUVdSM0VBReABAA";
            timetovisit.setText("November to January");
            duration.setText("3 Days");
            mainimage.setImageResource(R.drawable.saint);
        }

        if (city_str.equals("Kuakata")) {
            city.setText("Kuakata,Patuakhali");
            attr1name.setText("Jhaubon");
            attr2name.setText("Red Crab Beach");
            attr1des.setText("Jhaubon is very beautiful place at Kuakata.Jhaubon is close to the sea beach.");
            attr2des.setText("Red crab is one of the most attractions of Kuakata beach.");
            attr1img.setImageResource(R.drawable.jhao);
            attr2img.setImageResource(R.drawable.redcrab);
            food1name.setText("Dry Fish");
            food2name.setText("Crab Fry");
            food1des.setText("Dried fish is very popular food in Kuakata.");
            food2des.setText("Crab fry is so tasty food.");
            food1img.setImageResource(R.drawable.dry);
            food2img.setImageResource(R.drawable.crab);
            description.setText("Kuakata, locally called as 'Sagor Konnya' (Daughter of the Sea) is located in the southernmost tip of Bangladesh.has the unique beauty of offering the full view of the rising and setting of crimson sun in the water of the Bay of Bengal.");
            location = "https://www.google.com/maps/place/%E0%A6%95%E0%A7%81%E0%A6%AF%E0%A6%BC%E0%A6%BE%E0%A6%95%E0%A6%BE%E0%A6%9F%E0%A6%BE+%E0%A6%B8%E0%A6%AE%E0%A7%81%E0%A6%A6%E0%A7%8D%E0%A6%B0+%E0%A6%B8%E0%A7%88%E0%A6%95%E0%A6%A4/@21.8353171,90.1404184,13z/data=!3m1!4b1!4m5!3m4!1s0x30aa62836f83b573:0x31e7fec84916471!8m2!3d21.8031005!4d90.1822792";
            timetovisit.setText("January-February and July to November");
            duration.setText("3 Days");
            mainimage.setImageResource(R.drawable.kuakata);
        }

        if (city_str.equals("Sundarban")) {
            city.setText("Sundarban,Khulna");
            attr1name.setText("Koromjol Point");
            attr2name.setText("Hiron Point");
            attr1des.setText("Koromjol is known as a forest station in Sundarbans.The place is also used as Deer Breeding Center.");
            attr2des.setText("The place is especially attractive for Monkeys, Birds, Crocodiles, Snakes and Other Wildlife.");
            attr1img.setImageResource(R.drawable.koromjol);
            attr2img.setImageResource(R.drawable.hiron);
            food1name.setText("Crab Curry");
            food2name.setText("Hilsha Fish Curry");
            food1des.setText("Crab curry is so tasty food.");
            food2des.setText("It is so delicious.");
            food1img.setImageResource(R.drawable.crab);
            food2img.setImageResource(R.drawable.hilsha);
            description.setText("Sundarbans is the biggest natural mangrove forest in the world, located between Bangladesh and India.");
            location = "https://www.google.com/maps/place/%E0%A6%B8%E0%A7%81%E0%A6%A8%E0%A7%8D%E0%A6%A6%E0%A6%B0%E0%A6%AC%E0%A6%A8/@22.0188472,89.0067894,10z/data=!3m1!4b1!4m5!3m4!1s0x3a004caac2c7b315:0x4716abcfbb16c93c!8m2!3d21.9497274!4d89.1833304";
            timetovisit.setText("September to March");
            duration.setText("5 Days");
            mainimage.setImageResource(R.drawable.sun);
        }

        if (city_str.equals("Cox's Bazar")) {
            city.setText("Cox's Bazar,Cox's Bazar");
            attr1name.setText("Himchori");
            attr2name.setText("Marine Drive");
            attr1des.setText("You can come Himchori to see it's Waterfall, this is famous for waterfall.");
            attr2des.setText("It is an 80-kilometres-long road from Cox's Bazar to technaf and it is the world's longest marine drive.");
            attr1img.setImageResource(R.drawable.himchori);
            attr2img.setImageResource(R.drawable.marine);
            food1name.setText("Loitta Fry");
            food2name.setText("Sea Food");
            food1des.setText("Loitta Fry is so tasty food.");
            food2des.setText("Here local sea food is very fresh and so tasty.");
            food1img.setImageResource(R.drawable.loittafry);
            food2img.setImageResource(R.drawable.localse);
            description.setText("Cox's Bazar is the longest natural sea beach in the world.There are large number of hotels, resorts, guest houses, motels and restaurants have been established in the city. ");
            location = "https://www.google.com/maps/place/%E0%A6%95%E0%A6%95%E0%A7%8D%E0%A6%B8%E0%A6%AC%E0%A6%BE%E0%A6%9C%E0%A6%BE%E0%A6%B0/@21.4508852,91.9678825,13z/data=!4m5!3m4!1s0x30adc7ea2ab928c3:0x3b539e0a68970810!8m2!3d21.4272283!4d92.0058074";
            timetovisit.setText("December to February");
            duration.setText("3 Days");
            mainimage.setImageResource(R.drawable.sun);
        }

        if (city_str.equals("Sajek Valley")) {
            city.setText("Sajek Valley,Rangamati");
            attr1name.setText("Konglak Para");
            attr2name.setText("Sikam Twisa Waterfall");
            attr1des.setText("Konglak Para is located on the top of Konglak hill. The Sajak Valley consists mainly of Ruilui Para and Konglak Para.");
            attr2des.setText("The tracking distance of Sikam Twisa Water Fall is about 45-50 Minute from the sajek main point ");
            attr1img.setImageResource(R.drawable.konglak);
            attr2img.setImageResource(R.drawable.twisa);
            food1name.setText("Bamboo Biriyani");
            food2name.setText("Bamboo tea");
            food1des.setText("Bamboo Biriyani is a traditional food in Sajek.");
            food2des.setText("It's quite like green tea.");
            food1img.setImageResource(R.drawable.bbbbbbbb);
            food2img.setImageResource(R.drawable.btea);
            description.setText("Sajek valley is known for its natural environment and is surrounded by mountains, dense forest, and grassland hill tracks.");
            location = "https://www.google.com/maps/place/%E0%A6%B8%E0%A6%BE%E0%A6%9C%E0%A7%87%E0%A6%95/@23.3814161,92.2861862,15z/data=!3m1!4b1!4m5!3m4!1s0x375262b11e9e190d:0xa35f430f8847b276!8m2!3d23.3819926!4d92.2938229";
            timetovisit.setText("November to January");
            duration.setText("3 Days");
            mainimage.setImageResource(R.drawable.sajek);
        }

        if (city_str.equals("Nafa-Khum Waterfall")) {
            city.setText("Nafa-Khum Waterfall,Bandarban");
            attr1name.setText("Sangu River");
            attr2name.setText("Remakri");
            attr1des.setText("Sangu river is pretty much the lifeline of the Bandarban area. It is one of the major river in the hill tracks of Bangladesh.");
            attr2des.setText("Remakri is a beautiful heavenly peaceful place in Bandarban district of Bangladesh.");
            attr1img.setImageResource(R.drawable.sangu);
            attr2img.setImageResource(R.drawable.remakri);
            food1name.setText("Mundi");
            food2name.setText("Pahari Kabab");
            food1des.setText("The main ingredients are noodles made from rice,egg and hot water.");
            food2des.setText("It is so delicious.");
            food1img.setImageResource(R.drawable.mundi);
            food2img.setImageResource(R.drawable.kabab);
            description.setText("Nafakhum, the most beautiful waterfall in Bangladesh, is situated in the deep forest of Bandarban");
            location = "https://www.google.com/maps/place/%E0%A6%A8%E0%A6%BE%E0%A6%AB%E0%A6%BE%E0%A6%96%E0%A7%81%E0%A6%AE+%E0%A6%96%E0%A7%81%E0%A6%AE%E0%A6%A4%E0%A6%BE%E0%A7%9F%E0%A6%BE+%E0%A6%9D%E0%A6%B0%E0%A6%A8%E0%A6%BE/@21.7203175,92.5319988,17z/data=!3m1!4b1!4m5!3m4!1s0x30b279bf0e41a0bb:0xdcf8842c72dbe2d9!8m2!3d21.7203125!4d92.5341875";
            timetovisit.setText("September to October");
            duration.setText("3 Days");
            mainimage.setImageResource(R.drawable.nafa);
        }
        locationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(location)));
            }
        });



    }
}



