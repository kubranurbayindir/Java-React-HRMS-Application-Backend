package coderkubra.hrms.adapter;

import java.rmi.RemoteException;

import coderkubra.hrms.entities.concretes.JobSeekers;
import coderkubra.hrms.core.abstracts.MernisCheckService;
import coderkubra.hrms.core.entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements MernisCheckService{

	@Override
	public boolean CheckIfRealPerson(JobSeekers jobSeekers) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean check = false;
		try {
			 try {
				check = soapClient.TCKimlikNoDogrula(Long.parseLong
						 (jobSeekers.getIdentityNo()), jobSeekers.getFirstName().toUpperCase(),
						 jobSeekers.getLastName().toUpperCase(),jobSeekers.getBirthDate());
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} 
		return check;
	}

	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		return false;
	}
}
