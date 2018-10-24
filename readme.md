### How to run

- execute `mvn clean install`

- Open terminal and run the following command \
`mvn tomcat7:run -pl *-server -am -Denv=dev`

- Open another terminal and run the following command \
`mvn gwt:codeserver -pl *-client -am`