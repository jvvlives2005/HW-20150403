package nyc.c4q.jvvlives2005;
/**
 * Created by c4q-joshelynvivas on 4/3/15.
 *
 * Joshelyn Vivas
 *
 * Sanitizing web pages
 * 
 * Search engines like Google have programs called web-scapers which visit webpages and scrape the information
 * displayed on the webpage. The displayable information is contained in html tags like p, table, h2 etc.
 * When we make a GET request for a webpage, the HTML that is returned can also contain tags like script which often
 * do not correspond to the displayable content on the webpage. Information inside script tags is not used by scapers
 * and they often ignore these tags in the HTML. Write a class called WebPageSanitizer which implements a static method
 * called String sanitize(String html) which removes all script tags and the information that they encapsulate and returns
 * a sanitized version of the HTML string.
 */

public class WebPageSanitizer
{
    public static String santize(String html){
        /**that is the farthest I can go. I am not understanding the logic in this.
         * I think I would need like:
         * -importing some type of url and create another class?
         * -getting method or something like that (.get())
         * - question: how are people getting the HTTP class? Did they just create and put it in? Or they had a template?
         */
        return "";
    }
}
