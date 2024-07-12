CREATE TABLE public.pecas (
	peca_id int4 NOT NULL,
	peca_descricao varchar NOT NULL,
	CONSTRAINT pecas_unique PRIMARY KEY (peca_id)
);