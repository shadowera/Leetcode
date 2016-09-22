import java.io.*;

/**
 * Created by shadowera on 8/22/16.
 */
public class HostsParser {
    public static void main(String[] args) {
        File file = new File("hosts");
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("newHosts"));
            br = new BufferedReader(new FileReader("hosts"));
            String line = null;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.length() < 0 || line.startsWith("#"))
                    continue;
                String[] split = line.split("\\t");
                if (split.length >= 2) {
                    bw.write(split[0] + " " + split[1]);
                    bw.newLine();
                    bw.flush();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
