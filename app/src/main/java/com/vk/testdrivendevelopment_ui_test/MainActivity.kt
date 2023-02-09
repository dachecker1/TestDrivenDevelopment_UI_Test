package com.vk.testdrivendevelopment_ui_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.vk.testdrivendevelopment_ui_test.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModel()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.state.observe(this) { uiModel ->
            render(uiModel)
        }
        viewModel.getJoke()
    }

    private fun render(uiModel: UiModel) {
        when (uiModel) {
            is UiModel.Success -> showJoke(uiModel.joke)
            is UiModel.Error -> showError(uiModel.error)
        }
    }

    private fun showJoke(joke: Joke) {
    }

    private fun showError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show()
    }
}