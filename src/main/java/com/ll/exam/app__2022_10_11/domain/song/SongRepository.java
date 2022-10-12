package com.ll.exam.app__2022_10_11.domain.song;


import com.ll.exam.app__2022_10_11.domain.song.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
