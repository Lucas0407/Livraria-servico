CREATE TABLE IF NOT EXISTS public.contas (
	conta_id int4 NOT NULL,
	fornecedor_id int4 NOT NULL,
	numero_conta varchar NOT NULL,
	CONSTRAINT contas_pk PRIMARY KEY (conta_id),
	CONSTRAINT contas_fornecedores_fk FOREIGN KEY (fornecedor_id) REFERENCES public.fornecedores(fornecedor_id)
);
