 http https://start.spring.io/starter.tgz dependencies==web,data-jpa \\
		   type==gradle-project baseDir==my-dir | tar -xzvf -


 http https://start.spring.io/html-parsing.tgz dependencies==web,data-jpa \
		   type==gradle-project baseDir==html-parsing \
           artifactId==html-parsing groupId==am.willi.trendspotting \
           packageName==am.willi.trendspotting.parsing.html \
           applicationName==HtmlParsing  | tar -xzvf -
