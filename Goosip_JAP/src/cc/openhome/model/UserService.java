package cc.openhome.model;

import java.io.File;
import java.io.Serializable;
import java.io.Writer;
import java.util.*;

public class UserService {
	private String username;
	private Date date;
	private String txt;
	
	public List<Blah> getBlahs(Blah blah) throws IOException {
		this.username = username;
		this.date = date;
		this.txt = txt;	
		List<Blah> blahs = new ArrayList<Blah>();
		for (Date date : messages.keySet()) {
			String txt = messages.get(date);
			blahs.add(new Blah(blah.getUsername(), date, txt));
		}
		return blahs;
	}
	public void addBlah(Blah  blah) throws IOException {
		String file = USERS + "/" + blah.getUsername() + "/" + blah.getDate().getTime() + ".txt";
		BufferedWrite write = new BufferedWriter(
				new OutputStreamWriter(new FileoutputStream(flie), "UTF-8"));
		writer.writer(blah.getTxt());
		Writer.close();
	}
	public void deleteBlah(Blah blah) {
		File file = new Flie(USERS + "/" + blah.getUsername() + "/" + blah.getDate().getTime() + ".txt");
		if(file.exists()) {
			file.delete();
		}
	}
}