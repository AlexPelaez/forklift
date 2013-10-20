name := "forklift"

version := "0.1"

libraryDependencies ++= Seq(
    "org.springframework" % "spring-jms" % "3.2.4.RELEASE",
    "ch.qos.logback" % "logback-classic" % "1.0.13",
    "junit" % "junit" % "4.11" % "test",
    "com.novocode" % "junit-interface" % "0.8" % "test->default",
    "org.apache.geronimo.specs" % "geronimo-jms_1.1_spec" % "1.1.1"
)

autoScalaLibrary := false

crossPaths := false

resolvers ++= Seq(
    "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
    "Maven Central" at "http://repo1.maven.org/maven2",
    "Fuse Snapshots" at "http://repo.fusesource.com/nexus/content/repositories/snapshots",
    "Fuse" at "http://repo.fusesource.com/nexus/content/groups/public"
)