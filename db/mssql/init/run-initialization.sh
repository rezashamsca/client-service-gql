# Wait to be sure that SQL Server came up
sleep 90s

# Run the setup script to create the DB and the schema in the DB
/opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P 'yourStrong(!)Password' -d master -i schema.sql

/opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P 'yourStrong(!)Password' -d master -i data.sql