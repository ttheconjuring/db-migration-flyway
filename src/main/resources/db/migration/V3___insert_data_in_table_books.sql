insert into books (uuid, title, category)
VALUES
    (UNHEX(REPLACE(UUID(), '-', '')), 'The Great Gatsby', 'Classic Literature'),
    (UNHEX(REPLACE(UUID(), '-', '')), '1984', 'Dystopian'),
    (UNHEX(REPLACE(UUID(), '-', '')), 'To Kill a Mockingbird', 'Historical Fiction');