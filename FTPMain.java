import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;

public class FTPMain {
    public static void main(String[] str){
        FTPClient ftpclient = new FTPClient();
        try {
            FTPUtils.ftpConnect(ftpclient, "ipaddress", "username", "password");
            FTPUtils.uploadFile(ftpclient, "sourcePath", "destinationPath");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}