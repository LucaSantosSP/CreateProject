CREATE TABLE IF NOT EXISTS cliente (
	id serial PRIMARY KEY,
	nome text,
	email text,
	dtNasc date,
	senha text
);
