Hello world OSGi bundle
=======================

Hello World OSGi bundle using OSGi Framework Log service (implemented by Apache Felix Log). Built and packaged using [Apache Felix Bundle Plugin for Maven][ref_BundlePlugin]. Deployed in JBoss AS using [JBoss AS7 Deployment Plugin][ref_JBossPlugin].

## Requirements:

- [Apache Maven][ref_Maven]
- [JBoss Application Server 7][ref_JBossAS]


## Usage:

- Build the project with:

  `mvn clean install`

  All the dependencies will be downloaded from Maven repositories.

- Launch JBoss AS 7.1.1.Final in the standalone mode with:

  `cd {JBOSS_HOME}`
  
  `bin/standalone.sh`

- Deploy the project with:

  `mvn jboss-as:deploy`

  JBoss AS will activate OSGi runtime automatically and the bundle will be deployed and activated. To check it, open JBoss AS standalone log at `{JBOSS_HOME}/standalone/log/server.log` and look for a line ending by `Hello OSGi!!`.

- Undeploy the project with:

  `mvn jboss-as:undeploy`

  The log will show a line ending by `Goodbye OSGi!!`.


[ref_BundlePlugin]: http://felix.apache.org/site/apache-felix-maven-bundle-plugin-bnd.html
[ref_JBossPlugin]: http://docs.jboss.org/jbossas/7/plugins/maven/final/
[ref_Maven]: http://maven.apache.org/
[ref_JBossAS]: http://www.jboss.org/jbossas