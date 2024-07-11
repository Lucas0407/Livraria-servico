CREATE TABLE IF NOT EXISTS public.fornecedores (
	fornecedor_id int4 NOT NULL,
	nome varchar NOT NULL,
	CONSTRAINT fornecedores_pk PRIMARY KEY (fornecedor_id)
);