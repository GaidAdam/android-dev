package eniso.ia2.tp1_aziz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i = Intent(this, AuthenticationActivity::class.java);
        startActivity(i);
        Toast.makeText(this, "This App is developed by Aziz", Toast.LENGTH_LONG).show()
    }
}