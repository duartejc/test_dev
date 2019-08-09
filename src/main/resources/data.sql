-- Categorias
INSERT INTO categories (id, name) VALUES 
    (1, 'Alimentos'),
    (2, 'Eletrodomésticos'),
    (3, 'Móveis'),
    (90, 'Brinquedos'),
    (91, 'Medicamentos');



INSERT INTO products (id, name, category_id) VALUES 
    -- Produtos da categoria 1 - Alimentos
    (1, 'Arroz', 1),
    (2, 'Feijão', 1),

    -- Produtos da categoria 2 - Eletrodomesticos
    (3, 'Aspirador de pó', 2),
    (4, 'Batedeira', 2),
    (5, 'Liquidificador', 2),

    -- Produtos da categoria 3 - Móveis
    (6, 'Sofá', 3),
    (7, 'Mesa', 3),
    (8, 'Estante', 3);