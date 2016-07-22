package edu.jlu.fuliang.Service;

import java.util.List;

import edu.jlu.fuliang.domain.Song;

public interface SongManageService {
	public List<Song> getAllSongs();
	public Song getSongById(Long id);
	public List<Song> getSongByName(String name);
	public void updateSong(Song song);
	public void saveSong(Song song);
	public void deleteSong(long id);
	public List<Song> findSongBySongerRegion(String region);
}
