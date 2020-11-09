
NOTE: If you get an error about JAXB (java.lang.ClassNotFoundException: javax.xml.bind.JAXBException), it’s because you’re using Java 11. To fix this, add JAXB to your build.gradle.
runtimeOnly 'org.glassfish.jaxb:jaxb-runtime'
