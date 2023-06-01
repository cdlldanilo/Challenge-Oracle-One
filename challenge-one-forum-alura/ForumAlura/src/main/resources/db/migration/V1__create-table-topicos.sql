CREATE TABLE topicos (
  id BIGINT NOT NULL AUTO_INCREMENT,
  titulo VARCHAR(50) NULL,
  mensagem VARCHAR(255) NULL,
  data_criacao TIMESTAMP NULL,
  status_topico VARCHAR(10) NULL,
  curso VARCHAR(30) NULL,
  nome VARCHAR(45) NULL,
  senha TEXT NULL,
  PRIMARY KEY(id)
);