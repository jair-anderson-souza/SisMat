create table alunx(
    cpf varchar(15) primary key,
    identidade varchar(30) not null unique,
    nome varchar(40) not null,
    numeroDocumentoMilitar varchar(30),
    dtNasc date not null,
    nacionalidade varchar(30) not null,
    sexo varchar(30) not null
);
