#!/usr/bin/env kotlin

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val googleBtn = findViewById<Button>(R.id.googleLogin)
        val facebookBtn = findViewById<Button>(R.id.facebookLogin)
        val appleBtn = findViewById<Button>(R.id.appleLogin)
        val passwordBtn = findViewById<Button>(R.id.passwordLogin)

        googleBtn.setOnClickListener {
            // Logic Google login
        }

        facebookBtn.setOnClickListener {
            // Facebook login
        }

        appleBtn.setOnClickListener {
            // Apple login
        }

        passwordBtn.setOnClickListener {
            // переход к экрану логина
        }
    }
}