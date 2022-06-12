USE ClientDb;
GO
INSERT INTO dbo.client(id, name) values (newid(), 'Bill Gates');
INSERT INTO dbo.client(id, name) values (newid(), 'Jeff Bezos');
INSERT INTO dbo.client(id, name) values (newid(), 'Mark Zuckerburg');
INSERT INTO dbo.client(id, name) values (newid(), 'Elon Musk');
GO
