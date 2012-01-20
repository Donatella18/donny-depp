package pdm.pkg.donatella;



import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MyPlayerActivity extends Activity {
    /** Called when the activity is first created. */
	MediaPlayer mp;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mp = MediaPlayer.create(MyPlayerActivity.this, R.raw.dst);
        
        
        Button start = (Button)findViewById(R.id.start);
        start.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		
        		mp.start();
        	}
        });
        
        
        Button pausa = (Button)findViewById(R.id.pausa);
        pausa.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		
        		mp.pause();
        	}
        });
        
        protected void OnDestroy(){
        	super.onDestroy();
        	mp.release();
        }
        
       
    }
}