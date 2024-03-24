package com.example.dagger2demo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val smartfone = Smartfone(Battery(),SimCard(ServiceProvider()),Memory())
//        smartfone.makeCall()
//        val userRepositary = UserRepositary()
//        val emailService = EmailService()
//        val userRegistrationService = UserRegistrationService(userRepositary,emailService)

        val component = DaggerUserRegistrationComponent.builder().build()

        val userRegistrationService = component.getUserRegistration()
        userRegistrationService.registerUser("xyzzzz","111111")

        val emailService = component.getEmailService()
    }
}