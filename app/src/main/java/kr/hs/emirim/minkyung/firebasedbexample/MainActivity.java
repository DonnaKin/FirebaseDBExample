package kr.hs.emirim.minkyung.firebasedbexample;

import com.squareup.picasso.Picasso;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView mNameTextView;
    private TextView mGithubTextView;
    private ImageView mProfileImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameTextView = (TextView)findViewById(R.id.profile_name);
        mGithubTextView = (TextView) findViewById(R.id.profile_github);
        mProfileImageView = (ImageView)findViewById(R.id.profile_image);

        Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into(mProfileImageView);

        Picasso.with(this)
                .load("httpL//i.imgur.com/DvpvklR.png");
                .centerCrop();
                .resize(100,100);
                .into(mProfileImageView);
    }
}
