package de.egosanto.lottoapi.dao;

import de.egosanto.lottoapi.entity.EuroJackpotDraw;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface EuroJackpotDrawRepository extends JpaRepository<EuroJackpotDraw, Date> {
}
