package edu.jlu.fuliang.Service;

import java.util.List;

import edu.jlu.fuliang.domain.Band;
import edu.jlu.fuliang.domain.CompositeSinger;
import edu.jlu.fuliang.domain.Singer;
import edu.jlu.fuliang.domain.SingleSinger;

public interface SingerManageService {
	 public List<Singer> getAllSingers();
	  public List<SingleSinger> getAllSingleSingers();
	  public List<CompositeSinger> getAllCompositeSingers();
	  public List<Band> getAllBands();
	 
	  public List<Singer> getSingersByName(String name);
	  public List<SingleSinger> getSingleSingersByName(String name);
	  public List<Band> getBandsByName(String name);
	  public List<Singer> getSingerByRegion(String region);
	  public Singer getSingerById(Long id);
	  public void deleteSinger(Long id);
	  public void updateSinger(Singer singer);
	  public void saveSinger(Singer singer); 
}
