package com.ll.exam.app__2022_10_11.domain.song;


import com.ll.exam.app__2022_10_11.domain.song.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {
    List<Song> findAllByAuthorId(Long id);
}
