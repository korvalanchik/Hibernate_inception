package org.hibernate.init;

import org.flywaydb.core.Flyway;
import org.hibernate.config.DbUtils;

public class InitService {
    public InitService() {
        DbUtils dbConfig = new DbUtils();
//        Flyway flyway = Flyway.configure().dataSource(dbConfig.getDbUrl(),"Valerii","").load();


        Flyway flyway = Flyway.configure()
                .dataSource(dbConfig.getDbUrl(), dbConfig.getDbUser(), dbConfig.getDbPassword())
                .locations("db/migration")
                .baselineOnMigrate(true)
                .load();

        flyway.migrate();
    }

}
