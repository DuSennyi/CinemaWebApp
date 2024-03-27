package com.cinema.backend.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cinema_hall")
public class CinemaHall {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long movieId;
    private String movieSession;
    @ElementCollection
    private List<Integer> updatedSeats;

    public CinemaHall() {
    }

    public CinemaHall(Long id, Long movieId, String movieSession, List<Integer> updatedSeats) {
        this.id = id;
        this.movieId = movieId;
        this.movieSession = movieSession;
        this.updatedSeats = updatedSeats;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieSession() {
        return movieSession;
    }

    public void setMovieSession(String movieSession) {
        this.movieSession = movieSession;
    }

    public List<Integer> getUpdatedSeats() {
        return updatedSeats;
    }

    public void setUpdatedSeats(List<Integer> updatedSeats) {
        this.updatedSeats = updatedSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CinemaHall that = (CinemaHall) o;
        return Objects.equals(id, that.id) && Objects.equals(movieId, that.movieId) && Objects.equals(movieSession, that.movieSession) && Objects.equals(updatedSeats, that.updatedSeats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, movieId, movieSession, updatedSeats);
    }

    @Override
    public String toString() {
        return "HallSeating{" +
                "id=" + id +
                ", movieId=" + movieId +
                ", movieSession='" + movieSession + '\'' +
                ", updatedSeats=" + updatedSeats +
                '}';
    }
}
