package com.vk.testdrivendevelopment_ui_test

import io.reactivex.Single
import retrofit2.http.GET

interface JokeService {

    @GET("random_joke.json")
    fun getRandomJoke(): Single<Joke>
}