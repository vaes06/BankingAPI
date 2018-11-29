package db.migration;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;
import org.flywaydb.core.internal.jdbc.JdbcTemplate;

import java.sql.Connection;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

public class V1__CreateCustomerTable extends BaseJavaMigration{

	
	public void migrate(Context context) throws Exception {
		
		Flyway flyway = Flyway.configure().dataSource("localhot:3306", "root", "vaes06").load();
		flyway.migrate();
	}

	

}
