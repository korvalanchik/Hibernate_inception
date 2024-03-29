plugins {
    id("java")
}

group = "org.hibernate"
version = ""

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")
    implementation("com.h2database:h2:2.2.224")
    implementation("org.flywaydb:flyway-core:10.7.1")
    implementation("org.hibernate:hibernate-core:6.4.3.Final")
    implementation("org.hibernate:hibernate-validator:8.0.1.Final")
    implementation("jakarta.validation:jakarta.validation-api:3.0.2")

}

tasks.test {
    useJUnitPlatform()
}