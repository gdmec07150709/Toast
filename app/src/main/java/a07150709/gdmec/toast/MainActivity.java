package a07150709.gdmec.toast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) this.findViewById(R.id.button1);
        Button button2 = (Button) this.findViewById(R.id.button2);
        Button button3 = (Button) this.findViewById(R.id.button3);
        button1.setOnClickListener(showToast1);
        button2.setOnClickListener(showToast2);
        button3.setOnClickListener(showToast3);
    }

       View.OnClickListener showToast1 = new View.OnClickListener() {
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "哈哈,我早都会啦", Toast.LENGTH_LONG).show();
        }
    };
    View.OnClickListener showToast2 = new View.OnClickListener() {
        public void onClick(View v) {
           LayoutInflater li=(LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view =li.inflate(R.layout.toastinfo,null);
            Toast toast = new Toast(MainActivity.this);
            toast.setView(view);
            toast.show();
        }
    };
    View.OnClickListener showToast3 = new View.OnClickListener() {
        public void onClick(View v) {
            Toast toast = Toast.makeText(MainActivity.this, "我是小黄人-图文显示", Toast.LENGTH_LONG);
            LinearLayout ll = new LinearLayout(MainActivity.this);
            ll.setOrientation(LinearLayout.VERTICAL);
            ImageView myImage = new ImageView(MainActivity.this);
            myImage.setImageResource(R.drawable.yellowman);
            View toastView = toast.getView();
            ll.addView(myImage);
            ll.addView(toastView);
            toast.setView(ll);
            toast.show();
        }
    };
}
