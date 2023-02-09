package com.vk.testdrivendevelopment_ui_test

sealed class UiModel {
    data class Success(val joke: Joke) : UiModel()

    data class Error(val error: String) : UiModel()
}
