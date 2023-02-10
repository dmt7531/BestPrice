package myapps.bestprice.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import myapps.bestprice.databinding.ActivityMainBinding.inflate
import myapps.bestprice.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel: MainViewModel by viewModels()





    }
}