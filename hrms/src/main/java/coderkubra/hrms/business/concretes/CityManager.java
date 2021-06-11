package coderkubra.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coderkubra.hrms.business.abstracts.CityService;
import coderkubra.hrms.core.utilities.results.DataResults;
import coderkubra.hrms.core.utilities.results.ErrorDataResults;
import coderkubra.hrms.core.utilities.results.Results;
import coderkubra.hrms.core.utilities.results.SuccessDataResults;
import coderkubra.hrms.core.utilities.results.SuccessResults;
import coderkubra.hrms.dataAccess.abstracts.CityDao;
import coderkubra.hrms.entities.concretes.Cities;
@Service
public class CityManager implements CityService {
	
	private CityDao cityDao;

	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public Results add(Cities cities) {
		this.cityDao.save(cities);		
		return new SuccessResults("Sehır eklendi.");
	}

	@Override
	public DataResults<List<Cities>> getAll() {
		if (this.cityDao.findAll() != null) {
			return new SuccessDataResults<List<Cities>>(this.cityDao.findAll(),"Sehırler lıstelendı.");
		}
		return new ErrorDataResults<List<Cities>>("Sehırler lıstelenemedı.");
	}

}
