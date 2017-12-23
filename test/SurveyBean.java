package test;


	import java.io.Serializable;
	import java.rmi.RemoteException;
	import java.util.ArrayList;
	import java.util.List;

	import javax.faces.bean.ApplicationScoped;
	import javax.faces.bean.ManagedBean;
	import javax.xml.rpc.ServiceException;

import srinivas.soap.ManageSurveyService;
import srinivas.soap.SearchInterface;



//import com.hibernate.resources.ManageSurveyServiceLocator;

	@ManagedBean(name="s")
	@ApplicationScoped
	public class SurveyBean {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String firstName;
		private String lastName;
		private String city;
		private String state;
		private ArrayList<ArrayList<String>> Totallist = new ArrayList<ArrayList<String>>();
		
		
		String  mylist;
		SearchInterface si;
		
		
		
		public String getMylist() {
			return mylist;
		}
		public void setMylist(String mylist) {
			this.mylist = mylist;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		
		
		public String SearchRecord(){
			this.Totallist.clear();
			this.mylist="";
			 ArrayList<ArrayList<String>> finallist= new ArrayList<ArrayList<String>>();
			//ManageSurveyServiceLocator se= new ManageSurveyServiceLocator();
			 ManageSurveyService se=new ManageSurveyService();
			 SearchInterface si= se.getManageSurveyPort();
			 //System.out.println(si.listResults(getFirstName(), getLastName(), getCity(), getState()));
			 //System.out.println("ManagedSurvey");
			// System.out.println(si.listResults(getFirstName(), getLastName(), getCity(), getState()));
			setMylist(si.listResults(getFirstName(), getLastName(), getCity(), getState()));
			//SearchRecord();
			//System.out.println("mylist-printing");
			//System.out.println(mylist);
			 //System.out.println(mylist);
			//System.out.println( mylist);
			
			 //System.out.println(mylist.);
			
			
				
					//si = se.getManageSurveyPort();
				
			
			
		/*try {
			mylist=si.listResults(getFirstName(), getLastName(), getCity(), getState());
			System.out.println( si.listResults(getFirstName(), getLastName(), getCity(), getState()));
			System.out.println(mylist.toString().length());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
			

				/*ArrayList<String> list = new ArrayList<String>();
				for(int j=i;j<mylist[i].length;j++){
					list.add(mylist[i][j]);
				}
			finallist.add(list);	
			}			for(int i=0;i<mylist.length;i++){
			setTotallist(finallist);*/
			return "search.xhtml";
			
		}
		
		

	}


