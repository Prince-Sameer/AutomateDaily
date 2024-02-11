package Upload;

import java.io.IOException;

import org.testng.annotations.Test;
import ImageToPDF.ImagePage;

public class upload extends Base {

	@Test
	public void upload() throws InterruptedException, IOException
	{
	  ImagePage img= new ImagePage(driver);
	  img.fileupload();
	}

}
