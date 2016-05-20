import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by 1m0rt4l on 19/05/2016.
 */
public class Wordcloud_aux {

    public Wordcloud_aux()
    {

    }

    public static String readFile(String path)
            throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, StandardCharsets.UTF_8);
    }

    public InputStream remove_chars(String text)
    {
        String _final = text;

        _final = _final.replace("#","");
        _final = _final.replace("=","");
        _final = _final.replace("\\","");
        _final = _final.replace("*","");
        _final = _final.replace("|","");
        _final = _final.replace("-","");
        _final = _final.replace(":","");
        _final = _final.replace("[","");
        _final = _final.replace("]","");
        _final = _final.replace("(","");
        _final = _final.replace(")","");
        _final = _final.replace("<","");
        _final = _final.replace(">","");
        _final = _final.replace("!","");
        _final = _final.replace("?","");
        _final = _final.replace(".","");

        InputStream stream = new ByteArrayInputStream(_final.getBytes(StandardCharsets.UTF_8));

        return stream;

    }



}
