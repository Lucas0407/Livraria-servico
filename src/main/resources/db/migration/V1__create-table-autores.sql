
CREATE TABLE IF NOT EXISTS public.autores (
	autor_id int4 NOT NULL,
	nome varchar NOT NULL,
	CONSTRAINT autor_pk PRIMARY KEY (autor_id)
);