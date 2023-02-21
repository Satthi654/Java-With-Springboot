public class EmployeeRestController{
	public static void main(String[] args){
		try
		{
			if(con==null)
			{
				initDb();
			}
			if(con!=null)
			{
				//Statements
			}
			
		}
		catch(Exception e)
		{
			FacesMessage messsage=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR","The Error is"+e.getLocalizedMessage());
		}
		
	}
}