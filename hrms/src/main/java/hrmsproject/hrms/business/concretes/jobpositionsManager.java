package hrmsproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsproject.hrms.business.abstracts.jobpositionsService;
import hrmsproject.hrms.dataAccess.abstracts.jobpositionsDao;
import hrmsproject.hrms.entities.concretes.jobpositions;

@Service
public class jobpositionsManager implements jobpositionsService {
		
	private jobpositionsDao jobPositionsDao;
		
	@Autowired
	public jobpositionsManager(jobpositionsDao jobPositionsDao) {
			super();
			this.jobPositionsDao = jobPositionsDao;
		}
	@Override
	public List<jobpositions> getAll() {
		return this.jobPositionsDao.findAll();
	}

}
