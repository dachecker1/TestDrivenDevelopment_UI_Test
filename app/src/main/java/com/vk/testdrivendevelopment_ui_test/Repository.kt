package com.vk.testdrivendevelopment_ui_test

import io.reactivex.Single

interface Repository {
    fun getJoke() : Single<Joke>
}

class RepositoryImpl(private val service: JokeService) : Repository {
    override fun getJoke() : Single<Joke> {
        return service.getRandomJoke()
    }
}