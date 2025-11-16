package com.samuel.movie_watchlist_api.mappers;

import com.samuel.movie_watchlist_api.domain.MovieEntity;
import com.samuel.movie_watchlist_api.domain.dto.MovieDto;
import com.samuel.movie_watchlist_api.mappers.impl.MovieMapperImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MovieMapperImplIT {

    @Autowired
    private MovieMapperImpl movieMapper;

    private MovieEntity entity;
    private MovieDto dto;

    @BeforeEach
    void setUp() {
        //Arrange
        entity = new MovieEntity();
        entity.setId(1L);
        entity.setTitle("Harry Potter");
        dto = new MovieDto();
        dto.setId(1L);
        dto.setTitle("Harry Potter");
    }

    @Test
    void shouldMapMovieEntityToMovieDto() {
        //Act
        MovieDto movieDto = movieMapper.mapTo(entity);

        //Assert
        assertThat(movieDto).usingRecursiveComparison().isEqualTo(dto);
    }

    @Test
    void shouldMapMovieDtoToMovieEntity() {
        //Act
        MovieEntity movieEntity = movieMapper.mapFrom(dto);

        //Assert
        assertThat(movieEntity).usingRecursiveComparison().isEqualTo(entity);
    }

}
