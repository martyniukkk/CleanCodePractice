package com.cleancodepractice.presentation.activity

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cleancodepractice.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel by viewModel<MainViewModel>()

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.resultLiveData.observe(this) { result ->
            binding.label.text = result
        }

        binding.getNameButton.setOnClickListener {
            viewModel.get()
        }
        binding.saveNameButton.setOnClickListener {
            viewModel.save(name = binding.nameEditText.text.toString())
        }
    }

}