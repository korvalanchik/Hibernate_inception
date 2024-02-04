package org.hibernate;

import org.flywaydb.core.Flyway;

public class InitService {
    public InitService() {
        Flyway flyway = Flyway.configure().dataSource("./mydb","","").load();
    }
}
