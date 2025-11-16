package com.samuel.movie_watchlist_api.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class MovieEntity(movieId: Long? = null, movieTitle: String? = null) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = movieId

    var title: String? = movieTitle
}
