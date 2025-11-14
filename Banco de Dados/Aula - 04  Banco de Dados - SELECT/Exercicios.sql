-- Com base na "AULA 5 - MySQL - SELECT" e conceitos adicionais, faça 15 exercícios de 
--  MySQL que abrangem diversos comandos e funcionalidades: 



--  1. Selecionando Todos os Dados de uma Tabela 

Select * From  series;

---------------------------------------------------------------------------------------------------------
--  2. Selecionando Dados por Nome Específico 

Select * From  series where  titulo  in ('Sopranos') ;

---------------------------------------------------------------------------------------------------------
--  3. Ordenando Resultados por Nome em Ordem Decrescente 

Select * From series 
order by titulo desc;

--------------------------------------------------------------------------------------------------------------
-- 4. Selecionando Colunas Específicas de uma Tabela 

Select genero From series ;

--------------------------------------------------------------------------------------------------------------
--  5. Filtrando Dados por Ano Igual ou Anterior a 2016 

Select * From series where num_temporadas < 5 OR  num_temporadas = 5; 

----------------------------------------------------------------------------------------------------------------
--  6. Usando Operadores Relacionais para Comparar Valores 

Select * From series where num_temporadas < 6 AND num_temporadas > 4;

----------------------------------------------------------------------------------------------------------------
--  7. Filtrando Dados por Intervalo de Valores (BETWEEN) 

Select * From  series where num_temporadas Between 5 AND 10;

----------------------------------------------------------------------------------------------------------------
--  8. Combinando Condições com AND e OR 

Select * From series where id < 5 OR id = 4; 
Select * From series where titulo = 'Soprano' AND  genero ='Ação'; 

--  9. Selecionando Registros que Contém um Valor Específico (IN) 
--  10. Utilizando o Operador de União (|) para Combinar Resultados 
--  11. Buscando Nomes que Começam com 'Maria' (LIKE e Wildcard) 
--  12. Atualizando o Email de um Aluno Específico 
--  13. Removendo Registros Duplicados (DISTINCT) 
--  14. Contando o Número de Alunos por Curso (COUNT) 
--  15. Calculando a Média, Máximo e Mínimo de Salários (AVG, MAX, MIN)


insert into series values
(default, 'Liga da Justiça','Ação,Herois',3),
(default, 'Smallville','Ação,Herois',10),
(default, 'Narcos','Ação,Policial,Drama',5);