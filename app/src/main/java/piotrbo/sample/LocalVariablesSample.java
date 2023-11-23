/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package piotrbo.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class LocalVariablesSample {
    public static void main(String[] args) throws IOException {
        //you provide 'var' as a type instead actual type:
        var url = new URL("https://piotrbo.github.io/test-blog/2023/11/21/Java-21-language.html"); 
        var conn = url.openConnection(); 
        var reader = new BufferedReader(
            new InputStreamReader(conn.getInputStream()));
            
        System.out.println(reader.readLine());
    }
}
