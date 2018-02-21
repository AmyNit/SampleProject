package DBTest;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DBTest{
		WebDriver driver;
		
		@Test
		public void selectDBdata() throws ClassNotFoundException, SQLException{
			//String textData = driver.findElement(By.xpath("")).getText();
			String query = "SELECT * FROM registration";
			String query1 = "SELECT name FROM registration where id=1";
			Database dataBase = new Database();
			ResultSet data = dataBase.getData(query);
			System.out.println(data);
			while(data.next()){
				System.out.println(data.getString(1)+" "+data.getString(2)+" "+data.getString(3)+" "+data.getString(4)+" "+data.getString(5));
			}
			/*
			if(textData.contains(data.getString(1))){
				
			}
			*/
		}
		
	//	@Test
		public void insertDBdata() throws ClassNotFoundException, SQLException{
			String query = "insert into registration values(6,'bhnau',20,80000,'bhanu@gmail.com')";
			Database dataBase = new Database();
			dataBase.insertData(query);	
		}
		
	//	@Test
		public void updateDBdata() throws ClassNotFoundException, SQLException{
			String query = "update registration set name='56777' where profession='testing123'";
			Database dataBase = new Database();
			dataBase.updateData(query);
			
		}

	}

