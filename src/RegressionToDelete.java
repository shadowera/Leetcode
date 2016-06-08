import java.io.File;

/**
 * Created by Shadowera on 2016/5/13.
 */
public class RegressionToDelete {
    private boolean delete(File pluginFile) {
        if(pluginFile==null){
            return false;
        }
        if (pluginFile.isFile()) {
            return pluginFile.delete();
        } else {
            File[] files = pluginFile.listFiles();
            boolean isDelete = true;
            if (files == null || files.length == 0) {
                return false;
            }
            for (File file : files) {
                isDelete = isDelete & delete(file);
            }
            return isDelete;
        }
    }
}
