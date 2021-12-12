/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Komut satırından aşağıdaki gibi çalışan programı yazınız:
        java org.csystem.app.App <src> <dest>
    Program komut satırı argümanı verilmezse klavyeden yol ifadesini isteyecektir. src ile aldığı dosyayı dest ile
    aldığı dosya olarak kopyalayacaktır. Hedef dosya varsa hedef dosya ismi ve uzantısının sonuna "-bak" ekelenerek
    yedeklenecektir. Daha önce yedeklenmişse üzerine yazılacaktır. Bu işlemden sonra kopyalama yapılacaktır
----------------------------------------------------------------------------------------------------------------------*/

package org.csystem.app;

import java.io.FileOutputStream;

import static org.csystem.util.console.CommandLineUtil.checkIfNotEqualAndExit;

class App {
	public static void main(String [] args)
	{
		checkIfNotEqualAndExit(args, 1, "Wrong number of arguments");

		try (FileOutputStream fos = new FileOutputStream(args[0])) {
			//...
		}
		catch (Throwable ex) {
			System.err.println(ex.getMessage());
		}
	}
}
