package am.willi.trendspotting.parsing.html;

import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class WikipediaHeadlines {

    private static Document doc;

    @Before
    public void getWikipediaHomepage() throws IOException  {
        doc = Jsoup.connect("http://en.wikipedia.org/").get();

        log.info(doc.title());
    }

    @Test
    public void getsHeadlineLinks() {
        // https://jsoup.org/
        Elements newsHeadlines = doc.select("#mp-itn b a");
        newsHeadlines.forEach(headline -> log.info(
                String.format("%s\n\t%s", headline.attr("title"),
                        headline.absUrl("href"))
        ));
    }

    @Test
    public void getMetaKeyValues() {
        Elements meta = doc.head().getElementsByTag("meta");
        meta.forEach(element -> log.info(String.format("%s=%s",
                element.attr("name"), element.attr("content")
        )));

        log.debug(meta.toString());
    }
}
