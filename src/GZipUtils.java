import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by Shadowera on 2016/1/10.
 */
public class GZipUtils {

    public static void GZip(File in, File out) {
        GZIPOutputStream gos = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(in);
            gos = new GZIPOutputStream(new FileOutputStream(out));
            int len = 0;
            byte[] buffer = new byte[1024];
            while ((len = fis.read(buffer)) != -1) {
                gos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeQuietly(fis);
            closeQuietly(gos);
        }
    }

    public static void UnGZip(InputStream in, File des) {
        GZIPInputStream gis = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(des);
            gis = new GZIPInputStream(in);
            int len = 0;
            byte[] buffer = new byte[1024];
            while ((len = gis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeQuietly(fos);
            closeQuietly(gis);
        }
    }
    public static void closeQuietly(InputStream in){
        if(in!=null){
            try{
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void closeQuietly(OutputStream outputStream){
        if(outputStream!=null){
            try{
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        File in=new File("address.db");
        File out=new File("address.zip");
        GZip(in,out);
    }
}
