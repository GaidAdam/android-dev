package eniso.ia2.tp1_aziz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import eniso.ia2.tp1_aziz.databinding.ActivityAuthenticationBinding
import eniso.ia2.tp1_aziz.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class AuthenticationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)

        var date = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date())

        val binding = ActivityAuthenticationBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.textView3.text = date

        binding.update.setOnClickListener {
           date = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date())
            binding.textView3.text = date
        }

        binding.signin.setOnClickListener {
            var login = binding.loginInput.text.toString()
            var password = binding.passwordInput.text.toString()

            if (password == "pw$login") {
                Toast.makeText(this, "Success", Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(this, "Failed", Toast.LENGTH_LONG).show()
            }
        }



    }
}