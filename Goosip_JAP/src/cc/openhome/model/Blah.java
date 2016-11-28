package cc.openhome.model;

import java.io.Serializable;
import java.util.*;

public class Blah implements Serializable {
		private String username;
		private Date date;
		private String text;
		
		public Blah (String username, Date date, String text) {
			this.username = username;
			this.date =date ;
			this.text = text;
		}
		public String getUsername(){
			return username;
		}
		public String getDate(){
			return date;
		}
		public String getTxt() {
			return text;
		}
		public void setUsername(String username) {
			this.username= username;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		
	

}
