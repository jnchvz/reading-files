import java.io.*;
import java.util.*;

public class ReadFile implements InterfaceReadFile{
	private File file;
	FileInputStream f;
	private LinkedList<String> content;
	
	public ReadFile(String name)
	{
		this.f = null;
		this.file = new File(name);
		this.content = new LinkedList<String>();
	
	}
	
	public void open()
	{
		if(this.file.exists()) {
			System.out.println("File exists");
		} else {
			System.out.println("File not found");
		}	
	}	
	
	public void read()
	{
		try {			
			this.f = new FileInputStream(this.file);
			InputStreamReader reader = new InputStreamReader(this.f);
			BufferedReader buff = new BufferedReader(reader);
			String line;
			
			while((line = buff.readLine()) != null) {
				this.getContent().add(line);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void show()
	{		
		for(int i = 0; i < this.getContent().size(); i++) {
			System.out.println(this.getContent().get(i));
		}
	}

	public LinkedList<String> getContent() {
		return content;
	}
}
	
