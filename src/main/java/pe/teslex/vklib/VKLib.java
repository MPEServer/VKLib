package pe.teslex.vklib;

/**
 * Created by expexes on 14.01.2017.
 * Site: teslex.tech
 */

import cn.nukkit.plugin.PluginBase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class VKLib extends PluginBase {

    /**
     * @param token
     * @param id
     * @param message
     * @return
     */
    public static String messagesSend(String token, int id, String message) {
        String line = "";
        String url = "https://api.vk.com/method/"+
                "messages.send"+
                "?user_id="+id+
                "&message="+message+
                "&access_token="+token+
                "&v=5.60"
                ;
        try {
            URL url2 = new URL(url);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url2.openStream()));
            line = reader.readLine();
            reader.close();

        } catch (MalformedURLException e) {

        } catch (IOException e) {

        }
        return line;
    }

    /**
     * @param token
     * @param id
     * @param message
     * @return
     */
    public static String wallPost(String token, int id, String message) {
        String line = "";
        String url = "https://api.vk.com/method/"+
                "wall.post"+
                "?owner_id="+id+
                "&message="+message+
                "&access_token="+token+
                "&v=5.60"
                ;
        try {
            URL url2 = new URL(url);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url2.openStream()));
            line = reader.readLine();
            reader.close();

        } catch (MalformedURLException e) {

        } catch (IOException e) {

        }
        return line;
    }

    @Override
    public void onEnable() {
        this.getLogger().info("Запущен");
    }

}
