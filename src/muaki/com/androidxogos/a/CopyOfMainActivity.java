package muaki.com.androidxogos.a;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CopyOfMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        esto vai pala   
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        
   
        
        return true;
    }
    
    
    int factorial (int n) {

    	if (n==0)

    	return 1;

    	else

    	return (n * factorial(n-1));

    	}
    
    
}

 