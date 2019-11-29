package filehander;

import java.io.IOException;
import java.util.ArrayList;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class pdfreader {

	// private static final String FILE_NAME = "/tmp/itext.pdf";

	public static void main(String[] args) {

		PdfReader reader;

		try {

			reader = new PdfReader("D:\\testing/Updated Sprint 2 Service Cloud Requirements (Aug 29).pdf");

			// pageNumber = 1
			int pg = reader.getNumberOfPages();
			ArrayList<String> ls = new ArrayList<String>();
			ArrayList<String> sub = new ArrayList<String>();
			for (int i = 1; i <= pg; i++) {

				// System.out.println(i);
				String split[];
				String textFromPage = PdfTextExtractor.getTextFromPage(reader, i);
				split = textFromPage.split("\\n");
				for (String a : split)
					if (a.contains("[MARLS"))
						ls.add(a);
				// System.out.println(textFromPage);
			}
			for (String c : ls)
				if (c.charAt(0) == '[')
					sub.add(c);
			System.out.println(sub.size());
			for (String c : sub)
				System.out.println(c);
			reader.close();

		} catch (

		IOException e) {
			e.printStackTrace();
		}

	}

}