package dev;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        String asciiArt1 = FigletFont.convertOneLine("App");  // erreur car le package FigletFont n'est pas compilé avec le reste du jar
        System.out.println(asciiArt1);
    }
}
