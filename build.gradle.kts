plugins {
    id("java")
}

group = "com.choucair.pruebas"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
// https://mvnrepository.com/artifact/net.serenity-bdd/serenity-cucumber
    implementation("net.serenity-bdd:serenity-cucumber:4.2.9")
// https://mvnrepository.com/artifact/net.serenity-bdd/serenity-screenplay
    implementation("net.serenity-bdd:serenity-screenplay:4.2.9")
// https://mvnrepository.com/artifact/net.serenity-bdd/serenity-screenplay-webdriver
    implementation("net.serenity-bdd:serenity-screenplay-webdriver:4.2.9")
// https://mvnrepository.com/artifact/net.serenity-bdd/serenity-core
    implementation("net.serenity-bdd:serenity-core:4.2.9")
// https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation("org.seleniumhq.selenium:selenium-java:4.26.0")
// https://mvnrepository.com/artifact/net.serenity-bdd/serenity-ensure
    implementation("net.serenity-bdd:serenity-ensure:4.2.9")


}
