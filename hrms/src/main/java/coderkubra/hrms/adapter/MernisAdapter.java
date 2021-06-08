package coderkubra.hrms.adapter;

import java.rmi.RemoteException;

import coderkubra.hrms.business.abstracts.UserCheckService;
import coderkubra.hrms.entities.concretes.Candidates;
import coderkubra.hrms.entities.concretes.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(Candidates candidates) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean check = false;
		try {
			 try {
				check = soapClient.TCKimlikNoDogrula(Long.parseLong
						 (candidates.getIdentityNo()), candidates.getFirstName().toUpperCase(),
							candidates.getLastName().toUpperCase(),candidates.getBirthDate());
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
