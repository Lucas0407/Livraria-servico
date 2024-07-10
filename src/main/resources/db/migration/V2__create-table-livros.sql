CREATE TABLE IF NOT EXISTS public.livros (
	id int4 NOT NULL,
	autor_id int4 NOT NULL,
	data_de_publicacao date NOT NULL,
	CONSTRAINT livros_pk PRIMARY KEY (id),
	CONSTRAINT livros_autores_fk_1 FOREIGN KEY (autor_id) REFERENCES public.autores(id)
);
