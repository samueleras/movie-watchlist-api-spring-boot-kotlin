package com.samuel.movie_watchlist_api.domain.dto

import org.springframework.hateoas.server.core.Relation

@Relation(itemRelation = "movie", collectionRelation = "movies")
class MovieDto(var id: Long? = null, var title: String? = null)