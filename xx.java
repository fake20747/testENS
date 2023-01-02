import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;


class MainClass{
	public static void main() throws IOException {

}
public static List<String> zipSlipNoncompliant(ZipFile zipFile) throws IOException {
 Enumeration<? extends ZipEntry> entries = zipFile.entries();
 List<String> filesContent = new ArrayList<>();
 while (entries.hasMoreElements()) {
 ZipEntry entry = entries.nextElement();
 File file = new File(entry.getName());
 String content = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
 filesContent.add(content);
 }
 return filesContent;
 }
 
}
