package mkdirs;

import java.io.File;

public class mkdirs {
	public static void main(String[] args) {
		File file = new File("d:/a");
		if(!file.exists()) {
			file.mkdirs();
		}
	}
}
