CREATE TABLE public.pecas_fornecedores (
	peca_id int4 NOT NULL,
	fornecedor_id int4 NOT NULL,
	CONSTRAINT pecas_fornecedores_pk PRIMARY KEY (peca_id,fornecedor_id),
	CONSTRAINT pecas_fornecedores_fornecedores_fk FOREIGN KEY (fornecedor_id) REFERENCES public.fornecedores(fornecedor_id),
	CONSTRAINT pecas_fornecedores_pecas_fk FOREIGN KEY (peca_id) REFERENCES public.pecas(peca_id)
);
