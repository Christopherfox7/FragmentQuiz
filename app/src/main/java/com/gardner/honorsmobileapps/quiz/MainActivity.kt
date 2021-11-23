package com.gardner.honorsmobileapps.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gardner.honorsmobileapps.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var quantity = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
class Question(){

}