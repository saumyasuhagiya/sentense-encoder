FROM tomcat:8-jre8-alpine
MAINTAINER saumya.patel2001@gmail.com
RUN ln -snf /usr/share/zoneinfo/Asia/Kolkata /etc/localtime
ENV JAVA_OPTS="-Duser.timezone=IST -Dspring.profiles.active=dock"
COPY chatbot.war /usr/local/tomcat/webapps/
CMD ["catalina.sh", "run"]
