-- Database: TransportadoraFM

-- DROP DATABASE "TransportadoraFM";

CREATE DATABASE "TransportadoraFM"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
	
	--Criando tabela Remetente
	Create table Remetente(
     	CodigoRemetente integer not null check (CodigoRemetente > 0),
	    NomeRemetente varchar(40) not null,
		LogradouroRemetente varchar(50) not null,
		ContatoRemetente integer not null check (ContatoRemetente >0),
		constraint PKRemetente primary key(CodigoRemetente)
	);
	select * from Remetente
	
	--Criando tablela Produto
	Create table Produto(
		CodigoProduto integer not null check (CodigoProduto > 0),
		CodigoRemetente integer not null check (CodigoRemetente > 0),
		CodigoDestinatario integer not null check (CodigoDestinatario >0),
		DescricaoProduto varchar(50) not null,
		QuantidadeProduto integer not null check (QuantidadeProduto > 0),
		DataDeEnvio date check (DataDeEnvio <= current_date),
		PrevisaoEntrega date check ( PrevisaoEntrega >= DataDeEnvio),
		DataEntrega date check (DataEntrega <= current_date),
		constraint PKProduto primary key (CodigoProduto),
		constraint FKRemetente foreign key (CodigoRemetente) references Remetente (CodigoRemetente),
		constraint FKDestinatario foreign key (CodigoDestinatario) references Destinatario (CodigoDestinatario)
	);
	select * from Produto
	
	--Criando tabela Destinatario
	Create table Destinatario(
     	CodigoDestinatario integer not null check (CodigoDestinatario > 0),
	    NomeDestinatario varchar(40) not null,
		LogradouroDestinatario varchar(50) not null,
		ContatoDestinatario integer not null check (ContatoDestinatario >0),
		constraint PKDestinatario primary key(CodigoDestinatario)
	);
	select * from Destinatario