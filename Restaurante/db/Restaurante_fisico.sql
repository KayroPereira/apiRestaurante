/* Restaurante_logico: */

CREATE TABLE telefone (
    id serial PRIMARY KEY,
    numero text,
    fk_tipo_telefone_id serial
);

CREATE TABLE usuario (
    id serial PRIMARY KEY,
    nome text,
    senha text,
    data_criacao date
);

CREATE TABLE tipo_telefone (
    id serial PRIMARY KEY,
    descricao text
);

CREATE TABLE funcionario (
    id serial,
    data_criacao date,
    data_nascimento date,
    cpf text,
    fk_usuario_id serial,
    PRIMARY KEY (id, fk_usuario_id)
);

CREATE TABLE cliente (
    id serial,
    data_cricao date,
    data_nascimento date,
    fk_usuario_id serial,
    PRIMARY KEY (id, fk_usuario_id)
);

CREATE TABLE cliente_avulso (
    id serial PRIMARY KEY,
    data_criacao date
);

CREATE TABLE cliente_telefone (
    fk_cliente_id serial,
    fk_cliente_fk_usuario_id serial,
    fk_telefone_id serial
);

CREATE TABLE funcionario_telefone (
    fk_funcionario_id serial,
    fk_funcionario_fk_usuario_id serial,
    fk_telefone_id serial
);

CREATE TABLE cliente_avulso_telefone (
    fk_cliente_avulso_id serial,
    fk_telefone_id serial
);
 
ALTER TABLE telefone ADD CONSTRAINT FK_telefone_2
    FOREIGN KEY (fk_tipo_telefone_id)
    REFERENCES tipo_telefone (id)
    ON DELETE CASCADE;
 
ALTER TABLE funcionario ADD CONSTRAINT FK_funcionario_2
    FOREIGN KEY (fk_usuario_id)
    REFERENCES usuario (id)
    ON DELETE CASCADE;
 
ALTER TABLE cliente ADD CONSTRAINT FK_cliente_2
    FOREIGN KEY (fk_usuario_id)
    REFERENCES usuario (id)
    ON DELETE CASCADE;
 
ALTER TABLE cliente_telefone ADD CONSTRAINT FK_cliente_telefone_1
    FOREIGN KEY (fk_cliente_id, fk_cliente_fk_usuario_id)
    REFERENCES cliente (id, fk_usuario_id)
    ON DELETE RESTRICT;
 
ALTER TABLE cliente_telefone ADD CONSTRAINT FK_cliente_telefone_2
    FOREIGN KEY (fk_telefone_id)
    REFERENCES telefone (id)
    ON DELETE RESTRICT;
 
ALTER TABLE funcionario_telefone ADD CONSTRAINT FK_funcionario_telefone_1
    FOREIGN KEY (fk_funcionario_id, fk_funcionario_fk_usuario_id)
    REFERENCES funcionario (id, fk_usuario_id)
    ON DELETE RESTRICT;
 
ALTER TABLE funcionario_telefone ADD CONSTRAINT FK_funcionario_telefone_2
    FOREIGN KEY (fk_telefone_id)
    REFERENCES telefone (id)
    ON DELETE RESTRICT;
 
ALTER TABLE cliente_avulso_telefone ADD CONSTRAINT FK_cliente_avulso_telefone_1
    FOREIGN KEY (fk_cliente_avulso_id)
    REFERENCES cliente_avulso (id)
    ON DELETE RESTRICT;
 
ALTER TABLE cliente_avulso_telefone ADD CONSTRAINT FK_cliente_avulso_telefone_2
    FOREIGN KEY (fk_telefone_id)
    REFERENCES telefone (id)
    ON DELETE RESTRICT;