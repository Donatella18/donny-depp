package pcg.donatella;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Second extends Activity {
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.second);
	        
	        TextView label = (TextView) findViewById(R.id.textView1);
	        String iltestoricevuto = getIntent().getExtras().getString("iltestonelbox");
	        label.setText(iltestoricevuto);

  }
	 
	 protected void onStart(){
		 super.onStart();
		 Log.d("XML","start");
	 }
	 
	 protected void onReStart(){
		 super.onRestart();
		 Log.d("XML","restart");
	 }
	 
	 protected void onResume(){
		 super.onResume();
		 Log.d("XML","resume");
	 }
	 
	 protected void onPause(){
		 super.onPause();
		 Log.d("XML","pause");
	 }
	 
	 protected void onStop(){
		 super.onStop();
		 Log.d("XML","stop");
	 }
	 
	 protected void onDestroy(){
		 super.onDestroy();
		 Log.d("XML","destroy");
	 }
}

